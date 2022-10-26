package school.mjc.stage0.conditions.task4;

public class TernaryMaxNumberPrinter {
    public static void printGreatest(int first, int second, int third) {
        int max;
        max = (first > second) ?
                (first > third ? first : third) :
                (second > third ? second : third);
        System.out.println(max);


}
    public static void main(String[] args) {
        printGreatest(3,4,5);
    }
}


