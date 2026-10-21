public class InitializationDemo {
    private static int a;
    private int b;

    static {
        System.out.println("Blok statyczny"); //1 ale tylko z pierwszym obiekterm
        a = 1;
    }
    {
        System.out.println("Blok instancyjny"); //2
    }

    public InitializationDemo(){
        System.out.println("Konstruktor"); //3
    }
}
