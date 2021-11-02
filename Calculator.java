import java.util.Scanner;
public class Calculator {
//Making Calculator using the switch statement
        public static void main(String[]args) {
            Scanner in = new Scanner(System.in);
            System.out.println("Enter first number: ");
            int a = in.nextInt();
            System.out.println("Enter second number: ");
            int b = in.nextInt();
            System.out.println("Enter operator: ");
            char op = in.next().charAt(0);
            int r = 0;
            //using switch statement for calculator
            switch (op) {
                //addition
                case '+':
                    r = a + b;
                    System.out.println(a + " + " + b + " = " + r);
                    break;
                    //minus

                case '-':
                    r = a - b;
                    System.out.println(a + " - " + b + " = " + r);
                    break;
               //multiplication
                case '*':
                    r = a * b;
                    System.out.println(a + " * " + b + " = " + r);
                    break;
                    //divisoin

                case '/':
                    r = a / b;
                    System.out.println(a + " / " + b + " = " + r);
                    break;
         //for invalid
                default:
                    System.out.println("INVALID OPERATOR");
            }
        }
    }

