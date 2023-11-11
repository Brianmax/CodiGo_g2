package Semana2.sistemaInventarios.impl;

import Semana2.sistemaInventarios.InventoryManageable;

import java.util.ArrayList;
import java.util.List;

public class Inventory implements InventoryManageable {
    private List<Product> productList;
    public Inventory(){
        productList = new ArrayList<>();
    }
    @Override
    public void addItem() {

    }

    @Override
    public void deleteItem() {

    }

    @Override
    public void listItems() {

    }

    @Override
    public void findItemById() {

    }
}
