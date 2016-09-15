import java.util.ArrayList;
import java.util.Scanner;

public class MovieApp3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.out.println("Welcome to the Movie List Application");
        System.out.println();
 
        Scanner sc = new Scanner(System.in);
       // String name = null;
    //    String category = null;
    //    Movie movies = new Movie(name,category);
        ArrayList<Movie> movieList = new ArrayList<Movie>();
        movieList.add(new Movie("Nightmare on Elm Street", "horror"));
        movieList.add(new Movie("Bride of Chucky", "horror"));
        movieList.add(new Movie("Toy Story", "animated"));
        movieList.add(new Movie("Monsters Inc.", "animated"));
        movieList.add(new Movie("A Bug's Life", "animated"));
        movieList.add(new Movie("007", "action"));
        movieList.add(new Movie("The Expendables", "action"));
        movieList.add(new Movie("Star Wars", "scifi"));
        movieList.add(new Movie("Avatar", "scifi"));
        movieList.add(new Movie("Lucy", "scifi"));

        System.out.println("There are " + movieList.size() +" movies in the list");
        System.out.println("Which genre are you interested in? (animated, horror, action, scifi):");
        String personMovieCategory = sc.next();
      for (Movie movie : movieList){
    	  if(personMovieCategory.equalsIgnoreCase(movie.getCategory())){
    		  System.out.println(movie);
    	  }
      }
      
     
      
        sc.close();
       }
	
	
       
        
	

}
