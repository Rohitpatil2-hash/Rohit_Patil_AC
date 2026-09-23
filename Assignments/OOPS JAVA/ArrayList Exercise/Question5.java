

import java.util.ArrayList;
import java.util.ListIterator;
public class Question5 {

	public static void main(String[] args) {
		ArrayList<String>  list = new  ArrayList<String> ();
		list.add("red");
		list.add("blue");
		list.add("white");
		list.add("black");
		list.add("pink");
		
		list.remove(3);  //remove by index
		
		ListIterator<String> itr = list.listIterator();
		
		while(itr.hasNext()) {
			System.out.println(itr.next());
		}
		
}

}
