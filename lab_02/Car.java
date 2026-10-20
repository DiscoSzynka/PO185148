public class Car {
    String brand;
    String model;
    int productionYear;
    double mileage;

    public Car(){
        this("Nieznana","Nieznany",0,0);
    }

    public Car(String brand,String model){
        this(brand,model,0,0);
    }
    public Car(String brand,String model,int productionYear){
        this(brand,model,productionYear,0);
    }

    public Car(String brand, String model, int productionYear,double mileage){
        this.brand = brand;
        this.model = model;
        this.productionYear = productionYear;
        this.mileage = mileage;
    }
    public void drive(double distance) {
        if (distance < 0) {

        } else {
            this.mileage += distance;
        }
    }
    public Car(Car inny){
        this.brand = inny.brand;
        this.model = inny.model;
        this.productionYear = inny.productionYear;
        this.mileage = inny.mileage;
    }
    public void showInformation(){
            System.out.println(this.brand);
            System.out.println(this.model);
            System.out.println(this.productionYear);
            System.out.println(this.mileage);
        }
    }

