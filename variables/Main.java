class Variable{
	//class variable
	static int bus=0;
	//instance variable
	int car=0;
	int bike=0;
	int cycle=0;

	void print(){
		System.out.println("Bus:" + bus +" Car:" + car +" Bike:" + bike);
	}
}

class Main{
	public static void main(String[] args){
		Variable var1 =new Variable();
		Variable var2 =new Variable();
		var1.print();

		var1.car=2;
		var1.bike=3;
		var1.bus=10;

		System.out.println("Var1:" + var1.car);
		System.out.println(var1.bike);
		System.out.println(var1.bus);

		var2.car=4;
		var2.bike=5;
		var2.bus=20;
		System.out.println(var2.car);
		System.out.println(var2.bike);
		System.out.println("Var1:" + var1.bus);
		System.out.println("Var1:" + var1.car);
		System.out.println("Variable:" + Variable.bus);
		

	}

}