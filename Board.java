public class Board
{
	public static final String alpha = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
	public Side white;
	public Side black; 

	public Board()
	{
		this.white = new Side(Side.white);
		this.black = new Side(Side.black);
	}

	public void draw()
	{
		System.out.println("-------------------------------");
		for(int i = 8; i > 0; i--)
		{
			for(int j = 0; j < 8; j++)
			{
				String pos = alpha.charAt(j) + Integer.toString(i);

				Piece piece = Piece.getPieceByPosition(pos);

				if(piece == null)
				{
					System.out.print(prettyPrint(pos));
				} else
				{
					System.out.print(prettyPrint(piece.getName()));
				}

				if(j == 7)
				{
					System.out.println();
				}
			}
		}
		System.out.println("-------------------------------");
	}

	private String prettyPrint(String name)
	{
		int spaceLeft = 8 - name.length();
		boolean odd = spaceLeft % 2 != 0;
		String pretty = " ".repeat(spaceLeft / 2) + name;

		if(odd)
		{
			pretty += " ".repeat((spaceLeft / 2) + 1) + "|";
		} else{
			pretty += " ".repeat(spaceLeft / 2) + "|";
		}

		return pretty;

	}
}