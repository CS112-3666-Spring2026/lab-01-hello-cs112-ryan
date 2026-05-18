public class Main {

    // Part 2: void static method
    public static void sayGoodLuck() {
        System.out.println("Good luck in CS112!");
    }

    // Part 2: value-returning static method with parameter
    public static int squareNumber(int num) {
        return num * num;
    }

    public static void main(String[] args) {

        // Part 1
        System.out.println("Welcome to CS 112!");

        // Testing Part 2 methods
        sayGoodLuck();

        int result = squareNumber(5);
        System.out.println("5 squared is: " + result);

        // Part 3: creating and testing objects
        Student s1 = new Student();
        Student s2 = new Student("Ryan");

        System.out.println(s1);
        System.out.println(s2);

        s1.setName("Alex");
        System.out.println("s1 name: " + s1.getName());

        System.out.println("s1 equals s2? " + s1.equals(s2));
    }
}

// Part 3: programmer-defined class
class Student {

    // instance variable
    private String name;

    // default constructor
    public Student() {
        name = "Unknown";
    }

    // full constructor
    public Student(String name) {
        this.name = name;
    }

    // accessor/getter
    public String getName() {
        return name;
    }

    // mutator/setter
    public void setName(String name) {
        this.name = name;
    }

    // toString method
    public String toString() {
        return "Student name: " + name;
    }

    // equals method
    public boolean equals(Student other) {
        return this.name.equals(other.name);
    }
}
