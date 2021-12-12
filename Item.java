public class Item {


// member variable ------------
    private String name;
    private double price;

// constructor ----------------
    public Item(String name, double price) {
        setName(name);
        setPrice(price);

    }

// getter and setter ----------
    public String getName() {
        return this.name;
    }
    public double getPrice() {
        return this.price;
    }
    //-------
    public void setName(String name) {
        this.name = name;
    }
    public void setPrice(double price) {
        this.price = price;
    }
}