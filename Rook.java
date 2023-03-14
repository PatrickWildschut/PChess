public class Rook extends Piece
{
	public Rook(String name, int side, String position)
	{
		super(name, side, position);

		Piece.allPieces.add(this);
	}

	public boolean LegalMove(String pos)
	{
		return false;
	}
}