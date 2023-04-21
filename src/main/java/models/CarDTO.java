package models;

public class CarDTO implements IcarDTO{

    Integer id;

    public CarDTO(Integer id, String make, String model, String color, Integer year, String vin) {
        this.id = id;
        this.make = make;
        this.model = model;
        this.color = color;
        this.year = year;
        this.vin = vin;
    }

    public CarDTO(){

    }
    public void setId(Integer id) {
        this.id = id;
    }

    public CarDTO(Integer id) {
        this.id = id;
    }

    String make;

    public String getMake() {
        return make;
    }

    public void setMake(String make) {
        this.make = make;
    }


    @Override
    public int getId() {
        return id;
    }

    String model;

    public CarDTO(String make) {
        this.make = make;
    }

    String color;
    Integer year;
    String vin;

    public int getID() {
        return 0;
    }

    public void setYear(int year) {
    }

    public void setVin(String vin) {
    }

    public void setColor(String color) {
    }

    public void setModel(String model) {
    }

    public String toString() {
        return id.toString()+make+model+color+vin;
    }
}
