package src.com;

// Hierarchical Inheritance
class Bicycle1     //Base class
{
	int gear;
	int speed;
	
	public Bicycle1(int gear, int speed) {      //constructor
		this.gear = gear;
		this.speed = speed;
	}
	
	void applyBreak(int decrement)
	{
		speed-=decrement;
	}
	
	void speedUp(int increment)
	{
		speed+=increment;
	}

	@Override
	public String toString() {
		return "Bicycle [gear=" + gear + ", speed=" + speed + "]";
	}
}


class MountainBike1 extends Bicycle1         //Subclass
{
	int seatHeight;
	public MountainBike1(int gear,int speed,int seatHeight)
	{
	super(gear,speed);
	this.seatHeight=seatHeight;
	}
	
	void adjustHeight(int value)
	{
		seatHeight=value;
	}

@Override
	public String toString() {
		return "MountainBike [seatHeight=" + seatHeight + ", gear=" + gear + ", speed=" + speed + "]";
	}
}

class BMX extends Bicycle1   //Subclass
{
	int wheelSize;
	public BMX(int gear,int speed,int wheelsize)
	{
		super(gear,speed);
		this.wheelSize=wheelsize;
	}
	void adjustSize(int value)
	{
		wheelSize=value;
	}

@Override
	public String toString() {
		return "BMX [wheelSize=" + wheelSize + ", gear=" + gear + ", speed=" + speed + "]";
	}
}

public class InheritanceDemo1 {

	public static void main(String[] args) {
		
		  MountainBike1 bike=new MountainBike1(5,160,20); bike.speedUp(20);
		  bike.applyBreak(5); 
		  bike.adjustHeight(4);
		  System.out.println(bike.toString());
		 
		
		BMX bike1=new BMX(5,160,10);
		bike1.speedUp(10);
		bike1.applyBreak(5);
		bike1.adjustSize(20);
		System.out.println(bike1.toString());

	}

}
