package Semana2.sistemaInventarios.impl;

import Semana2.sistemaInventarios.Details;
import Semana2.sistemaInventarios.InventoryManageable;

public class Clothing extends Product implements Details {
    private String size;
    private String material;

    public Clothing(int productId, float price, String size, String material) {
        super(productId, price);
        this.size = size;
        this.material = material;
    }

    @Override
    public void showDetails() {
        System.out.println("Id: " + this.productId);
        System.out.println("Precio: " + this.price);
        System.out.println("Size: " + this.size);
        System.out.println("Material: " + this.material);
    }
}
