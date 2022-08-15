
public class Box {
	
	double length;
	double width;
	double depth;
	
	Box(){
		this.length = 10;
		this.width = 10;
		this.depth = 10;
	}
	
	Box(double l, double w, double d)
	{
		this.length = l;
		this.width = w;
		this.depth = d;
	}
	
	Box(double l){
		
		this.width = this.depth = this.length = l;
	}
	
	Box(double l, double w){
		this.length = l;
		this.width = w;
		this.depth = 10;
	}
	
	void setDimension(double l, double w, double d){
		this.length = l;
		this.width = w;
		this.depth = d;
		return;
	}
	
	double computeVolume() {
		return length*width*depth;
	}
	
	void volume() {
		double vol;
		vol = length*width*depth;
		System.out.println("Volume of Box : " + vol );
		return;
	}
}
