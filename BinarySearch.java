import java.util.Arrays;

public class BinarySearch
{


	public static int binarySearch(int[] ray, int item)
	{

		Arrays.sort(ray);
		int bottom = ray[0];
		int middle = 0 ;
		int top = ray.length-1;
		
		while(bottom<=top)
		{
			middle = (bottom + top)/2 ;
		
			if(ray[middle]<item)
				bottom = middle + 1;
			else if(ray[middle]>item)
				top = middle - 1;
			else
				return middle;
		}
		return -1;
	}
}
