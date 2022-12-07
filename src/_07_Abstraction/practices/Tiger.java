package _07_Abstraction.practices;

public class Tiger extends Animal implements Edible {
    public String makeSound(){
       return "graoooooo";
    }

    @Override
    public String howtToEat() {
        return "nấu cao hổ cốt";
    }
}
