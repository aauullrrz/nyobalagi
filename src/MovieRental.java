
class MovieRental implements IMovieRental {
    private String movieTitle;
    private int rentalDays;
    private double pricePerDay;

    public MovieRental(String movieTitle, int rentalDays, double pricePerDay) {
        this.setMovieTitle(movieTitle);
        this.setRentalDays(rentalDays);
        this.setPricePerDay(pricePerDay);
    }

    public double calculateSubtotal() {
        return (double)this.getRentalDays() * this.getPricePerDay();
    }

    public void displayRentalInfo() {
        System.out.println("Movie Title: " + this.getMovieTitle());
        System.out.println("Rental Duration (Days): " + this.getRentalDays());
        System.out.println("Daily Rate: $" + this.getPricePerDay());
        System.out.println("Total Rental Cost: $" + this.calculateSubtotal());
    }

    public String getMovieTitle() {
        return this.movieTitle;
    }

    public void setMovieTitle(String movieTitle) {
        this.movieTitle = movieTitle;
    }

    public int getRentalDays() {
        return this.rentalDays;
    }

    public void setRentalDays(int rentalDays) {
        this.rentalDays = rentalDays;
    }

    public double getPricePerDay() {
        return this.pricePerDay;
    }

    public void setPricePerDay(double pricePerDay) {
        this.pricePerDay = pricePerDay;
    }
}
