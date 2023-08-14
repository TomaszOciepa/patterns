package org.example.cars;

public class Cars {

    private String mark;
    private String typ;
    private String color;
    private int engine;
    private int horses;
    private String typOfFuel;

    public String getMark() {
        return mark;
    }

    public void setMark(String mark) {
        this.mark = mark;
    }

    public String getTyp() {
        return typ;
    }

    public void setTyp(String typ) {
        this.typ = typ;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public int getEngine() {
        return engine;
    }

    public void setEngine(int engine) {
        this.engine = engine;
    }

    public int getHorses() {
        return horses;
    }

    public void setHorses(int horses) {
        this.horses = horses;
    }

    public String getTypOfFuel() {
        return typOfFuel;
    }

    public void setTypOfFuel(String typOfFuel) {
        this.typOfFuel = typOfFuel;
    }

    @Override
    public String toString() {
        return "Cars{" +
                "mark='" + mark + '\'' +
                ", typ='" + typ + '\'' +
                ", color='" + color + '\'' +
                ", engine=" + engine +
                ", horses=" + horses +
                ", typOfFuel='" + typOfFuel + '\'' +
                '}';
    }
}
