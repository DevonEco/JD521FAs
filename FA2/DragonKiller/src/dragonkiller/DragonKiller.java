/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dragonkiller;

/**
 *
 * @author Devon
 */
import java.util.Scanner;
import java.util.Random;
public class DragonKiller {
    
    public static int RemoveSpace(String x)
    {
        String nameSurname = new String(x.replaceAll("//s", ""));    ////Creates a new string to store in////
        int z = (nameSurname.length());    ////this is the string length for the size of array////
        return z;
    }
    
    public static void main(String[] args) 
    {
        ////Scanner input////
        Scanner name = new Scanner(System.in);
        System.out.print("Please enter your name: ");
        
        String x = name.nextLine(); ////takes the input for user////
        
        ////Array////
        int n = RemoveSpace(x);
        Random randomNr = new Random();
        
        
        int[] arrayDragon;
        arrayDragon = new int[n];
        
        for (int i = 0; i < n;)
        {
            int number = randomNr.nextInt(40 + 1) + 10;
            ////read in only odd numbers////
            if (number % 2 ==1)
            {
                arrayDragon[i] = number;
                System.out.print("Index[" + i + "] = " + arrayDragon[i] + "\n");
                i++;
            }
        }
        ////Search for element input////
        System.out.println("Search for an element: ");
        int killNumber = name.nextInt();
        name.close();
        
        ////Search for an element////
        int i ;
        for ( i = 0 ; i < n; i++)
        {
            if (arrayDragon[i] == killNumber)
            {
                arrayDragon[i] = 0;
            }
        }
        for ( i = 0 ; i < n ; i++)
        {
            System.out.println("Index[" + i + "] = " + arrayDragon[i]);
        }
    }
}
