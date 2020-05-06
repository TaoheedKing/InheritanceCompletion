public class Product {

    private String code;
    private String description;
    protected double price;
    protected static int count = 0; // a protected static variable

    public Product() {
        code = "";
        description = "";
        price = 0;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public static void setCount(int count) {
        Product.count = count;
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }
// Get and set accessors for the code, description, and price instance variables

    @Override
    public String toString() {
        return "Code:                " + code + "\n" +
                "Description:        " + description + "\n" +
                "Price:              " + this.getFormattedPrice(price) + "\n";
    }

    public double getFormattedPrice(double price) {
        // Use the NumberFormat class to format the price to 2 decimal places
        this.price = price;
        return price;
    }

    // Create public access for the count variable
    public static int getCount() {
        return count;
    }

    public boolean equals(double price){
        return this.price==price;
    }
}