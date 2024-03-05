//DrawPanel.java
//Draws random shapes
import java.awt.Color;
import java.awt.Graphics;
import java.util.Random;
import javax.swing.JPanel;
import javax.swing.JOptionPane;

public class DrawPanel extends JPanel
{
    //private variables that work to create shapes
    private Random randomNumbers = new Random();
    private MyShape [] shapes;//array of shapes
    private Color color;
    private boolean filled;
    private final int line = 0;
    private final int oval = 0;
    private int x1;
    private int x2;
    private int y1;
    private int y2;
    private int input=0;

    //DrawPanel constructor
    public DrawPanel()
    {
        setBackground (Color.WHITE);       

        //input validation
        boolean bool = false;
        while(!bool)
        {

            try{
                //creates shapes when integer is inputted
                String num = JOptionPane.showInputDialog("How many shapes would you like to create?");
                input=Integer.parseInt(num);  
                //shows warning message if zero or negative number is inputted  
                if (input > 0){
                    bool = true;
                    break; 
                }
                JOptionPane.showMessageDialog(null,"Invalid input", "Please enter a positive integer", JOptionPane.WARNING_MESSAGE);  
            }
            //catches input exceptions
            catch(NumberFormatException e){
                JOptionPane.showMessageDialog(null," Invalid input, please try again","Attention",JOptionPane.WARNING_MESSAGE); 
            }    
            
        }//end while

        //creates shapes based on input
        shapes = new MyShape [input];

        //generates random numbers
        for (int i=0; i<input; i++)
        {
            x1 = randomNumbers.nextInt(300);
            y1 = randomNumbers.nextInt(300);
            x2 = randomNumbers.nextInt(300);
            y2 = randomNumbers.nextInt(300);
            
            color = new Color (randomNumbers.nextInt(256), randomNumbers.nextInt(256), randomNumbers.nextInt(256));
            //decides if filled
            filled = randomNumbers.nextBoolean();

            //creates line
            if(randomNumbers.nextInt (3) ==line)
                shapes[i] = new MyLine (x1, y1, x2, y2, color);
                //creates oval
                else if (randomNumbers.nextInt(3)== oval)
                    shapes [i]= new MyOval (x1, y1, x2, y2, color, filled);
                //creates rectangle
                else 
                    shapes [i] = new MyRectangle (x1, y1, x2, y2, color, filled);
        }//end for
    }//end DrawPanel constructor

    //counts number of each shape
    public String shapeCounter()
    {
        //variables to control amount of shapes
        int lineCount = 0;
        int ovalCount = 0;
        int rectCount = 0;

        for (MyShape shape : shapes)
        {
            //increases line count if the produced shape is an instance of MyLine
            if (shape instanceof MyLine)
                lineCount++;
            //increases oval count if the produced shape is an instance of MyOval
            else if (shape instanceof MyOval)
                ovalCount++;
            //increases rectangle count if the produced shape is an instance of MyRectangle
            else
                rectCount++;
        }

        //displays components of drawing
        String message= "Lines:" + lineCount + ", Ovals:" + ovalCount + ", Rectangles: " + rectCount;
        return message;

    }//end shapeCounter

    //draws shapes
    public void paintComponent (Graphics g)
    {
        super.paintComponent (g);

        for (MyShape shape: shapes)
            shape.draw(g);
    }//end paintComponent
}//end DrawPanel