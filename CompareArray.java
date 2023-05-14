import java.util.ArrayList;

public class CompareArray {
	public static void main(String[] args)
	  {
		ArrayList ls=new ArrayList<>();
		ls.add("Red");
		ls.add("Green");
		ls.add("Orange");
		ls.add("White");
		ls.add("Black");
		System.out.println("Original list:"+ls);
	
		ArrayList ls1=new ArrayList<>();
		ls1.add("Red");
		ls1.add("Green");
		ls1.add("White");
		ls1.add("Black");
		
		if(ls.equals(ls1))
		{
			System.out.println("YES");
		}
		else
		{
			System.out.println("NO");
		}
}
}