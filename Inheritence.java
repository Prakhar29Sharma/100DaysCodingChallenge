class Vehicle {

	private String name;
	private String color;
	private int wheels;

	public Vehicle(String name, String color, int wheels) {
		this.color = color;
		this.wheels = wheels;
		this.name = name;
	}

	public String getColor() {
		return color;
	}

	public String getName() {
		return name;
	}

	public int getWheels() {
		return wheels;
	}
	
}

class Car extends Vehicle {

	private String model;
	
	public Car(String name, String color, String model){
		super(name, color, 4);
		this.model = model;	
	}
	
	public void show_props(){
		System.out.println("color : " + getColor());
		System.out.println("name : " + getName());
		System.out.println("wheels : " + getWheels());
		System.out.println("model : " + this.model);
	}
}

public class Inheritence {
	public static void main(String[] args){
		Car verna = new Car("hyundai_verna", "black", "model y");
		verna.show_props();
		System.out.println(verna.getName());
	}

}
