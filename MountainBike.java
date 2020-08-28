package OppsConcept;

interface BicycleParts {
	public int gears=0;
	public int currentSpeed=0;
	
}

interface BicycleOperations{
	public void applyBreak(int decrement);
	public void speedUp(int increament);
	
}


class Bicycle implements BicycleParts,BicycleOperations{
	
	public int gears;
	public int currentSpeed;
	// creation of constarctor
	Bicycle(int gears,int currentSpeed){
		this.gears=gears;
		this.currentSpeed=currentSpeed;
	}
	
	

	public void applyBreak(int decrement) {
		currentSpeed-=decrement;
		System.out.println("Current Speed is:"+currentSpeed);
	}

	public void speedUp(int increament) {
		currentSpeed+=increament;
		System.out.println("Current Speed is: "+currentSpeed);
	}
	
	public String bicycleDesc() {
		return("No of gears are "+gears+"\nSpeed of Bicycle is: "+currentSpeed);
	}
	

}

public class MountainBike extends Bicycle{
	
	//The MountainBike subclass adds one more field
    public int seatHeight;

    //The MountainBike subclass has one constructor
    public MountainBike(int gears, int currentSpeed, int startHeight) {
        //Invoking base-class(Bicycle) constructor
        super(gears, currentSpeed);
        seatHeight = startHeight;
    }
    
    public void setHeight(int newValue) {
        seatHeight = newValue;
    }
    
    public String bicycleDesc() {
		return("No of gears are "+gears+"\nSpeed of Bicycle is: "+currentSpeed+"\nSeat Hight:"+seatHeight);
	}


	
	
	public static void main(String[] args) {
		MountainBike mb = new MountainBike(3,0,20);
		System.out.println(mb.bicycleDesc());
		mb.speedUp(20);
		mb.applyBreak(5);

	}
	
}
