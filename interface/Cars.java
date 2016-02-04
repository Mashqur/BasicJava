class BMW implements Car{

	String wheeldrive;
	int gear=0;
	int door=0;

	public void wheeldrive(String newwheeldrive){

		wheeldrive=newwheeldrive;
	}

	public void gear(int newgear){

		gear=newgear;
	}

	public void door(int newdoor){

		door=newdoor;
	}

	void specification(){

		System.out.println("Wheeldrive:" + wheeldrive + " Gear:" + gear + " Door:" + door);
	}
}

class Cars{

	public static void main(String[] args){
		BMW bmw = new BMW();

		bmw.wheeldrive("4W");
		bmw.gear(6);
		bmw.door(4);
		bmw.specification();
	}
}