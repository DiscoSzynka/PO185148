import java.util.Scanner;

public class Zad4 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in); //brak srednika

        System.out.print("Podaj liczbę: ");
        int liczba = scanner.nextInt();

        if (liczba % 2 == 0) { // operator przypisania zamiast porowniania
            System.out.println("Liczba jest parzysta");
        }
        else {
            System.out.println("Liczba jest nieparzysta"); //brak srednika
        }

        for (int i = 0; i <= 5; i++) { //nieskonczona petla bo warunek nie zostanie spelniony przez i-- zamiast i++ (niestety zauwazylem dopiero po uruchomieniu programu :( )
            System.out.println(i);
        }

        scanner.close();
    }
}