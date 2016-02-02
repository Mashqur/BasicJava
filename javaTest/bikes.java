class Bmx implements bike{
	
	int speed=0;
	int gear=1;
	int cadance=0;
	
	 public void Speedup(int newspeed){
		
		speed=speed+newspeed;
	}
	
	public void Gear(int newgear){
		gear=newgear;
	}
	
	void specification(){
		
		System.out.println("Speed:" + speed +" Gear:" + gear);
	}
}

class bikes{
	
	public static void main(String[] args){
		
		Bmx bmx=new Bmx();
		
		// bike bmx=new bike();
// 		motorbike yamaha=new motorbike();
		
		bmx.Speedup(30);
		bmx.Gear(4);
		bmx.specification();
		
		// yamaha.Gear(6);
// 		yamaha.Speedup(100);
// 		yamaha.Maxspeed(250);
// 		yamaha.specification();
// 		yamaha.motorbikespecification();
	}
}

// class motorbike extends bike{
//
// 	int maxspeed=0;
//
// 	void Maxspeed(int newmaxspeed){
// 		maxspeed=newmaxspeed;
// 	}
// 	void motorbikespecification(){
// 		System.out.println("Maxspeed:" + maxspeed);
// 	}
// }