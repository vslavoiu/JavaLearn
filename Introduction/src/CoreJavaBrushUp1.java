
public class CoreJavaBrushUp1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		int myNum = 3;
		String website = "Rahul Shetty Academy";
		char letter = 'r';
		double dec = 5.99;
		boolean myCard = true;
		
		System.out.println(myNum+" is the value stored in the myNum variable");
		System.out.println(website);
		//Arrays -
		int[] arr = new int[6];
		arr[0] = 1;
		arr[1] = 2;
		arr[2] = 3;
		arr[3] = 4;
		arr[4] = 7;
		arr[5] = 8;
		
		int[] arr2 = {1,2,3,4,5,6,7,8,9,10,11,12};
		
		//System.out.println(arr[4]);
		
		//for loop 
		for(int i = 0; i<arr2.length; i++)
		{
		
			System.out.println(arr2[i]);
		}
		
		String[] name = {"victor", "selenium", "learning"};
		for(int i = 0; i<name.length; i++)
		{
			System.out.println(name[i]);
		}
		for(String s: name)
		{
			System.out.println(s);
		}
		
		
		

	}

}
