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
    public void addItem(Product product) {
        this.productList.add(product);
    }

    @Override
    public void deleteItem(int id) {
        for(Product product: this.productList){
            if(product.productId == id){
                this.productList.remove(product);
                break;
            }
        }
    }

    @Override
    public void listItems() {
        for(Product product: this.productList){
            product.showDetails();
        }
    }

    @Override
    public void findItemById(int id) {
        for(Product product: this.productList){
            if(product.productId == id){
                product.showDetails();
                break;
            }
        }
    }
}
