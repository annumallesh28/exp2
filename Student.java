public class Student {
    String name;
    int age;

    public Student(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public int calculateAge() {
        return age;
    }

    public void display() {
        System.out.println("Student Name: " + name);
        System.out.println("Age: " + calculateAge() + " years");
    }

    public static void main(String[] args) {
        Student student = new Student("Bharat Kulkarni", 20);
        student.display();
    }
}