package com.kuali.codingchallenge;

import java.util.ArrayList;
import java.util.List;

public class ElevatorController {
	
	private List<Floor> floors;
	private List<Elevator> elevators;
	public ElevatorController(List<Floor> floors, List<Elevator> elevators){
		this.floors = floors;
		this.elevators = elevators;
	}
	public ElevatorController(){
		floors = new ArrayList<Floor>(1);
		elevators = new ArrayList<Elevator>(1);
	}
	public void callElevator(){
		
	}
	public void goUp(int floorNumber) {
		Elevator elevator = getElevator(floorNumber);
		elevator.addDestination();
		
	}
	private Elevator getElevator(int floorNumber) {
		// TODO Auto-generated method stub
		return null;
	}
	public void goDown(int floorNumber) {
		// TODO Auto-generated method stub
		
	}

}
