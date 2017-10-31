import java.util.Arrays;

public class Logic6_1 {
	//matrix
	String[][] data;
	int baris = 0;
	int kolom = 0;
	// i = y = baris
	// j = x = kolom
	//set data
	public void setData(int input){ //input = 9
		if(input > 1){
			this.kolom = (input * 2 - 1) * 2;
		} else {
			this.kolom = 1;
		}
		this.baris = input * input;
		//this.kolom = (input * 2 - 1) * 2;
		
		data = new String[this.baris][this.kolom];
		int addBangun = 0;
		for(int bangun = 0; bangun < input; bangun++){
			for(int i = 0; i < this.baris; i++){
				for(int j = 0; j < this.kolom; j++){
					if(i + j >= (input-1) && i - j >= -(input-1) && j <= (input * 2 - 1) && i <= (input - 1)){
						if(bangun % 2 == 0){
							data[i+addBangun][j] = "*";
						} else {
							data[i+addBangun][j+(input * 2 - 1)] = "*";
						}
					}
					
				}
			}
			addBangun = addBangun + input;
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
		Logic6_1 contoh = new Logic6_1();
		contoh.setData(2);
		/*
		 * i = 0 => j = 0 - 8
		 * i = 1 => j = 0 - 8
		 * */
	}

}
