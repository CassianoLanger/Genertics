package br.com.clanger.application;

import br.com.clanger.generic.CarList;
import br.com.clanger.namespace.model.Fiat;
import br.com.clanger.namespace.model.Tesla;
import br.com.clanger.namespace.model.Toyota;

public class Main {

    public static void main(String[] args) {
        Toyota toyota = new Toyota("Corolla","Toyota",2020);
        Fiat fiat = new Fiat("Pulse", "Fiat", 2025);
        Tesla tesla = new Tesla("Cybertruck", "Tesla", 2021);


        CarList carList = new CarList();

        carList.setCars(toyota);
        carList.setCars(fiat);
        carList.setCars(tesla);

        System.out.println(carList);
    }
}
