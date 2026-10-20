public class Dog {
    String name;
    String breed;
    int age;

    Dog(String name,String breed,int age){
        this.name = name;
        this.breed = breed;
        this.age = age;
    }
    void bark(){
        System.out.println("woof woof");
    }
    void showInformation(){
        System.out.println(this.name);
        System.out.println(this.breed);
        System.out.println(this.age);
    }
}
