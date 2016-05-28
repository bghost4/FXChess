package com.derpderphurr.graphics.svg;
import java.io.InputStream;
import java.util.HashMap;
import java.util.Map;
import java.util.Queue;
import java.util.Stack;

import org.xml.sax.Attributes;
import org.xml.sax.SAXException;
import org.xml.sax.helpers.DefaultHandler;

import javafx.scene.Group;
import javafx.scene.paint.Color;
import javafx.scene.shape.Circle;
import javafx.scene.shape.FillRule;
import javafx.scene.shape.SVGPath;
import javafx.scene.shape.Shape;
import javafx.scene.shape.StrokeLineCap;
import javafx.scene.shape.StrokeLineJoin;

public class SVGParser extends DefaultHandler {

	protected Map<String,Group> availableGroups;
	protected Stack<Group> treepath;
	
	public Group get(String name) { return availableGroups.get(name); }
	
	protected Group currentGroup;
	protected String groupStyle;

	public SVGParser() {
		treepath = new Stack<>();
		availableGroups = new HashMap<>();
	}
	
	protected void processStyle(SVGPath p) {
		//use default group style
		//then apply path style
	}
	
	@Override
	public void endElement(String namespace, String localname, String qname) throws SAXException {
		// TODO Auto-generated method stub
		if(qname.equals("g")) {
			treepath.pop();
		}
	}

	//Convert an SVG Style attribute and Translate to something that can be applied to shape
	protected void convertStyle(String style,Shape s) {
		Map<String,String> styleOptions = new HashMap<>();
		String[] options = style.split(";");
		for(String op:options) {
			String[] keyvalue = op.split(":");
			if(keyvalue.length == 2) {
				//Correct format
				styleOptions.put(keyvalue[0], keyvalue[1]);
				//System.out.println("Key: "+keyvalue[0]+" Value:  "+keyvalue[1]);
				switch(keyvalue[0]) {
				case "stroke":
					s.setStroke(Color.web(keyvalue[1]));
					break;
				case "fill":
					if(keyvalue[1].equals("none")) {
						s.setFill(Color.TRANSPARENT);
					} else {
						s.setFill(Color.web(keyvalue[1]));
					}
					break;
				case "stroke-width":
					s.setStrokeWidth(Double.parseDouble(keyvalue[1]));
					break;
				case "stroke-linecap":
					
					s.setStrokeLineCap(StrokeLineCap.valueOf(keyvalue[1].toUpperCase()));
					break;
				case "stroke-linejoin":
					s.setStrokeLineJoin(StrokeLineJoin.valueOf(keyvalue[1].toUpperCase()));
					break;
				case "stroke-miterlimit":
					s.setStrokeMiterLimit(Double.parseDouble(keyvalue[1]));
					break;
				case "fill-rule":
					if(s instanceof SVGPath) {
						SVGPath p = (SVGPath)s;
						p.setFillRule(FillRule.valueOf(keyvalue[1].toUpperCase()));
					}
					break;
				default:
						break;
				}
			} else {
				System.out.println("KeyValue in InCorrect Format");
			}
		}
	}
	
	@Override
	public void startElement(String namespace, String localname, String qname, Attributes attrs) throws SAXException {
		if(qname.equals("g")){
			
			currentGroup = new Group();
			if(!treepath.isEmpty()) {
				treepath.peek().getChildren().add(currentGroup);
			}
			treepath.push(currentGroup);
			if(attrs.getValue("id") != null) { 
				currentGroup.setId(attrs.getValue("id"));
				availableGroups.put(attrs.getValue("id"),currentGroup);
				System.out.println("Inserted Named Group: "+attrs.getValue("id"));
			}
			if(attrs.getValue("style") != null) { groupStyle = attrs.getValue("style"); }
			//prepare for handling style tag
		} else if(qname.equals("path")) {
			SVGPath p = new SVGPath();
			p.setContent(attrs.getValue("d"));
			currentGroup.getChildren().add(p);
			if(attrs.getValue("style") != null) {
				convertStyle(attrs.getValue("style"),p);
			}
		} else if(qname.equals("circle")) {
			Circle c = new Circle();
			c.setCenterX(Double.parseDouble(attrs.getValue("cx")));
			c.setCenterY(Double.parseDouble(attrs.getValue("cy")));
			c.setRadius(Double.parseDouble(attrs.getValue("r")));
			currentGroup.getChildren().add(c);
		} else {
			System.out.println("Qname: "+qname);
			System.out.println("localname: "+localname);
		}
	
	}
}
