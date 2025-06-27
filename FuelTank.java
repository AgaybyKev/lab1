public class FuelTank {
    private double capacity;       // in liters
    private double currentLevel;   // in liters
    private String fuelType;       // e.g., "Petrol", "Diesel"

    public FuelTank(double capacity, String fuelType) {
        this.capacity = capacity;
        this.fuelType = fuelType;
        this.currentLevel = capacity; // assume full tank at start
    }

    public double getCapacity() {
        return capacity;
    }

    public double getCurrentLevel() {
        return currentLevel;
    }

    public String getFuelType() {
        return fuelType;
    }

    public void refuel(double amount) {
        if (amount <= 0) {
            System.out.println("Refuel amount must be positive.");
            return;
        }

        if (currentLevel + amount > capacity) {
            currentLevel = capacity;
        } else {
            currentLevel += amount;
        }
    }

    public void consumeFuel(double amount) {
        if (amount <= 0) return;

        if (currentLevel - amount < 0) {
            currentLevel = 0;
        } else {
            currentLevel -= amount;
        }
    }

    @Override
    public String toString() {
        return "FuelTank: " + currentLevel + "L / " + capacity + "L (" + fuelType + ")";
    }
}
