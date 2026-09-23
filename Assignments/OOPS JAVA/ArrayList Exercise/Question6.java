

import java.util.ArrayList;
import java.util.ListIterator;
public class Question6 {

	public static void main(String[] args) {
		ArrayList<String>  list = new  ArrayList<String> ();
		list.add("red");
		list.add("blue");
		list.add("white");
		list.add("black");
		list.add("pink");
		
		System.out.println(list.contains("red")); //one way
		
		boolean isred =list.contains("red");
		System.out.println("contains red colour ? " + isred);  // second way
		
}

}
