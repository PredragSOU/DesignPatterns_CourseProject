package Christmas;

public class DollCommand implements Command {

	private MagicalBoard magicalBoard;
	
	public DollCommand(MagicalBoard magicalBoard) {
		this.magicalBoard = magicalBoard;
	}
	
	@Override
	public void execute() {
		this.magicalBoard.wantDoll();;
	}

}
