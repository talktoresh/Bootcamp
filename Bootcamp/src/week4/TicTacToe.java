package week4;

import java.util.Scanner;

public class TicTacToe {
	static String[] board = new String[9];
	static Scanner in;
	static String winner = null;
	static String turn = "X";
	public static void main(String args[]) {
		in = new Scanner(System.in);
		int input;
		populateEmptyBoard();
		printBoard();
		
		System.out.println("Player X's turn:");
		while(winner == null) {
			input = in.nextInt();
			board[input-1] = turn;
			printBoard();	
		    if(turn.equals("X"))
		    	turn = "O";
		    else
		    	turn ="X";
		    winner = checkWinner();   
		}	
		System.out.println("The winner is:" +winner);
	}

	private static String checkWinner() {
		String line = null;
		for(int a =0;a<8;a++) {
			switch(a) {
			case 0:
				line = board[0]+board[1]+board[2];
				break;
			case 1:
				line = board[3]+board[4]+board[5];
				break;
			case 2:
				line = board[6]+board[7]+board[8];
				break;
			case 3:
				line = board[0]+board[3]+board[6];
				break;
			case 4:
				line = board[1]+board[4]+board[7];
				break;
			case 5:
				line = board[2]+board[5]+board[8];
				break;
			case 6:
				line = board[0]+board[4]+board[8];
				break;
			case 7:
				line = board[2]+board[4]+board[6];
				break;
			}
			if(line.equals("XXX")) 
				return "X";
			else if (line.equals("OOO"))
				return "O";	
		}
			
			System.out.println("Player " +turn+ "'s turn:");
			return null;
			
	}

	private static void printBoard() {
		
			System.out.println(board[0]+ "----"+ board[1] + "----"+board[2]);
			System.out.println("|"+ "----"+ "|" + "----"+"|");
			System.out.println(board[3]+ "----"+ board[4] + "----"+board[5]);
			System.out.println("|"+ "----"+ "|" + "----"+"|");
			System.out.println(board[6]+ "----"+ board[7] + "----"+board[8]);		
		
	}
	
	private static void populateEmptyBoard() {
		for(int i=0;i<9;i++) {
			board[i]=String.valueOf(i+1);
			//System.out.println(board[i]);
		}
		
	}

}
