// File: CodeAnalysisExample.java
public class CodeAnalysisExample {

    // Class-level variable
    private int count;

    // Constructor
    public CodeAnalysisExample(int initialCount) {
        this.count = initialCount;
    }

    // Method to increment count
    public void increment() {
        count++;
    }

    // Method to decrement count
    public void decrement() {
        count--;
    }

    // Method to reset count
    public void reset() {
        count = 0;
    }

    // Method to display current count
    public void display() {
        System.out.println("Current count: " + count);
    }

    // Main method
    public static void main(String[] args) {
        CodeAnalysisExample example = new CodeAnalysisExample(5);

        example.display();
        example.increment();
        example.display();
        example.decrement();
        example.display();
        example.reset();
        example.display();
    }
}
