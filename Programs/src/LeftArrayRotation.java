
public class LeftArrayRotation {

	public static void main(String[] args) {
		int[] arr=new int[] {10,20,30,40,50};
		int n=4;
		System.out.println("Array elements before left rotation......");
		for(int a:arr)
		{
			System.out.println(a+" ");
		}
		System.out.println("Rotating array 2 time.....");
		for(int i=0; i<n; i++)
		{
			int j, first;
			first=arr[0];
			for(j=0; j<arr.length-1; j++)
			{
				arr[j]=arr[j+1];
			}
			arr[arr.length-1]=first;
		}
		System.out.println("----------------------------------");
		System.out.println("Array elements after left rotation.......");
		for(int a:arr)
		{
			System.out.println(a+" ");
		}


	}

}
