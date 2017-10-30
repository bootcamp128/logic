
public class EXAMPLE_TEST {
	
	int baris = 0; 
	int kolom = 0;
	public String[][] data;
	
	public void setData(int n){
		this.baris = n * n;
		this.kolom = n * n;
		this.data = new String[this.baris][this.kolom];
		int addBlock = 0;
		int increment = 0;
		for(int i2 = 0; i2 < n; i2++){
			int addRight = 0;
			for(int j2 = 0; j2 < n; j2++){
				for(int i = 0; i < this.baris; i++){
					for(int j = 0;j < this.kolom; j++){
						if(i >= j && i <= n - 1 && j <= n -1){
							if(i2 == j2){
								data[i+addBlock][j+addRight] = increment  + "";
								increment = increment + 1;
							}
							 
						}
						
					}
				}
				addRight = addRight + n;
			}
			addBlock = addBlock + n;
		}
		
		
		showData();
	}
	
	public void showData(){
		for(int i = 0; i < this.baris; i++){
			for(int j = 0;j < this.kolom; j++){
				System.out.print(data[i][j] + "\t");
			}
			System.out.println();
		}
	}
	
	public static void main(String argas[]){
		
		EXAMPLE_TEST example = new EXAMPLE_TEST();
		example.setData(4);
	}

}
