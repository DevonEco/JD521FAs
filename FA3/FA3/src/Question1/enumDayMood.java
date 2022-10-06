package Question1;
import javax.swing.JFrame;
import javax.swing.JOptionPane;

class enumDayMood extends FA3
{
    //Constructor
    public enumDayMood (Day day)
    {
        super(day);
    }
    
    //Method
    public void telDayMood()
    {
        //Creating the frame
        JFrame frame = new JFrame();
        
        //Switch Case
        switch (day) 
        {
            case MONDAY:
                JOptionPane.showMessageDialog (frame, "Mondays are bad.");
                break;
                
            case FRIDAY:
                JOptionPane.showMessageDialog (frame, "Fridays are better.");
                break;
                
            case SATERDAY:
                JOptionPane.showMessageDialog (frame, "Weekends are the best.");
                
            default :
                JOptionPane.showMessageDialog(frame, "Midweeks are so so.");
                break;
        }
    }
}
