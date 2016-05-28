package com.derpderphurr.graphics.svg;
import java.io.File;
import java.io.IOException;

import javax.xml.parsers.ParserConfigurationException;
import javax.xml.parsers.SAXParser;
import javax.xml.parsers.SAXParserFactory;

import org.xml.sax.SAXException;
import org.xml.sax.XMLReader;



public class TestParseSVG {

	public static void main(String[] args) {
		
		SAXParserFactory spf = SAXParserFactory.newInstance();
		try {
			SVGParser svg = new SVGParser();
			SAXParser sp = spf.newSAXParser();
			XMLReader xmlReader = sp.getXMLReader();
			xmlReader.setContentHandler(svg);
			xmlReader.parse(TestParseSVG.class.getResource("Chess_Pieces_Sprite.svg").toString());
			
			
			
		} catch (ParserConfigurationException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (SAXException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	
	}
	
}
