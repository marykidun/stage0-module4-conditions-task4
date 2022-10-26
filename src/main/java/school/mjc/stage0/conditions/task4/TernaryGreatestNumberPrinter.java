package school.mjc.stage0.conditions.task4;

public class TernaryGreatestNumberPrinter {
    public static void printGreatest(int first, int second) {
        int greatest;
        greatest = (first > second) ? first : second;
        System.out.println(greatest);
    }
    public static void main(String[] args) {
        printGreatest(2,3);
    }
}
