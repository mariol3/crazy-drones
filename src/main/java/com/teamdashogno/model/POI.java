package com.teamdashogno.model;

/**
 * Created by Mario Grimaldi <mario.grimaldi89@gmail.com> with <3
 */
public abstract class POI {

    private final int id;
    private int x;
    private int y;

    protected POI(int id, int x, int y) {
        this.id = id;
        this.x = x;
        this.y = y;
    }

    public int getId() {
        return id;
    }

    public int getX() {
        return x;
    }

    public int getY() {
        return y;
    }

    protected void setX(int x) {
        this.x = x;
    }

    protected void setY(int y) {
        this.y = y;
    }

}
