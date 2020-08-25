package JavaActivityOne;

public class Activity1_1_Java {

	public static void main(String[] args) {
		Car Toyota = new Car();
		Toyota.iMake=2014;
		Toyota.sColor="Black";
		Toyota.sTransmission="Manual";
		// calling method
		Toyota.displayCharecterstic();
		//accelerate
		Toyota.accelerate();
		//break
		Toyota.brake();

	}

}
