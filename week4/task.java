package week4;

import java.util.Scanner;


public class task {
    /*7 */
    public static int calculateHCF(int num1, int num2){
        int min = Math.min(num1, num2);
        int hcf = 1;
        for(int i = 1; i <=min; i++){
            if (num1 % i == 0 && num2 % i == 0){
                hcf = i;
            }
        }
        return hcf;

    }
    public static void main(String[] args) {
        /*1. Write a program that asks your name and prints 
        “Hello your name” five times. Use a loop. */

        Scanner task = new Scanner(System.in);
        System.out.println("What's your name? ");
        String name = task.nextLine();
        for (int i=0; i < 5; i++){
            System.out.println("Hello " + name);

        }
        

        /*2.Write a program that displays the following table (note that 1 mile is 1.609 kilometers):
        Miles    Kilometers
        1    1.609
        2    3.218
        …    ….
        9    14.481
        10    16.090 */
        double num = 1.609;
        for(int kilo = 0; kilo <=10; kilo ++){
            System.out.println( kilo + " mile is "+ kilo * num);
        }

        /* 3. Write a program that generates the following table: 
            Number    Square
            10        100
            9         81
            ..        ….2    4
            1         1
            */
            System.out.println("Number     Square ");
            for(int sqr = 10; sqr >= 0; sqr --){
                System.out.println( sqr + "         "+ sqr* sqr);
            }/* 4. Write a program that reads the width and generates a corresponding square of *. For example, if width = 5, output is:
            *****
            *****
            *****
            *****
            *****
             */

        int width = 5;

        for(int i = 1; i <= width; i++){
            for(int j = 1; j <= width; j++){
                System.out.println("*");
            }
                System.out.println();
        }

        /* 5. Modify the above program by using a do..while loop so that it provides the user with the option to continue running the program and enter more inputs. For example:
            Sample Run:
            Enter a positive non-zero integer 4
            Sum of 1 to 4 is 10
            Do you want to continue? Enter ‘y’ for yes or any other character for no.
            y
            Enter a positive non-zero integer 3
            Sum of 1 to 3 is 6
            Do you want to continue? Enter ‘y’ for yes and any other character for no.
            n. */


        

        do{
            System.out.println("Enter a positive non-zero integer: ");
            int n = task.nextInt();

            int sum = 0;
            for (int i = 1; i <= n; i++){
                sum += i;
           }

           System.out.println("Sum of 1 to " + n + " is " + sum);

           System.out.println("Dou you want to continue? Enter 'y' for yes and any other key for no:  ");
           
           char choice = task.next().charAt(0);


           if (choice == 'y' || choice == 'Y') {
                continue;
           }
           else{
            System.out.println("Stopped!!!");
            break;
           }

        }while(true);
        
        /* 6. Write a program that reads the width and generates a corresponding triangle of *. For example, if width = 5, output is:
            *
            **
            ***
            ****
            *****
            Use a nested for loop to generate the above pattern. */
        
        int Width = 5;

        for(int i = 1; i <= Width; i++){
            for(int j = 1; j <= i; j++){
                System.out.println("*");
            }
            System.out.println();
        }

 
        /*7. Write a program to calculate the HCF of
         Two given numbers. */
        System.out.println("Enter the first number: ");
        int num1 = task.nextInt();
        System.out.println("Enter the second number: ");
        int num2 = task.nextInt();
        int hcf = calculateHCF(num1, num2);
        System.out.println("The HCf of " + num1 + "and" + num2 +  "is:" + hcf);

        /*8. Write a program that prompts the user to input an integer and then outputs the number with the digits reversed.
         For example, if the input is 12345, the output should be 54321. */
         System.out.println("Enter a number: ");
         int ornum = task.nextInt();
         int revnum = 0;
 
         while(ornum != 0){
             int digits = ornum % 10;
             revnum = revnum * 10 + digits;
             ornum /= 10;
         }
 
         System.out.println(revnum);
        

        
         
        /*9. Write a program that reads ten integer numbers and outputs the number
        of inputs which are greater than 50, less than 50 or equal to 50. The program
        should also display the average of all numbers greater than 50 and the average of all
        numbers less than 50.*/ 
         int countGreaterThan50 = 0;
         int countLessThan50 = 0;
         int countEqualTo50 = 0;
         int sumGreaterThan50 = 0;
         int sumLessThan50 = 0;
         System.out.println("Enter ten integer numbers:");
         for (int i = 0; i < 10; i++) {
             int num3 = task.nextInt();
             if (num > 50) {
                 countGreaterThan50++;
                 sumGreaterThan50 += num3;
             } else if (num3 < 50) {
                 countLessThan50++;
                 sumLessThan50 += num3;
             } else {
                 countEqualTo50++;
             }
         }
         double averageGreaterThan50 = countGreaterThan50 > 0 ? (double) sumGreaterThan50 / countGreaterThan50 : 0;
         double averageLessThan50 = countLessThan50 > 0 ? (double) sumLessThan50 / countLessThan50 : 0;
         System.out.println("Number of inputs greater than 50: " + countGreaterThan50);
         System.out.println("Number of inputs less than 50: " + countLessThan50);
         System.out.println("Number of inputs equal to 50: " + countEqualTo50);
         System.out.println("Average of numbers greater than 50: " + averageGreaterThan50);
         System.out.println("Average of numbers less than 50: " + averageLessThan50);
     
        /*10. Write a program that asks the user for a positive nonzero integer value. The program should use a 
        loop to get the sum of all the integers from 1 up to the number entered. For example, if the
        user enters 50, the loop will find the sum of 1+2+3+4+….+50. */
        
        int number;
        do{
            System.out.print("Enter a positive nonzero integer: ");
            number = task.nextInt();
        }while (number <= 0);
        int sum = 0;
        for (int i = 1; i <= number; i++){
            sum += 1;
        }

        System.out.println("The sum of integers from 1 to " + number + "is:" +sum);
        task.close();
    }
    
}
