import java.util.Scanner;

public class KeyboardAddingImp {
    public KeyboardAddingImp() {
    }

    public static void addingKb (Group group) {
        Scanner scanner = new Scanner(System.in);
        Student student8 = new Student(null, null, null, 0, null);
        System.out.println("Enter student`s name: ");
        student8.setName(scanner.nextLine());

        System.out.println("Enter student`s lastname: ");
        student8.setLastName(scanner.nextLine());

        System.out.println("Enter student`s gender (MALE/FEMALE): ");
        student8.setGender(Gender.valueOf(scanner.nextLine()));

        System.out.println("Enter student`s Id: ");
        student8.setId(Integer.valueOf(scanner.nextLine()));

        System.out.println("Enter student`s group name: ");
        student8.setGroupName(scanner.nextLine());

        try {
group.addStudent(student8);
System.out.println("Successfully");
        }
        catch (GroupOverflowException e){

        }
    }
}
