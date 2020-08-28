package OppsConcept;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class Plane {
	private List<String> passengers;
	private int maxPassengers;
	private Date lastTimeTookOf;
	private Date lastTimeLaned;
	
	public Plane(int maxPassengers){
		this.maxPassengers = maxPassengers;
		this.passengers = new ArrayList<>();
	}
	
	public void onBoard(String passenger) {
		this.passengers.add(passenger);
	}
	
	public Date takeOff() {
		this.lastTimeTookOf = new Date();
		return lastTimeTookOf;
	}
	
	public void land() {
		this.lastTimeLaned = new Date();
		this.passengers.clear();
	}
	
	public Date lastTimeLanded() {
		return lastTimeLaned;
	}
	
	public List<String> getPassengers() {
		return passengers;
	}

}
