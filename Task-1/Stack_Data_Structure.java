import java.util.Scanner;

public class Stack_Data_Structure {
    static class ExerciseStack {
        private int top = -1;
        private final int[] values = new int[10];

        void push(int value) {
            if (top == values.length - 1) {
                System.out.println("Overflow");
                return;
            }
            values[++top] = value;
            System.out.println("Item inserted");
        }

        void pop() {
            if (top == -1) System.out.println("Underflow");
            else {
                top--;
                System.out.println("Item deleted");
            }
        }

        void display() {
            System.out.println("Items are:");
            for (int index = top; index >= 0; index--) System.out.println(values[index]);
        }
    }

    public static void main(String[] args) {
        ExerciseStack stack = new ExerciseStack();
        try (Scanner scanner = new Scanner(System.in)) {
            System.out.println("1: push, 2: pop, 3: display, 0: exit");
            while (scanner.hasNextInt()) {
                int option = scanner.nextInt();
                if (option == 0) break;
                if (option == 1) {
                    System.out.println("Enter data");
                    if (!scanner.hasNextInt()) break;
                    stack.push(scanner.nextInt());
                } else if (option == 2) stack.pop();
                else if (option == 3) stack.display();
                else System.out.println("Unknown option");
            }
        }
    }
}
