package com.codeup;

import org.apache.commons.lang3.StringUtils;

import java.util.Scanner;

/**
 * Hello world!
 */
public class App 
{
    public static void main( String[] args )
    {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter something: ");
        String response = scan.nextLine();
        System.out.println("You entered" + " " + response);
        if (StringUtils.isNumeric(response)){
            System.out.println(response + " " + "is a number");
        } else if (!StringUtils.isNumeric(response)){
            System.out.println(response + " " + "is not a number");
        }
        System.out.println("Flipcase: " + StringUtils.swapCase(response));
        System.out.println("Reversed: " + StringUtils.reverse(response));
    }
}