package com.java.logic.PreTest1;

public class Soal7 {

	private int dimX = 0;
	private int dimY = 0;
	private String[][] data;
	
	public void setDataArray(int input, int n2, int n3){
		this.dimX = n2 * n3;
		this.dimY = input+(n2-1);
		
		data = new String[dimY][dimX];
		int addBlock = 0;
		for(int block = 0; block < n3; block++){
			for(int bangun = 0; bangun < input; bangun++){
				for(int i = 0; i < dimY; i++){
					for(int j = 0; j < dimX; j++){
						if(i == j && j < n2){
							this.data[i+bangun][j+addBlock] = "*";
						/*	this.data[i+1][j] = "*";
							this.data[i+2][j] = "*";*/
						}
						//this.data[i][j] = "*";
					}
				}
			}
			addBlock = addBlock + n2;
		}
		
		
	}
	
	public void showDataArray(int input, int n2, int n3){
		setDataArray(input, n2, n3);
		
		for(int i = 0; i < dimY; i++){
			for(int j = 0; j < dimX; j++){
					System.out.print(this.data[i][j]+"\t");
			}
			System.out.println(" ");
		}
	}
	
	public static void main(String args[]){
		Soal7 soal = new Soal7();
		soal.showDataArray(5, 5, 3);
	}
}
