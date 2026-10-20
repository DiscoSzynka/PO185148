public class Product {

    String name;
    double price;

    public Product(String name, double price) {
        this.name = name;       //bez this program nie wie do czego jaka wartosc przypisac przez takie same nazwy
        this.price = price;
    }

    public void show() {
        System.out.println(name + ": " + price);
    }
}