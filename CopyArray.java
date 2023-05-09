import java.util.ArrayList;
import java.util.Collections;
public class CopyArray {
	public static void main(String[] args)
	  {
		ArrayList list1=new ArrayList<>();
		
		list1.add("Red");
		list1.add("Green");
		list1.add("Orange");
		list1.add("White");
		list1.add("Black");
		System.out.println("Original list:"+list1);
		//Collections.shuffle(list1);
		//Collections.reverse(list1);
		//System.out.println("List after reversing:"+list1);
		System.out.println("List of first three elements:");
		System.out.println(list1.subList(0, 3));
}
}