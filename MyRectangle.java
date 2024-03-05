//MyRectangle.java
//Draws rectangles
import java.awt.Color;
import java.awt.Graphics;

public class MyRectangle extends MyBoundedShape
{
    public MyRectangle()
    {
        //no-parameter constructor of MyRectangle
    }

    public MyRectangle(int x1, int y1, int x2, int y2, Color myColor, boolean filled)
    {
        super(x1, y1, x2, y2, myColor, filled);
    }

    @Override//draws rectangle
    public void draw(Graphics g)
    {
        g.setColor(super.getColor());
        //draws filled rectangle
        if(super.getFilled())
            g.fillRect(super.getUpperLeftX(),super.getUpperLeftY(), super.getWidth(), super.getHeight());
        //draws unfilled rectangle
        else
            g.drawRect(super.getUpperLeftX(), super.getUpperLeftY(), super.getWidth(), super.getHeight());
    }//end draw
}//end MyRectangle