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
	
	public static void main(String args[]){
		DeretAngka da = new DeretAngka();
		System.out.println(Arrays.toString(da.incrementByN(9, 21)));
	}
}
