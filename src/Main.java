import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        while(true) {
            System.out.println("Enter a number from 1 to 5");
            int exercise = sc.nextInt();

            if (exercise == 0) {
                System.out.println("Program finished");
                break;
            }

            switch (exercise) {
                case 1:
                    System.out.println("Enter the number of seconds");
                    int seconds = sc.nextInt();

                    if (seconds < 0) {
                        System.out.println("ERROR");
                        break;
                    }

                    int minutesAndSeconds;
                    System.out.print((minutesAndSeconds = seconds / 60) + " minutes, ");
                    System.out.println((minutesAndSeconds = seconds % 60) + " seconds");
                    break;
                case 2:
                    System.out.println("Enter the number of days");
                    int days = sc.nextInt();

                    if (days < 0) {
                        System.out.println("ERROR");
                        break;
                    }
                    int months = days / 30;
                    int remainingDays = days % 30;
                    int weeks = remainingDays / 7;
                    int finalDays = remainingDays % 7;

                    System.out.print(months + " months, ");
                    System.out.print(weeks + " weeks, ");
                    System.out.println(finalDays + " days");
                    break;
                case 3:
                    System.out.println("Enter two coordinates of the point");
                    int pointX = sc.nextInt();
                    int pointY = sc.nextInt();

                    if (pointX > 0 && pointY > 0) {
                        System.out.println("The point is in the first quadrant");
                    } else if (pointX < 0 && pointY > 0) {
                        System.out.println("The point is in the second quadrant");
                    } else if (pointX < 0 && pointY < 0) {
                        System.out.println("The point is in the third quadrant");
                    } else if (pointX > 0 && pointY < 0) {
                        System.out.println("The point is in the fourth quadrant");
                    } else if (pointX == 0 && pointY == 0) {
                        System.out.println("The point is at the origin");
                    } else if (pointX == 0) {
                        System.out.println("The point lies on the Y-axis");
                    } else { // pointY == 0
                        System.out.println("The point lies on the X-axis");
                    }
                    break;
                case 4:
                    System.out.println("Enter the deposit amount");
                    double deposit = sc.nextDouble();

                    System.out.println("How many years was the money deposited for?");
                    int years = sc.nextInt();

                    int fullFiveYearsPeriods = years / 5;
                    int percentTotal = fullFiveYearsPeriods * 10;
                    double profit = deposit / percentTotal * 100.0;

                    System.out.println("Accrued interest: " + (fullFiveYearsPeriods + "%"));
                    System.out.printf("Profit: %.2f euros%n", profit);
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