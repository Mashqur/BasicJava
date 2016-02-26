class continueDemo{
	public static void main(String[] args){
		int[][] array={
					{7,2,3,4,5},
					{2,3,7,5,6},
					{3,4,5,6,7}
		};
		int i;
		int j=0;
		int num=0;
		//int searchfor=7;
		for(i=0;i<array.length;i++){
			for(j=0;j<array[i].length;j++){
				if(array[i][j]!=7){
					continue;
				}
				num++;
				System.out.println(i+" "+j);
			}
			
		}
		System.out.println(num);
	}
}
