class Test5 {
	int a;
	public int b;
	private int c;

	void setc(int i){
		c = i;
	}

	int getc(){
		return c;
	}
}

public class AccessTest {
	public static void main(String[] args){
		Test5 obj = new Test5();

		obj.a = 5;
		obj.b = 4;
		obj.setc(9);

		System.out.println("obj.a : " + obj.a);
		System.out.println("obj.b : " + obj.b);
		System.out.println("obj.c : " + obj.getc());

		return;
	}
}