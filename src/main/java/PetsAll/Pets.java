package PetsAll;

import java.util.ArrayList;

public class Pets extends HumanFriend {
    public static class Cat extends Pets {
        private final String type = "Кошка";
        private ArrayList<Cat> catalogCat = new ArrayList<>();

        public void addition(Cat cat) {
            catalogCat.add(cat);
        }
    }
    public static class Dog extends Pets {
        private final String type = "Собака";
        private ArrayList<Dog> catalogDog = new ArrayList<>();

        public void addition(Dog dog) {
            catalogDog.add(dog);
        }
    }
    public static class Hamster extends Pets{
        private final String type = "Хомяк";
        private ArrayList<Hamster> catalogHamster = new ArrayList<>();

        public void addition(Hamster hamster) {
            catalogHamster.add(hamster);
        }
    }

}
