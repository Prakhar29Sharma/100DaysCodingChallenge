public class Box5{
	public static void main(String[] args){
		Box box1 = new Box(2,3,4);
		Box box2 = new Box(5,4,1);
		
		double vol1, vol2;
		
		vol1 = box1.computeVolume();
		vol2 = box2.computeVolume();
		
		System.out.println("Volume of box1 : " + vol1);
		System.out.println("Volume of box2 : " + vol2);
	}
}
