import java.util.ArrayList;

public class CoreJavaBrushUp2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		int[] arr2 = {1,2,3,4,5,6,7,8,9,10,11,12};
		
		//2,4,6,8,10,12 - multiple of 2
		
		for(int i=0;i<arr2.length;i++)
		{
			if (arr2[i] % 2 == 0)
			{
			System.out.println(arr2[i]);
			break;
			}
			else
			{
			System.out.println(arr2[i] +" is not multiple of 2");
		
			}
	
		}
	
		ArrayList<String> a = new ArrayList<String>();
		a.add("victor");
		a.add("selenium");
		a.add("learning");
		a.add("randomText");
			System.out.println(a.get(2));
			
			for(int i = 0; i<a.size();i++)
			{
				System.out.println(a.get(i));
			}
		System.out.println("****************");
			for( String val :a)
			{
				System.out.println(val);
			}
			
			//item is present in ArrayList
			System.out.println("Text contains word 'selenium': " + a.contains("selenium"));
		
		
		//create object of the class - object.method
		
		
		
		
	}


}