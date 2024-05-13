package br.com.clanger.namespace.model;

public class Car {

    private String name;
    private String brand;
    private String year;

    public Car(String name, String brand, int year){
        this.name = name;
        this.brand = brand;
        this.year = String.valueOf(year);
    }

    @Override
    public String toString() {
        return "Car{" +
                "name='" + name + '\'' +
                ", brand='" + brand + '\'' +
                ", year='" + year + '\'' +
                '}';
    }
}
