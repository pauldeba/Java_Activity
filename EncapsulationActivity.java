package OppsConcept;

public class EncapsulationActivity {

	public static void main(String[] args) throws InterruptedException {
		Plane plane = new Plane(10);
		// adding passengers
		plane.onBoard("Jhon");
		plane.onBoard("Tom");
		plane.onBoard("Mary");
		//print take of time
		System.out.println("Take of time:"+plane.takeOff());
		//printing passengers on board
		System.out.println(plane.getPassengers());
		//Fylying
		Thread.sleep(5000);
		// plane has landed
		plane.land();
		// plane lands
		System.out.println("Last Time Landed:"+plane.lastTimeLanded());
		//print passengers
		System.out.println("People on the boad after Landing"+plane.getPassengers());

	}

}
