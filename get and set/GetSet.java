class setget{
	private int speed;
	private int brake;
	private int gear;

	public void setSpeed(int newspeed){
		speed=newspeed;
	}
	public void setBrake(int newbrake){
		brake=newbrake;
	}
	public void setGear(int newgear){
		gear=newgear;
	}

	public int getSpeed(){
		return speed;
	}
	public int getBrake(){
		return brake;
	}
	public int getGear(){
		return gear;
	}

	public void print(){
		System.out.println(getSpeed());
		System.out.println(getBrake());
		System.out.println(getGear());
	}
}

class GetSet{
	public static void main(String[] args){
		setget cycle=new setget();
		cycle.setSpeed(24);
		cycle.setBrake(0);
		cycle.setGear(3);
		cycle.print();
	}
}