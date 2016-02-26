class unary{
	public static void main(String[] args){
		
		int i = 10;
		int n = i++%5;
		System.out.println(i);
		System.out.println(n);//value of n =0
		
		//if we use the below code value of n will be 1
		// int i = 10;
// 		int n = ++i%5;
// 		System.out.println(i);
// 		System.out.println(n);
		
		
	}
}