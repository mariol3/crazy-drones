package com.teamdashogno.model;

import java.util.Map;

/**
 * Created by Mario Grimaldi <mario.grimaldi89@gmail.com> with <3
 */
public class Warehouse extends ProductsOwner {

    public Warehouse(int id, int x, int y, Map<Product, Integer> products) {
        super(id, x, y, products);
    }

}
