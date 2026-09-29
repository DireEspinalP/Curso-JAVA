package POO;
import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        String studentId = scanner.nextLine();
        String name = scanner.nextLine();
        int grade = Integer.parseInt(scanner.nextLine());
        String school = scanner.nextLine();
        
        Student student1 = new Student(studentId,name, grade,school);
        
        System.out.println(school);
        
        System.out.println(student1.getInfo());
    }
}
