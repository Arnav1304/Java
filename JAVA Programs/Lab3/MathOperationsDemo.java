class MathOperations {
    public int subtract(int a, int b) {
        return a - b;
    }

    public double subtract(double a, double b) {
        return a - b;
    }

    public int subtract(int[] numbers) {
        int result = numbers[0];
        for (int i = 1; i < numbers.length; i++) {
            result -= numbers[i];
        }
        return result;
    }
}

public class MathOperationsDemo {
    public static void main(String[] args) {
        MathOperations mathObj = new MathOperations();

        int result1 = mathObj.subtract(10, 5);
        System.out.println("Result 1: " + result1);

        double result2 = mathObj.subtract(15.5, 7.3);
        System.out.println("Result 2: " + result2);

        int[] numbers = {20, 4, 2};
        int result3 = mathObj.subtract(numbers);
        System.out.println("Result 3: " + result3);
    }
}
