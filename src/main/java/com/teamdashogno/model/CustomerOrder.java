package com.teamdashogno.model;

import java.util.Map;

/**
 * Created by mario on 14/02/16.
 */
public class CustomerOrder extends ProductsOwner {

    public CustomerOrder(int id, int x, int y, Map<Product, Integer> products) {
        super(id, x, y, products);
    }

    public boolean isFulfilled() {
        return this.getProducts().size() == 0;
    }

}
