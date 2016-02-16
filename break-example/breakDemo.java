import java.util.Scanner;
class breakDemo{
	public static void main(String[] args){
		int[] array={1,2,3,4,5,6,7,8,9};
		int i;
		boolean found=false;
		Scanner sc=new Scanner(System.in);
		int searchfor=sc.nextInt();
		
		for(i=0;i<array.length;i++){
			if(array[i]==searchfor){
				found=true;
				break;
			}
		}
		if(found){
			System.out.println(i);
		}
		else{
			System.out.println("Not found");
		}
	}
}