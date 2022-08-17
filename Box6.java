public class Box6{
	public static void main(String[] args){
		Box box1 = new Box();
		Box box2 = new Box();
		
		double v1, v2;
		
		v1 = box1.computeVolume();
		v2 = box2.computeVolume();
		
		System.out.println("Volume of the box1 : " + v1);
		System.out.println("Volume of the box2 : " + v2);
	}
}
