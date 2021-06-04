/*
 *  UCF COP3330 Summer 2021 Assignment 1 Solution
 *  Copyright 2021 Evan Raiford
 */
package ex02;
import java.util.Scanner;

public class App {
    public static void main(String[] args){
    Scanner in = new Scanner(System.in);
        System.out.print("What is the input string? ");
        String name = in.nextLine();

        System.out.println(name + " has " + name.length() + " characters.");
    }
}