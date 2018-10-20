package com.vat.model;

import com.vat.model.Shape;

import java.util.HashMap;

public class Cuboid implements Shape {

    /**
     * Length of the Cuboid
     */
    private int length;
    /**
     * Width of the Cuboid
     */
    private int width;
    /**
     * Height of the Cuboid
     */
    private int height;

    /**
     * Fields of the Cuboid
     */
    private static HashMap<String, String> fields = new HashMap<String, String>() {{
        put("length", "Lengte:");
        put("width", "Breedte:");
        put("height", "Hoogte:");
    }};


    /**
     * @param length
     * @param width
     * @param height
     */
    public Cuboid(int length, int width, int height) {
        // TODO - implement Cuboid.Cuboid
        throw new UnsupportedOperationException();
    }

    public static HashMap<String, String> getFields() {
        return fields;
    }

    public int getLength() {
        return this.length;
    }

    public void setLength(int length) {
        this.length = length;
    }

    public int getWidth() {
        return this.width;
    }

    public void setWidth(int width) {
        this.width = width;
    }

    public int getHeight() {
        return this.height;
    }

    public void setHeight(int height) {
        this.height = height;
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
    public double calculateVolume() {
        return 0;
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
}