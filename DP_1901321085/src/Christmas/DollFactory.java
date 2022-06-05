package Christmas;

public class DollFactory extends ChristmasFactory{

	@Override
	public ChristmasToy createToy(String command) 
	{
		if(command.contains("Doll")) 
		{
			return new Doll();
		}
		
		return null;
	}

}
