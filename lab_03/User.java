public class User {

    private String login; //publiczne zmienne, brak hermetyzacji, zle uzycie static
    private String password;
    private int age;

    public User(
            String login,
            String password,
            int age
    ) {
        if(age >=0 && age<=120) {
            this.login = login;
            this.password = password;
            this.age = age; //brak this
        }
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public void showUser() {
        System.out.println("Login: " + this.login + ", hasło: " + this.password + ", wiek: " + this.age //proba uzycia niestatycznych zmiennych w statycznej metodzie
        );
    }
}