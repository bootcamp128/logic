package com.java.logic.PreTest1;

public class Soal2 {

	private int dimX = 0;
	private int dimY = 0;
	private String[][] data;
	
	public void setDataArray(int input){
		this.dimX = 3 * input;
		this.dimY = 3 * input;
		
		data = new String[dimY][dimX];
		int addBlock = 0;
		for(int block = 0; block < input; block++){
			int addBangun = 0;
			for(int bangun = 0; bangun < input; bangun++){
				for(int i = 0; i < dimY; i++){
					for(int j = 0; j < dimX; j++){
						if(j == 0 && i < 3 || i == 0 && j < 3 || j == 3 - 1&& i < 3 || i == 3 -1 && j < 3 ){
							if(block == bangun){
								this.data[i+addBlock][j+addBangun] = "*";
							} else if(block + bangun == input - 1){
								this.data[i+addBlock][j+addBangun] = "*";
							}
							
						}
					}
				}
				addBangun = addBangun + 3;
			}
			addBlock = addBlock + (3);
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
		Soal2 soal = new Soal2();
		int input = 2;
		soal.showDataArray(input + 1);
	}
}
