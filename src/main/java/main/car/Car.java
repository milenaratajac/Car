package main.car;

public class Car {
    public String brand;
    public String model;
    public String color;
    private int buildYear;
    private int mileage = 0;
    private int fuel;
    private int consumption;
    
    
    
    public Car (){
      this.brand = "";
      this.model = "";
      this.color = "";
      this.buildYear = 0; 
    }
    public Car (int year){
        this.buildYear = year;
    }
    public Car (String brand, String model, String color, int buildYear, int mileage, int fuel, int consumption ){
      this.brand = brand;
      this.model = model;
      this.color = color;
      this.buildYear = buildYear;
      this.mileage = mileage;
      this.fuel = fuel;
      this.consumption = consumption;
    }

    Car(String lada, String niva, String green, int i) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    public int getBuildYear (){
        return this.buildYear;
    }
    private int getMileage (){
        return this.mileage;
    }
    private void setMileage(int newMileage) {
        this.mileage = newMileage;
    }
    private int getConsumption() {
        return this.consumption;
    }
    private int getFuel(){
        return this.fuel;
    }
    private void setFuel (int fuel) {
        this.fuel = fuel;
    }
    public void printAttributes (){
        System.out.println("Brend: " + this.brand);
        System.out.println("Model: " + this.model);
        System.out.println("Color: " + this.color);
        System.out.println("Build year: " + this.getBuildYear());
        System.out.println("Mileage: " + this.getMileage());
        System.out.println("Current fuel: " + this.getFuel());
    }
    public void travel(int distance) {
//        int newMileage = this.getMileage() i distance;
//        this.setMileage(newMileage);
        
        this.setMileage(this.getMileage() + distance);
        int spentFuel = this.getConsumption() * distance;
        int newFuel = this.getFuel() - spentFuel;
        this.setFuel(newFuel);
        
    }
    //prosecna potrosnja
    //trenutno gorivo
    //potroseno gorivo=p.potrosnja *distanca
    //novo stanje goriva = trenutno gorivo - potroseno gorivo

//    private int getConsumption() {
//        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }