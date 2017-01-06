import org.newdawn.slick.AppGameContainer;
import org.newdawn.slick.SlickException;

/**
 * Created by Aster on 13/12/2016.
 */


public class Main {


    public static PacGraphs pacGraphs;

    public static void main(String[] args){

        AppGameContainer appGameContainer;

        try {
            PacGraphs pacGraphs = new PacGraphs("PacMan !");
            Main.pacGraphs = pacGraphs; //stockage de packgrah dans une variable globale pacgraphs située dans Main
            appGameContainer = new AppGameContainer(pacGraphs);
            appGameContainer.setTargetFrameRate(120); // 60 FPS
            appGameContainer.setDisplayMode(500, 500, false); // false = non je ne veux pas de plein écran
            appGameContainer.start();
        } catch (SlickException e) {
            e.printStackTrace();
        }



    }













}

































//////////// j'ai enlevé tous les " throws SlickException "