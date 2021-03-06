package com.kuali.codingchallenge;

import java.util.LinkedList;
import java.util.List;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;


/**
 * - Design approach : 
 * I have taken elevator controller approach to solve this problem. 

 * There are challenges to keep shared state in controller and ensure that there are no synchronizaton issues with this approach.

 * I also believe that we could solve this problem using "Message Passing Approach using Akka framework" but I'm not well versed in using Akka framework so decided to go with shared state approach.

 * @author avanisoni
 *
 */
public class ElevatorSimulator {
	public static int numberOfElevators;

	public static int numberOfFloors;
	
	public static int TOP_FLOOR = 5;
	
	private static int NUM_OF_THREADS = 2;
	public static void main(String args[]){
		//arg0 is number of elevators
		numberOfElevators = Integer.valueOf(args[0]);
		//arg1 is number of floors
		numberOfFloors = Integer.valueOf(args[1]);
		
		
		ExecutorService executorService = Executors.newFixedThreadPool(NUM_OF_THREADS);
		
		List<Elevator> elevatorList = new LinkedList<Elevator>();
		for(int i=0; i<numberOfElevators;i++){
			Elevator elevator = new Elevator("Elevator"+i,TOP_FLOOR);
			executorService.execute(elevator);
			elevatorList.add(elevator);
		}
		List<Floor> floorList =  new LinkedList<Floor>();
		for(int i=1; i<=numberOfFloors;i++){
			floorList.add(new Floor(i));
		}
		
		
		
	}
}
