import java.util.Iterator;
import java.util.PriorityQueue;

public class Que2 {

	public static void main(String[] args) {
		PriorityQueue<String> pq=new PriorityQueue<>();
		pq.add("Amit");
		pq.add("Vijay");
		pq.add("Karan");
		pq.add("Jai");
		pq.add("Renuhbj");
		System.out.println("head:"+pq.element());  
		System.out.println("head:"+pq.peek());  
		System.out.println("iterating the queue elements:");  
		Iterator itr=pq.iterator();  
		while(itr.hasNext()){  
		System.out.println(itr.next());  
		}  
		pq.remove();  
		pq.poll();  
		System.out.println("after removing two elements:");  
		Iterator<String> itr2=pq.iterator();  
		while(itr2.hasNext()){  
		System.out.println(itr2.next());  
		}  
	}
	
}
