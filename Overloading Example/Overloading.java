import java.util.Scanner;

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
		
		Scanner sc=new Scanner(System.in);
		int z=sc.nextInt();
		
		String s=sc.nextLine();
		sc.nextLine();
		char c=sc.next().charAt(0);
	}
}