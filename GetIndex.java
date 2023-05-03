import java.util.*;
public class GetIndex
{
	public static void main(String[] args) {
		
		LinkedList<String> fruits = new LinkedList<String>();
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter 5 fruits:");
        for (int i = 0; i < 5; i++) {
            fruits.add(sc.nextLine());
        }
        for (String fruit:fruits) {
            char fL = fruit.charAt(0);
            char sL = fruit.charAt(1);
            char lL = fruit.charAt(fruit.length() - 1);
            System.out.println( fL+""+sL+""+lL);
        }
	}
}
