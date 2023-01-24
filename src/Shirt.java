public class Shirt {
    public int shirtID = 7;
    public String description = "Some shirt";
    public String colorCode = "White";
    public double price = 123.0;
    public int quantityInStock = 15;

    public void displayShirtInformation() {
        System.out.println("Shirt ID: " + shirtID);
        System.out.println("Shirt description:" + description);
        System.out.println("Color Code: " + colorCode);
        System.out.println("Shirt price: $" + price);
        System.out.println("Quantity in stock: " + quantityInStock);
    }
}