import java.util.ArrayList;
import java.util.stream.Stream;

import org.testng.annotations.Test;

public class stream1 {

	
	  @Test
	  
	  public static void main(String[] args)
	  
	  { // TODO Auto-generated method stub
	  
	  // Count the number of names starting with alphabet A in list
	  
	  ArrayList<String> names = new ArrayList<String>(); names.add("Abhijeet");
	  names.add("Don"); names.add("Rahul"); names.add("Alekhya");
	  names.add("Adam"); names.add("Ram"); int count = 0;
	  
	  for(int i=0;i<names.size();i++) { String actual = names.get(i);
	  if(actual.startsWith("A")) { count++; } }
	  
	  System.out.println(count);
	  
	  
	  
	  
	  }
	  
	 

	public void streamFilter() {
		ArrayList<String> names = new ArrayList<String>();
		names.add("Abhijeet");
		names.add("Don");
		names.add("Rahul");
		names.add("Alekhya");
		names.add("Adam");
		names.add("Ram");
		// there is no life for intermediate op if there is no terminal op
		// terminal operation will execute only if inter op (filter) returns true
		// we can create stream
		// how to use filter in stream API
		Long c = names.stream().filter(s -> s.startsWith("A")).count();
		System.out.println(c);

		long d = Stream.of("Abhijeet", "Don", "Rahul", "Alekhya", "Adam", "Ram").filter(s -> {
			s.startsWith("A");
			return true;
		}).count();
		System.out.println(d);
		// print all the names of ArrayList
		// names.stream().filter(s->s.length()>4).forEach(s->System.out.println(s));
		names.stream().filter(s -> s.length() > 4).limit(1).forEach(s -> System.out.println(s));

	}

	@Test
	public void streamMap() {
		// Alekhya-ALEKHA
		// print names which have last letter as "a" with Uppercase
		Stream.of("Abhijeet", "Don", "Rahul", "Alekhya", "Adam", "Ram").filter(s -> s.endsWith("a"))
				.map(s -> s.toUpperCase());

		// course 116

	}

}
