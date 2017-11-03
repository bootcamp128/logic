package com.java.logic.PreTest1;

public class Soal1 {

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
						if(i >= j && i < 3){
							if(bangun == 0){
								this.data[i+addBlock][j+ addBangun] = "*";
							} else if(block == 0){
								this.data[i+addBlock][j+ addBangun] = "*";
							} else if(block == bangun){
								this.data[i+addBlock][j+ addBangun] = "*";
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
		Soal1 soal = new Soal1();
		soal.showDataArray(3);
	}
}
