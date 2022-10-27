package school.mjc.stage0.conditions.task4;

public class TernaryPrinter {
    public static void printWhichIsBigger(int first, int second) {
        int bigger;
        System.out.println(bigger = (first > second) ? first : second);
    }

    public static void main(String[] args) {
        printWhichIsBigger(4, 5);
    }
}
