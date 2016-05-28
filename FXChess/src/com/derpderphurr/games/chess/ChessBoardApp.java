package com.derpderphurr.games.chess;
import javax.xml.parsers.SAXParser;
import javax.xml.parsers.SAXParserFactory;

import org.xml.sax.XMLReader;

import com.derpderphurr.graphics.svg.SVGParser;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Group;
import javafx.scene.Scene;
import javafx.scene.layout.GridPane;
import javafx.stage.Stage;

public class ChessBoardApp extends Application {

	private ChessBoard cb;
	private SVGParser svg;
	
	@Override
	public void start(Stage arg0) throws Exception {
		FXMLLoader loader = new FXMLLoader(this.getClass().getResource("ChessBoard.fxml"));
		GridPane p = loader.load();
		cb = loader.getController();
		if(cb == null) {
			System.err.println("Controller was null");
		}
		
		SAXParserFactory spf = SAXParserFactory.newInstance();
		svg = new SVGParser();
		SAXParser sp = spf.newSAXParser();
		XMLReader xmlReader = sp.getXMLReader();
		xmlReader.setContentHandler(svg);
		xmlReader.parse(this.getClass().getResource("/resources/Chess_Pieces_Sprite.svg").toString());
		
		
		
		cb.put(svg.get("white_rook"), Position.A1);
		cb.put(svg.get("white_knight"), Position.B1);
		cb.put(svg.get("white_bishop"), Position.C1);
		cb.put(svg.get("white_king"), Position.D1);
		cb.put(svg.get("white_queen"), Position.E1);
		cb.put(svg.get("white_bishop"), Position.F1);
		cb.put(svg.get("white_knight"), Position.G1);
		cb.put(svg.get("white_rook"), Position.H1);
		
		
		
		
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
