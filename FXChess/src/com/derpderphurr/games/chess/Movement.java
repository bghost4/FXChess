package com.derpderphurr.games.chess;
import java.util.List;

import com.derpderphurr.games.board.Playfield;

public interface Movement {
	//a pawns first move can be 1 or 2 spaces forward
	//so we must have which move
	public List<ChessPosition> availableMoves(ChessPosition starting,int movenumber,Playfield p);
}
