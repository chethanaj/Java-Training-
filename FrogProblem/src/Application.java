import java.util.NoSuchElementException;
import java.util.Scanner;

public class Application {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Please select 1 for calculate the time duration and 2 for calculate the distance: ");
        Application application = new Application();
        try {

            int decision = scanner.nextInt();

            if (decision == 1) {
                System.out.println("Enter the distance : ");
                long n = scanner.nextInt();


                if (n > 0) {
                    application.calculateTimeDuration(n);
                } else {
                    errorHandle();
                }
            } else if (decision == 2) {
                System.out.println("Enter the time duration : ");
                long n = scanner.nextInt();

                if (n >= 0) {
                    application.calculateDistance(n);
                } else {
                    errorHandle();
                }
            } else {
                System.out.println("Please enter 1 or 2.");
                System.out.println();
                main(null);
            }


        } catch (NoSuchElementException | IllegalStateException e) {

            errorHandle();
        } finally {
            scanner.close();
        }

    }

    static void errorHandle() {
        System.out.println("Please enter valid input.");
        System.out.println();
        main(null);
    }

    void calculateDistance(long value) {

        long time = value;

        int distance = 5;
        while (value >= 1) {
            if (value >= 1) {
                distance = distance + 3;
                value = value - 1;
            }
            if (value >= 2) {
                distance = distance + 1;
                value = value - 2;
            }
            if (value > 5) {
                distance = distance + 5;
                value = value - 5;
            }
        }
        System.out.println("The Frog jumps " + distance + " meters within " + time + " seconds.");

    }

    void calculateTimeDuration(long value) {
        long distance = value;

        int timeDuration = 0;
        while (value > 5) {
            if (value >= 5) {
                timeDuration = timeDuration + 1;
                value = value - 5;
            }
            if (value >= 3) {
                timeDuration = timeDuration + 2;
                value = value - 3;
            }
            if (value > 1) {
                timeDuration = timeDuration + 5;
                value = value - 1;
            }
        }
        System.out.println("The Frog takes " + timeDuration + " seconds to jump " + distance + " meters.");

    }
}
