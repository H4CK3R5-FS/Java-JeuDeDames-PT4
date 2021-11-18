package events;

import model.Joueur;
import model.Piece;
import utilitaires.Utilitaires;

public class Events {
	public static void isMovable(Piece P, Joueur J) {

	}
//only move if its your turn
//move only your colours

//mouvement event
//move(hmP.get("PB2"), board, 3, 5);
//{key,value}
//{PB2,Piece}

//move sert à bouger un pion(piece)
	public static void move(Piece P, String[][] board, int x, int y) {
		board[P.getY()][P.getX()] = Utilitaires.get_Position(board, P.getX(), P.getY());
		System.out.println("X avant changement : " + P.getX());
		System.out.println("Y avant changement : " + P.getY());
		P.setX(x);
		P.setY(y);
		System.out.println("X après changement : " + P.getX());
		System.out.println("Y après changement : " + P.getY());
		board[P.getY()][P.getX()] = P.getName();
	}

	public static void check_Moves() {

	}
	// eat event
	// eat condtions
	// il ya un pion après
	// le pion est de couleur different
	// la case après est vide
	// change turns after each play
	// game over
	// if player is out of pieces
	// if player cant move anymore
}
