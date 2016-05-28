package com.derpderphurr.games.chess;
import java.util.List;

public interface Movement {
	//a pawns first move can be 1 or 2 spaces forward
	//so we must have which move
	public List<Position> availableMoves(Position starting,int movenumber);
}
