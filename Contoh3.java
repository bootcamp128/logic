
public class Contoh3 {
	
	String[][] data;
	int baris = 0;
	int kolom = 0;
	
	public void setData(int input){
		this.baris = input;
		this.kolom = input;
		this.data = new String[baris][kolom];
		
		for(int i = 0; i < this.baris; i++){
			for(int j = 0; j < this.kolom; j++){
				if(i == j || i + j == input - 1){
					data[i][j] = "*";
				} /*else if(i + j == input - 1){
					data[i][j] = "*";
				}*/
				
			}
			
		}
		
	}
	
	public void showData(){
		for(int i = 0; i < this.baris; i++){
			for(int j = 0; j < this.kolom; j++){
				System.out.print(data[i][j] + "\t");
			}
			System.out.println();
		}
	}
	
	public static void main(String args[]){
		Contoh3 contoh = new Contoh3();
		contoh.setData(9);
		contoh.showData();
	}

}
