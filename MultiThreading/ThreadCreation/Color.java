import java.util.Random;

class ColourThread implements Runnable {

    public void run() {

        String colours[] = {"white", "blue", "black", "green", "red", "yellow"};
        Random random = new Random();

        while (true) {

            int index = random.nextInt(colours.length);

            System.out.println(colours[index]);

            if (colours[index].equals("red")) {
                break;
            }
        }
    }
}

public class Color {

    public static void main(String[] args) {

        ColourThread ct = new ColourThread();

        Thread t = new Thread(ct);

        t.start();
    
    }
}