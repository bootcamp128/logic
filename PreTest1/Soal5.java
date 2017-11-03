package com.java.logic.PreTest1;

public class Soal5 {
	
	int baris= 0;
	int kolom=0;
	String[][] data;
	
	public int getMaxWidth(int n){
		return n;
	}
	
	public int getMaxHeigth(int n){
		return n;
	}
	
	public void setDataArray(int n){
		this.baris = getMaxHeigth(n);
		this.kolom = getMaxWidth(n);
		
		data = new String[this.baris][this.kolom];
		int kanan = n - 1;
		int kiri = 1;
		for(int i = 0; i < baris; i++){
			for(int j = 0; j < kolom; j++){
				if(i % 2 == 0){
					data[i][j] = "*";
				} else if(i % 4 == 1 && j == kanan){
					data[i][j] = "#";
				} else if(i % 4 == 3 && j == kiri){
					data[i][j] = "$";
				}
			}
			
			if(i % 4 == 1){
				kanan = kanan - 2;
			} else if(i % 4 == 3){
				kiri = kiri + 2;
			}	
		}
	};
	
	public void getDataArray(int n){
		this.setDataArray(n);
		for(int i = 0; i < baris; i++){
			for(int j = 0; j < kolom; j++){
				System.out.print(data[i][j]+"\t");
			}
			System.out.println("");
		}
	}
	
	public static void main(String args[]){
		Soal5 test = new Soal5();
		test.getDataArray(9);
	}

}
