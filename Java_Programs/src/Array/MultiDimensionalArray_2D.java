package Array;

public class MultiDimensionalArray_2D {

	public static void main(String[] args) {
		// declaring and initializing 2D Array
		int arr[][]= {{2,7,9},{3,2,1},{1,2,3}};
		
		//printing 2D Array
		for(int i=0; i<3; i++)
		{
			for(int j=0; j<3; j++)
				System.out.print(arr[i][j]+" ");
			System.out.println();
		}
	}

}
