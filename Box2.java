
public class Box2 {

	public static void main(String[] args) {
		
		Box box1 = new Box(1,2,3);
		Box box2 = new Box(5);
		
		System.out.println("Volume of box1 : " + box1.computeVolume());
		System.out.println("Volumne of box2 : " + box2.computeVolume());

	}

}
