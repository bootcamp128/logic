//hallo world
var data = "hello world javascript";

var fibonachi = "1, 1, 2, 3, 5, 8";
var tribonachi = "0, 1, 3, 6, 10, 15";
var arrays = [fibonachi, tribonachi];

//arrays object
var employee = {
	id : 1,
	name : 'rizky',
	address : 'jakarta'
}

var employee2 = {
		id : 2,
		name : 'aditya',
		address : 'solo'
	}

var employees = [employee, employee2];
/*console.log(employees);*/
//alert(employees);
//ambil value element id output-data
var elementOuput = document.getElementById('output-data');
var elementInput = document.getElementById('text-name');
var elementClick = document.getElementById('click');
//console.log("hasil text : "+ elementOuput.innerHTML);
console.log(elementInput);
//console.log(elementClick);

//method 

showDataName("sugeng");
var dataMax = getMaxValue();
console.log(dataMax);

//event with anonymous function
elementClick.addEventListener("click", function(){
	var textName = document.getElementById('text-name').value;
	var textEmail = document.getElementById('text-email').value;
	var textAddress = document.getElementById('text-address').value;
	
	//json => javascript Object
	var employee = {
		name : textName,
		email : textEmail,
		address : textAddress
	}
	
	console.log(employee);
});

var get = document.getElementById('getData');
get.addEventListener('click', myEvent);

function myEvent(){
	console.log('hello even listener');
}

function getLastName(){
	return "rushid";
}

function getMaxValue(){
	return 54;
}

function showDataName(data){
	console.log("the name : "+ data);
}

//Javascript object 
var name = "nopri"; //variable string (value)
var address = "jakarta"; //variable string (value)
var salary = 50000; //varible integer (value)

//json
var myObject = {};


//prototype
var myHouse = new House("blue", 5688888, "jakut");
function House(color, price, address){
	this.color = color;
	this.price = price;
	this.address = address;
}

var myCar = {
		color : 'red',
		price : 4000,
		number: 'BE1234AC',
		start : function(){
			console.log("my car will start..");
		},
		garage :myHouse
	};
myHouse.street = "jalan kenari";







