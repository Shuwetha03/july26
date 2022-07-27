package july26ga;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class MovieMainClass {

	public static void main(String[] args) {
		
		Movie m1 = new Movie("Iron Man","Jon Favreau",145,2008);
		Movie m2 = new Movie("Incredible Hulk","Louis Leterrier",130,2008);
		Movie m3 = new Movie("Iron Man 2","Jon Favreau",150,2010);
		Movie m4 = new Movie("Thor","Kenneth Branagh",140,2011);
		Movie m5 = new Movie("Captan America","Jon Favreau",145,2011);
		Movie m6 = new Movie("Avengers","Shane Black",135,2013);
		Movie m7 = new Movie("Ant Man","Peyton",137,2015);
		Movie m8 = new Movie("Doctor Strange","Scott Derrickson",160,2017);
		Movie m9 = new Movie("Black Panther","Shane Black",125,2018);
		Movie m10 = new Movie("Iron Man","Jon Favreau",145,2019);
		Movie m11 = new Movie("Eternals","Kenneth Branagh",155,2018);
		
		List<Movie> movies = new ArrayList<>();
		
		movies.add(m1);
		movies.add(m2);
		movies.add(m3);
		movies.add(m4);
		movies.add(m5);
		movies.add(m6);
		movies.add(m7);
		movies.add(m8);
		movies.add(m9);
		movies.add(m10);
		movies.add(m11);
		
		Map<String,List<String>> displayMovies = new HashMap<>();
		
		for(Movie m : movies) {
			
			List<String> mName = new ArrayList<>();	
			mName.add(m.getName());
			
			if(displayMovies.get(m.getDirectorName())!= null)
			  displayMovies.get(m.getDirectorName()).add(m.getName());
			else
			  displayMovies.put(m.directorName,mName);
		}
		
		System.out.println("-----------------------------------------");
		System.out.println("      DIRECTORS -> MOVIES");
		System.out.println("-----------------------------------------");
		
		for(Map.Entry m : displayMovies.entrySet()) 
			System.out.println(m.getKey()+ " -> " + m.getValue());
		
		
	}
}
