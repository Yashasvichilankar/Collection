import java.util.*;

class HashSet31 {
	
   public static void main(String args[]) {
      // create a hash set
	   HashSet<String> hs = new HashSet<>();
      // add elements to the hash set
      hs.add("A");
	  hs.add("B");
      hs.add("D");
	  hs.add("D");
	  hs.add("C");
      hs.add("E");
      hs.add("C");
      hs.add("F");
      hs.add("o");
      hs.add(null);
      hs.add("0");
      hs.add("1");
      hs.add("a");
      System.out.println(hs);
      hs.remove("C");
      System.out.println(hs);
      hs.clear();
      System.out.println(hs.isEmpty()); 
      
      HashSet<String> al=new HashSet<String>();  
      al.add("Ravi"); 
      
      al.add("Vijay kumar"); 
      al.add(null);
      al.add("Vijay");  
      al.add("Ravi");  
      al.add("Ajay");   
      System.out.println(al);
	   
      Iterator<String> itr=al.iterator();  
      while(itr.hasNext()){  
       System.out.println(itr.next());  
      
      }
      
   }
}
