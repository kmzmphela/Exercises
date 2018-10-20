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
			int [] combinations = getCombinations(nums, i);
			if(combinations != null)
				result.add(combinations);
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

	private int[] getCombinations(int[] nums, int i) {
		
		HashSet<Integer> set = new HashSet(); 
		int [] arr = new int[3];
		for (int j = i+1; j<nums.length; j++)
		{
			int remove = i- nums[j];
			if(set.contains(remove))
			{
				arr = new int[] {i,remove,nums[j]};
				Arrays.sort(arr);
				return (arr);
			}
			else
			{
				set.add(nums[j]);
			}
			
		}
		
		return arr;
	}

}
