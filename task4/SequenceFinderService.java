package task4;

public class SequenceFinderService {

    public static int nextElementA() {
        return 7 + 2;
    }

    public static int nextElementB() {
        return 64 * 2;
    }

    public static int nextElementC() {
        int lastElement = 36;
        int nextIndex = (int) Math.sqrt(lastElement) + 1;
        return nextIndex * nextIndex;
    }

    public static int nextElementD() {
        int lastElement = 64;
        int nextIndex = (int) Math.sqrt(lastElement) + 2;
        return nextIndex * nextIndex;
    }

    public static int nextElementE() {
        int a = 5;
        int b = 8;
        return a + b;
    }

    public static int nextElementF() {
        return 20;
    }

    public static void main(String[] args) {
        System.out.println("Next element in sequence a: " + nextElementA());
        System.out.println("Next element in sequence b: " + nextElementB());
        System.out.println("Next element in sequence c: " + nextElementC());
        System.out.println("Next element in sequence d: " + nextElementD());
        System.out.println("Next element in sequence e: " + nextElementE());
        System.out.println("Next element in sequence f: " + nextElementF());
    }
}

