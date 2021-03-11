package Abstraction;

public class Twowheelar extends Vehicale
{

	@Override
	public int setMaxSpeed(int maxSpeed) {
		if(maxSpeed>120)
			System.err.println("Maxspeed should be less than 120");
		else
			constant.MaxSpeed=maxSpeed;
		
		return constant.MaxSpeed;
	}
	
	
	
}
