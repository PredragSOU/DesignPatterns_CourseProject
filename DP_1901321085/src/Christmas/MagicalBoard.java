package Christmas;

import java.util.ArrayList;
import java.util.List;

public class MagicalBoard implements Observable{

	private String santasCommand;
	private List<Observer> observers;
	
	public MagicalBoard() {
		this.observers = new ArrayList<>();
	}
	
	//Magical Board As the Receiver Class From The Command Pattern

	public void wantBike() 
	{
		this.santasCommand = "I Want A Bike!";
		System.out.println("Santa says: " + this.santasCommand);
	}
	
	public void wantDoll() 
	{
		this.santasCommand = "I Want A Doll!";
		System.out.println("Santa says: " + this.santasCommand);
	}
	
	// MagicalBoard as the Observable

	@Override
	public void subscribe(Observer observer) 
	{
		this.observers.add(observer);
		observer.setMagicalBoard(this);
	}

	@Override
	public void unsubscribe(Observer observer) 
	{
		this.observers.remove(observer);
		observer.setMagicalBoard(this);
	}

	@Override
	public void notifyObservers() 
	{
		for(Observer observer: this.observers) 
		{
			observer.update();
		}
	}
	
	@Override
	public String getUpdate() {
		return santasCommand;
	}
	
	public void passCommand(String command) {
		this.santasCommand = command;
		this.notifyObservers();
	}

	//GETTERS AND SETTERS
	
	public String getSantasCommand() {
		return santasCommand;
	}
	
	public void setSantasCommand(String santasCommand) 
	{
		this.santasCommand = santasCommand;
	}
	
	public List<Observer> getObservers() 
	{
		return observers;
	}

	public void setObservers(List<Observer> observers) 
	{
		this.observers = observers;
	}
}
