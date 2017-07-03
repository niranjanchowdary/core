package com.niranjan1;

public class ValidateSudoku {
	boolean flag=false;
	int csum,rsum;
	public boolean validateSudoku(int array[][]){
		
		for(int i=0; i<array.length;i++)
		{
			csum=0;
			rsum=0;
		for(int j=0;j<array.length;j++){	
		
			csum+=array[j][i];
			rsum+=array[i][j];
		
			
		}
		flag=callMe(rsum,csum,array);
		}		
		
		return flag;
	}
	private boolean callMe(int rsum2, int csum2,int[][] array) {
		// TODO Auto-generated method stub
		int lengthOfArray=array.length;
		int sum=0;
		for(int i=lengthOfArray;i>0;i--)
			sum=sum+i;
			if(csum2!=sum&&rsum2!=sum){
				flag=false;
			}
			else{
				flag=true;
			}
	
				
		return flag;
		
	}

}

