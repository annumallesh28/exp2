class Courses{
    int sem;
    int[] marks = new int [3]; 
    String[] courseName = new String[3];

    Courses(int sem, int[] marks, String[] courseName) {
        this.sem = sem;
        this.marks = marks;
        this.courseName = courseName;
    }

    void displayCourses() {
        System.out.println("Courses offered in semester " + sem + ":");
        for (int i =0; i < courseName.length; i++) {
            System.out.println("Subject: "+courseName[i]+"\tMarks: " + marks[i]);
        }
    }

}

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

        Courses course = new Courses(2, new int[]{85, 90, 78}, new String[]{"Math", "Science", "History"});
        course.displayCourses();
    }
}