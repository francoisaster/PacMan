import org.newdawn.slick.tests.SoundTest;

import java.util.ArrayList;

/**
 * Created by Aster on 06/01/2017.
 */
public class Board {

    private String name;
    private ArrayList<Wall> listeMur;


    int [][] tableau=new int[501][501];

    public Board(String name, ArrayList<Wall> listeMur){
        this.name = name;
        this.listeMur = listeMur;
    }

    public void tableauCoordonneeMurs(){

        for (Wall o : this.listeMur) {         //Pour avoir un quadrillage avec tous les murs en
            int abscisse = o.getAbscisse();
            int ordonnee = o.getOrdonnee();
            int width = o.getWidth();
            int height = o.getHeight();

            for (int i = abscisse; i < abscisse + width; i++) {
                for (int j = ordonnee; j < ordonnee + height; j++) {
                    this.tableau[i][j] = 1;


                }

            }
        }
    }



    public int detectionSimpleHorizontale(int pixelX, int y){
        if(pixelX+20>499){
            return(1);
        }
        for(int i = pixelX; i < pixelX + 20 ;i++){
            if(this.tableau[i][y]==1){
                return(1);
            }
        }
        return(0);

    }                                       // x-1   , y
    public int detectionSimpleVerticale(int pixelY, int x){
        if(pixelY+20>499){
            return(1);
        }
        for(int i = pixelY; i < pixelY + 20 ;i++){
            if(this.tableau[x][i]==1){
                return(1);
            }
        }
        return(0);

    }

}
