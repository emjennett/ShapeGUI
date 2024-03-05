//MyOval.java
//Draws oval
import java.awt.Color;
import java.awt.Graphics;

public class MyOval extends MyBoundedShape{
    
    public MyOval (){
        //no-parameter constructor of MyBoundedShape
    }

    public MyOval (int x1, int y1, int x2, int y2, Color myColor, boolean filled){
        super(x1, y1, x2, y2, myColor, filled);
    }//end MyOval constructor

    @Override//use for polymorphism
    public void draw (Graphics g){
        g.setColor(Color.BLACK);
        //draws filled oval
        if(super.getFilled())
            g.fillOval(getUpperLeftX(), getUpperLeftY(), getWidth(), getHeight());
        //draws unfilled oval
        else
            g.drawOval(getUpperLeftX(), getUpperLeftY(), getWidth(), getHeight());
    }//end draw

}//end MyOval