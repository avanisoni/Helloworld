package com.kuali.codingchallenge;

import java.util.LinkedList;
import java.util.List;

public class ElevatorSimulator {
	public static int numberOfElevators;

	public static int numberOfFloors;
	
	public static void main(String args[]){
		//arg0 is number of elevators
		numberOfElevators = Integer.valueOf(args[0]);
		//arg1 is number of floors
		numberOfFloors = Integer.valueOf(args[1]);
		
		List<Elevator> elevatorList = new LinkedList<Elevator>();
		for(int i=0; i<numberOfElevators;i++){
			elevatorList.add(new Elevator());
		}
		List<Floor> floorList =  new LinkedList<Floor>();
		for(int i=1; i<=numberOfFloors;i++){
			floorList.add(new Floor(i));
		}
		
		
	}
}
