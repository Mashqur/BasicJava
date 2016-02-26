class demostatic{
	int a=12;
	static int b=13;
}

class StaticDemo{
	public static void main(String[] args){
		
		demostatic abc=new demostatic();
		demostatic xyz=new demostatic();
		demostatic qwe=new demostatic();
		xyz.a=23;
		xyz.b=34;
		System.out.println(abc.a);
		System.out.println(abc.b);
		System.out.println(xyz.a);
		System.out.println(abc.a);
		System.out.println(demostatic.b);
		System.out.println(qwe.a);
		System.out.println(qwe.b);
	}
}