public class Side
{
	public static final String alpha = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
	public static final int white = 1;
	public static final int black = 2;

	public King king;
	public Queen queen;
	public Rook[] rooks;
	public Knight[] knights;
	public Bishop[] bishops;
	public Pawn[] pawns;

	public Side(int side)
	{
		rooks = new Rook[2];
		knights = new Knight[2];
		bishops = new Bishop[2];
		pawns = new Pawn[8];

		king = new King("King", side, side == this.white ? "E1" : "E8");
		queen = new Queen("Queen", side, side == this.white ? "D1" : "D8");

		// rooks
		rooks[0] = new Rook("Rook1", side, side == this.white ? "A1" : "A8");
		rooks[1] = new Rook("Rook2", side, side == this.white ? "H1" : "H8");

		// knights
		knights[0] = new Knight("Knight1", side, side == this.white ? "B1" : "B8");
		knights[1] = new Knight("Knight2", side, side == this.white ? "G1" : "G8");

		// bishops
		bishops[0] = new Bishop("Bishop1", side, side == this.white ? "C1" : "C8");
		bishops[1] = new Bishop("Bishop2", side, side == this.white ? "F1" : "F8");

		// pawns
		for (int i = 0; i < 8; i++) 
		{
			pawns[i] = new Pawn("Pawn" + (i+1), side, alpha.charAt(i) + (side == this.white ? "2" : "7"));
		}

		
	}
}