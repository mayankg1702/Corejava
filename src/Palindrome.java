
public class Palindrome {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		String m = "naman";
		
	String n ="";
	
	
	for(int i=m.length()-1;i>=0;i--)
	
	{
		
		n= n+m.charAt(i);
		
	}
		
if (n.equals(m))		
	

	System.out.println("Number is palindrome");

else

System.out.println("Number is not Palindrome");	



	}

}
