/**
 A student collection consisting of multiple student accounts.
 */
public class StudentCollection
{
    private StudentAccount[] accounts;

    /**
     * Constructs a student collection with given size
     * @param size -- number of accounts
     */
    public StudentCollection(int size)
    {
        accounts = new StudentAccount[size];
        for (int i = 0; i < accounts.length; i++)
        {
            accounts[i] = new StudentAccount();
        }
    }

    /**
     * gets the current GPA
     * @param accountNumber -- student account to get GPA of
     * @return GPA of selected student
     */
    public double currentGPA(int accountNumber)
    {
        StudentAccount account = accounts[accountNumber];
        return account.currentGPA();
    }

    /**
     * sets the GPA of the selected student to the new GPA
     * @param accountNumber -- selected student
     * @param newGPA -- self-explanatory -- new GPA for selected student
     */
    public void setGPA(int accountNumber, double newGPA)
    {
        StudentAccount account = accounts[accountNumber];
        account.setGPA(newGPA);
    }

    /**
     * gets the classes taken by the selected student
     * @param accountNumber -- selected student
     * @return classes taken by selected student
     */
    public double classesTaken(int accountNumber)
    {
        StudentAccount account = accounts[accountNumber];
        return account.classesTaken();
    }

    /**
     * gets the upcoming assignments for the selected student
     * @param accountNumber -- selected student
     * @return upcoming assignments for the selected student
     */
    public double upcomingAssignments(int accountNumber)
    {
        StudentAccount account = accounts[accountNumber];
        return account.upcomingAssignments();
    }
}