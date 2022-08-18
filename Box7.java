public class Box7{
	public static void main(String[] args){
		Box box1 = new Box();
		Box box2 = new Box();
		
		box1.setDim(3,4,5);
		box2.setDim(5,6,7);
		
		System.out.println("Volume of the box1 : " + box1.computeVolume());
		System.out.println("Volume of the box2 : " + box2.computeVolume());
	}
}
