import java.util.*;

public class Chess
{ 
	static Scanner scanner;
	static Board board;
	static boolean whiteMove = true;

	public static void main(String[] args)
	{
		scanner = new Scanner(System.in);
		board = new Board();

		while(true)
		{
			board.draw();

			getNextMove();
		}

	}

	public static void getNextMove()
	{
		if(whiteMove)
		{
			System.out.print("White> ");
		} else{
			System.out.print("Black> ");
		}

		// get input
		String move = scanner.nextLine();

		String[] splitted = move.split(" ");
		String pieceName = splitted[0];
		String newPosition = splitted[1];

		Piece[] pieces = Piece.getPieceByName(pieceName);

		// Check if piece is on right side
		if(whiteMove)
		{
			for(int i = 0; i < 2; i++)
			{
				if(pieces[i].getSide() == Side.white)
				{
					pieces[i].setPosition(newPosition);
					break;
				}
			}
		} else{
			for(int i = 0; i < 2; i++)
			{
				if(pieces[i].getSide() == Side.black)
				{
					pieces[i].setPosition(newPosition);
					break;
				}
			}
		}

		// Switch to other player
		whiteMove = !whiteMove;
		
	}

	static String[] getSubstringUntilFirstNumber(String source) 
	{
    	return source.split("[0-9]");
	}
}