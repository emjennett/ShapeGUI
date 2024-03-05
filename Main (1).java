/*
*
*@version: 15/03/2021
*@author: Emily Jennett
*@description: Modified MyLine, MyRectangle, and MyOval class using polymorphism.
*
*/
import javax.swing.JOptionPane;
import java.util.Scanner;
import javax.swing.JFrame;
import java.util.*;

public class Main
{
    //executes program
    public static void main (String[]args)
    {
        DrawPanel panel = new DrawPanel();
       //converts input to integer
        JFrame application = new JFrame(panel.shapeCounter());
        application.setDefaultCloseOperation( JFrame.EXIT_ON_CLOSE );
        application.add(panel);//adds panel to frame
        application.setSize(300, 300);//sets size of frame
        application.setVisible(true);//makes frame visible
    }//end main

}//end Main class