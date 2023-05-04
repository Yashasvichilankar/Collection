import java.util.ArrayList;

public class IterateAllElements 
{
	public static void main(String[] args) 
	{
		ArrayList<String> str=new ArrayList<>();
		str.add("Red");
		str.add("Green");
		str.add("Orange");
		str.add("White");
		str.add("Black");
		
		 for (String e : str)
		 {
		  System.out.println(e);
		 }
	}
}
