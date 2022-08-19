class Test {
	int a, b;

	/* constructor */
	Test(int i, int j){
		a = i;
		b = j;
	}

	/* equalTo method : compares obj : Equal/Not-Equal */
	void equalTo(Test o){

		if(o.a == a && o.b == b ){
			System.out.println("Equal!");
		} else {
			System.out.println("Not Equal!");
		}

	}
}


public class PassObj {
	public static void main(String[] args){
		
		Test obj1 = new Test(1,2);
		Test obj2 = new Test(1,2);
		Test obj3 = new Test(2,3);

		obj1.equalTo(obj2);
		obj1.equalTo(obj3);
		obj3.equalTo(obj3);

		return;
	}
}