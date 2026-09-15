interface Student {
    void displayMarks();
}

interface Teacher {
    void updateMarks(int newMark);
    void displayMarks();
}

class Marks implements Student, Teacher {

    int mark = 75;

    // Teacher interface method
    public void updateMarks(int newMark) {
        mark = newMark;
        System.out.println("Mark updated successfully!");
    }

    // Common method for both interfaces
    public void displayMarks() {
        System.out.println("Student Mark: " + mark);
    }
}

public class Main {
    public static void main(String[] args) {

        Marks m = new Marks();

        // Student displays mark
        System.out.println("Before Update:");
        m.displayMarks();

        // Teacher updates mark
        System.out.println("\nTeacher updating mark...");
        m.updateMarks(90);

        // Display updated mark
        System.out.println("\nAfter Update:");
        m.displayMarks();
    }
}