
Simple Academic Tracker Protocol (SATP)
Whenever you develop a server application, you need to specify some
application-level protocol that clients can use to interact with the server.
For the purpose of this example, we will create a "Simple Bank Access Protocol".
The table below shows the protocol format. Of course, this is just a toy
protocol to show you how to implement a server.

| Client Request         | Server Response                          | Description                                                                                   |
|------------------------|------------------------------------------|-----------------------------------------------------------------------------------------------|
| CURRENT_GPA n          | student account number n and the GPA     | Get the GPA of selected student account n                                                     |
| SET_GPA n gpa          | n and the gpa                            | Set the student account n's GPA to the gpa entered                                            |
| CLASSES_TAKEN n        | n and the amount of taken classes        | returns the amount of classes taken for the student account n. (random number for now)        |
| UPCOMING_ASSIGNMENTS n | n and the amount of upcoming assignments | returns the amount of upcoming assignments for thr student account n. (random number for now) |
| QUIT                   | Quit the connection                      |                                                                                               |

Source: Cay Horstmann, Big Java