package Abstraction;

public class ThreeWheelar extends Vehicale
{

	@Override
	public int setMaxSpeed(int maxSpeed) {
		// TODO Auto-generated method stub
		

	if(maxSpeed>70)
		System.err.println("Maxspeed should be less than 70");
	else
		constant.MaxSpeed=maxSpeed;
	
	return constant.MaxSpeed;
}
}
