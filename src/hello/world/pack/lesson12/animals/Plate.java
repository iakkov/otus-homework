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
    public void putFood(int howMuch) {
        if((currentAmountOfFood + howMuch) > volume) {
            System.out.println("Тарелка заполнена!");
        }
        currentAmountOfFood += howMuch;
        System.out.println("Вы насыпали в тарелку " + howMuch + " ед. еды. Теперь в тарелке " + currentAmountOfFood + " ед. еды.");
        if (volume == currentAmountOfFood) {
            System.out.println("Тарелка полная.");
        }
    }
}
