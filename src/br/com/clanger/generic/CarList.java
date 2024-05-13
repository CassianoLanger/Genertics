package br.com.clanger.generic;

import java.util.ArrayList;
import java.util.List;

public class CarList <T>{

    private List<T> cars = new ArrayList<>();

    public List<T> getCars() {
        return cars;
    }

    public void setCars(T cars) {
        this.cars.add(cars);
    }

    @Override
    public String toString() {
        return "CarList{" +
                "cars=" + cars +
                '}';
    }
}
