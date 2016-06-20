package com.derpderphurr.games.chess;

import java.net.URL;
import java.util.HashMap;
import java.util.Map;
import java.util.ResourceBundle;

import javafx.fxml.FXML;
import javafx.scene.Node;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.StackPane;

public class ChessBoard extends GridPane {

	    @FXML // ResourceBundle that was given to the FXMLLoader
	    private ResourceBundle resources;

	    @FXML // URL location of the FXML file that was given to the FXMLLoader
	    private URL location;

	    @FXML // fx:id="A8"
	    private StackPane A8; // Value injected by FXMLLoader

	    @FXML // fx:id="B8"
	    private StackPane B8; // Value injected by FXMLLoader

	    @FXML // fx:id="C8"
	    private StackPane C8; // Value injected by FXMLLoader

	    @FXML // fx:id="D8"
	    private StackPane D8; // Value injected by FXMLLoader

	    @FXML // fx:id="E8"
	    private StackPane E8; // Value injected by FXMLLoader

	    @FXML // fx:id="F8"
	    private StackPane F8; // Value injected by FXMLLoader

	    @FXML // fx:id="G8"
	    private StackPane G8; // Value injected by FXMLLoader

	    @FXML // fx:id="H7"
	    private StackPane H8; // Value injected by FXMLLoader

	    @FXML // fx:id="A7"
	    private StackPane A7; // Value injected by FXMLLoader

	    @FXML // fx:id="B7"
	    private StackPane B7; // Value injected by FXMLLoader

	    @FXML // fx:id="C7"
	    private StackPane C7; // Value injected by FXMLLoader

	    @FXML // fx:id="D7"
	    private StackPane D7; // Value injected by FXMLLoader

	    @FXML // fx:id="E7"
	    private StackPane E7; // Value injected by FXMLLoader

	    @FXML // fx:id="F7"
	    private StackPane F7; // Value injected by FXMLLoader

	    @FXML // fx:id="G7"
	    private StackPane G7; // Value injected by FXMLLoader

	    @FXML 
	    private StackPane H7;
	    
	    @FXML // fx:id="A6"
	    private StackPane A6; // Value injected by FXMLLoader

	    @FXML // fx:id="B6"
	    private StackPane B6; // Value injected by FXMLLoader

	    @FXML // fx:id="C6"
	    private StackPane C6; // Value injected by FXMLLoader

	    @FXML // fx:id="D6"
	    private StackPane D6; // Value injected by FXMLLoader

	    @FXML // fx:id="E6"
	    private StackPane E6; // Value injected by FXMLLoader

	    @FXML // fx:id="F6"
	    private StackPane F6; // Value injected by FXMLLoader

	    @FXML // fx:id="G6"
	    private StackPane G6; // Value injected by FXMLLoader

	    @FXML // fx:id="H6"
	    private StackPane H6; // Value injected by FXMLLoader

	    @FXML // fx:id="A5"
	    private StackPane A5; // Value injected by FXMLLoader

	    @FXML // fx:id="B5"
	    private StackPane B5; // Value injected by FXMLLoader

	    @FXML // fx:id="C5"
	    private StackPane C5; // Value injected by FXMLLoader

	    @FXML // fx:id="D5"
	    private StackPane D5; // Value injected by FXMLLoader

	    @FXML // fx:id="E5"
	    private StackPane E5; // Value injected by FXMLLoader

	    @FXML // fx:id="F5"
	    private StackPane F5; // Value injected by FXMLLoader

	    @FXML // fx:id="G5"
	    private StackPane G5; // Value injected by FXMLLoader

	    @FXML // fx:id="H5"
	    private StackPane H5; // Value injected by FXMLLoader

	    @FXML // fx:id="A4"
	    private StackPane A4; // Value injected by FXMLLoader

	    @FXML // fx:id="B4"
	    private StackPane B4; // Value injected by FXMLLoader

	    @FXML // fx:id="C4"
	    private StackPane C4; // Value injected by FXMLLoader

