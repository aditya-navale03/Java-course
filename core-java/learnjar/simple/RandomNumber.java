import java.util.Random;

public class RandomNumber{
    public static void main(String args[]) {

        Random GenerateRandom = new Random();

        System.out.println("Random numbers 1 to 100");
        for(int i = 0;i<10;i++){
            System.out.println("numbers"+GenerateRandom.nextInt(100));
        }

    }
}