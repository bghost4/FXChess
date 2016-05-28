package com.derpderphurr.games.chess;


import javafx.scene.paint.Color;
import javafx.scene.paint.Paint;

public enum Team {
	BLACK("Black",Color.BLACK),WHITE("White",Color.WHITE);
	private String name;
	private Paint color;
	public Paint getColor() { return this.color; }
	public String getName() { return this.name; }
	private Team(String name,Paint color) { this.name = name; this.color = color; }
}
