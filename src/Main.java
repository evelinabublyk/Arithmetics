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
            else if (exercise > 0 && exercise <= 5) {
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
                            System.out.println("ERROR: invalid input");
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

                        if (deposit < 0) {
                            System.out.println("ERROR: invalid input");
                            break;
                        }

                        System.out.println("How many years was the money deposited for?");
                        int years = sc.nextInt();

                        if (years < 0) {
                            System.out.println("ERROR: invalid input");
                            break;
                        }

                        int fullFiveYearsPeriods = years / 5;
                        int percentTotal = fullFiveYearsPeriods * 10;
                        double profit = deposit * percentTotal / 100.0;

                        System.out.println("Accrued interest: " + (percentTotal + "%"));
                        System.out.println("Profit: " + profit);
                        break;
                    case 5:
                        System.out.println("Welcome at UBER!");

                        sc.nextLine();

                        System.out.print("What day of the week is it today? ");
                        System.out.println("Enter " + "Mon/" + "Tue/" + "Wed/" + "Thu/" + "Fri/" + "Sat/ " + "or " + "Sun");

                        String dayOfTheWeek = sc.nextLine().trim();

                        System.out.println("Enter the start time (hhmm, e.g., 1330 for 13:30): ");
                        int time = sc.nextInt();

                        System.out.println("Enter the distance in km");
                        int km = sc.nextInt();

                        if (time < 0 || time > 2359 || km < 0){
                            System.out.println("ERROR: invalid input");
                            break;
                        }

                        double pricePerKM = 0;

                        switch (dayOfTheWeek){
                            case "Mon":
                            case "Tue":
                            case "Wed":
                            case "Thu":
                                if (time >= 700 && time <= 1700){
                                    pricePerKM = 4;
                                }
                                else {
                                    pricePerKM = 6;
                                }
                                break;
                            case "Fri":
                            case "Sat":
                            case "Sun":
                                pricePerKM = 8;
                                break;
                            default:
                                System.out.println("ERROR: invalid input");
                                break;
                        }

                        double totalPrice = pricePerKM * km;

                        System.out.println("Price: " + (totalPrice) + "euros");
                    default:
                        System.out.println("Enter the number from 1 to 5");
                }

            }
        }
    }
}