
public class RemoveDuplicates
{
   static String removeDuplicates(String str)
   {
     char[] ch = new char[str.length()];
     int k = 0;
        for(int i = 0;i<str.length();i++)
        {
            int count = 0;
            int j ;
            for( j = 0;j<i;j++)
            {
                if(str.charAt(i) == str.charAt(j))
                {
                    count++;
                }
            }
            if(count == 0)
            {
                ch[k] = str.charAt(i);
                k = k + 1;
            }
        }
	    String str1 = String.valueOf(ch);
      return str1;
   }
	public static void main(String[] args) 
	{
	    String str = "Shivani Raut";
      
	    System.out.println("After removing dupliactes from \"Shivani Raut\" :" + removeDuplicates(str));
	    
	}
}
