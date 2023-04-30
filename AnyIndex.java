import java.util.LinkedList;
import java.util.List;

public class AnyIndex {

	static int index(List<String> ls,String find,int r)
	{
	int c=0,i=0;
	
	//for(int i=0;i<ls.size();i++)
	
	for(String s:ls) //This is enhanced for loop
		
	{
		//String s=ls.get(i);
		
		if(s.equals(find))
		{
			c++;
			if(c==r)
			{
				return i;
			}
		}
		i++;
	}
	return -1;
	}
public static void main(String[] args) {
	
	LinkedList<String> ls = new LinkedList<String>();
	ls.add("tu");
	ls.add("tera");
	ls.add("mera");
	ls.add("tu");
	ls.add("uska");
	ls.add("iska");
	ls.add("tu");
	
	System.out.println(ls);
	System.out.println();
	System.out.println(index(ls,"tu",2));
	}
}
