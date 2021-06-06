/*
 *  UCF COP3330 Summer 2021 Assignment 1 Solution
 *  Copyright 2021 Luis Corona
 */
import java.util.Scanner;

public class App {
    static Scanner in = new Scanner(System.in);

    public static void main(String[] args) {
        App app = new App();
        String first = app.readFirst();
        String second = app.readSec();
        String third = app.readThird();
        int maxNum = app.Largest(first,second,third);
        app.printOutput(maxNum);
    }

    private void printOutput(int maxNum) {
        String msg = String.format("The largest number is %s.", maxNum);
        System.out.print(msg);
    }

    private int Largest(String first, String second, String third) {
        int firstInt = Integer.parseInt(first);
        int secondInt = Integer.parseInt(second);
        int thirdInt = Integer.parseInt(third);

        int max = firstInt;
        if(secondInt > max)
            max = secondInt;
        if(thirdInt > max)
            max = thirdInt;
        return max;
    }

    private String readFirst() {
        System.out.print("Enter the first number: ");
        String first = in.nextLine();
        return first;
    }

    private String readSec() {
        System.out.print("Enter the second number: ");
        String second  = in.nextLine();
        return second;
    }

    private String readThird() {
        System.out.print("Enter the third number: ");
        String third  = in.nextLine();
        return third;
    }




}