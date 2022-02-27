import java.util.ArrayList;
import java.util.List;

class Product
{
	int id;
	String name;
	float price;
	public Product(int id, String name, float price)
	{
		this.id = id;
		this.name = name;
		this.price = price;
	}
	
}
public class JavaStreamExample {

	public static void main(String[] args) {
		List<Product> p1=new ArrayList<Product>();
		p1.add(new Product(1,"Samsung Mobile",15000f));
		p1.add(new Product(2,"Nokia Mobile",14000f));
		p1.add(new Product(3,"IPhone Mobile",500000f));
		p1.add(new Product(4,"Vivo Mobile",35000f));
		p1.add(new Product(5,"Oppo Mobile",11000f));
		
		List<Float> p2=new ArrayList<Float>();
		for(Product product:p1)
		{
			if(product.price<30000)
			{
				p2.add(product.price);
			}
		}
		System.out.println("Price of products is: "+p2);

	}

}
