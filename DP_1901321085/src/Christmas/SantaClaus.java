package Christmas;


public class SantaClaus {

	private static SantaClaus santaClaus;

	private SantaClaus() {
		// TODO Auto-generated constructor stub
	}

	public static SantaClaus getInstance() {
		
		if(santaClaus == null) 
		{
			santaClaus = new SantaClaus();
		}
		
		return santaClaus;
	}
	
	public void congratulateChristmas() 
	{
		System.out.println("Ho, ho, ho! Merry Christmas Everyone!");
	}
	
	//SantaClaus As The Invoker Class From The Command Pattern
	
	private Command command;

	public Command getCommand() {
		return command;
	}

	public void sayCommand(Command command) {
		this.command = command;
		
		if(this.command == null) {
			System.out.println("No command set");
			return;
		}
		this.command.execute();
	}

	
}
