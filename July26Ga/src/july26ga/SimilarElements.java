package july26ga;

import java.util.HashSet;

public class SimilarElements {

	public static void main(String[] args) {
		
		  HashSet<String> set1 = new HashSet<String>();
		  HashSet<String> set2 = new HashSet<String>();
	
		  set1.add("C");
	      set1.add("C++");
	      set1.add("Java");
	      set1.add("Python");
	      
	      set2.add("C");
	      set2.add("C++");
	      set2.add("SQL");
	      set2.add("R");
		
	      set1.retainAll(set2);
		
		System.out.println("Similar elemets in both set are : " + set1);
	}
}
