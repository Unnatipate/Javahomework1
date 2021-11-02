import java.util.Scanner;
public class MaxMinNumbers {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a, b, c, maximum,minimum, temp;
//object of the Scanner class
        Scanner scanner = new Scanner(System.in);
//reading input from the user
        System.out.println("Enter the first number:");
        a = sc.nextInt();
        System.out.println("Enter the second number:");
        b = sc.nextInt();
        System.out.println("Enter the third number:");
        c = sc.nextInt();
//comparing a and b and storing the maximum number in a temp variable
        temp=a>b?a:b;
//comparing the temp variable with c and storing the result in the variable
        maximum=c>temp?c:temp;
//prints the largest number
        System.out.println("The maximum number is: "+maximum);
        //comparing a and b and storing the largest number in a temp variable
        temp=a<b?a:b;
        //comparing the temp variable with c and storing the result in the variable
        minimum=c>temp?c:temp;
        //prints the minimum number
        System.out.println("The minimum number is:" +minimum);
    }
}