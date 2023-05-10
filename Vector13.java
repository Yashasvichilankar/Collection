import java.util.Vector;

public class Vector13 {

	public static void main(String[] args) {
		Vector<Integer>v=new Vector<>(4,6);  //default capacity 10      //(4,6); //you can set capacity 4 is initial capacity 6 is increased when next time 
		System.out.println(v.capacity());
		v.addElement(5);
		v.addElement(4);
		v.addElement(1);
		v.addElement(3);
		v.addElement(2);
		v.addElement(5);
		v.addElement(4);
		v.addElement(1);
		v.addElement(3);
		v.addElement(null);
		v.addElement(2);
		v.addElement(4);
		
		//v.setSize(5);
		System.out.println(v.capacity());
		System.out.println(v.size());
		System.out.println(v);
		v.add(7);
		v.setSize(15);
		System.out.println(v.get(14));
		System.out.println(v.size());
		v.clear();
		System.out.println(v);
		System.out.println(v.isEmpty());

	}

}
