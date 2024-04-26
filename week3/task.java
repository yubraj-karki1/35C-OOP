package week3;

import java.util.Scanner;

public class task {
    public static void main(String[] args) {
        /*1. Write a JAVA program to find the maximum between three numbers.*/
        Scanner task = new Scanner(System.in);
        double num1 = 10;
        double num2 = 20;
        double num3 = 15;
        // Find the maximum value
        double max = Math.max(num1, Math.max(num2, num3));
        System.out.println("The maximum value among = " + max);
        
        /*2. Write a JAVA program to check whether a number is negative, positive, or zero.*/
        System.out.print("Enter a number: ");
        double number = task.nextDouble();

        if (number > 0) {
            System.out.println("The number is positive.");
        } else if (number < 0) {
            System.out.println("The number is negative.");
        } else {
            System.out.println("The number is zero.");
        }

        /*3. Write a JAVA program to check whether a number is divisible by 5 and 11 or not.*/
        System.err.println("Enter a number: ");
        double num = task.nextDouble();
        if (num % 5 == 0 && num % 11 == 0){
            System.out.println("Number is divisible by 5 and 11" + num);
        }else{
            System.out.println("Number is not divisible by 5 and 11" + num);
        }

        /*4. Write a JAVA program to check whether a number is even or odd.*/
        System.out.println("Enter a number: ");
        int numb = task.nextInt();
        if(numb % 2 == 0){
            System.out.println("The number " + numb + " is even");
        }else{
            System.out.println("The number " + num + " is odd");
        }

        /*5. Write a JAVA program to check whether a year is a leap year or not. 
        Hint: if year%4==0; if year%100!==0 ; year%400==0;*/ 
        // Scanner year = new Scanner(System.in);
        // System.out.println("Enter a year :");
        // int y=year.nextInt();
        // if((y % 4 == 0 && y % 100 != 0) || (y % 400 == 0)) {
        //         System.out.println(y + " is a leap year");
        // }
        // else{
        //         System.out.println(y + " is not a leap year");
        // }
        // year.close();

        /*6. Write a JAVA program to input any alphabet and check whether it is vowel or consonant.*/
        System.out.println("Entera alphabet: ");
        char ch = task.next().charAt(0);
        ch= Character.toLowerCase(ch);
        if(ch=='a' || ch == 'e'  || ch == 'i' || ch == 'o' || ch == 'u'){
            System.out.println(ch + " is a vowel. ");
        }else{
            System.out.println(ch + " is a consonant. ");
        }



        /*Switch case */
        /*Write a Java program that takes a student's grade as input (A, B, C, D, or F) 
        and converts it to the corresponding GPA value.
        Use a switch case statement to handle different grades. */
        System.out.println("Enter student's grades,(A,B,C,D or F):");
        String grade = task.next().toUpperCase();
        double gpa = 0.0;
        switch (grade) {
            case "A":
                gpa =4.0;
                break;
            case "B":
                gpa = 3.0;
                break;
            case "C":
                gpa = 2.0;
                break;
            case "D":
                gpa = 1.0;
                break;
            case "F":
                gpa = 0.0;
            default:
            System.out.println("Invalid grade. please enter (A,B,C,D oe F):");
                break;
        }
        System.out.println("GPA value for grade" + grade + ":" + gpa );
        /*Create a Java program that takes two numbers and an operator (+, -, *, /) as inputs and 
        performs the corresponding arithmetic operation using a switch case statement. */

        System.out.print("Enter the first number: ");
        double x1 = task.nextDouble();
        
        // Input operator
        System.out.print("Enter the operator (+, -, *, /): ");
        char operator = task.next().charAt(0);
        
        // Input second number
        System.out.print("Enter the second number: ");
        double y1 = task.nextDouble();
        
        double result = 0;
        
        // Perform arithmetic operation based on operator
        switch (operator) {
            case '+':
                result = x1 +y1;
                break;
            case '-':
                result = x1 - y1;
                break;
            case '*':
                result = x1 * y1;
                break;
            case '/':
                if (num2 != 0) {
                    result = x1 / y1;
                } else {
                    System.out.println("Error: Division by zero!"); 
                }
                break;
            default:
                System.out.println("Invalid operator!");
                break;
        }
        
        System.out.println("Result: " + result);

        /*3. Write a Java program that takes an integer input (1 to 12) representing
         a month and prints the corresponding season (e.g., 1-3: Winter, 4-6: Spring, 7-9:
         Summer, 10-12: Fall) using a switch case. */
        
        System.out.print("Enter a month (1 to 12): ");
        int month = task.nextInt();
        
        String season;
        switch (month) {
            case 1:
            case 2:
            case 3:
                season = "Winter";
                break;
            case 4:
            case 5:
            case 6:
                season = "Spring";
                break;
            case 7:
            case 8:
            case 9:
                season = "Summer";
                break;
            case 10:
            case 11:
            case 12:
                season = "Fall";
                break;
            default:
                season = "Invalid month";
        }
        
        System.out.println("The season for month " + month + " is: " + season);
        /*4. Implement a Java program that calculates the area of 
        different shapes (circle, rectangle, square, triangle) based on the user's
         choice using a switch case.*/
        System.out.println("Shape Area Calculator");
        System.out.println("1. Circle");
        System.out.println("2. Rectangle");
        System.out.println("3. Square");
        System.out.println("4. Triangle");
        System.out.print("Enter your choice (1-4): ");
        int choice = task.nextInt();

        double area = 0;

        switch (choice) {
            case 1: // Circle
                System.out.print("Enter the radius of the circle: ");
                double radius = task.nextDouble();
                area = Math.PI * radius * radius;
                break;
            case 2: // Rectangle
                System.out.print("Enter the length of the rectangle: ");
                double length = task.nextDouble();
                System.out.print("Enter the width of the rectangle: ");
                double width = task.nextDouble();
                area = length * width;
                break;
            case 3: // Square
                System.out.print("Enter the side length of the square: ");
                double side = task.nextDouble();
                area = side * side;
                break;
            case 4: // Triangle
                System.out.print("Enter the base length of the triangle: ");
                double base = task.nextDouble();
                System.out.print("Enter the height of the triangle: ");
                double height = task.nextDouble();
                area = 0.5 * base * height;
                break;
            default:
                System.out.println("Invalid choice!");
        }

        System.out.println("The area of the shape is: " + area);



        task.close();

    }
}
