package com.java.logic.PreTest1;

public class Soal4 {
	
	int baris= 0;
	int kolom=0;
	String[][] data;
	
	public int getMaxWidth(int n){
		return (n*2) - 1;
	}
	
	public int getMaxHeigth(int n){
		return (n*2) - 1;
	}
	
	public void setDataArray(int n){
		this.baris = getMaxHeigth(n);
		this.kolom = getMaxWidth(n);
		int mid = getMaxWidth(n) / 2;
		System.out.println("hasil : "+ mid);
		data = new String[this.baris][this.kolom];
		for(int i = 0; i < baris; i++){
			for(int j = 0; j < kolom; j++){
				if(i + j >= mid && i - j >= -mid && i + j <= ((this.baris - 1) + mid) && i - j <= mid ){
					data[i][j]= "*";
					if(i + j >= mid + 3 && i - j <= mid - 3 && i - j >= - (mid - 3) && i + j <= ((this.baris - 1) + mid) - 3){
						data[i][j]= "#";
					}
					
				}
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
		Soal4 test = new Soal4();
		test.getDataArray(7);
	}

}
