public class Main {
    public static void main(String[] args) {
        Material steel = new Material("Steel");
        Frame frame1 = new Frame(steel);
        Wheel front = new Wheel(18.0);
        Wheel back = new Wheel(18.0);

        Motorcycle m1 = new Motorcycle("Honda", "CBR600", 2020, 600.0, "Red", frame1, front, back);
        Motorcycle m2 = new Motorcycle("Yamaha", "MT-09", 2022, 847.0, "Black", frame1, front, back);
        Motorcycle m3 = new Motorcycle("Suzuki", "GSX-R750", 2019, 750.0, "Blue", frame1, front, back);

        // Simulate motorcycle actions
        m1.start();
        m1.accelerate(40);
        m1.brake();
        printMotorcycle(m1);

        m2.start();
        m2.accelerate(60);
        m2.brake();
        printMotorcycle(m2);

        m3.start();
        m3.accelerate(50);
        m3.brake();
        printMotorcycle(m3);
    }

    public static void printMotorcycle(Motorcycle m) {
        System.out.println("Make: " + m.getMake());
        System.out.println("Model: " + m.getModel());
        System.out.println("Year: " + m.getYear());
        System.out.println("Engine Size: " + m.getEngineSize());
        System.out.println("Color: " + m.getColor());
        System.out.println("Frame Material: " + m.getFrame().getMaterial().getName());
        System.out.println("Front Wheel Size: " + m.getWheels()[0].getSize());
        System.out.println("Back Wheel Size: " + m.getWheels()[1].getSize());
        System.out.println("Fuel Tank: " + m.getFuelTank());
        System.out.println("-------------------------------");
    }
}
