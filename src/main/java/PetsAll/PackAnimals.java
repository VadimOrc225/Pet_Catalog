package PetsAll;

import java.util.ArrayList;

public class PackAnimals extends HumanFriend {
    public static class Donkey extends PackAnimals {
        private ArrayList<Donkey> catalogDonkey = new ArrayList<>();

        public void addition(Donkey donkey) {
            catalogDonkey.add(donkey);
        }
    }
    public static class Camel extends PackAnimals {
        private ArrayList<Camel> catalogCamel = new ArrayList<>();

        public void addition(Camel camel) {
            catalogCamel.add(camel);
        }
    }

        public static class Horse extends PackAnimals {
            private ArrayList<Horse> catalogHorse = new ArrayList<>();

            public void addition(Horse horse) {
                catalogHorse.add(horse);
            }
        }
    }
