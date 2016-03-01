class overload{
	int gear;
	String name;
	char letter;
	
	void name(int newgear){
		gear=newgear;
		System.out.println(gear);
	}
	void name(String newname){
		name=newname;
		System.out.println(name);
	}
	void name(char newletter){
		letter=newletter;
		System.out.println(letter);
	}
	
}
class OverLoading{
	public static void main(String[] agrs){
		overload abc=new overload();
		abc.name('A');//method is called depends on the value.
		//abc.name("this is a string");
		//abc.name(12);
	}
}