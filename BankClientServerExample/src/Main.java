//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        //TIP Press <shortcut actionId="ShowIntentionActions"/> with your caret at the highlighted text
        // to see how IntelliJ IDEA suggests fixing it.
        System.out.print("Hello world!");
        StudentAccount s1 = new StudentAccount();
        s1.setGPA(3.9);
        System.out.println(s1.currentGPA());
        System.out.println(s1.classesTaken());
        System.out.println(s1.upcomingAssignments());
    }
}