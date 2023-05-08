import java.util.Enumeration;
import java.util.Stack;

public class Stack14 {

	public static void main(String[] args) {
		Stack<String> s=new Stack<>(); //child of vector class
		s.push("two");
		s.push("four");
		s.push("one");
		s.push("five");
		s.push("five");
		s.push(null);
		s.push("three");
		
		System.out.println(s);
		System.out.println(s.peek());
		System.out.println(s.search("two"));
		/*
		System.out.println(s.pop());
		System.out.println(s.pop());
		System.out.println(s.pop());
		System.out.println(s.pop());
		System.out.println(s.pop());
		System.out.println(s.empty());
		*/
		Enumeration<String> e=s.elements();
		while(e.hasMoreElements())
		{
			System.out.println(e.nextElement());
		}

	}

}
