package _01_introduction_java.practice.declare_variable;


import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner myInput = new Scanner(System.in);
        Integer myScore;

        System.out.println("input ur score");
        myScore = myInput.nextInt();
        System.out.println("ur score is " + myScore);
//        System.out.println("ur score is " + myInput);
//        if (myScore < 5) {
//            System.out.println("thi lai");
//            myScore = myInput.nextInt();
//        } else
//            System.out.println("ok roi");
//
//        //switch case
//        Scanner myGrade = new Scanner(System.in);
        switch (myScore) {
            case 1:
                System.out.println("thi lai");
                myScore = myInput.nextInt();
            case 2:
                System.out.println("thi lai");
                myScore = myInput.nextInt();
            case 3:
                System.out.println("thi lai");
                myScore = myInput.nextInt();
            case 4:
                System.out.println("thi lai");
                myScore = myInput.nextInt();
            case 5:
                System.out.println("Pass");
                break;
            case 6:
                System.out.println("Pass");
                break;
            case 7:
                System.out.println("Pass");
                break;
            case 8:
                System.out.println("Pass");
                break;
            case 9:
                System.out.println("Pass");
                break;
            case 10:
                System.out.println("Pass");
                break;

            default:
                System.out.println("Error! Invalid grade.");
        }
    }
}