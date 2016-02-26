class DemoReturn{
	
	private int brake;
	private int speed;
	private int cadance;
	
	// constructor
	public DemoReturn(int setbrake,int setspeed,int setcadance){
		brake=setbrake;
		speed=setspeed;
		cadance=setcadance;
	}
	
	public int getBrake(){
		return brake;
	}
	public int getSpeed(){
		return speed;
	}
	public int getCadance(){
		return cadance;
	}
	public void print(){
		System.out.println(getBrake());
		System.out.println(getSpeed());
		System.out.println(getCadance());
	}
}

public class returnDemo{
	public static void main(String[] args){
		DemoReturn abc=new DemoReturn(12,13,14);
		abc.print();
	}
}