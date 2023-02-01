package org.example.animalFeast;

public class main {
    public static void main(String[] args) {
        Animal a1 = new Animal("Tiger");
        Animal a2 = new Animal("Great blue heron");
        Animal a3 = new Animal("Chickadee");

        Dish d1 = new Dish("Ceaser Salad");
        Dish d2 = new Dish("Garlic Naan");
        Dish d3 = new Dish("Chocolate Cake");

        System.out.println(testAnimal(a1,d1));
        System.out.println(testAnimal(a2,d2));
        System.out.println(testAnimal(a3,d3));

    }

    public static boolean testAnimal(Animal animal, Dish dish){

        String firstAnimalLetter = animal.getName().substring(0,1);
        String firstDishLetter = dish.getName().substring(0,1);
        int lastAnimalLetter = animal.getName().length()-1;
        int lastDishLetter = dish.getName().length()-1;


        if (firstAnimalLetter.equalsIgnoreCase(firstDishLetter) && animal.getName().substring(lastAnimalLetter)
                .equalsIgnoreCase(dish.getName().substring(lastDishLetter))){
            return true;
        }
        return false;
    }
}
