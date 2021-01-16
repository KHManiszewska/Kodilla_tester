import java.util.Random;
public class RandomNumbers {

    public static void main(String[] args) {

        int min=30;
        int max=0;
        Random random = new Random();
        int sum = 0;
        while (sum < 5000) {
            int temp = random.nextInt(31);
            sum = sum + temp;
            System.out.println(temp);
            if (temp < min) {
                min = temp;
            }
            if (temp > max) {
                max = temp;
            }
        }
        System.out.println("Najmniejsz: "+min);
        System.out.println("Największa: "+max);
    }
}
