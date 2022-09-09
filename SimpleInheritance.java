class A {
	int i, j;
	
	void showij() {
		System.out.println("i and j : " + i + " " + j);
	}
}

class B extends A {
	int k;
	
	void showk() {
		System.out.println("k: " + k);
	}
	void sum() {
		System.out.println("i+j+k : " + (i+j+k));
	}
}

public class SimpleInheritance {
	public static void main(String[] args) {
		A superOb = new A();
		B subOb = new B();
		superOb.i = 10;
		superOb.j = 12;
		System.out.println("Contents of super obj : ");
		superOb.showij();
		subOb.i = 10;
		subOb.j = 12;
		subOb.k = 14;
		subOb.showk();
		subOb.sum();
	}
}
