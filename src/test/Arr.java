package test;

import java.util.Arrays;

public class Arr {

	public static void main(String[] args) {
		
		int[] arr= {1,2,4,0,5,0,7,0,0};
		
		int temp=0;
		
		for(int i=0; i<arr.length; i++ )
		
		{
			
			if(arr[i] !=0) {
				
				arr[temp++]=arr[i];
			}
			
		}
		
		while(temp<arr.length) {
			
			arr[temp++]=0;
		
			}
		System.out.println(Arrays.toString(arr));

}
	}
