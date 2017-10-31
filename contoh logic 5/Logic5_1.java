import java.util.Arrays;

import com.xsis.training.bootcamp128.utils.DeretAngka;

public class Logic5_1 {
	//matrix
	String[][] data;
	int baris = 0;
	int kolom = 0;
	// i = y = baris
	// j = x = kolom
	//set data
	public void setData(int input){ //input = 9
		this.baris = DeretAngka.getTriAngular(input); //DeretAngka.incrementByN(input);
		this.kolom = DeretAngka.getTriAngular(input);
		int[] dataArray = DeretAngka.getTriAngularArray(input+1);
		System.out.println(Arrays.toString(dataArray));
		
		data = new String[this.baris][this.kolom];
		for(int bangun = 0; bangun < input; bangun++){
			for(int i = dataArray[bangun]; i < dataArray[bangun+1]; i++){
				for(int j = dataArray[bangun]; j < dataArray[bangun+1]; j++){
					data[i][j] = "*";
				}
			}
		}
		
		/*
		for(int i = 0; i < 1; i++){
			for(int j = 0; j < 1; j++){
				data[i][j] = "*";
			}
		}
		for(int i = 1; i < 3; i++){
			for(int j = 1; j < 3; j++){
				data[i][j] = "$";
			}
		}
		
		for(int i = 3; i < 6; i++){
			for(int j = 3; j < 6; j++){
				data[i][j] = "$";
			}
		}
		
		for(int i = 6; i < 10; i++){
			for(int j = 6; j < 10; j++){
				data[i][j] = "$";
			}
		}*/
		
		this.showData();
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
		Logic5_1 contoh = new Logic5_1();
		contoh.setData(2);
	}

}
