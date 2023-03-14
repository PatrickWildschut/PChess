public class Queen extends Piece
{
	public Queen(String name, int side, String position)
	{
		super(name, side, position);

		Piece.allPieces.add(this);
	}

	public boolean LegalMove(String pos)
	{
		return false;
	}
}