package Christmas;

public abstract class ChristmasFactory {
	
	public abstract ChristmasToy createToy(String command);

	public ChristmasToy produceToy(String command) 
	{
		ChristmasToy toy = createToy(command);
		toy.produce();
		return toy;
	}
	
}
