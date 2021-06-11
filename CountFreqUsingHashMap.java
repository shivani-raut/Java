import java.util.*;
public class CountFreqUsingHashMap
{
    public static void countFreqeuncy(int[] a,int n)
    {
        Map<Integer,Integer> m = new HashMap<Integer,Integer>();
        for(int i = 0;i<n;i++)
        {
            if(m.containsKey(a[i]))
            {
                m.put(a[i],m.get(a[i]) + 1);
            }
            else
            {
                m.put(a[i],1);
            }
        }
        for(Map.Entry<Integer,Integer> en : m.entrySet())
        {
            System.out.println(en.getKey() + "----->" + en.getValue());
        }
    }
	public static void main(String[] args) 
	{
	    int a[] = {1,2,3,8,2,2,2,5,1};
	    int n = a.length;
	    countFreqeuncy(a,n);
	}
}
