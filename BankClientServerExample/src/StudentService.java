import java.io.InputStream;
import java.io.IOException;
import java.io.OutputStream;
import java.io.PrintWriter;
import java.net.Socket;
import java.util.Scanner;

/**
 Executes Simple Bank Access Protocol commands
 from a socket.
 */
public class StudentService implements Runnable
{
    private Socket s;
    private Scanner in;
    private PrintWriter out;
    private StudentCollection studentCollection;

    /**
     Constructs a service object that processes commands
     from a socket for a student collection.
     @param aSocket the socket
     @param aStudentCollection the student collection
     */
    public StudentService(Socket aSocket, StudentCollection aStudentCollection)
    {
        s = aSocket;
        studentCollection = aStudentCollection;
    }

    public void run()
    {
        try
        {
            try
            {
                in = new Scanner(s.getInputStream());
                out = new PrintWriter(s.getOutputStream());
                doService();
            }
            finally
            {
                s.close();
            }
        }
        catch (IOException exception)
        {
            exception.printStackTrace();
        }
    }

    /**
     Executes all commands until the QUIT command or the
     end of input.
     */
    public void doService() throws IOException
    {
        while (true)
        {
            if (!in.hasNext()) { return; }
            String command = in.next();
            if (command.equals("QUIT")) { return; }
            else { executeCommand(command); }
        }
    }

    /**
     Executes a single command.
     Changed the logic on this a bit, so it was easier to work with in my application. Originally the final thing it
     would check is if the input was not "BALANCE", but this wouldnt work the same for my application.
     @param command the command to execute
     */
    public void executeCommand(String command)
    {
        int account = in.nextInt();
        if (command.equals("SET_GPA"))
        {
            double GPA = in.nextDouble();
            studentCollection.setGPA(account, GPA);
            out.println(account + " " + studentCollection.currentGPA(account));
        }
        else if(command.equals("CLASSES_TAKEN"))
        {
            studentCollection.classesTaken(account);
            out.println(account + " " + (int)(studentCollection.classesTaken(account)));
        }
        else if (command.equals("UPCOMING_ASSIGNMENTS"))
        {
            studentCollection.upcomingAssignments(account);
            out.println(account + " " + (int)(studentCollection.upcomingAssignments(account)));
        }
        else if(command.equals("CURRENT_GPA"))
        {
            out.println(account + " " + studentCollection.currentGPA(account));
        }
        else
        {
            out.println("Invalid command");
            out.flush();
            return;
        }
        out.flush();
    }
}