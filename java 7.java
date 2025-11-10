class Printer {
    public synchronized void printDocument(String userName, int numOfPages) {
        System.out.println(userName + " started printing " + numOfPages + " pages...");
        for (int i = 1; i <= numOfPages; i++) {
            System.out.println("Printing page " + i + " for " + userName);
            try {
                Thread.sleep(500); // simulate time taken to print each page
            } catch (InterruptedException e) {
                System.out.println("Printing interrupted!");
            }
        }
        System.out.println(userName + " completed printing.\n");
    }
}
class User implements Runnable {
    private String userName;
    private Printer printer;
    private int pages;

    public User(String userName, Printer printer, int pages) {
        this.userName = userName;
        this.printer = printer;
        this.pages = pages;
    }

    public void run() {
        printer.printDocument(userName, pages);
    }
}

public class Labprog7 {
    public static void main(String[] args) {
        Printer sharedPrinter = new Printer();

        Thread user1 = new Thread(new User("Alice", sharedPrinter, 3));
        Thread user2 = new Thread(new User("Bob", sharedPrinter, 4));
        Thread user3 = new Thread(new User("Charlie", sharedPrinter, 2));

        user1.start();
        user2.start();
        user3.start();
    }
}