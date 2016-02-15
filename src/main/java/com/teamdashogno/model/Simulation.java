package com.teamdashogno.model;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Mario Grimaldi <mario.grimaldi89@gmail.com> with <3
 */
public class Simulation {

    private long turns;
    private List<CustomerOrder> customerOrders = new ArrayList<CustomerOrder>();
    private List<Warehouse> warehouses = new ArrayList<Warehouse>();
    private List<Drone> drones = new ArrayList<Drone>();

    public Simulation(long turns, List<CustomerOrder> customerOrders, List<Warehouse> warehouses, List<Drone> drones) {
        this.turns = turns;
        this.customerOrders = customerOrders;
        this.warehouses = warehouses;
        this.drones = drones;
    }

}
