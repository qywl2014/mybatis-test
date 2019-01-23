package com.wulang.localdatabase.plugin;

import org.mybatis.generator.api.IntrospectedTable;
import org.mybatis.generator.api.PluginAdapter;
import org.mybatis.generator.api.dom.java.*;
import org.mybatis.generator.api.dom.xml.Attribute;
import org.mybatis.generator.api.dom.xml.TextElement;
import org.mybatis.generator.api.dom.xml.XmlElement;

import java.util.List;

public class PagePlugin extends PluginAdapter {

    @Override
    public boolean modelExampleClassGenerated(TopLevelClass topLevelClass, IntrospectedTable introspectedTable) {

        addField("limit",topLevelClass,introspectedTable);
        addField("offset",topLevelClass,introspectedTable);
        return true;
    }

    @Override
    public boolean sqlMapSelectByExampleWithoutBLOBsElementGenerated(XmlElement element, IntrospectedTable introspectedTable) {

        XmlElement offsetIsNotNullElement=new XmlElement("if");
        offsetIsNotNullElement.addAttribute(new Attribute("test", "offset != null"));
        offsetIsNotNullElement.addElement(new TextElement("limit ${limit} offset ${offset}"));

        XmlElement offsetIsNullElement=new XmlElement("if");
        offsetIsNullElement.addAttribute(new Attribute("test", "offset == null"));
        offsetIsNullElement.addElement(new TextElement("limit ${limit}"));

        XmlElement limitIsNotNullElement = new XmlElement("if");
        limitIsNotNullElement.addAttribute(new Attribute("test", "limit != null"));
        limitIsNotNullElement.addElement(offsetIsNotNullElement);
        limitIsNotNullElement.addElement(offsetIsNullElement);

        element.addElement(limitIsNotNullElement);

        return true;
    }

    @Override
    public boolean validate(List<String> warnings) {
        return true;
    }

    private void addField(String name,TopLevelClass topLevelClass, IntrospectedTable introspectedTable){
        Field field = new Field();
        field.setVisibility(JavaVisibility.PRIVATE);
//		field.setType(FullyQualifiedJavaType.getIntInstance());
        field.setType(PrimitiveTypeWrapper.getIntegerInstance());
        field.setName(name);
//		field.setInitializationString("-1");
        topLevelClass.addField(field);
        char c = name.charAt(0);
        String camel = Character.toUpperCase(c) + name.substring(1);
        Method setMethod = new Method();
        setMethod.setVisibility(JavaVisibility.PUBLIC);
        setMethod.setName("set" + camel);
        setMethod.addParameter(new Parameter(PrimitiveTypeWrapper.getIntegerInstance(), name));
        setMethod.addBodyLine("this." + name + "=" + name + ";");
        topLevelClass.addMethod(setMethod);
        Method getMethod = new Method();
        getMethod.setVisibility(JavaVisibility.PUBLIC);
        getMethod.setReturnType(PrimitiveTypeWrapper.getIntegerInstance());
        getMethod.setName("get" + camel);
        getMethod.addBodyLine("return " + name + ";");
        topLevelClass.addMethod(getMethod);
    }
}
