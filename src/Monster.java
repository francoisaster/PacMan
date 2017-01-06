import org.newdawn.slick.Color;
import org.newdawn.slick.Graphics;

/**
 * Created by Aster on 01/01/2017.
 */
public class Monster extends Entity{

    public Monster(int x, int y){ //constructeur
        super(x, y);

    }

    public void draw(Graphics graphics){ // je lui donne une feuille de papier pour dessiner ;)
        graphics.setColor(Color.green);
        graphics.fillOval(super.getX(), super.getY(), 20, 20);
        graphics.drawOval(super.getX(), super.getY(), 20, 20);
    }

}
