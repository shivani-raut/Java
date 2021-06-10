import java.util.*;
class CountIndex
{
  int count,index;
  public CountIndex(int index)
  {
    this.count = 1;
    this.index = index;
  }
  public void incCount()
  {
    this.count++;
  }
}
public class FirstNonRepeatingChar
{
  	static final int no_of_chars = 256;
    static HashMap<Character,CountIndex>hm = new HashMap<Character,CountIndex>(no_of_chars);
    static void getCharCountArray(String str)
    {
      for(int i = 0;i<str.length();i++)
      {
        if(hm.containsKey(str.charAt(i)))
        {
          hm.get(str.charAt(i)).incCount();
        }
        else{
          hm.put(str.charAt(i), new CountIndex(i));
        }
      }
    }
    static int firstNonRepeating(String str)
    {
      getCharCountArray(str);
      int result = Integer.MAX_VALUE,i;
      for (Map.Entry<Character, CountIndex> entry : hm.entrySet())
      {
        int c = entry.getValue().count;
        int ind = entry.getValue().index;
        if(c == 1 && ind<result)
        {
          result = ind;
        }
      }
      return result;
    }
    public static void main(String[] args)
    {
      String str = "abbbdcaseerss";
      int index = firstNonRepeating(str);
      System.out.println(index == Integer.MAX_VALUE ? "Either all strings are repeating or string is empty" : "First non repeating char is "+str.charAt(index));
    }
}
