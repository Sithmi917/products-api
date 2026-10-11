package uk.ac.westminster.products_api;



public class Product {
    private Long id;
    private String name;
    private double price;

    public Product(long id, String name, double price) {
    }

    public Long getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public double getPrice() {
        return price;
    }
}

