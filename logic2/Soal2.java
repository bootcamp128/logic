package com.xsis.training.bootcamp128.logic2;
import java.util.Arrays;

public class Soal2 {
	//matrix
	String[][] data;
	int baris = 0;
	int kolom = 0;
	// i = y = baris
	// j = x = kolom
	//set data
	public void setData(int input){ //input = 9
		this.baris = input;
		this.kolom = input;
		
		int a = 1;
		int b = 0;
		int[] max = getMaxValue(input);//input * 2 - 2;
		//[0, 2, 4, 6, 8, 10, 12, 14, 16]
		
		System.out.println(Arrays.toString(max));
		
		data = new String[this.baris][this.kolom];
		for(int i = 0; i < this.baris; i++){
			for(int j = 0; j < this.kolom; j++){
				if(i + j == input - 1){
					data[i][j] = String.valueOf(max[input-1 - i]);
				} else if(i == j){
					data[i][j] = String.valueOf(a);
				}
			}
			
			a = a+ 2;
			//max = max - 2;
		}
		
		this.showData();
	}
	
	public int[] getMaxValue(int input){
		int[] result = new int[input];
		int angka = 0;
		
		for(int i = 0; i < input; i++){
			result[i] = angka;
			angka = angka + 2;
		}
		
		return result;
	}
	
	//show data
	public void showData(){
		for(int i = 0; i < this.baris; i++){
			for(int j = 0; j < this.kolom; j++){
				System.out.print(data[i][j] + "\t");
			}
			System.out.println("");
			//System.out.println(Arrays.toString(data[0]));
		}
		
	}
	
	public static void main(String args[]){
		Soal2 contoh = new Soal2();
		contoh.setData(9);
		/*
		 * i = 0 => j = 0 - 8
		 * i = 1 => j = 0 - 8
		 * */
	}

}
