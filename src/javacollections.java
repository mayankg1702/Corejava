import java.util.ArrayList;

public class javacollections {

	public static void main(String[] args) {
		
		
		
		// Array list examples -
	
		ArrayList<String> al = new ArrayList<String>();
		
		al.add("Mayank");
		al.add("Gupta");
		al.add("new");
		al.add("india");
		al.add(0, "student");
         System.out.println(al);
         System.out.println(al.contains("java"));
         System.out.println(al.indexOf("india"));
         System.out.println(al.isEmpty());
         System.out.println(al.size());
		
		
		

	}

}
