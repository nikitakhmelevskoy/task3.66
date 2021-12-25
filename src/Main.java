import java.util.Scanner;

public class Main {

    private static final VerticalParabola verticalParabola = new VerticalParabola(5, -4, -0.25);
    private static final Line line = new Line(-8, 1, -1);
    private static final Circle circle = new Circle(-7, -4, 5);

    public static final Picture picture = new Picture(verticalParabola, circle, line);

    public static void main(String[] args) {

        if (Test.testPoints(picture)) {
            System.out.println("All tests completed");
            double x = readNum("Input x = ");
            double y = readNum("Input y = ");

            if (isTheCoordinatePlaneCorrect(x)) {
                System.out.println("Error,enter correct value -10 < (x) < 10");
                return;

            }
            if (isTheCoordinatePlaneCorrect(y)) {
                System.out.println("Error,enter correct value -10 < (y) < 10");
                return;
            }

            printColorForPoint(x, y);

        } else {
            System.out.println("Tests failed");
        }
    }

    public static void printColorForPoint(double x, double y) {
        System.out.printf("(%.2f, %.2f) -> ", x, y);
        System.out.println(picture.getColor(x, y));
    }

    private static double readNum(String text) {
        System.out.print(text);
        Scanner scn = new Scanner(System.in);
        return scn.nextDouble();
    }

    private static boolean isTheCoordinatePlaneCorrect(double num) {
        return (num < -10 || num > 10);
    }

}