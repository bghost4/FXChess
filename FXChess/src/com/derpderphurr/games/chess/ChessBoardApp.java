package com.derpderphurr.games.chess;
import javax.xml.parsers.SAXParser;
import javax.xml.parsers.SAXParserFactory;

import org.xml.sax.InputSource;
import org.xml.sax.XMLReader;

import com.derpderphurr.graphics.SvgToFXBuilder;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Group;
import javafx.scene.Node;
import javafx.scene.Scene;
import javafx.scene.layout.GridPane;
import javafx.stage.Stage;

public class ChessBoardApp extends Application {

	private ChessBoard cb;
	
	@Override
	public void start(Stage arg0) throws Exception {
		FXMLLoader loader = new FXMLLoader(this.getClass().getResource("ChessBoard.fxml"));
		GridPane p = loader.load();
		cb = loader.getController();
		if(cb == null) {
			System.err.println("Controller was null");
		}
		
		SvgToFXBuilder fxb = new SvgToFXBuilder();
			fxb.loadXML("chess_pieces", new InputSource(this.getClass().getResourceAsStream("/resources/Chess_Pieces_Sprite.svg")));
		 
		Node whiteRook1 = fxb.createInstanceFromId("white_rook");
		Node whiteRook2 = fxb.createInstanceFromId("white_rook");
		
		
		cb.put(whiteRook1, ChessPosition.A1);
		cb.put(fxb.createInstanceFromId("white_knight"), ChessPosition.B1);
		cb.put(fxb.createInstanceFromId("white_bishop"), ChessPosition.C1);
		cb.put(fxb.createInstanceFromId("white_king"), ChessPosition.D1);
		cb.put(fxb.createInstanceFromId("white_queen"), ChessPosition.E1);
		cb.put(fxb.createInstanceFromId("white_bishop"), ChessPosition.F1);
		cb.put(fxb.createInstanceFromId("white_knight"), ChessPosition.G1);
		cb.put(whiteRook2, ChessPosition.H1);
		
		whiteRook1.setOnMouseClicked(me -> { 
			System.out.println("Rook Clicked");
			cb.move(whiteRook1, ChessPosition.A8);
			});
		
		Scene s = new Scene(p);		
		arg0.setScene(s);
		arg0.setTitle("ChessBoard");
		arg0.show();
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		launch(args);
	}

}
