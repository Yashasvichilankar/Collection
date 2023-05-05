import java.util.ArrayList;
import java.util.Collections;

public class SortArray {
	public static void main(String[] args)
	  {
		
		ArrayList<String> ls=new ArrayList<>();
		
		ls.add("Red");
		ls.add("Green");
		ls.add("Orange");
		ls.add("White");
		ls.add("Black");
		System.out.println("Test:"+ls);
		Collections.sort(ls);
		System.out.println("Output:"+ls);
}
}