	    @FXML // fx:id="D4"
	    private StackPane D4; // Value injected by FXMLLoader

	    @FXML // fx:id="E4"
	    private StackPane E4; // Value injected by FXMLLoader

	    @FXML // fx:id="F4"
	    private StackPane F4; // Value injected by FXMLLoader

	    @FXML // fx:id="G4"
	    private StackPane G4; // Value injected by FXMLLoader

	    @FXML // fx:id="H4"
	    private StackPane H4; // Value injected by FXMLLoader

	    @FXML // fx:id="A3"
	    private StackPane A3; // Value injected by FXMLLoader

	    @FXML // fx:id="B3"
	    private StackPane B3; // Value injected by FXMLLoader

	    @FXML // fx:id="C3"
	    private StackPane C3; // Value injected by FXMLLoader

	    @FXML // fx:id="D3"
	    private StackPane D3; // Value injected by FXMLLoader

	    @FXML // fx:id="E3"
	    private StackPane E3; // Value injected by FXMLLoader

	    @FXML // fx:id="F3"
	    private StackPane F3; // Value injected by FXMLLoader

	    @FXML // fx:id="G3"
	    private StackPane G3; // Value injected by FXMLLoader

	    @FXML // fx:id="H3"
	    private StackPane H3; // Value injected by FXMLLoader

	    @FXML // fx:id="A2"
	    private StackPane A2; // Value injected by FXMLLoader

	    @FXML // fx:id="B2"
	    private StackPane B2; // Value injected by FXMLLoader

	    @FXML // fx:id="C2"
	    private StackPane C2; // Value injected by FXMLLoader

	    @FXML // fx:id="D2"
	    private StackPane D2; // Value injected by FXMLLoader

	    @FXML // fx:id="E2"
	    private StackPane E2; // Value injected by FXMLLoader

	    @FXML // fx:id="F2"
	    private StackPane F2; // Value injected by FXMLLoader

	    @FXML // fx:id="G2"
	    private StackPane G2; // Value injected by FXMLLoader

	    @FXML // fx:id="H2"
	    private StackPane H2; // Value injected by FXMLLoader

	    @FXML // fx:id="A1"
	    private StackPane A1; // Value injected by FXMLLoader

	    @FXML // fx:id="B1"
	    private StackPane B1; // Value injected by FXMLLoader

	    @FXML // fx:id="C1"
	    private StackPane C1; // Value injected by FXMLLoader

	    @FXML // fx:id="D1"
	    private StackPane D1; // Value injected by FXMLLoader

	    @FXML // fx:id="E1"
	    private StackPane E1; // Value injected by FXMLLoader

	    @FXML // fx:id="F1"
	    private StackPane F1; // Value injected by FXMLLoader

	    @FXML // fx:id="G1"
	    private StackPane G1; // Value injected by FXMLLoader

	    @FXML // fx:id="H1"
	    private StackPane H1; // Value injected by FXMLLoader

	    private Map<ChessPosition,StackPane> positionResolver;
	    
	    public void put(Node n,ChessPosition p) {
	    	positionResolver.get(p).getChildren().add(n);
	    }
	    
	    public void move(Node n,ChessPosition p) {
	    	//positionResolver.get(p).getChildren().remove(n);
	    	positionResolver.get(p).getChildren().add(n);
	    }
	    
