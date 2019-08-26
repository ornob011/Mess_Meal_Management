package mess;

public class Mess 
{

    public static void main(String[] args) 
    {
        java.awt.EventQueue.invokeLater(() -> 
        {
            new AddNewMember().setVisible(true);
        }); 
    }
}
