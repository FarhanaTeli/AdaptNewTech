
public class SwitchCaseString {

	public static void main(String[] args) {
		String name="team";
		
		switch(name.toLowerCase())
		{
		case "author":
			System.out.println("Vikas");
			break;
			
		case "team":
			System.out.println("Team Java Full Stack");
			break;
			
		case "editor":
			System.out.println("Zain & Zoya");
			break;
			
		default:
			System.out.println("Invalid Entry");
			break;
		}

	}

}
