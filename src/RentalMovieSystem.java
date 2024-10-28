import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Scanner;

public class RentalMovieSystem {
    public RentalMovieSystem() {
    }

    /**
     *
     * @param args
     */
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        List<MovieRental> rentals = new ArrayList();
        String[] availableMovies = new String[]{"Frozen", "Avatar", "Up"};
        double[] pricesPerDay = new double[]{2.5, 3.0, 1.5};
        System.out.println("Selamat datang di Sistem Persewaan Film");
        System.out.println("Film yang tersedia:");

        int movieChoice;
        for(movieChoice = 0; movieChoice < availableMovies.length; ++movieChoice) {
            System.out.printf("%d. %s (Harga per hari: $%.2f)\n", movieChoice + 1, availableMovies[movieChoice], pricesPerDay[movieChoice]);
        }
/**
 * 
 */
        System.out.print("Masukkan nomor film yang ingin disewa: ");
        movieChoice = scanner.nextInt();
        scanner.nextLine();
        if (isaBoolean(movieChoice, availableMovies)) {
            System.out.println("Pilihan film tidak valid.");
            scanner.close();
        } else {
            double dailyRate = pricesPerDay[movieChoice - 1];
            System.out.print("Masukkan durasi sewa (dalam hari): ");
            int rentalDays = scanner.nextInt();
            rentals.add(new MovieRental(getAvailableMovie(availableMovies, movieChoice), rentalDays, dailyRate));
            Iterator var9 = rentals.iterator();

            while(var9.hasNext()) {
                MovieRental rental = (MovieRental)var9.next();
                rental.displayRentalInfo();
                System.out.println("---------------------------");
            }

            scanner.close();
        }
    }

    private static boolean isaBoolean(int movieChoice, String[] availableMovies) {
        return movieChoice < 1 || movieChoice > availableMovies.length;
    }

    private static String getAvailableMovie(String[] availableMovies, int movieChoice) {
        return availableMovies[movieChoice - 1];
    }
}
