package src.com;
interface i1
{
	void set(int x,int y);
}
interface i2
{
	void display();
}

class ImpClass implements i1,i2
{
	int p=10;
	int q=12;
	
	@Override
	public void set(int x, int y) {
		p=x;
		q=y;
		
	}
	void incr() {
		p++;
	}
	@Override
	public void display() {
		System.out.println(p);
		System.out.println(q);
		
	}
	
}
public class InterfaceDemo {

	public static void main(String[] args) {
		ImpClass imp=new ImpClass();
		imp.set(100, 200);
		imp.display();
		imp.incr();
		imp.display();

	}

}
