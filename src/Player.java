import org.newdawn.slick.AppGameContainer;
import org.newdawn.slick.GameContainer;
import org.newdawn.slick.Input;

/**
 * Created by Aster on 13/12/2016.
 */
public class Player extends Entity{

    private String username;
    private String age;
    private AppGameContainer appGameContainer;
    private int DirectionPlayerX = 1;
    private int DirectionPlayerY = 0;



    public Player(int x, int y){ //constructeur
        super(x, y);

    }
    public Player(int x, int y, String username){ //autre constructeur
        super(0, y);
        this.username=username;
    }
    public Player(String username, AppGameContainer appGameContainer){ //Constructeur
        super(100,100);
        this.username=username;
        this.appGameContainer = appGameContainer;
    }



    @Override
    public void move(GameContainer GameContainer){ // Fonction pour le déplacement

        super.setX(super.getX() + this.DirectionPlayerX);
        super.setY(super.getY() + this.DirectionPlayerY);

        if(GameContainer.getInput().isKeyDown(Input.KEY_DOWN)){
            setDirectionPlayerX(0);
            setDirectionPlayerY(1);
           // super.setY(super.getY() + this.DirectionPlayerY);
        }
        if(GameContainer.getInput().isKeyDown(Input.KEY_UP)){
            setDirectionPlayerX(0);
            setDirectionPlayerY(-1);
          //  super.setY(super.getY() + this.DirectionPlayerY);
        }
        if(GameContainer.getInput().isKeyDown(Input.KEY_LEFT)){
            setDirectionPlayerY(0);
            setDirectionPlayerX(-1);
          //  super.setX(super.getX() + this.DirectionPlayerX);
        }
        if(GameContainer.getInput().isKeyDown(Input.KEY_RIGHT)){
            setDirectionPlayerY(0);
            setDirectionPlayerX(1);
          //  super.setX(super.getX() + this.DirectionPlayerX);
        }
    }




    //////////////////////////////////
    public AppGameContainer getAppGameContainer() {
        return appGameContainer;
    }

    public void setAppGameContainer(AppGameContainer appGameContainer) {
        this.appGameContainer = appGameContainer;
    }

    public int getDirectionPlayerX() {
        return DirectionPlayerX;
    }

    public void setDirectionPlayerX(int directionPlayerX) {
        DirectionPlayerX = directionPlayerX;
    }

    public int getDirectionPlayerY() {
        return DirectionPlayerY;
    }

    public void setDirectionPlayerY(int directionPlayerY) {
        DirectionPlayerY = directionPlayerY;
    }

    /////////////////////////////////








}


