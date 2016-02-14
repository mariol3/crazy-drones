package com.teamdashogno.model;

import java.util.HashMap;
import java.util.Map;

/**
 * Created by Mario Grimaldi <mario.grimaldi89@gmail.com> with <3
 */
public abstract class ProductsOwner extends POI {

    private Map<Product, Integer> products = new HashMap<Product, Integer>();

    protected ProductsOwner(int id, int x, int y) {
        super(id, x, y);
    }

    public ProductsOwner(int id, int x, int y, Map<Product, Integer> products) {
        super(id, x, y);
        this.products = new HashMap<Product, Integer>(products);
    }

    public void unloadProduct(int quantity, Product product) {
        Integer currentQuantity = this.products.getOrDefault(product, 0);
        this.products.put(product, currentQuantity - quantity);
    }

    public void loadProduct(int quantity, Product product) {
        Integer ownedQuantity = this.products.getOrDefault(product, 0);
        this.products.put(product, ownedQuantity + quantity);
    }

    protected Map<Product, Integer> getProducts() {
        return products;
    }

}
