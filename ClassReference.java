import java.util.Arrays;

public class ClassReference {

	private String name;
	private int age= 6;
	private Integer age2 = new Integer(7);
	private Double salary;
	private short id;
	private String[] dataArray;
	private Employee employee = new Employee();
	private Employee[] employees = new Employee[5];

	//ARRAY
	public void exampleArray(){
		//single 1
		int[] data = new int[3];
		data[0] = 11;
		data[1] = 222;
		data[2] = 35;
		
		//single 2
		String[] dataKota = {
				"jakarta", "bandung", "surabaya"
		};
		
		//single 3
		String dataProvinsi[] = new String[]{
			"lampung", "jawa barat"	
		};
		
		System.out.println(Arrays.toString(data));
		System.out.println(Arrays.toString(dataKota));
		System.out.println(Arrays.toString(dataProvinsi));
		
		//multiple => matrix
		int[][] fields = new int[3][3];
		fields[0][0] = 1;
		fields[1][1] = 2;
		fields[2][2] = 3;
		
		System.out.println(Arrays.toString(fields[0]));
		System.out.println(Arrays.toString(fields[1]));
		System.out.println(Arrays.toString(fields[2]));
	}
	
	public static void main(String[] args){
		ClassReference cf = new ClassReference();
		cf.exampleArray();
	}
}

