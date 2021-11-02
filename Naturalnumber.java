import java.util.Scanner;
public class Naturalnumber {

    // Display Sum of n Natural Number
    public static void main(String[] args) {
            Scanner sc= new Scanner(System.in);
            System.out.print("Enter the value of n:");
            int N = sc.nextInt();
            int sum=0;

            for (int i=0;i<=N;i++){
                sum += i;
            }
            System.out.println("Sum of the first "+N+" natural number is: "+sum);
        }
    }

