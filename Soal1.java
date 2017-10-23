package com.xsis.training.bootcamp128.logic1;

public class Soal1 {
	

	public static void main(String args[]){
		int input = 5;
		
		int width = input;
		int height = input;
		
		//10x
		//x = j = kolom
		//y = i = baris 
	/*for(int xj = 0; xj < 2; xj++){
		for(int p = 0; p < 2; p++){
			for(int i = 0; i < 3; i++){
				System.out.print("*\t");
			}
		}
	}*/
		
		//IF => AND => YANG 
		//ELSE IF => OR => ATAU
		
	    for(int i = 0; i < height; i++){
			for(int j = 0; j < width; j++){
				if(i == j){
					System.out.print(i + ","+j+ "\t");
				} else if(i == 0){
					System.out.print(i + ","+j+ "\t");
				} else if(j == 0){
					System.out.print(i + ","+j+ "\t");
				}else {
					System.out.print("\t");
				}
				
			}
			System.out.println("");
		}
	}
}
