package Abstraction;

public class Fourwheelar extends Vehicale
{

	@Override
	public int setMaxSpeed(int maxSpeed) {
		// TODO Auto-generated method stub
		
	if(maxSpeed>200)
		System.err.println("Maxspeed should be less than 200");
	else
		constant.MaxSpeed=maxSpeed;
	
	return constant.MaxSpeed;
	
	}
}
