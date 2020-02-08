import animal.Animal;
import animal.Chiken;
import animal.Tiger;
import edible.Fruit;

import java.util.Random;

public class Test {


    public static void main(String[] args) {
        Random r = new Random();
        r.nextInt(10);
        Animal[] a = new Animal[2];
        a[0] = new Chiken();
        a[1] = new Tiger();
        for (Animal x:a){
            System.out.println(x.makeSound());
        }
    }
}
