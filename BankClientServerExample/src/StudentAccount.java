import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

/**
 * A Student Account has GPA which can be changed. For the purpose of this assignment, the classes taken and the
 * upcoming assignments are randomly set. In a more involded project --
 * maybe for future me TODO add set methods for upcoming assignments and taken classes
 */
public class StudentAccount
{
    private double GPA;
    private int classesTaken;
    private int upcomingAssignments;
    private Lock GPAChangeLock;

    /**
     * Constructs a Student Account with 0 GPA and randomly selected classesTaken and upcomingAssignments
     */
    public StudentAccount()
    {
        GPA = 0;
        classesTaken = (int)(10*Math.random());
        upcomingAssignments = (int)(10*Math.random());
        GPAChangeLock = new ReentrantLock();
    }

    /**
     * Constructs a Student Account with initially set GPA, classesTaken, and upcomingAssignments
     * @param initialGPA
     * @param initialClassesTaken
     * @param initialUpcomingAssignments
     */
    public StudentAccount(double initialGPA, int initialClassesTaken, int initialUpcomingAssignments)
    {
        GPA = initialGPA;
        classesTaken = initialClassesTaken;
        upcomingAssignments = initialUpcomingAssignments;
    }

    /**
     * Gets the current GPA of the selected student
     * @return GPA of selected student
     */
    public double currentGPA()
    {
        return GPA;
    }

    /**
     * sets the GPA to the new GPA for the selected student
     * @param newGPA -- self-explanatory -- new GPA to replace the old GPA
     * @return GPA of the selected student, should be updated to be the same as newGPA
     */
    public double setGPA(double newGPA)
    {
        GPA = newGPA;
        return GPA;
    }

    /**
     * gets the amount of classes taken for the selected student
     * @return classesTaken
     */
    public int classesTaken()
    {
        return classesTaken;
    }

    /**
     * gets the amount of upcoming assignments
     * @return upcomingAssignments
     */
    public int upcomingAssignments()
    {
        return upcomingAssignments;
    }


}