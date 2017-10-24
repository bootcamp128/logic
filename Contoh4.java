
public class Contoh4 {
	
	String[][] data;
	int baris = 0;
	int kolom = 0;
	
	public void setData(int input){
		this.baris = input;
		this.kolom = input;
		data = new String[this.baris][this.kolom];
		for(int i = 0; i < this.baris; i++){
			for(int j = 0; j < this.kolom; j++){
				if(i == j || i + j == input - 1 || j == input / 2){
					data[i][j] = "*";
				} else if(i == input / 2){
					data[i][j] = "*";
				}
				
			}
		}
	}
	
	public void showData(){
		for(int i = 0; i < this.baris; i++){
			for(int j = 0; j < this.kolom; j++){
				if(data[i][j] != null){
					System.out.print(data[i][j] + "\t");
				} else{
					System.out.print("\t");
				}
				
			} 
			System.out.println();
		}
	}

	public static void main(String[] args){
		Contoh4 contoh = new Contoh4();
		contoh.setData(5);
		contoh.showData();
	}
}