	    private void initPositionResolver() {
	    	System.out.println("Creating Position Map");
	    	positionResolver.put(ChessPosition.A1, A1);
	    	positionResolver.put(ChessPosition.A2, A2);
	    	positionResolver.put(ChessPosition.A3, A3);
	    	positionResolver.put(ChessPosition.A4, A4);
	    	positionResolver.put(ChessPosition.A5, A5);
	    	positionResolver.put(ChessPosition.A6, A6);
	    	positionResolver.put(ChessPosition.A7, A7);
	    	positionResolver.put(ChessPosition.A8, A8);
	    	
	    	positionResolver.put(ChessPosition.B1, B1);
	    	positionResolver.put(ChessPosition.B2, B2);
	    	positionResolver.put(ChessPosition.B3, B3);
	    	positionResolver.put(ChessPosition.B4, B4);
	    	positionResolver.put(ChessPosition.B5, B5);
	    	positionResolver.put(ChessPosition.B6, B6);
	    	positionResolver.put(ChessPosition.B7, B7);
	    	positionResolver.put(ChessPosition.B8, B8);
	    	
	    	positionResolver.put(ChessPosition.C1, C1);
	    	positionResolver.put(ChessPosition.C2, C2);
	    	positionResolver.put(ChessPosition.C3, C3);
	    	positionResolver.put(ChessPosition.C4, C4);
	    	positionResolver.put(ChessPosition.C5, C5);
	    	positionResolver.put(ChessPosition.C6, C6);
	    	positionResolver.put(ChessPosition.C7, C7);
	    	positionResolver.put(ChessPosition.C8, C8);
	    	
	    	positionResolver.put(ChessPosition.D1, D1);
	    	positionResolver.put(ChessPosition.D2, D2);
	    	positionResolver.put(ChessPosition.D3, D3);
	    	positionResolver.put(ChessPosition.D4, D4);
	    	positionResolver.put(ChessPosition.D5, D5);
	    	positionResolver.put(ChessPosition.D6, D6);
	    	positionResolver.put(ChessPosition.D7, D7);
	    	positionResolver.put(ChessPosition.D8, D8);
	    	
	    	positionResolver.put(ChessPosition.E1, E1);
	    	positionResolver.put(ChessPosition.E2, E2);
	    	positionResolver.put(ChessPosition.E3, E3);
	    	positionResolver.put(ChessPosition.E4, E4);
	    	positionResolver.put(ChessPosition.E5, E5);
	    	positionResolver.put(ChessPosition.E6, E6);
	    	positionResolver.put(ChessPosition.E7, E7);
	    	positionResolver.put(ChessPosition.E8, E8);
	    	
	    	positionResolver.put(ChessPosition.F1, F1);
	    	positionResolver.put(ChessPosition.F2, F2);
	    	positionResolver.put(ChessPosition.F3, F3);
	    	positionResolver.put(ChessPosition.F4, F4);
	    	positionResolver.put(ChessPosition.F5, F5);
	    	positionResolver.put(ChessPosition.F6, F6);
	    	positionResolver.put(ChessPosition.F7, F7);
	    	positionResolver.put(ChessPosition.F8, F8);
	    	
	    	positionResolver.put(ChessPosition.G1, G1);
	    	positionResolver.put(ChessPosition.G2, G2);
	    	positionResolver.put(ChessPosition.G3, G3);
	    	positionResolver.put(ChessPosition.G4, G4);
	    	positionResolver.put(ChessPosition.G5, G5);
	    	positionResolver.put(ChessPosition.G6, G6);
	    	positionResolver.put(ChessPosition.G7, G7);
	    	positionResolver.put(ChessPosition.G8, G8);
	    	
	    	positionResolver.put(ChessPosition.H1, H1);
	    	positionResolver.put(ChessPosition.H2, H2);
	    	positionResolver.put(ChessPosition.H3, H3);
	    	positionResolver.put(ChessPosition.H4, H4);
	    	positionResolver.put(ChessPosition.H5, H5);
	    	positionResolver.put(ChessPosition.H6, H6);
	    	positionResolver.put(ChessPosition.H7, H7);
	    	positionResolver.put(ChessPosition.H8, H8);
	    	System.out.println("Done Creating Position Map");
	    } 
	    
	    public ChessBoard() {
	    	System.out.println("Chessboard Constructor called");
	    	positionResolver = new HashMap<ChessPosition,StackPane>();
	    	// ewwww
	    	
	    }
	    
