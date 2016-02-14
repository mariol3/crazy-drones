package com.teamdashogno.model;

/**
 * Created by Mario Grimaldi <mario.grimaldi89@gmail.com> with <3
 */
public class Product {

    private final int typeId;
    private final int weight;

    public Product(int typeId, int weight) {
        this.typeId = typeId;
        this.weight = weight;
    }

    public int getWeight() {
        return weight;
    }

    public int getTypeId() {
        return typeId;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Product product = (Product) o;

        return typeId == product.typeId;
    }

    @Override
    public int hashCode() {
        return typeId;
    }
}
