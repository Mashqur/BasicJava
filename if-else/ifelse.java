class Brakes{
	int speed = 50;
	boolean isMoving = true;
	void applybrake(){
		if(!isMoving){
			speed=0;
			System.out.println(speed);
		}
		else{
			System.out.println("Bike is not moving");
		}
	}
}

class ifelse{
	public static void main(String[] args){
		Brakes brakes = new Brakes();
		brakes.applybrake();
	}
	
}