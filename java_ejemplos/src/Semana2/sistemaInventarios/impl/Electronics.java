package Semana2.sistemaInventarios.impl;

import Semana2.sistemaInventarios.Details;
import Semana2.sistemaInventarios.InventoryManageable;

public class Electronics extends Product implements Details {
    private String brand;
    private String model;

    public Electronics(int productId, float price, String brand, String model) {
        super(productId, price);
        this.brand = brand;
        this.model = model;
    }

    @Override
    public void showDetails() {
        System.out.println("Id: " + this.productId);
        System.out.println("Precio: " + this.price);
        System.out.println("Brand: " + this.brand);
        System.out.println("Model: " + this.model);
    }
}
