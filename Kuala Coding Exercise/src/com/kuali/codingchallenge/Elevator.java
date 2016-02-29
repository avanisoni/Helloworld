package com.kuali.codingchallenge;

public class Elevator implements Runnable{
	public static boolean isOccupied;
	
	public static int noOfTrips = 0;
	
	public static int numberOfFloorsPassed=0;
	
	public static int currentFloor;
	
	public String reportOpen(){
		return "Door Open";
	}
	public String reportClose(){
		return "Door Closing";
	}
	public String reportfloor(Floor floor){
		return "";
	}
	public void countFloor(){
		
	}
	public void countTrips(){
		
	}
	public void answer(){
		
	}
	
	@Override
	public void run() {
	
		
	}
	
	

}
