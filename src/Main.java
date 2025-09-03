import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        while(true) {
        System.out.println("Enter the number from 1 to 5");
        int exercise = sc.nextInt();

        if (exercise == 0){
            System.out.println("Program finished");
            break;
        }

            switch (exercise) {
            case 1:
                System.out.println("Enter the number of seconds");
                int seconds = sc.nextInt();
                int minutesAndSeconds;
                System.out.print((minutesAndSeconds = seconds / 60) + " minutes, ");
                System.out.println((minutesAndSeconds = seconds % 60) + " seconds");
                break;
            case 2 :
                System.out.println("Enter the number of days");
                int days = sc.nextInt();
                int monthsWeeksDays;
                System.out.print((monthsWeeksDays = days / 30) + " months, ");
                System.out.print((monthsWeeksDays = days / 7) + " weeks, ");
                System.out.println((monthsWeeksDays = days % 7) + " days");
                break;
            case 3:
                System.out.println("Enter the deposit amount");
                int deposit = sc.nextInt();
                System.out.println("How many years was the money deposited for?");
                int years = sc.nextInt();
                if (years % 5 == 0){

                }
                break;
            case 4:
                System.out.println("kfghrkkgj");
                break;
            case 5:
                System.out.println("jgfseiyufsr");
                break;
            default:
                System.out.println("Enter the number from 1 to 5");
            }
        }
    }
}