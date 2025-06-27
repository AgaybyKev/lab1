public class Engine {
    private String type;
    private double horsepower;

    public Engine(String type, double horsepower) {
        this.type = type;
        this.horsepower = horsepower;
    }

    public String getType() {
        return type;
    }

    public double getHorsepower() {
        return horsepower;
    }

    @Override
    public String toString() {
        return type + " engine with " + horsepower + " HP";
    }
}