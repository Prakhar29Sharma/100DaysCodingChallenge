
public class Box3 {

	public static void main(String[] args) {
		
		double vol;
		Box box1 = new Box();
		box1.setDimension(3, 4, 5);
		vol = box1.computeVolume();
		System.out.println("Volume of the box : " + vol);

	}

}
