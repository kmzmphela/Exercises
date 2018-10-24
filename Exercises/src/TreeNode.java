
public class TreeNode {

	public int val;
	public TreeNode left;
	public TreeNode right;
	
	public TreeNode()
	{
		val = 0;
		left = null;
		right = null;
	}
	
	public TreeNode(int val)
	{
		this.val = val;
		left = null;
		right = null;
	}
	
	public void addElement(int i)
	{
		if (i<val)
			left = new TreeNode(i);
		else
			right = new TreeNode(i);
	}
	
}
