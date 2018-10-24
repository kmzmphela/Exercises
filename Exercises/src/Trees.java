
public class Trees {
	
	public static boolean isBalanced(TreeNode root) throws Exception
	{
		if (root == null)
			throw new Exception();
		int lLength = getLen(root.left);
		int rLength = getLen(root.right);
		return  (Math.max(lLength, rLength) - Math.min(lLength, rLength) < 2);
	}

	private static int getLen(TreeNode node) {
		if (node == null)
			return 0;
		return (Math.max(getLen(node.left), getLen(node.right)) +1);
	}
	
	
	public static void main(String [] args) throws Exception
	{
		TreeNode root = new TreeNode(6);
		root.addElement(2);
//		root.addElement(8);
		
		root.left.addElement(1);
		root.left.addElement(3);
		
		
		boolean bool = Trees.isBalanced(root);
		
		System.out.println(bool);
	}

}
