# Java 
	1. constructor
	2. constructor overloading 
	3. method / function overloading
	4. Encapsulation 
	5. Exception Handling
		1. try catch 
		2. throw Exception
			
## Contructor
### Overview
	Constructor adalah yang 
		1. memiliki nama yang sama dengan nama class 
		2. akan dijalankan pada saat terjadinya instansiasi object 
		3. tidak memiliki nilai balik.
		
### example constructor empty : 
	public class MyContructor {
		//contructor
		public MyContructor(){
			System.out.print("hello constructor!!");
		}
	}
### example constructor with parameter
	public MyContructor(String name){
		System.out.println("hello "+ name);
	}
	
## Constructor Overloading 
### Overview 
	constructor yang memiliki nama yang sama tapi memiliki type data dan jumlah parameter yang berbeda.
	
## Overloading (method) 
	beberapa method yang memiliki nama yang sama tapi memiliki type data dan jumlah parameter yang berbeda.
### Example : 
		public void setName(String firstName){
		this.name = firstName;
	}
	public void setName(String firstName, String lastName){
		this.name = firstName + " " + lastName;
	}

## Encapsulation
### Overview
   - Pembungkusan object
   - Java is a mechanism of wrapping the data (variables) and code acting on the data (methods) together as a single unit
### Create Encapsulation 
	1. Declare the variables of a class as private.
	2. Provide public setter and getter methods to modify and view the variables values.
### Example : 
	// POJO / Java Bean
	public class Mahasiswa {	
		//property / variable / field
		private String name;
		private String address;
		private String nim;
		private String email;
		//private String fakultas;
		private Double uangSaku;
		
		.. empty constructor 
		.. fields constructor parameter
		
		.. setter and getter
		
## Exception Handling
### Overview 
	Handling An exception (or exceptional event) is a problem that arises during the execution of a program
		
### Try catch
	public class MyException {	
		public void proses(){
			String[] data = new String[3];
			Scanner scanner = new Scanner(System.in);
			try{
				System.out.println("masukan angka : ");
				int input = scanner.nextInt();
				
				System.out.println("angka : "+ input);
				data[0] = "a";
				data[1] = "b";
				data[2] = "c";
				data[3] = "d";
			}catch(ArrayIndexOutOfBoundsException e){
				System.err.println("index array kelebihan");
			}catch(InputMismatchException e2 ){
				System.err.println("input harus angka !!");
			}catch(Exception other){
				System.err.println("other error !!");
			}finally{
				System.out.println("executed!!");
			}
			
			
			System.out.println(Arrays.toString(data));
		}
		
		public static void main(String[] args){
			new MyException().proses();
		}

	}
	
### Throw Exception Example
	public void throwProcess() throws Exception{
		InputStreamReader isr = new InputStreamReader(System.in);
		BufferedReader br = new BufferedReader(isr);
		int data = Integer.parseInt(br.readLine());
		System.out.println("data : "+ data);
	}
	
	public static void main(String[] args){
		MyException me = new MyException();
		try {
			me.throwProcess();
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}