package _07_Abstraction.practices;

public  class Chicken extends Animal implements Edible {
    public String makeSound(){
        return "cuktak cuktak";
    }

    @Override
    public String howtToEat() {
        return "xao xa ot";
    }
}
