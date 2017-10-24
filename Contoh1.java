import java.util.Arrays;

public class Contoh1 {
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
		
		data = new String[this.baris][this.kolom];
		for(int i = 0; i < this.baris; i++){
			for(int j = 0; j < this.kolom; j++){
				data[i][j] = i + "," + j;
			}
		}
		
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
		Contoh1 contoh = new Contoh1();
		contoh.setData(9);
		/*
		 * i = 0 => j = 0 - 8
		 * i = 1 => j = 0 - 8
		 * */
	}

}