	    @FXML // This method is called by the FXMLLoader when initialization is complete
	    void initialize() {
	        assert A8 != null : "fx:id=\"A8\" was not injected: check your FXML file 'ChessBoard.fxml'.";
	        assert B8 != null : "fx:id=\"B8\" was not injected: check your FXML file 'ChessBoard.fxml'.";
	        assert C8 != null : "fx:id=\"C8\" was not injected: check your FXML file 'ChessBoard.fxml'.";
	        assert D8 != null : "fx:id=\"D8\" was not injected: check your FXML file 'ChessBoard.fxml'.";
	        assert E8 != null : "fx:id=\"E8\" was not injected: check your FXML file 'ChessBoard.fxml'.";
	        assert F8 != null : "fx:id=\"F8\" was not injected: check your FXML file 'ChessBoard.fxml'.";
	        assert G8 != null : "fx:id=\"G8\" was not injected: check your FXML file 'ChessBoard.fxml'.";
	        assert H7 != null : "fx:id=\"H7\" was not injected: check your FXML file 'ChessBoard.fxml'.";
	        assert A7 != null : "fx:id=\"A7\" was not injected: check your FXML file 'ChessBoard.fxml'.";
	        assert B7 != null : "fx:id=\"B7\" was not injected: check your FXML file 'ChessBoard.fxml'.";
	        assert C7 != null : "fx:id=\"C7\" was not injected: check your FXML file 'ChessBoard.fxml'.";
	        assert D7 != null : "fx:id=\"D7\" was not injected: check your FXML file 'ChessBoard.fxml'.";
	        assert E7 != null : "fx:id=\"E7\" was not injected: check your FXML file 'ChessBoard.fxml'.";
	        assert F7 != null : "fx:id=\"F7\" was not injected: check your FXML file 'ChessBoard.fxml'.";
	        assert G7 != null : "fx:id=\"G7\" was not injected: check your FXML file 'ChessBoard.fxml'.";
	        assert A6 != null : "fx:id=\"A6\" was not injected: check your FXML file 'ChessBoard.fxml'.";
	        assert B6 != null : "fx:id=\"B6\" was not injected: check your FXML file 'ChessBoard.fxml'.";
	        assert C6 != null : "fx:id=\"C6\" was not injected: check your FXML file 'ChessBoard.fxml'.";
	        assert D6 != null : "fx:id=\"D6\" was not injected: check your FXML file 'ChessBoard.fxml'.";
	        assert E6 != null : "fx:id=\"E6\" was not injected: check your FXML file 'ChessBoard.fxml'.";
	        assert F6 != null : "fx:id=\"F6\" was not injected: check your FXML file 'ChessBoard.fxml'.";
	        assert G6 != null : "fx:id=\"G6\" was not injected: check your FXML file 'ChessBoard.fxml'.";
	        assert H6 != null : "fx:id=\"H6\" was not injected: check your FXML file 'ChessBoard.fxml'.";
	        assert A5 != null : "fx:id=\"A5\" was not injected: check your FXML file 'ChessBoard.fxml'.";
	        assert B5 != null : "fx:id=\"B5\" was not injected: check your FXML file 'ChessBoard.fxml'.";
	        assert C5 != null : "fx:id=\"C5\" was not injected: check your FXML file 'ChessBoard.fxml'.";
	        assert D5 != null : "fx:id=\"D5\" was not injected: check your FXML file 'ChessBoard.fxml'.";
	        assert E5 != null : "fx:id=\"E5\" was not injected: check your FXML file 'ChessBoard.fxml'.";
	        assert F5 != null : "fx:id=\"F5\" was not injected: check your FXML file 'ChessBoard.fxml'.";
	        assert G5 != null : "fx:id=\"G5\" was not injected: check your FXML file 'ChessBoard.fxml'.";
	        assert H5 != null : "fx:id=\"H5\" was not injected: check your FXML file 'ChessBoard.fxml'.";
	        assert A4 != null : "fx:id=\"A4\" was not injected: check your FXML file 'ChessBoard.fxml'.";
	        assert B4 != null : "fx:id=\"B4\" was not injected: check your FXML file 'ChessBoard.fxml'.";
	        assert C4 != null : "fx:id=\"C4\" was not injected: check your FXML file 'ChessBoard.fxml'.";
	        assert D4 != null : "fx:id=\"D4\" was not injected: check your FXML file 'ChessBoard.fxml'.";
	        assert E4 != null : "fx:id=\"E4\" was not injected: check your FXML file 'ChessBoard.fxml'.";
	        assert F4 != null : "fx:id=\"F4\" was not injected: check your FXML file 'ChessBoard.fxml'.";
	        assert G4 != null : "fx:id=\"G4\" was not injected: check your FXML file 'ChessBoard.fxml'.";
	        assert H4 != null : "fx:id=\"H4\" was not injected: check your FXML file 'ChessBoard.fxml'.";
	        assert A3 != null : "fx:id=\"A3\" was not injected: check your FXML file 'ChessBoard.fxml'.";
	        assert B3 != null : "fx:id=\"B3\" was not injected: check your FXML file 'ChessBoard.fxml'.";
	        assert C3 != null : "fx:id=\"C3\" was not injected: check your FXML file 'ChessBoard.fxml'.";
	        assert D3 != null : "fx:id=\"D3\" was not injected: check your FXML file 'ChessBoard.fxml'.";
	        assert E3 != null : "fx:id=\"E3\" was not injected: check your FXML file 'ChessBoard.fxml'.";
	        assert F3 != null : "fx:id=\"F3\" was not injected: check your FXML file 'ChessBoard.fxml'.";
	        assert G3 != null : "fx:id=\"G3\" was not injected: check your FXML file 'ChessBoard.fxml'.";
	        assert H3 != null : "fx:id=\"H3\" was not injected: check your FXML file 'ChessBoard.fxml'.";
	        assert A2 != null : "fx:id=\"A2\" was not injected: check your FXML file 'ChessBoard.fxml'.";
	        assert B2 != null : "fx:id=\"B2\" was not injected: check your FXML file 'ChessBoard.fxml'.";
	        assert C2 != null : "fx:id=\"C2\" was not injected: check your FXML file 'ChessBoard.fxml'.";
	        assert D2 != null : "fx:id=\"D2\" was not injected: check your FXML file 'ChessBoard.fxml'.";
	        assert E2 != null : "fx:id=\"E2\" was not injected: check your FXML file 'ChessBoard.fxml'.";
	        assert F2 != null : "fx:id=\"F2\" was not injected: check your FXML file 'ChessBoard.fxml'.";
	        assert G2 != null : "fx:id=\"G2\" was not injected: check your FXML file 'ChessBoard.fxml'.";
	        assert H2 != null : "fx:id=\"H2\" was not injected: check your FXML file 'ChessBoard.fxml'.";
	        assert A1 != null : "fx:id=\"A1\" was not injected: check your FXML file 'ChessBoard.fxml'.";
	        assert B1 != null : "fx:id=\"B1\" was not injected: check your FXML file 'ChessBoard.fxml'.";
	        assert C1 != null : "fx:id=\"C1\" was not injected: check your FXML file 'ChessBoard.fxml'.";
	        assert D1 != null : "fx:id=\"D1\" was not injected: check your FXML file 'ChessBoard.fxml'.";
	        assert E1 != null : "fx:id=\"E1\" was not injected: check your FXML file 'ChessBoard.fxml'.";
	        assert F1 != null : "fx:id=\"F1\" was not injected: check your FXML file 'ChessBoard.fxml'.";
	        assert G1 != null : "fx:id=\"G1\" was not injected: check your FXML file 'ChessBoard.fxml'.";
	        assert H1 != null : "fx:id=\"H1\" was not injected: check your FXML file 'ChessBoard.fxml'.";
	        initPositionResolver();
	    }
	}


