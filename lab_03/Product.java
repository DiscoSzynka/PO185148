public class Product {
    private String name;
    private int price;

    private static int numberOfProducts = 0; //ilosc produktow nie moze byc final bo po dokonaniu przypisania nie mozna zmieniac wartosci zmiennej

    public Product(String name){
        this.name = name;
        numberOfProducts++;
    }
    public static final int MAX_PRODUCTS = 100; // max products powinno by static bo maksimum dotyczy wszystkich obiektow, powinno byc final zeby na stale ustalic limit
}
