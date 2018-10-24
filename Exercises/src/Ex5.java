import java.util.LinkedList;
import java.util.Stack;


public class Ex5 {

	public boolean isPalandrome(Node head) throws Exception
	{
		if(head == null)
			throw new Exception();
		
		int len = 1;
		Stack<String> stack = new Stack();
		
		//find len of linkedList
		Node curr = head.next;
		while (curr!= null)
		{
			curr = curr.next;
			len++;
		}
		
		//loop to half way and pop into stack
		stack.push(head.val);
		curr = head.next;
		for (int i = 1; i<len/2; i++)
		{
			stack.push(curr.val);
			curr = curr.next;
			
		}
		
		//loop the other half and compare each value with the
		// top of the stack
		if(len%2 !=0)
			curr = curr.next;
		while (curr!= null)
		{
			if(curr.val != stack.pop())
				return false;
			curr = curr.next;

		}
		
		return true;
	}
	
	
	public static void main(String [] args) throws Exception
	{
		Ex5 x = new Ex5();
		
		Node one = new Node(null, "1");
		Node two = new Node(one, "3");
		Node middle = new Node(two,"9");
		Node three = new Node(middle, "3");
		Node four = new Node(three, "1");
				
		boolean bool = x.isPalandrome(four);
		
		System.out.println(bool);
		
		
		LinkedList<String> list = new LinkedList<String>();
		
		list.addFirst("1");
		list.add("2");
		list.add("3");

		
		System.out.println(list);
	
		
	}
}
