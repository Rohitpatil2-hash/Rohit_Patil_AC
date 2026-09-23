
import java.util.ArrayList;
import java.util.ListIterator;
public class Question4 {

	public static void main(String[] args) {
		ArrayList<String>  list = new  ArrayList<String> ();
	
		list.add("red");
		list.add("blue");
		list.add("white");
		list.add("black");
		list.add("pink");
		
		ListIterator<String> itr = list.listIterator();
		
		list.set(2,"Orange");  // replacing the element of the arraylist.
		
		while(itr.hasNext()) {
			System.out.println(itr.next());
		}
}

}