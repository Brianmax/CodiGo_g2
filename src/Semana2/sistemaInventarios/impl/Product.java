package Semana2.sistemaInventarios.impl;

import Semana2.sistemaInventarios.Details;
import Semana2.sistemaInventarios.Priceable;

public class Product implements Priceable, Details {
    protected int productId;
    protected float price;

    public Product(int productId, float price) {
        this.productId = productId;
        this.price = price;
    }

    @Override
    public float getPrice() {
        return 0;
    }
    @Override
    public void setPrice(float price) {
    }

    @Override
    public void showDetails() {

    }
}
