import java.util.ArrayList;
import java.util.Collections;

public class SwapList {
	public static void main(String[] args)
	  {
		
		ArrayList ls=new ArrayList<>();
		ls.add("YELLOW");
		ls.add("BLUE");
		ls.add("PURPLE");
		ls.add("PINK");
		ls.add("RED");
		
		System.out.println("Arraylist before swaping:"+ls);
		Collections.swap(ls, 0, 4);
		System.out.println("Arraylist before swaping:"+ls);
		
}
}