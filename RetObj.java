class Test4 {
	int a;

	Test4(int i){
		a = i;
	}

	// return type of incrByTen() is class name //
	Test4 incrByTen(){
		// creating new obj and passing a + 10 //
		Test4 temp = new Test4(a + 10);
		// returning new obj //
		return temp;
	}
}


public class RetObj {
	public static void main(String[] args){
		Test4 obj = new Test4(10);
		Test4 newObj; // obj to store returned value //
		newObj = obj.incrByTen();
		System.out.println(newObj.a);
		return;
	}
}