import java.util.Scanner;
class break2Demo{
	public static void main(String[] args){
		int[][] array={
			{1,2,3,4,5},
			{11,13,12,14},
			{23,21,18}		
		};
		Scanner sc=new Scanner(System.in);
		
		int searchfor= sc.nextInt();
		int i;
		int j=0;
		boolean found=false;
		search:
		for(i=0;i<array.length;i++){
			for(j=0;j<array[i].length;j++){
				if(array[i][j]==searchfor){
					found=true;
					break search;
				}
			}
		}
		if(found){
			System.out.println(i);
			System.out.println(j);
		}
		else{
			System.out.println("Not found");
		}
	}
	
}