package Semana2.sistemaInventarios.impl;

import Semana2.sistemaInventarios.Priceable;

public class Product implements Priceable {
    protected int productId;
    protected float price;
    @Override
    public float getPrice() {
        return 0;
    }

    @Override
    public void setPrice(float price) {

    }
}
