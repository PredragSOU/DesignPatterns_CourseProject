package Christmas;

public class BikeFactory extends ChristmasFactory{

	@Override
	public ChristmasToy createToy(String command) {
		
		if(command.contains("Bike")) 
		{
			return new Bike();
		}
		
		return null;
	}

}
