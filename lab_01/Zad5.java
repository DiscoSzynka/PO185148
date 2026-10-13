public class Zad5 {

    public static void main(String[] args) {
        int x = 2;
        int wynik = 0;

        for (int i = 0; i < 4; i++) { // 0 1 2 3
            wynik += x;  //2 6 14 30
            x *= 2;  //4 8 16 32
        }

        System.out.println(x); //32
        System.out.println(wynik); //30
    }
}