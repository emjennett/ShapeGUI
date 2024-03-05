//MyBoundedShape.java
//Factors out common features from MyRectangle and MyOval

import java.awt.Color;
import java.awt.Graphics;

public class MyBoundedShape extends MyShape
{
    private boolean filled;

    //calls constructor from MyShape
    public MyBoundedShape()
    {
        filled=false;
    }

    //constructor with filled parameter
    public MyBoundedShape( int x1, int y1, int x2, int y2, Color myColor, boolean filled)
    {
        setUpperLeftX (x1, x2);
        setUpperLeftY (y1, y2);
        super.setColor (myColor);
        setFilled(filled);
    }//end constructor

    //sets upper left x coordinate
    public void setUpperLeftX (int x1, int x2)
    {
        if (x1<0)
            x1= 0;
        
        if (x2 <0)
            x2= 0;
        
        if (x1 >x2)
        {
            super.setX1(x2);
            super.setX2(x1);
        }

        else
        {
            super.setX1(x1);
            super.setX2(x2);
        }
    }

    //sets upper left y coordinate
    public void setUpperLeftY (int y1, int y2)
    {
        if (y1 < 0)
            y1= 0;

        if (y2 < 0)
            y2 = 0;

        if (y1>y2)
        {
            super.setY1 (y2);
            super.setY2 (y1);
        }

        else
        {
            super.setY1 (y1);
            super.setY2 (y2);
        }
    }

    //sets filled shapes
    public void setFilled(boolean filled)
    {
        this.filled = filled;
    }

    //gets upper left x
    public int getUpperLeftX ()
    {
        return super.getX1 ();
    }
    //gets upper left y
    public int getUpperLeftY ()
    {
        return super.getY1 ();
    }
    //gets width
    public int getWidth ()
    {
        return Math.abs(super.getX1() - super.getX2());
    }
    //gets height
    public int getHeight()
    {
        return Math.abs(super.getY1() - super.getY2());
    }
    //gets filled
    public boolean getFilled()
    {
        return filled;
    }

    public void draw(Graphics g)
    {  
    }
}//end MyBoundedShape