package _07_Abstraction.practices;


public class mainTest {
    public static void main(String[] args) {
        Animal[] animals = new Animal[2];
        animals[0] = new Tiger();
        animals[1] = new Chicken();
        //animal action
        for (Animal animal : animals) {
            System.out.println(animal.makeSound());
            if (animal instanceof Chicken){
                Edible edible = (Chicken) animal;
                System.out.println(edible.howtToEat());
            }
            if (animal instanceof Tiger){
                Edible edible = (Tiger) animal;
                System.out.println(edible.howtToEat());
            }
        }
        //fruit action
        Fruit[] fruits = new Fruit[2];
        fruits[0] = new Apple();
        fruits[1]= new Orange();
        for (Fruit fruit : fruits){
            if (fruit instanceof Fruit){
                System.out.println(fruit.howtToEat());
            }
        }
    }
}
