import java.util.ArrayList;
import java.util.Iterator;
import java.util.Scanner;

public class Labprog9 {
    public static void main(String[] args) {
        ArrayList<Integer> marksList = new ArrayList<>();
        Scanner sc = new Scanner(System.in);
        int choice;

        do {
            System.out.println("\n--- Student Marks Menu ---");
            System.out.println("1. Add Marks");
            System.out.println("2. Display Marks");
            System.out.println("3. Update Marks");
            System.out.println("4. Delete Marks");
            System.out.println("5. Exit");
            System.out.print("Enter your choice: ");
            choice = sc.nextInt();

            switch (choice) {
                case 1:
                    System.out.print("Enter marks to add: ");
                    int mark = sc.nextInt();
                    marksList.add(mark);
                    System.out.println("Marks added successfully!");
                    break;

                case 2:
                    System.out.println("\nStudent Marks:");
                    Iterator<Integer> itr = marksList.iterator();
                    while (itr.hasNext()) {
                        System.out.println(itr.next());
                    }
                    break;

                case 3:
                    System.out.print("Enter index to update (0-based): ");
                    int indexToUpdate = sc.nextInt();
                    if (indexToUpdate >= 0 && indexToUpdate < marksList.size()) {
                        System.out.print("Enter new marks: ");
                        int newMark = sc.nextInt();
                        marksList.set(indexToUpdate, newMark);
                        System.out.println("Marks updated successfully!");
                    } else {
                        System.out.println("Invalid index!");
                    }
                    break;

                case 4:
                    System.out.print("Enter index to delete (0-based): ");
                    int indexToDelete = sc.nextInt();
                    if (indexToDelete >= 0 && indexToDelete < marksList.size()) {
                        marksList.remove(indexToDelete);
                        System.out.println("Marks deleted successfully!");
                    } else {
                        System.out.println("Invalid index!");
                    }
                    break;

                case 5:
                    System.out.println("Exiting program...");
                    break;

                default:
                    System.out.println("Invalid choice! Please try again.");
            }

        } while (choice != 5);

        sc.close();
    }
}
