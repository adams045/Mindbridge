package com.xml;

import java.io.File;
import java.security.PublicKey;

import javax.xml.parsers.SAXParser;
import javax.xml.parsers.SAXParserFactory;
import javax.xml.stream.events.StartDocument;

import org.xml.sax.helpers.DefaultHandler;

import org.xml.sax.Attributes;
import org.xml.sax.SAXException;
import org.xml.sax.helpers.DefaultHandler;

import javax.xml.parsers.SAXParser;
import javax.xml.parsers.SAXParserFactory;

public class SAXParserExample extends DefaultHandler{
    public static void main(String[] args) {
        try {
            SAXParserFactory factory = SAXParserFactory.newInstance();
            SAXParser saxParser = factory.newSAXParser();
            DefaultHandler handler = new DefaultHandler() {
            	
                boolean isId = false;
                boolean isName = false;
                boolean isDepartment = false;
                boolean isGrade = false;

                @Override
                public void startElement(String uri, String localName, String qName, Attributes attributes) throws SAXException {
                    if (qName.equalsIgnoreCase("id")) {
                        isId = true;
                    } else if (qName.equalsIgnoreCase("name")) {
                        isName = true;
                    } else if (qName.equalsIgnoreCase("department")) {
                        isDepartment = true;
                    } else if (qName.equalsIgnoreCase("grade")) {
                        isGrade = true;
                    }
                }

                @Override
                public void endElement(String uri, String localName, String qName) throws SAXException {
                }

                @Override
                public void characters(char[] ch, int start, int length) throws SAXException {
                    if (isId) {
                        System.out.println("ID: " + new String(ch, start, length));
                        isId = false;
                    } else if (isName) {
                        System.out.println("Name: " + new String(ch, start, length));
                        isName = false;
                    } else if (isDepartment) {
                        System.out.println("Department: " + new String(ch, start, length));
                        isDepartment = false;
                    } else if (isGrade) {
                        System.out.println("Grade: " + new String(ch, start, length));
                        isGrade = false;
                    }
                }
            };
            saxParser.parse("C:\\Users\\Admin\\Desktop\\SpringProject\\com.xml\\src\\account.xml", handler);

        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
