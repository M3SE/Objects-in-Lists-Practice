import java.util.ArrayList;
import java.util.Scanner;

public class TvShow {
    private String showName;
    private int numberOfEpisodes;
    private String genre;

    // Constructor
    public TvShow(String showName, int numberOfEpisodes, String genre) {
        this.showName = showName;
        this.numberOfEpisodes = numberOfEpisodes;
        this.genre = genre;
    }

    // Getter for show name
    public String getShowName() {
        return showName;
    }

    // Getter for number of episodes
    public int getNumberOfEpisodes() {
        return numberOfEpisodes;
    }

    // Getter for genre
    public String getGenre() {
        return genre;
    }

    // Override toString() method to print TV show details
    @Override
    public String toString() {
        return "TV Show [Name: " + getShowName() + ", Episodes: " + getNumberOfEpisodes() + ", Genre: " + getGenre() + "]";
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayList<TvShow> tvShows = new ArrayList<>();

        while (true) {
            System.out.print("Enter the name of the TV show (or press Enter to stop): ");
            String showName = scanner.nextLine();
            if (showName.isEmpty()) {
                break;
            }

            System.out.print("Enter the number of episodes: ");
            int numberOfEpisodes = Integer.parseInt(scanner.nextLine());

            System.out.print("Enter the genre: ");
            String genre = scanner.nextLine();

            tvShows.add(new TvShow(showName, numberOfEpisodes, genre));
        }

        System.out.println("\nList of TV Shows:");
        for (TvShow tvShow : tvShows) {
            System.out.println(tvShow);
        }
    }
}
