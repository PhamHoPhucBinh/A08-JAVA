package _01_introduction_java.excercise.read_number;


    import java.util.Scanner;

public class read_number_ver2 {


    public static void main(String[] args) {
        Scanner kb = new Scanner(System.in);

        System.out.println("Enter a 4 digit number.");

        int number = kb.nextInt();

        //Seperate number into digits.
        int digit4 = number % 10;
        number = number / 10;
        int digit3 = number % 10;
        number = number / 10;
        int digit2 = number % 10;
        number = number / 10;
        int digit1 = number % 10;
        number = number / 10;

        //Set up a switch statement to read through the number.
        switch (digit1) {
            case 1:
                System.out.print("One ");
                break;
            case 2:
                System.out.print("Two ");
                break;
            case 3:
                System.out.print("Three ");
                break;
            case 4:
                System.out.print("Four ");
                break;
            case 5:
                System.out.print("Five ");
                break;
            case 6:
                System.out.print("Six ");
                break;
            case 7:
                System.out.print("Seven ");
                break;
            case 8:
                System.out.print("Eight ");
                break;
            case 9:
                System.out.print("Nine ");
                break;
            case 0:
                System.out.print("Zero ");
                break;
            default:
                System.out.print("");
                break;
        }
        switch (digit2) {
            case 1:
                System.out.print("One ");
                break;
            case 2:
                System.out.print("Two ");
                break;
            case 3:
                System.out.print("Three ");
                break;
            case 4:
                System.out.print("Four ");
                break;
            case 5:
                System.out.print("Five ");
                break;
            case 6:
                System.out.print("Six ");
                break;
            case 7:
                System.out.print("Seven ");
                break;
            case 8:
                System.out.print("Eight ");
                break;
            case 9:
                System.out.print("Nine ");
                break;
            case 0:
                System.out.print("Zero ");
                break;
            default:
                System.out.print("");
                break;
        }
        switch (digit3) {
            case 1:
                System.out.print("One ");
                break;
            case 2:
                System.out.print("Two ");
                break;
            case 3:
                System.out.print("Three ");
                break;
            case 4:
                System.out.print("Four ");
                break;
            case 5:
                System.out.print("Five ");
                break;
            case 6:
                System.out.print("Six ");
                break;
            case 7:
                System.out.print("Seven ");
                break;
            case 8:
                System.out.print("Eight ");
                break;
            case 9:
                System.out.print("Nine ");
                break;
            case 0:
                System.out.print("Zero ");
                break;
            default:
                System.out.print("");
                break;
        }
        switch (digit4) {
            case 1:
                System.out.print("One ");
                break;
            case 2:
                System.out.print("Two ");
                break;
            case 3:
                System.out.print("Three ");
                break;
            case 4:
                System.out.print("Four ");
                break;
            case 5:
                System.out.print("Five ");
                break;
            case 6:
                System.out.print("Six ");
                break;
            case 7:
                System.out.print("Seven ");
                break;
            case 8:
                System.out.print("Eight ");
                break;
            case 9:
                System.out.print("Nine ");
                break;
            case 0:
                System.out.print("Zero ");
                break;
            default:
                System.out.print("");
                break;
        }
    }

}

