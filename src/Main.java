import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner read = new Scanner(System.in);
        //task2 3 input numbers calculate the average
        System.out.println("Please enter three values:");
        System.out.println("First number:");
        int num1 = read.nextInt();
        System.out.println("Second number:");
        int num2 = read.nextInt();
        System.out.println("Third number:");
        int num3 = read.nextInt();

        int Av = (num1+num2+num3)/3;
        System.out.println("The average of the three given numbers is "+Av);
        System.out.println("\n");

    }
}