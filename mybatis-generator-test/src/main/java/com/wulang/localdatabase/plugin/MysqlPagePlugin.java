package com.wulang.localdatabase.plugin;

import org.mybatis.generator.api.IntrospectedTable;
import org.mybatis.generator.api.dom.xml.Attribute;
import org.mybatis.generator.api.dom.xml.TextElement;
import org.mybatis.generator.api.dom.xml.XmlElement;

public class MysqlPagePlugin extends PagePlugin {
    @Override
    public void setXmlCode(XmlElement element, IntrospectedTable introspectedTable) {
        XmlElement offsetIsNotNullElement=new XmlElement("if");
        offsetIsNotNullElement.addAttribute(new Attribute("test", "offset != null"));
        offsetIsNotNullElement.addElement(new TextElement("limit ${offset}, ${limit}"));

        XmlElement offsetIsNullElement=new XmlElement("if");
        offsetIsNullElement.addAttribute(new Attribute("test", "offset == null"));
        offsetIsNullElement.addElement(new TextElement("limit ${limit}"));

        XmlElement limitIsNotNullElement = new XmlElement("if");
        limitIsNotNullElement.addAttribute(new Attribute("test", "limit != null"));
        limitIsNotNullElement.addElement(offsetIsNotNullElement);
        limitIsNotNullElement.addElement(offsetIsNullElement);

        element.addElement(limitIsNotNullElement);
    }
}

