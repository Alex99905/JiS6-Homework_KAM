
import java.util.Random;
public class RandomGen {
    public static void main(String[] args) {
        Random r = new Random();
        int sum = 0;
        int randomInt;
        for (int i = 0; i < 3; i++) {
            randomInt = r.nextInt(100);

            sum = sum + randomInt;
            System.out.println(randomInt);

        }
        System.out.println(sum);

    }



}
