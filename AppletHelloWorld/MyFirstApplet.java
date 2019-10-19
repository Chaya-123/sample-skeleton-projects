import java.applet.Applet;
import java.awt.Graphics;

public class MyFirstApplet extends Applet {

   // private static final long serialVersionUID = -3783584337636720597L;

    /**
     * The init method will be called when the applet is launched
     */
    @Override
    public void init() {
        System.out.println("This is being initialized");
    }

    /**
     * This method is responsible for rendering graphics in the applet
     *
     * @param g
     */
    public void draw(Graphics g) {
        g.drawString("Greetings", 10, 100);
    }
    public void paint(Graphics g)
   {
    System.out.println("Hello there");
    g.drawString("Drawing an oval in our applet", 0,10);
    g.drawOval(50,50,100,100);		//draws an Oval in applet window
    g.drawRect(150,150,100,100);		//draws a Rectangle in applet window
    g.drawLine(270,270,350,350);		//draws a Line in applet window
   }
}

}
