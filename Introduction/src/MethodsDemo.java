
public class MethodsDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		MethodsDemo d = new MethodsDemo();
		String name = d.getData();
		System.out.println(name);
		MethodsDemo2 d1 = new MethodsDemo2();
		d1.getUserData();
		getData2();
		
		
		
	}
	//why method - 
	
	
	public String getData()
	{
		System.out.println("Hello world");
		return "victor selenium";
	}
	
	
	public static String getData2()
	{
		System.out.println("Hello Word!");
		return "Victorash Selenium";
	}
	
	
	
	
}
