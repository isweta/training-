package org.mycompany;

import java.util.List;

public class Training {
	String name;
	String location;
	List<Trainee> traineeList;
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getLocation() {
		return location;
	}
	public void setLocation(String location) {
		this.location = location;
	}
	public List<Trainee> getTraineeList() {
		return traineeList;
	}
	public void setTraineeList(List<Trainee> traineeList) {
		this.traineeList = traineeList;
	}
	
	public void getDetails(){
		System.out.println("name of training: "+ name);
		System.out.println("loc: "+location);
		System.out.println("\nTrainees : ");
		for(Trainee  t : traineeList){
			System.out.println("name :"+t.getName());
			System.out.println("mks : "+t.getMarks());
		}
	}

}
