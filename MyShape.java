//MyShape.java
//implements any shape

import java.awt.Color;
import java.awt.Graphics;

public abstract class MyShape
{
    //private coordinate variables
    private int x1;
    private int y1;
    private int x2;
    private int y2;

    private Color myColor;

    //no paremeter constructor
    public MyShape()
    {
        //coordinates initialized to zero
        x1 = 0;
        y1 = 0;
        x2 = 0;
        y2 = 0;
        //color set to black
        myColor= Color.BLACK;
    }

    public MyShape( int x1, int y1, int x2, int y2, Color myColor)
    {
        this.x1 = x1;// set x coordinate of first endpoint
        this.y1 = y1;// set y coordinate of first endpoint
        this.x2 = x2;// set x coordinate of second endpoint
        this.y2 = y2;// set y coordinate of second endpoint
        this.myColor = myColor;//sets color
    }//end constructor

    //setters
    public void setX1 (int x)
    {
        x1= x;
    }

    public void setY1 (int y)
    {
        y1= y;
    }

    public void setX2 (int x)
    {
        x2= x;
    }

    public void setY2 (int y)
    {
        y2= y;
    }

    public void setColor (Color color)
    {
        myColor = color.BLACK;
    }

    //getters
    public int getX1 ()
    {
        return x1;
    }

    public int getX2()
    {
        return x2;
    }

    public int getY1 ()
    {
        return y1;
    }

    public int getY2 ()
    {
        return y2;
    }

    public Color getColor ()
    {
        return myColor;
    }

    public abstract void draw (Graphics g);//draws shape
}//end MyShape