package com.java.logic.PreTest1;

public class Soal3 {

	private int dimX = 0;
	private int dimY = 0;
	private String[][] data;
	
	public void setDataArray(int input){
		this.dimX = input;
		this.dimY = input;
		
		data = new String[dimY][dimX];
		for(int i = 0; i < dimY; i++){
			for(int j = 0; j < dimX; j++){
				if(i <= j && i + j <= input - 1 && i % 2 == 0){
					this.data[i][j] = "*";
					this.data[input - 1 - i][j] = "*";
					this.data[j][i] = "*";
					this.data[j][input - 1 - i] = "*";
				} 
				if(i == j + 1 && i <= input/2){
					this.data[i][j] = null;
				}
				if(i == j + 1 && i <= input/2 && j %2 == 1){
					this.data[i][j] = "*";
				}
			}
		}
	}
	
	public void showDataArray(int input){
		setDataArray(input);
		
		for(int i = 0; i < dimY; i++){
			for(int j = 0; j < dimX; j++){
					System.out.print(this.data[i][j]+"\t");
			}
			System.out.println(" ");
		}
	}
	
	public static void main(String args[]){
		Soal3 soal = new Soal3();
		soal.showDataArray(9);
	}
}
