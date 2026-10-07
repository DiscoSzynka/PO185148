import java.util.Scanner;

public class Zad2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Podaj liczbe: ");
        int liczba = scanner.nextInt();
        if(liczba%2==0){
            System.out.println("Liczba jest parzysta");
        } else {
            System.out.println("Liczba jest nieparzysta");
        }
        if(liczba%3==0){
            System.out.println("Liczba jest podzielna przez 3");
        } else {
            System.out.println("Liczba nie jest podzielna przez 3");
        }
        int suma = 0;
        for(int i = 1;i<=liczba;i++){
            suma+=i;
        }
        System.out.println("Suma: "+suma);
        int parzyste = 0;
        for(int i = 1;i<=liczba;i++){
            if(i%2==0) {
                parzyste += 1;
            }
        }
        System.out.println("Liczb parzystych: "+parzyste);
    }
}
