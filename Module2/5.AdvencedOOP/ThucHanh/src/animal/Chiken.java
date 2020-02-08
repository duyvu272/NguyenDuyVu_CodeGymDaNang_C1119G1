package animal;

import edible.Edible;

public class Chiken extends Animal implements Edible {

    @Override
    public String makeSound() {
        return "OOOOOOO";
    }

    @Override
    public String howToEat() {
        return "kit kit";
    }
}
