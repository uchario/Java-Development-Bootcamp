package models;

public class Movie {
    private String name;
    private String format;
    private double rating;
    private double sellingPrice;
    private double rentalPrice;
    private boolean available;

    public Movie(String name, String format, double rating) {
        if (name == null || name.isBlank()) {
            throw new IllegalArgumentException("name must not be null/blank");
        }

        if (!(format.equalsIgnoreCase("Blue-Ray") || format.equalsIgnoreCase("DVD"))) {
            throw new IllegalArgumentException("Format must either be 'DVD' or 'Blu-Ray'");
        }

        if (rating < 0 || rating > 10) {
            throw new IllegalArgumentException("Rating must be between 0 and 10");
        }

        this.name = name;
        this.format = format;
        this.rating = rating;
        this.sellingPrice = this.format.equals("Blu-Ray") ? 4.25 : 2.25;
        this.rentalPrice = this.format.equals("Blu-Ray") ? 1.99: 0.99;
        this.available = true;
    }

    public Movie(Movie source) {
        this.name = source.name;
        this.format = source.format;
        this.rating = source.rating;
        this.sellingPrice = source.sellingPrice;
        this.rentalPrice = source.rentalPrice;
        this.available = source.available;
    }

    public String getName() {
        return this.name;
    }

    public String getFormat() {
        return this.format;
    }

    public double getRating() {
        return this.rating;   
    }

    public double getSellingPrice() {
        return this.sellingPrice;
    }

    public double getRentalPrice() {
        return this.rentalPrice;
    }

    public boolean isAvailable() {
        return this.available;
    }

    public void setName(String name) {
        if (name == null || name.isBlank()) {
            throw new IllegalArgumentException("name must not be null/blank");
        }
        this.name = name;
    }

    public void setFormat(String format) {
        if (!format.equalsIgnoreCase("Blu-Ray") || !format.equalsIgnoreCase("DVD")) {
            throw new IllegalArgumentException("Format must either be 'DVD' or 'Blu-Ray'");
        }
        this.format = format;
        setSellingPrice(this.format.equals("Blu-Ray") ? 4.25 : 2.25);
        setRentalPrice(this.format.equals("Blu-Ray") ? 1.99 : 0.99);
    }

    public void setRating(double rating) {
        if (rating < 0 || rating > 10) {
            throw new IllegalArgumentException("Rating must be between 0 and 10");
        }
        this.rating = rating;
    }

    private void setSellingPrice(double sellingPrice) {
        this.sellingPrice = sellingPrice;
    }

    private void setRentalPrice(double rentalPrice) {
        this.rentalPrice = rentalPrice;
    }

    public void setAvailable(boolean available) {
        this.available = available;
    }

    public String toString() {
        return "\t Name: " + this.name + "\n" +
                "\t Format: " + this.format + "\n" +
                "\t Rating: " + this.rating + "\n" +
                "\t Selling Price: " + this.sellingPrice + "\n" +
                "\t Rental Price: " + this.rentalPrice + "\n" +
                "\t Availability: " + (this.available == true ? "in-stock" : "rented") + "\n";
    }
}
