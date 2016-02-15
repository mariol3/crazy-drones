package com.teamdashogno.parser;

import com.teamdashogno.model.Product;
import com.teamdashogno.model.Simulation;
import com.teamdashogno.model.Warehouse;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.*;

/**
 * Created by Mario Grimaldi <mario.grimaldi89@gmail.com> with <3
 */
public class InputParser {

    private int rows;
    private int columns;
    private int dronesNumber;
    private long simulationTurns;
    private int dronesMaxLoad;

    public Simulation parse(String pathToFile) throws IOException {
        List<String> lines = Files.readAllLines(Paths.get(pathToFile));

        String[] parameters = lines.remove(0).split(" "); // [rows, columns, drones_number, turns, max_drone_load]
        long turns = Long.valueOf(parameters[3]);

        int productTypesNumber = Integer.valueOf(lines.remove(0));
        int[] productWeights = Arrays.stream(lines.remove(0).split(" ")).mapToInt(Integer::valueOf).toArray();

        List<Warehouse> warehouses = new ArrayList<>();
        int warehouseNumber = Integer.valueOf(lines.remove(0));
        for (int i = 0; i < warehouseNumber; i++) {
            int[] warehouseCoordinates = Arrays.stream(lines.remove(0).split(" ")).mapToInt(Integer::valueOf).toArray();
            int[] warehouseProductsQuantities = Arrays.stream(lines.remove(0).split(" ")).mapToInt(Integer::valueOf).toArray();
            Map<Product, Integer> warehouseProducts = new HashMap<>();
            for (int j = 0; j < productTypesNumber; j++) {
                int quantity = warehouseProductsQuantities[j];
                if (quantity > 0) {
                    warehouseProducts.put(new Product(j, productWeights[j]), quantity);
                }
            }
            warehouses.add(new Warehouse(i, warehouseCoordinates[0], warehouseCoordinates[1], warehouseProducts));
        }

        int customerOrdersNumber = Integer.valueOf(lines.remove(0));
        for (int i = 0; i < customerOrdersNumber; i++) {
            //TODO
        }
    }

}
