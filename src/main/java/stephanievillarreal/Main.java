package stephanievillarreal;

import org.apache.commons.lang3.StringUtils;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        //input
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter Something:");
        //scans from the current position until it finds a line separator delimiter
        String input = scanner.nextLine();
        System.out.println("You Entered: \"" + input + "\"");
        //a.Tells whether or not what the user entered is a number
        System.out.println("\"" + input + "\" is " + (StringUtils.isNumeric(input) ? "" : "not ") + "a number");
        //b.Flips the case of the string
        System.out.println("Flipped Case: " + StringUtils.swapCase(input));
        //c.Reverses the string
        System.out.println("Reversed: " + StringUtils.reverse(input));
    }
}