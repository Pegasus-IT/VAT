package com.vat.model;

import java.util.HashMap;

public class Sphere implements Shape {

    /**
     * Fields of the Sphere
     */
    public static HashMap<String, String> fields = new HashMap<String, String>() {{
        put("radius", "Radius:");
    }};
    /**
     * Radius of the Sphere
     */
    private int radius;

    /**
     * @param radius
     */
    public Sphere(int radius) {
        this.radius = radius;
    }

    @Override
    public HashMap<String, String> getFields() {
        return Sphere.fields;
    }

    public int getRadius() {
        return this.radius;
    }

    public void setRadius(int radius) {
        this.radius = radius;
    }

    @Override
    public int getId() {
        return 0;
    }

    @Override
    public void setId(int id) {

    }

    @Override
    public String getType() {
        return null;
    }

    @Override
    public void setType(String type) {

    }

    @Override
    public HashMap<String, Integer> getData() {
        HashMap<String, Integer> data = new HashMap<>();

        data.put("radius", this.radius);

        return data;
    }

    @Override
    public void setData(HashMap<String, Integer> data) {
        this.radius = data.getOrDefault("radius", 0);
    }

    @Override
    public double calculateVolume() {
//         4/3 × π × r ³
        return (4.0 / 3.0) * Math.PI * Math.pow(radius, 3);
    }

    @Override
    public String toJSON() {
        return null;
    }

    @Override
    public void saveSQL() {

    }

    @Override
    public void loadJSON(int jsonObject) {

    }

    @Override
    public void loadSQL(int id) {

    }

    @Override
    public void loadString(String text) {

    }

    @Override
    public String toString() {
        return String.format("Bol (radius: %d)", radius);
    }
}