import java.util.Scanner;

public class OddEven
{
    public static void main(String[] args)
    {     //to check the answer in console bar we must be use scanner
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a number: ");
        //test
        int num = scanner.nextInt();
        if (num % 2 == 0)
            System.out.println(num + " is even");
        else
            System.out.println(num + " is odd");
    }
}