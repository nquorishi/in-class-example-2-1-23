/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */
package com.mycompany.inclass;

/**
 *
 * @author Naweed Quorishi
 */
import java.util.Scanner;

public class InClass {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        /*System.out.println("Enter any 5 digits: ");
        int digits = input.nextInt();
        
        System.out.printf("%d   ", (digits / 10000));
        System.out.printf("%d   ", (digits / 1000) % 10);
        System.out.printf("%d   ", (digits / 100) % 10);
	System.out.printf("%d   ", (digits % 100) / 10);
	System.out.printf("%d   ", (digits % 10));
        
        //We haven't gone over if-statements yet, but I know in order to make sure 
        //that the code sticks to 5 digits only, we will be needing an if-statement.
        //That is how I would've done it in C++. Hopefully it is the same!
        
        int myNumber;
        Scanner scanner = new Scanner(System.in);
        myNumber = scanner.nextInt();
        
        int digit1 = myNumber / 10000;
        System.out.println("First digit: " + digit1);
*/
        
        int myInt;
        String word;
        String line;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter an int, word, line: ");
        
        myInt = scanner.nextInt();
        word = scanner.next();
        line = scanner.nextLine();
        
        System.out.println("int: " + myInt + "\n" + "word: " + word + "\n" + "line: " + line + "\n");
        
        
        
      
    }
}
