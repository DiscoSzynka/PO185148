public class Person {
    private String name;
    private int age;
    private String email;

    Person(String name,int age,String email){
        if(age>=0 && age<=150 && email.contains("@") && name != null && !name.isEmpty()) {
            this.name = name;
            this.age = age;
            this.email = email;
        }
    }

    public String getName(){
        return this.name;
    }

    public int getAge(){
        return this.age;
    }
    public String getEmail(){
        return this.email;
    }
    public void setName(String name){
        if(name != null && !name.isEmpty()){
            this.name = name;
        }
    }
    public void setEmail(String email){
        if (email.contains("@")) {
            this.email = email;
        }
    }
}
