
import java.util.Scanner;

public class MovieDriver {
	public static void main(String[] args) {
		Scanner scanner = new Scanner (System.in);
		Movie movie = new Movie();
		
		char menu;
		String title;
		String rating;
		int ticketsSold;
		
		do {
			System.out.println("Enter the name of a movie");
			title = scanner.nextLine();
			movie.setTitle(title);
			
			System.out.println("Enter the rating of movie");
			rating = scanner.nextLine();
			movie.setRating(rating);
			
			System.out.println("Enter the number of tickets sold for this movie");
			ticketsSold = scanner.nextInt();
			movie.setSoldTickets(ticketsSold);
			
			System.out.println(movie.toString());
			
			System.out.println("Do you want to enter another? (y or n)");
			menu = scanner.next().charAt(0);
			
			scanner.nextLine();
			
		}while(menu == 'y');
			
		
		System.out.println("Goodbye");
		
		scanner.close();
		System.exit(0);
	}

}
