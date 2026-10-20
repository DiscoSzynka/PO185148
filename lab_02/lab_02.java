public class lab_02 {
    static void main() {
        zad1();
    //    zad2();
    //    zad3();
    //    zad4();
    //    zad5();
    //    zad6();
    //    zad7();
    //    zad8();
    //    zad9();
    //    zad10();
    //    zad11();
    }



    static void zad1(){
        Dog dog = new Dog("Tosia","York",2);
        dog.bark();
        dog.showInformation();
        Dog dog2 = new Dog("Milka","Pomeranian",3);
        dog2.showInformation();
    }
    static void zad2(){
        Point point = new Point(3,4);
        Point point2 = new Point(13,8);
        point.distance(point,point2);
    }
    static void zad3(){
        Book book = new Book();
        Book book2 = new Book("Lalka","Bolesław Prus");
        Book book3 = new Book("Dzieci z Bullerbyn","Astrid Lindgren",1947);
    }
    static void zad4(){
        Car car = new Car();
        car.drive(124.5);
        System.out.println(car.mileage);
        car.drive(-3.7);
        System.out.println(car.mileage);
        car.drive(12);
        System.out.println(car.mileage);
    }
    static void zad5(){
        Car original = new Car("Opel","Astra",2018,70000);
        Car copy = new Car(original);
        original.productionYear = 2020;
        System.out.println(original.productionYear);
        System.out.println(copy.productionYear);
        System.out.println("Kopia pobiera dane przy utworzeniu i funkcjonuje jako oddzielny obiekt dlatego nie zmienia sie po pozniejszej edycji oryginalu");
    }
    static void zad6(){
        Person first = new Person("Anna");
        Person second = first;

        second.name = "Maria";
        System.out.println(first.name);
        System.out.println(second.name);
        System.out.println("Powstaje jeden obiekt Person z dwiema referencjami dlatego edycja drugiego wpływa na pierwszy");
    }
    static void zad7(){
        Person first = new Person("Maria");
       // Person second = first;
        Person second = new Person(first);
        System.out.println(first.name);
        second.name = "Anna";
        System.out.println(first.name);
        System.out.println(second.name);
        System.out.println("Drugi obiekt jest kopia pierwszego ale funkcjonuje jako samodzielny obiekt");

    }
    static void zad8(){
        Counter counter = new Counter(2);
        Counter counter2 = new Counter(12);
        counter.increaseOther(counter2);
        System.out.println(counter2.value);
        System.out.println("Metoda może zmienić stan obiektu utworzonego poza nią bo java przekazuje agrgumenty przez wartosc, w tym wypadku kopia referencji");
    }
    static void zad9(){
        Car car = null;
        car.showInformation(); //pewnie wyskoczy jakis blad albo wyswietli wszedzie null
    }
    static void zad10(){
        Box a = new Box(10);
        Box b = a;
        Box c = new Box(a.value);

        b.value = 20;
        c.value = 30;

        System.out.println(a.value);
        System.out.println(b.value);
        System.out.println(c.value);

        System.out.println(a == b); //program wyswietli true bo a i b sa referencjami do tego samego obiektu
        System.out.println(a == c); //program wyswietli false bo c to oddzielny obiekt

        /*
        a\
          ----------- a
        b/

        c ------- c
         */
    }
    static void zad11(){
        Product product = new Product("Monitor", 1200);
        System.out.println("Program sie nie kompilowal poniewaz definicja konstruktora byla nieprawidlowa przez co obiekt nie mogl zostac utworzony");
        product.show();
            }
        }



