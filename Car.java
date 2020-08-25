package JavaActivityOne;

public class Car {
	String sColor;
	String sTransmission;
	int iMake;
	int iTyre;
	int iDoor;
	
public Car(){
	iTyre = 4;
	iDoor = 4;
}

public void displayCharecterstic() {
	System.out.println("Number of Tyre:"+iTyre);
	System.out.println("Number of Door is:"+iDoor);
}

public void accelerate() {
	System.out.println("The Car is moving forward");
}

public void brake() {
	System.out.println("Car has stopped");
}

}
