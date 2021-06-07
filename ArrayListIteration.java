import java.util.*;
public class ArrayListIteration
{
	public static void main(String[] args) 
	{
	    ArrayList<String> ar = new ArrayList<String>();	
	    ar.add("A");
	    ar.add("B");
	    ar.add("C");
	    ar.add("D");
	    //1. using lambda and for each loop 
	    System.out.println("****************using lambda and for each loop ***********************");
	    ar.forEach(str ->
	    {
	        System.out.println(str);
	    });
	    //2. using Iterator
	    System.out.println("************************* using Iterator ******************************");
        Iterator <String> i = ar.iterator();
        while(i.hasNext())
        {
            String str = i.next();
            System.out.println(str);
        }
        //3. using iterator and forEachRemaining method
        System.out.println("**************** using iterator and forEachRemaining() ****************");
        i = ar.iterator();
        i.forEachRemaining(str ->
        {
            System.out.println(str);
        });
        //4. using forEach method
        System.out.println("**************************** using forEach() **************************");
        for(String str:ar)
        {
            System.out.println(str);
        }
        //5. using for loop with order/Index
        System.out.println("****************** using for loop with order/index *******************");
        for(int j = 0;j<ar.size();j++)
        {
            System.out.println(ar.get(j));
        }
        //6. using listIterator() to traverse in both direction
        System.out.println("********** using listIterator() to traverse in both direction *********");
        ListIterator<String> arListIterator = ar.listIterator(ar.size());
        while(arListIterator.hasPrevious())
        {
            String str = arListIterator.previous();
            System.out.println(str);//descending
        }
	}
}
