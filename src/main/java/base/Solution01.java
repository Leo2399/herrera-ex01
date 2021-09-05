/*
 *  UCF COP3330 Fall 2021 Assignment 1 Solution
 *  Copyright 2021 Leonardo Herrera
 */

package base;

import java.util.Scanner;

public class Solution01 {
    /*
    print "What's your name?"
    'name' = read string from user
    print "Hello 'name' nice to meet you!"
     */
    private static Scanner input = new Scanner(System.in);

    public static void main(String[] args){
        System.out.print("What's your name? ");
        String name = input.nextLine();

        System.out.println("Hello, " +name+ ", nice to meet you!");
    }
}
