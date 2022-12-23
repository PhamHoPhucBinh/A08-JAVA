package _15_Exception.Exercice;

public class IllegalTriangleException extends Exception {
    private int a;
    private int b;
    private int c;

    public IllegalTriangleException(){

    }
    public String getMessage(){
        return "error";
    }
}
