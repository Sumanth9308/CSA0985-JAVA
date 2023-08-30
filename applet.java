import java.applet.Applet;
import java.awt.Color;
import java.awt.Graphics;

public class applet extends Applet 
{
public void paint(Graphics g)
{
g.setColor(Color.orange);
g.fillRect(50, 50, 100, 60);

g.setColor(Color.white);
int[] xPoints = {150, 200, 100};
int[] yPoints = {50, 150, 150};
g.fillPolygon(xPoints, yPoints, 3);

g.setColor(Color.green);
g.fillOval(100, 200, 80, 80);
}
}

