import java.util.ArrayList;
import java.util.Collections;

public class JoinList {
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
		
		System.out.println("LIST 1:"+ls);
		System.out.println("LIST 2:"+ls1);
	
		ls.addAll(ls1);
				System.out.println(ls);
		}
}