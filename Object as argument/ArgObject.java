// object passing as argument
import java.util.Scanner;

class Rect{
	int length;
	int height;
	int result;
	
	public void area(Rect r){
		result=length*height;
		System.out.println("Area:"+ result);
	}	
}
class ArgObject{
	public static void main(String[] args){
		Scanner sc=new Scanner(System.in);
		Rect q=new Rect();
		int l=sc.nextInt();
		int h=sc.nextInt();
		q.length=l;
		q.height=h;
		q.area(q);
	}
}

