package Christmas;

import java.util.ArrayList;
import java.util.List;

public class ChirstmasElf implements Observer{

	private String elfName;
	private Observable magicalBoard;
	private List<ChristmasToy> elfBag;
	private String lastSantaCommand;

	public ChirstmasElf(String name)
	{
		this.elfName = name;
		this.elfBag = new ArrayList<>();
	}

	public void update() 
	{
		if(this.magicalBoard == null) 
		{
			System.out.println("There Is No Magical Board Yet!");
			return;
		}
		
		lastSantaCommand = this.magicalBoard.getUpdate();
		if(lastSantaCommand.contains("Bike")) 
		{
			System.out.println(this.elfName + " sees: " + "Bike");
		}
		else if (lastSantaCommand.contains("Doll")) 
		{
			System.out.println(this.elfName + " sees: " + "Doll");
		}	
	}
	
	public void setMagicalBoard(Observable magicalBoard) 
	{
		this.magicalBoard = magicalBoard;
	}
	
	public List<ChristmasToy> getElfBag() {
		return elfBag;
	}

	public void setElfBag(List<ChristmasToy> elfBag) {
		this.elfBag = elfBag;
	}
	
	public void takeToy(ChristmasToy toy) {
		
		this.elfBag.add(toy);
		
		if(lastSantaCommand.contains("Bike")) 
		{
			System.out.println(this.elfName + " Is Taking A Bike From The Christmas Factory");	
		}
		else 
		{
			System.out.println(this.elfName + " Is Taking A Doll From The Christmas Factory");
		}

	}
	
	


}
