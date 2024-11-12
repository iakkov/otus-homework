package hello.world.pack.lesson12.animals;

public class Plate {
    private int volume; // Объем тарелки, максимальное количество еды
    private int currentAmountOfFood;
    public Plate(int volume) {
        this.volume = volume;
        currentAmountOfFood = volume;
    }

    public int getVolume() {
        return volume;
    }

    public int getCurrentAmountOfFood() {
        return currentAmountOfFood;
    }
    public void setVolume(int volume) {
        this.volume = volume;
    }
}
