package Christmas;

public class BikeCommand implements Command{

	private MagicalBoard magicalBoard;
	
	public BikeCommand(MagicalBoard magicalBoard) 
	{
		this.magicalBoard = magicalBoard;
	}

	public void execute() 
	{
		this.magicalBoard.wantBike();;
	}
}
