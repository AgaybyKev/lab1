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
    private final String make;
    private final String model;
    private final int year;
    private final double engineSize;
    private final String color;
    private final Frame frame;
    private final Wheel[] wheels;
    private Tire frontTire;
    private Tire backTire;

    /**
     * The current speed of the motorcycle in miles per hour.
     */
    private double currentSpeed;

    private FuelTank fuelTank;

    /**
     * Constructor for Motorcycle.
     *
     * @param make       The manufacturer of the motorcycle.
     * @param model      The model name of the motorcycle.
     * @param year       The year the motorcycle was made.
     * @param engineSize The size of the engine in cubic centimeters.
     * @param color      The color of the motorcycle.
     * @param frame      The frame of the motorcycle.
     * @param frontWheel The front wheel of the motorcycle.
     * @param backWheel  The back wheel of the motorcycle.
     */
    public Motorcycle(String make, String model, int year, double engineSize, String color, Frame frame, Wheel frontWheel, Wheel backWheel) {
        this.make = make;
        this.model = model;
        this.year = year;
        this.engineSize = engineSize;
        this.color = color;
        this.frame = frame;
        this.wheels = new Wheel[]{frontWheel, backWheel};
        this.currentSpeed = 0;
        this.fuelTank = fuelTank;
        this.frontTire = frontTire;
        this.backTire = backTire;
    }


    public String getMake() { return make; }
    public String getModel() { return model; }
    public int getYear() { return year; }
    public double getEngineSize() { return engineSize; }
    public String getColor() { return color; }
    public Frame getFrame() { return frame; }
    public Wheel[] getWheels() { return wheels; }
    public Tire getFrontTire() { return frontTire; }
    public Tire getBackTire() { return backTire; }

    /**
     * Starts the motorcycle.
     */
    public void start() {
        System.out.println(make + " " + model + " started.");
    }

    /**
     * Stops the motorcycle.
     */
    public void stop() {
        System.out.println(make + " " + model + " stopped.");
    }

    /**
     * Increases the current speed of the motorcycle.
     *
     * @param mph The amount in miles per hour to accelerate.
     */
    public void accelerate(int mph) {
        if (mph > 0) {
            currentSpeed += mph;
            System.out.println(make + " " + model + " accelerated to " + currentSpeed + " mph.");
        } else {
            System.out.println("Acceleration must be a positive value.");
        }
    }

    /**
     * Stops the motorcycle by reducing its speed to zero.
     */
    public void brake() {
        if (currentSpeed > 0) {
            System.out.println(make + " " + model + " is braking from " + currentSpeed + " mph to a stop.");
            currentSpeed = 0;
        } else {
            System.out.println(make + " " + model + " is already stopped.");
        }
    }

    /**
     * Displays the current status of the motorcycle.
     */
    public void displayStatus() {
        System.out.println("Make: " + make);
        System.out.println("Model: " + model);
        System.out.println("Year: " + year);
        System.out.println("Engine Size: " + engineSize + " cc");
        System.out.println("Color: " + color);
        System.out.println("Current Speed: " + currentSpeed + " mph");
        System.out.println("Front Tire: " + frontTire);
        System.out.println("Back Tire: " + backTire);
    }

    public FuelTank getFuelTank() {
        return fuelTank;
    }
}
