package com.teamdashogno.model;

import java.util.Map;

/**
 * Created by mario on 14/02/16.
 */
public class Warehouse extends ProductsOwner {

    public Warehouse(int id, int x, int y, Map<Product, Integer> products) {
        super(id, x, y, products);
    }

}
