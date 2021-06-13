
public class MaxOccurChar
{
    static final int Ascii_size = 256;
    static char maxOccurr(String str)
    {
        int count[] = new int[Ascii_size];
        int len = str.length();
        for(int i = 0;i<len;i++)
        count[str.charAt(i)] = count[str.charAt(i)] + 1;
        int max = -1;
        char result = ' ';
        for(int i = 0;i<len;i++)
        {
            if(max < count[str.charAt(i)])
            {
                max = count[str.charAt(i)];
                result = str.charAt(i);
            }
        }
        return result;
    }
	public static void main(String[] args) {
		String str = "Shivani Raut";
		System.out.println("Max occurring character in \"Shivani Raut\" is:"+maxOccurr(str));
	}
}
