import java.util.Scanner;

public class LazyDays {

    public static void main(String[] args) {
        int temp = 0;
        final int reallyHot = 95;
        final int hot = 80;
        final int medium = 60;
        final int cold = 40;
        final int reallyCold = 20;

        Scanner scan = new Scanner(System.in);

        System.out.println("Enter a temperature for the day:");
        temp = scan.nextInt();

        if ((temp >= hot) && (temp <= reallyHot)) {
            System.out.println("Go swimming!");
        }

        if ((medium <= temp) && (temp < hot)) {
            System.out.println("Go play tennis!");
        }

        if ((cold <= temp) && (temp < medium)) {
            System.out.println("Go golfing!");
        }

        if ((temp < cold) && (temp >= reallyCold)) {
            System.out.println("BRRRR! Go skiing.");
        }
        
        if ((temp > reallyHot) || (temp < reallyCold)) {
            System.out.println("Visit our shops!");
            
        }
    }
}
