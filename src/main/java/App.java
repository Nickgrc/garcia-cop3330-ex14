import java.util.Scanner;

/*
 *  UCF COP3330 Summer 2021 Assignment 1 Solution
 *  Copyright 2021 Nickolas Garcia
 */

public class App {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        final double tax = 0.055;

        System.out.print("What is the order amount? ");
        String order = in.nextLine();

        System.out.print("What is the State? ");
        String state = in.nextLine();

        double a = Double.parseDouble(order);

        String h = String.format("%.2f", a);

        String output = "";

        //simple if statement
        if("WI".equals(state)) {
            double b = a * tax;
            double c = a + b;

            String g = String.format("%.2f", b);
            String s = String.format("%.2f", c);

            output += "The Subtotal is $" + h + ".\n" + "The tax is $" + g + ".\n" +
                    "The total is $" + s + ".";
        }

        if(!"WI".equals(state)) {

            output += "The total is $" + h;
        }

        System.out.print(output);

    }
}
