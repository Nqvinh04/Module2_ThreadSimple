public class NumberGenerator implements Runnable {
    @Override
    public void run() {
        for (int i =0; i < 10; i++)
            System.out.println("\nNumber: " + i);
                System.out.println(hashCode());
        try {
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
