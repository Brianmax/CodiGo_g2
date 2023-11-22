package Semana2.sistemaInventarios;

import Semana2.sistemaInventarios.impl.Product;

public interface InventoryManageable {
    void addItem(Product product);
    void deleteItem(int id);
    void listItems();
    void findItemById(int id);
}
