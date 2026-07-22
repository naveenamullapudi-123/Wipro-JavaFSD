class Race extends Thread {

    static boolean raceOver = false;

    public Race(String name) {
        super(name);
    }

    public void run() {

        String threadName = Thread.currentThread().getName();

        for (int distance = 1; distance <= 100; distance++) {

            if (raceOver) {
                break;
            }

            System.out.println(threadName + " covered " + distance + " meters");

            // Hare sleeps after running 60 meters
            if (threadName.equals("Hare") && distance == 60) {
                try {
                    System.out.println("Hare is sleeping for 1000 milliseconds...");
                    Thread.sleep(1000);
                } catch (InterruptedException e) {
                    System.out.println(e);
                }
            }

            // To make Tortoise slower
            if (threadName.equals("Tortoise")) {
                try {
                    Thread.sleep(50);
                } catch (InterruptedException e) {
                    System.out.println(e);
                }
            }
        }

        if (!raceOver) {
            raceOver = true;
            System.out.println("\n" + threadName + " wins the race!");
        }
    }
}


public class HareTortoiseRace {

    public static void main(String[] args) {

        Race hare = new Race("Hare");
        Race tortoise = new Race("Tortoise");


        // Setting priorities
        hare.setPriority(Thread.MAX_PRIORITY);      // 10
        tortoise.setPriority(Thread.MIN_PRIORITY);  // 1


        System.out.println("Race Started...\n");


        hare.start();
        tortoise.start();


        try {
            hare.join();
            tortoise.join();
        } catch (InterruptedException e) {
            System.out.println(e);
        }


        System.out.println("\nRace Finished");
    }
}