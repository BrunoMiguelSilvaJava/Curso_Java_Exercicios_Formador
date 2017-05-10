import school.Student;

/**
 * Created by Ricardo on 28/04/2017.
 */
public class HelloWorld {
    public static void main(String[] args){
        System.out.println("Hello World");

        Student student1 = new Student();
        student1.studentNumber = "10";
        String fileName = student1.getStudentFileName();
        System.out.println("FileName = " + fileName);

        Student student2 = new Student();
        student2.studentNumber = "12";
        System.out.println(student1.studentNumber);
        System.out.println(student2.studentNumber);
    }
}
