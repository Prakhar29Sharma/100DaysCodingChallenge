
public class Box4 {
	public static void main(String[] args) {
		Box box1 = new Box();
		
		box1.length = 3;
		box1.width = 4;
		box1.depth = 3;
		
		System.out.println("Volume of Box : " + box1.computeVolume());
	}
}
