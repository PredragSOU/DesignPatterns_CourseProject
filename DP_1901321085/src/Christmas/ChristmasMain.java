package Christmas;

import java.util.List;

public class ChristmasMain {

	public static void main(String[] args) {
		
		//--SETUP-------------------------------------------------------------------------------------
	
		SantaClaus santaClaus = SantaClaus.getInstance();
		ChristmasFactory bikeFactory = new BikeFactory();	
		ChristmasFactory dollFactory = new DollFactory();
		MagicalBoard magicalBoard = new MagicalBoard();
		
		Command bikeCommand = new BikeCommand(magicalBoard);
		Command dollCommand = new DollCommand(magicalBoard);
			
		Observer firstElf = new ChirstmasElf("Mike");
		Observer secondElf = new ChirstmasElf("Mark");
		Observer thirdElf = new ChirstmasElf("John");
		
		List<Observer> subscribedObservers = magicalBoard.getObservers();
			
		String receivedBoardCommand; 
		
		//--SANTA CONGRATULATES CHRISTMAS------------------------------------------------------------------------------------
		
		santaClaus.congratulateChristmas();
		
		//--SANTA GIVES THE FIRST COMMAND------------------------------------------------------------------------------------
		
		magicalBoard.subscribe(firstElf);
		magicalBoard.subscribe(secondElf);
		magicalBoard.subscribe(thirdElf);
		
		santaClaus.sayCommand(bikeCommand);
		
		receivedBoardCommand = magicalBoard.getSantasCommand();
		
		magicalBoard.passCommand(receivedBoardCommand);
		
		for(int i = 0; i < subscribedObservers.size(); i++) {
			
			ChristmasToy bike = bikeFactory.produceToy(receivedBoardCommand);
			subscribedObservers.get(i).takeToy(bike);
			
		}
		
		//---------------------------------------------------------------------------------------
		
		magicalBoard.unsubscribe(firstElf);
		
		santaClaus.sayCommand(dollCommand);
		
		receivedBoardCommand = magicalBoard.getSantasCommand();
		
		magicalBoard.passCommand(receivedBoardCommand);
		
		for(int i = 0; i < subscribedObservers.size(); i++) 
		{	
			ChristmasToy doll = dollFactory.produceToy(receivedBoardCommand);
			subscribedObservers.get(i).takeToy(doll);	
		}
		
		
		
		
		
		/*for(int i = 0; i < listObs.size(); i++) 
		{
			listObs.get(i);
		}*/
		

	}
	

}
