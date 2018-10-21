import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Stack;

public class Sum3 {
	
	
	public int[][] sum(int[] nums)
	{
		Stack<int[]> result = new Stack(); 
		int [][] res;
		for (int i = 0; i < nums.length; i++ )
		{
			Stack<int[]> combinations = getCombinations(nums, nums[i],i);
			while(!combinations.isEmpty())
			{
				result.add(combinations.pop());
			//System.out.println(combinations);
			}
		}
		
		if(result.isEmpty())
			return null;
		
		int len = result.size();
		res = new int[len][3];
		
		for (int i = 0; i< len; i++)
		{
			res[i] = result.pop();
		}
		return res;
	}

	private Stack<int[]> getCombinations(int[] nums, int target,int index) {
		
		HashSet<Integer> set = new HashSet(); 
		Stack<int[]> result =new Stack();;
		int [] arr = new int[3];
		for (int j = index+1; j<nums.length; j++)
		{
			int remove = -target- nums[j];
			if(set.contains(remove))
			{
				arr = new int[] {target,remove,nums[j]};
				Arrays.sort(arr);
				result.add(arr);
			}
			else
			{
				set.add(nums[j]);
			}
			
		}
		
		return result;
	}
	
	
	
	public static void main(String [] args)
	{
		
		int[] s = new int[] {-1,0,1,2,-1,-4};
		Sum3 sum = new Sum3();
		int[][] result = sum.sum(s);
		for (int [] i : result)
		{
			for (int k: i)
			{
				System.out.print(k + " ");					
			}
			System.out.println();
		}
		
	}

}
