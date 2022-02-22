package src.general;

class Box
{
	float width;
	float height;
	float depth;
	
	float calVol() {
		return width*height*depth;
	}
}
public class BoxDemo {

	public static void main(String[] args) {
		Box box=new Box();
		//box=new Box();
		box.width=3.4f;
		box.height=2.2f;
		box.depth=1.4f;
		float vol=box.calVol();
		System.out.println("Volume of Box1 is: "+vol);
		
		Box box1=new Box();
		//box=new Box();
		box1.width=4.5f;
		box1.height=1.1f;
		box1.depth=1.4f;
		float vol1=box1.calVol();
		System.out.println("Volume of Box2 is: "+vol1);
		
		
	}

}
