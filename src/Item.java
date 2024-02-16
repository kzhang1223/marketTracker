public class Item {

    // an item that is being sold in the market, will have category, price and quantity (colour may be included for
    // items with the same design but in multiple colours

    private String name;
    private String category;
    private double price;
    private String colour;

    public Item(String name, String category, double price) {
        this.name = name;
        this.category = category;
        this.price = price;
        this.colour = null;
    }

    // setters and getters
    public void setName(String name) {
        this.name = name;
    }

    public void setCategory(String category) {
        this.category = category;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public void setColour(String colour) {
        this.colour = colour;
    }

    public String getName() {
        return this.name;
    }

    public String getCategory() {
        return this.category;
    }

    public double getPrice() {
        return this.price;
    }

    public String getColour() {
        return this.colour;
    }
}
