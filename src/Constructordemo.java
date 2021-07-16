
public class Constructordemo {

	
	public Constructordemo()
	{
		
		System.out.println("I am constructor");
		
	}
	
	public Constructordemo(String ram)
	{
		
		System.out.println(ram);
		
	}
	
	
	public Constructordemo(int a)
	{
		
		System.out.println(a);
		
	}
	
	public void getdata()
	{
		
		
		System.out.println("I am Getdata fghfghfghfgfghgfhfgfg");

		

	}

	
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		
		Constructordemo cd =new Constructordemo();
		Constructordemo cds =new Constructordemo("hi");
		Constructordemo cdst =new Constructordemo(10);

	}

}
