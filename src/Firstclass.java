
public class Firstclass {
	
	
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//Strings in java

		
		String a = "Mayank gupta quality engineer";
		
		System.out.println(a.charAt(2));
		System.out.println(a.indexOf("k"));
		System.out.println(a.substring(3, 6));
		System.out.println(a.substring(5));
		System.out.println(a.concat("mayank Learn"));
		//a.length()
		System.out.println(a.trim());
		a.toUpperCase();
		a.toLowerCase();
		
		//split
		String arr[]=a.split("t");
		System.out.println(arr[0]);
		System.out.println(arr[1]);
		System.out.println(a.replace("t", "s"));

	}

}
