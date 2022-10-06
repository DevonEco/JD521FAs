// Formative Assesment 3
package Question1;
import javax.swing.JOptionPane;

public class FA3 {
    
    //Container of the days ENUM
    public enum Day{
        
    SUNDAY, MONDAY, TUESDAY, WEDNESDAY, THURSDAY, FRIDAY,
    SATERDAY,
    }
    Day day;
    
    // Constuctors
    public FA3 (Day day)
    {
        this.day = day;        
    }
    
    //User enter
    public static String enterDay()
    {
        String theDay = (JOptionPane.showInputDialog("Enter a day: ").toUpperCase());
        return theDay;
    }
    
    public static void main(String[] args)
    {
        //try & catch system which exits with 0
        try
        {
            String dayy = enterDay();
            enumDayMood firstDay = new enumDayMood (Day.valueOf(dayy));
            firstDay.telDayMood();
        }
        catch(IllegalArgumentException e)
        {
            System.exit(0);
        }
    }
}