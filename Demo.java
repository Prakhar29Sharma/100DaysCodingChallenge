class Car {
	static int topSpeed = 100;
	static int maxCapacity = 4;

	public static void printSpeed() {
		System.out.println(topSpeed);
	}
}

class Demo {
	public static void main(String[] args) {
		System.out.println(Car.topSpeed);
		Car.printSpeed();
	}
}
