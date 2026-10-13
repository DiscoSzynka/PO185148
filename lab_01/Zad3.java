import java.util.Scanner;

public class Zad3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] liczby = new int[10];
        int suma = 0;

        for(int i = 0;i<10;i++){
            System.out.println("Podaj liczbe: ");
            liczby[i] = scanner.nextInt();
            suma += liczby[i];
        }
        int max = liczby[0];
        int min = liczby[0];
        double srednia = (double) suma /10;
        int ilosc = 0;

        for(int i = 0;i<10;i++){
            if(liczby[i]>max){
                max = liczby[i];
            } else if(liczby[i]<min) {
                min = liczby[i];
            } else if(liczby[i]>srednia) {
                ilosc +=1;
            }
        }


        System.out.println("Najwieksza wartosc: "+max);
        System.out.println("Najmniejsza wartosc: "+min);
        System.out.println("Suma wszystkim elementow: "+suma);
        System.out.println("Srednia arytmetyczna: "+srednia);
        System.out.println("Ilosc liczb powyzej sredniej: "+ilosc);
    }
}
