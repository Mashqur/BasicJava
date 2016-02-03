class TernaryOperator{
	
	public static void main(String[] args){
		
		int value1 = 1;
		int value2 = 2;
		int result = 0;
		boolean newresult = true;
		
		result = value1<value2 ? value1 : value2;
		System.out.println(result);
		result = value1>value2 ? value1 : value2;
		System.out.println(result);
		result = newresult ? value1 : value2;
		System.out.println(result);
		result = !newresult ? value1 : value2;
		System.out.println(result);
		
		
	}
}