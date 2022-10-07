import java.util.*;

class GenericsDemo {
	public static void main(String args[]) {
		ArrayList<String> list = new ArrayList<String>();
		list.add("Ajay");
		list.add("Rahul");
		String s = list.get(1);
		System.out.println("element is " + s);
		return;
	}
}
