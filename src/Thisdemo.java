
public class Thisdemo {
	
	
	
	int a =10;
	
	public void getdata()
	{
		
		int a =20;
		
		int b = a+this.a;
		
		System.out.println(b);
		
		
	}
	
	
	
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Thisdemo td=new Thisdemo();
		td.getdata();
		

	}

}
