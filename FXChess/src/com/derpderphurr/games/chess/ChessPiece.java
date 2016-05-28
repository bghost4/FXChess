package com.derpderphurr.games.chess;
import javafx.scene.Group;
import javafx.scene.Node;

public abstract class ChessPiece extends Group {
	
	protected int movecount = 0;
	protected Position position;
	protected Node graphic;
	protected Team team;
	protected Movement moveType;
	protected String name;
	
	public ChessPiece(Position position,Node graphic,Movement m,Team t) { 
		super();
		this.position = position;
		this.graphic = graphic;
		this.moveType = m;
		this.team = t;
	}
	
	
	
	
}
