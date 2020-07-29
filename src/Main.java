public class Main {
    public static void main(String[] args) {
        NumberGenerator runnable = new NumberGenerator();
        NumberGenerator runnable1 = new NumberGenerator();
        Thread thread = new Thread(runnable);
        Thread thread1 = new Thread(runnable1);

        thread.start();
        thread1.start();
    }
}
