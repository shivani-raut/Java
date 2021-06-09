import java.util.Stack;
public class NextGreaterStack
{
	public static void main(String[] args) 
	{
	    int[] a = {2,7,1,8,3,9};
	    nextGeater(a,a.length);
	}
	public static void nextGeater(int[] a,int n)
	{
	    Stack<Integer> s = new Stack<Integer>();
	    int[] a1 = new int[n];
	    for(int i = n - 1;i>=0;i--)
	    {
	        while(!s.isEmpty() && s.peek() <= a[i])
	        {
	            s.pop();
	        }
	        if(s.isEmpty())
	        {
	            a1[i] = -1;
	        }
	        else{
	            a1[i] = s.peek();
	        }
	        s.push(a[i]);
	    }
	    for(int i = 0;i<a.length;i++)
	    {
	        System.out.println(a[i] + "---->" + a1[i]);
	    }
	}
}
