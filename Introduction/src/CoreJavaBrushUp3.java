
public class CoreJavaBrushUp3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//String is an object

		//String s1 = "Victor learning Selenium";
		String s4 = "hello";
		
		
		//new
		String s2 = new String("Welcome");
		
		String s = "Victor learning Selenium";
		String[] splittedString = s.split("learning");
		System.out.println(splittedString[0]);
		System.out.println(splittedString[1]);		
		System.out.println(splittedString[1].trim());
		for (int i =s.length()-1; i>=0; i--)
		{
		
			System.out.println(s.charAt(i));
			
		}
		
		
		
		
		

	}

}
