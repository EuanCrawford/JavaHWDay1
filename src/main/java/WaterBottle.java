public class WaterBottle {

    private double volume;

    public WaterBottle(double volume) {
        this.volume = volume;
    }

    public double getVolume() {
        return volume;
    }

    public void drink(double volumeToRemove) {
        this.volume = volume - volumeToRemove;
    }

    public void empty() {
        this.volume = 0;
    }

    public void fill() {
        this.volume = 100;
    }

}
