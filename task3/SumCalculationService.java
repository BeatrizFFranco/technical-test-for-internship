package task3;

public class SumCalculationService {

    public static int calculateSum(int index) {
        int sum = 0;
        int k = 1;

        while (k < index) {
            k = k + 1;
            sum = sum + k;
        }

        return sum;
    }

    public static void main(String[] args) {
        int index = 12;

        int sum = calculateSum(index);
        System.out.println("The value of SUM is: " + sum);
    }
}

