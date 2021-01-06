public class Loops {
    public static void main(String[] args) {         // [2]
        int[] numbers = new int[] {2, 4, 6, 8, 10, 12};
        int numberOfElements = numbers.length;
        int sumUp = 0;
        for (int i = 0; i < numberOfElements; i++) {
            int number = numbers[i];
            sumUp = sumAndDisplay(sumUp, number);
        }
        System.out.println("Final:" + sumUp);
    }
    private static int sumAndDisplay(int a, int b) {
        int result = a + b;
        System.out.println(result);
        return result;
    }
}
