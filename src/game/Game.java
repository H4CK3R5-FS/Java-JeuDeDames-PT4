package game;

import java.util.ArrayList;
import java.util.HashMap;

import events.Events;
import events.Round;
import model.Piece;
import utilitaires.Utilitaires;

public class Game {
//draw board
//add players
//add pieces
	String[][] board = new String[10][10];
	ArrayList<Piece> alP = new ArrayList<Piece>();
	HashMap<String, Piece> hmP = new HashMap<String, Piece>();

	public void game() {
		Utilitaires.draw_Board(board);
		Utilitaires.add_Pieces_To_List(alP);
		Utilitaires.add_Pieces_To_Board(alP, hmP, board);
		Utilitaires.read_Board(board);
		Round.round(hmP, board);

		Utilitaires.read_Board(board);
	}
}
