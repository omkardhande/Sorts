
public class Anagrams {
	char a[] = new char[26];
	String b = "babak";
	String c = "kabab";
	public static void main(String []args)
	{
		Anagrams ob = new Anagrams();
		for (int i =0;i<ob.b.length();i++)
		{
			ob.a[ob.b.charAt(i)-97]++;
		}
		for(int i=0;i<ob.c.length();i++)
		{
			ob.a[ob.c.charAt(i)-97]--;
		}
		int k =0;
		for(int i=0;i<ob.a.length;i++)
		{
			if(ob.a[i] != 0)
				k++;
		}
		if(k==0)
			System.out.println("Yes");
		else
			System.out.println("No");
	}

}
