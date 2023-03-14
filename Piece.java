import java.util.ArrayList;

public abstract class Piece
{
	private String name;
	private int side;
	private String position;
	public static ArrayList<Piece> allPieces = new ArrayList<Piece>();

	public Piece(String name, int side, String position)
	{
		this.name = name;
		this.side = side;
		this.position = position;
	}

	public int getSide()
	{
		return side;
	}

	public String getPosition()
	{
		return position;
	}

	public void setPosition(String newPosition)
	{
		position = newPosition.toUpperCase();
	}

	public String getName()
	{
		return name;
	}

	public static Piece getPieceByPosition(String pos)
	{
		for(Piece p : Piece.allPieces)
		{ 
			if(p.getPosition().equals(pos))
			{
				return p;
			}
		}

		return null;
	}

	public static Piece[] getPieceByName(String name)
	{
		Piece[] pieces = new Piece[2];
		int i = 0;
		for(Piece p : Piece.allPieces)
		{
			if(p.getName().equals(name))
			{
				pieces[i] = p;
				i++;
			}
		}

		return pieces;
	}

	public String toString()
	{
		return "Piece object named: " + name;
	}


	public abstract boolean LegalMove(String pos);
}