package com.java.logic.PreTest1;

public class template {

	private int dimX = 0;
	private int dimY = 0;
	private String[][] data;
	
	public void setDataArray(int input){
		this.dimX = input;
		this.dimY = input;
		
		data = new String[dimY][dimX];
		for(int i = 0; i < dimY; i++){
			for(int j = 0; j < dimX; j++){
				if(i + j == input - 1){
					this.data[i][j] = "*";
				} else if(i == j) {
					this.data[i][j] = "@";
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
		template soal = new template();
		soal.showDataArray(7);
	}
}
