interface printable {
	void print();
}

class InterfaceDemo implements printable {
	
	public void print() {
		System.out.println("Hello");
	}

	public static void main(String args[]) {
		InterfaceDemo obj = new InterfaceDemo();
		obj.print();
	}
}
