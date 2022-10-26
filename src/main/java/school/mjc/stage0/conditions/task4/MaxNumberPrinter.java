package school.mjc.stage0.conditions.task4;

public class MaxNumberPrinter {
    public static void printGreatest(int first, int second, int third) {
       if (first >= second && first >= third)
           System.out.println(first);
       else if (second >= first && second >= third)
           System.out.println(second);
       else
           System.out.println(third);
            }
    public static void main(String[] args) {
        printGreatest(3,4,5);
    }
}
