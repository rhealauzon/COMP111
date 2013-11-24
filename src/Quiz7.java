import java.util.Scanner;

public class Quiz7 {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        int num1;
        int num2;
        int num3;
        int median = 0;

        System.out.println("Enter the first number: ");
        num1 = scan.nextInt();

        System.out.println("Enter the second number: ");
        num2 = scan.nextInt();

        System.out.println("Enter the third number: ");
        num3 = scan.nextInt();

        if ((num1 > num2 && (num1 < num3)) || num1 < num2 && (num1 > num3)) {
            median = num1;
        }

        if ((num2 > num1 && (num2 < num3)) || (num2 < num1 && (num2 > num3))) {
            median = num2;
        }

        if ((num3 > num2 && (num3 < num1)) || (num3 < num2 && (num3 > num1))) {
            median = num3;
        }
        

        System.out.println("The numbers you have entered are : " + num1 + ", "
                + num2 + ", " + num3);
        System.out.println("The median is : " + median);

        scan.close();
    }

}
