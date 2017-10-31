package com.xsis.training.bootcamp128.utils;

import java.util.Arrays;

public class DeretAngka {

	//1,2,3,4,5,6..
	public int[] increment(int input){
		int[] data = new int[input];
		
		int b = 1;
		for(int i = 0; i < input; i++){
			data[i] = b;
			b = b + 1;
		}
		
		return data;
	}
	
	//1+n, n+n...
	public int[] incrementByN(int input, int n){
		int[] data = new int[input];
				
		int b = 1;
		for(int i = 0; i < input; i++){
			data[i] = b;
			b = b + n;
		}
				
		return data;
	}
	
	//tri angular 
	public static int getTriAngular(int n){
		int result = 0;
		for(int i = 1; i <= n; i++){
			result = result + i;
		}
		
		return result;
	}
	
	public static int[] getTriAngularArray(int n){
		int[] data = new int[n];
		int result = 0;
		int index =0;
		for(int i = 1; i <= n; i++){
			data[index] = result;
			result = result + i;
			index++;
		}
		
		return data;
	}
	
	public static void main(String args[]){
		System.out.println(getTriAngular(4));
	//	DeretAngka da = new DeretAngka();
	//	System.out.println(Arrays.toString(da.incrementByN(9, 21)));
	}
}
