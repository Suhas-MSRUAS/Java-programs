class Car{
	String name;
	String brand;
	String color;
	int noOfWheels;
	public void start(){
		System.out.println("Car is Started");
	}
	
	public static void main(String[] args){
		Car c1 = new Car();
		c1.name = "polo";
		c1.brand = "volkswagon";
		c1.color = "black";
		c1.noOfWheels = 5;
		System.out.println("Car Name = "+c1.name);
		c1.start();
}
}