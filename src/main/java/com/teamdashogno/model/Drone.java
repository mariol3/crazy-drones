package com.teamdashogno.model;

/**
 * Created by mario on 14/02/16.
 */
public class Drone extends ProductsOwner {

    private final int maximumLoad;
    private int currentLoad;

    public Drone(int id, int x, int y, int maximumLoad) {
        super(id, x, y);
        this.maximumLoad = maximumLoad;
    }

    public void load(int quantity, Product product, Warehouse warehouse) {
        this.moveTo(warehouse);
        warehouse.unloadProduct(quantity, product);
        this.loadProduct(quantity, product);
        System.out.println(String.format("%d L %d %d %d", this.getId(), warehouse.getId(), product.getTypeId(), quantity));
    }

    public void unload(int quantity, Product product, Warehouse warehouse) {
        this.moveTo(warehouse);
        this.unloadProduct(quantity, product);
        warehouse.loadProduct(quantity, product);
        System.out.println(String.format("%d U %d %d %d", this.getId(), warehouse.getId(), product.getTypeId(), quantity));
    }

    public void deliver(int quantity, Product product, CustomerOrder customerOrder) {
        this.moveTo(customerOrder);
        this.unloadProduct(quantity, product);
        System.out.println(String.format("%d D %d %d %d", this.getId(), customerOrder.getId(), product.getTypeId(), quantity));
    }

    public void wait(int numberOfTurns) {
        System.out.println(String.format("%d W %d", this.getId(), numberOfTurns));
    }

    private void moveTo(POI poi) {
        this.setX(poi.getX());
        this.setY(poi.getY());
    }

    @Override
    public void loadProduct(int quantity, Product product) {
        super.loadProduct(quantity, product);
        this.currentLoad += product.getWeight() * quantity;
    }

    @Override
    public void unloadProduct(int quantity, Product product) {
        super.unloadProduct(quantity, product);
        this.currentLoad -= product.getWeight() * quantity;
    }

    public int getMaximumLoad() {
        return maximumLoad;
    }

    public int getCurrentLoad() {
        return currentLoad;
    }

}
