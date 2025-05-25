/**
 * Project: Motorcycle Simulator
 * Purpose Details: Represents a motorcycle and its properties
 * Course: IST 242
 * Author: Kevin Agayby
 * Date Developed: [Insert Date]
 * Last Date Changed:
 * Revision:
 */

public class Motorcycle {
    private String make;
    private String model;
    private int year;
    private double engineSize;
    private String color;
    private Frame frame;
    private Wheel[] wheels;

    public Motorcycle(String make, String model, int year, double engineSize, String color, Frame frame, Wheel frontWheel, Wheel backWheel) {
        this.make = make;
        this.model = model;
        this.year = year;
        this.engineSize = engineSize;
        this.color = color;
        this.frame = frame;
        this.wheels = new Wheel[]{frontWheel, backWheel};
    }

    public String getMake() { return make; }
    public String getModel() { return model; }
    public int getYear() { return year; }
    public double getEngineSize() { return engineSize; }
    public String getColor() { return color; }
    public Frame getFrame() { return frame; }
    public Wheel[] getWheels() { return wheels; }

    public void start() { System.out.println(make + " " + model + " started."); }
    public void stop() { System.out.println(make + " " + model + " stopped."); }
}