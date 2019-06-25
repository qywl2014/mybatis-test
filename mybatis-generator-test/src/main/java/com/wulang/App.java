package com.wulang;

import org.mybatis.generator.api.MyBatisGenerator;
import org.mybatis.generator.config.*;
import org.mybatis.generator.internal.DefaultShellCallback;

import java.util.ArrayList;
import java.util.List;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args ) throws Exception
    {
        List<String> warnings = new ArrayList<String>();
        boolean overwrite = true;
        Configuration config = new Configuration();

        //   ... fill out the config object as appropriate...
//        config.addClasspathEntry("D:\\desktop\\idea\\mybatis-test\\mybatis-generator-test\\src\\main\\resources\\postgresql-9.4.1209.jar");
//        config.addClasspathEntry("D:\\desktop\\idea\\mybatis-test\\mybatis-generator-test\\src\\main\\resources\\postgresql-9.4.1209.jar");
        Context context=new Context(ModelType.CONDITIONAL);
        PluginConfiguration pluginConfiguration=new PluginConfiguration();
        pluginConfiguration.setConfigurationType("com.wulang.localdatabase.plugin.PostgresqlPagePlugin");
        context.addPluginConfiguration(pluginConfiguration);

        CommentGeneratorConfiguration commentGeneratorConfiguration=new CommentGeneratorConfiguration();
        commentGeneratorConfiguration.addProperty("suppressAllComments","true");
        commentGeneratorConfiguration.addProperty("suppressDate","true");
        context.setCommentGeneratorConfiguration(commentGeneratorConfiguration);

        JDBCConnectionConfiguration jdbcConnectionConfiguration=new JDBCConnectionConfiguration();
        jdbcConnectionConfiguration.setDriverClass("org.postgresql.Driver");
        jdbcConnectionConfiguration.setConnectionURL("jdbc:postgresql://127.0.0.1:5432/kkcx");
        jdbcConnectionConfiguration.setUserId("postgres");
        jdbcConnectionConfiguration.setPassword("123456");
        context.setJdbcConnectionConfiguration(jdbcConnectionConfiguration);

        JavaModelGeneratorConfiguration javaModelGeneratorConfiguration=new JavaModelGeneratorConfiguration();
        javaModelGeneratorConfiguration.setTargetPackage("com.wulang.localdatabase.model");
        javaModelGeneratorConfiguration.setTargetProject("D:\\desktop\\idea\\mybatis-test\\mybatis-generator-test\\src\\main\\java");
        javaModelGeneratorConfiguration.addProperty("trimStrings","true");
        context.setJavaModelGeneratorConfiguration(javaModelGeneratorConfiguration);

        SqlMapGeneratorConfiguration sqlMapGeneratorConfiguration=new SqlMapGeneratorConfiguration();
        sqlMapGeneratorConfiguration.setTargetPackage("sqlmap");
        sqlMapGeneratorConfiguration.setTargetProject("D:\\desktop\\idea\\mybatis-test\\mybatis-generator-test\\src\\main\\resources");
        context.setSqlMapGeneratorConfiguration(sqlMapGeneratorConfiguration);

        JavaClientGeneratorConfiguration javaClientGeneratorConfiguration=new JavaClientGeneratorConfiguration();
        javaClientGeneratorConfiguration.setConfigurationType("XMLMAPPER");
        javaClientGeneratorConfiguration.setTargetPackage("com.wulang.localdatabase.dao");
        javaClientGeneratorConfiguration.setTargetProject("D:\\desktop\\idea\\mybatis-test\\mybatis-generator-test\\src\\main\\java");
        context.setJavaClientGeneratorConfiguration(javaClientGeneratorConfiguration);

        TableConfiguration tableConfiguration=new TableConfiguration(context);
        tableConfiguration.setSchema("kkcx");
        tableConfiguration.setTableName("hist_signed_talent_apply");
        tableConfiguration.setDomainObjectName("HistSignedTalentApplyDO");
        tableConfiguration.setMapperName("HistSignedTalentApplyMapper");

        context.setId("pg");
        context.setTargetRuntime("MyBatis3");
        context.addTableConfiguration(tableConfiguration);
        config.addContext(context);

        DefaultShellCallback callback = new DefaultShellCallback(overwrite);
        MyBatisGenerator myBatisGenerator = new MyBatisGenerator(config, callback, warnings);
        myBatisGenerator.generate(null);
        for(String str:warnings){
            System.out.print(str);
        }
    }
}
