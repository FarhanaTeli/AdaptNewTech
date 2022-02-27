import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;
class Products
{
	int id;
	String name;
	float price;
	public Products(int id, String name, float price)
	{
		this.id = id;
		this.name = name;
		this.price = price;
	}
	
}
public class JavaStreamExampleUpdated {

	public static void main(String[] args) {
		List<Products> p1=new ArrayList<Products>();
		p1.add(new Products(1,"Samsung Mobile",15000f));
		p1.add(new Products(2,"Nokia Mobile",14000f));
		p1.add(new Products(3,"IPhone Mobile",500000f));
		p1.add(new Products(4,"Vivo Mobile",35000f));
		p1.add(new Products(5,"Oppo Mobile",11000f));
		
		List<Float> p2=p1.stream().filter(p->p.price>30000).map(p->p.price).collect(Collectors.toList());
		System.out.println("Price of products is: "+p2);
	}

}
