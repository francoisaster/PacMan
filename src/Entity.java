import org.newdawn.slick.*;
import org.newdawn.slick.tests.SoundTest;

import java.util.ArrayList;
import java.util.Random;

/**
 * Created by Aster on 13/12/2016.
 */
public class Entity {

    private int x;
    private int y;
    private Graphics graphics;
    private int directionX = 1;
    private int directionY = 0;
    private Board board;
    private ArrayList<int[]> listePassage = new ArrayList<int[]>();

///////////////////////////////////////////////
    public int getX() {
        return x;
    }

    public void setX(int x) {
        this.x = x;
    }

    public int getY() {
        return y;
    }

    public void setY(int y) {
        this.y = y;
    }

    public int getDirectionX() {
        return directionX;
    }

    public void setDirectionX(int directionX) {
        this.directionX = directionX;
    }

    public int getDirectionY() {
        return directionY;
    }

    public void setDirectionY(int directionY) {
        this.directionY = directionY;
    }

/////////////////////////////////////////////////////
    public Entity(int x, int y){  // Constructeur
        this.x=x;
        this.y=y;
    }

    public void move(GameContainer GameContainer) {

        this.x = this.x + this.directionX;
        this.y = this.y + this.directionY;

    }



    public void draw(Graphics graphics){ // je lui donnes une feuille de papier pour dessiner ;)
        graphics.setColor(Color.yellow); //PAC MAN
        graphics.fillOval(this.x, this.y, 20, 20);
        graphics.drawOval(this.x, this.y, 20, 20);



    }


    public void detection(){
        Random random = new Random();




        if(this.directionY == -1 ){
            if( board.detectionSimpleVerticale(this.x-1, this.y)==0){

                int[] coord = {this.directionY,this.directionX};
                listePassage.add(coord);
            }
            if(board.detectionSimpleVerticale(this.x + 20, this.y)==0){
                int[] coord = {-this.directionY,-this.directionX};
                listePassage.add(coord);
            }
            if(board.detectionSimpleHorizontale(this.x, this.y )==0){//SI IL N Y A PAS DE MUR?  C EST 0
                int[] coord = {this.directionX,this.directionY};
                listePassage.add(coord);

            }
            int directionAleatoire = random.nextInt(listePassage.size());
            int[] newDirection= listePassage.get(directionAleatoire);
            this.directionX=newDirection[0];
            this.directionY=newDirection[1];




        }


        if(this.directionY == 1 ){
            if(board.detectionSimpleHorizontale(this.x, this.y + 20)==0){//SI IL N Y A PAS DE MUR?  C EST 0
                int[] coord = {this.directionX,this.directionY};
                listePassage.add(coord);

            }


           if( board.detectionSimpleVerticale(this.x-1, this.y)==0){

               int[] coord = {this.directionY,this.directionX};
               listePassage.add(coord);
            }
            if(board.detectionSimpleVerticale(this.x + 20, this.y)==0){
                int[] coord = {-this.directionY,-this.directionX};
                listePassage.add(coord);
            }
            int directionAleatoire = random.nextInt(listePassage.size());
            int[] newDirection= listePassage.get(directionAleatoire);
            this.directionX=newDirection[0];
            this.directionY=newDirection[1];

        }

        if(this.directionX == -1 ){
            if(board.detectionSimpleHorizontale(this.x, this.y + 20)==0){//SI IL N Y A PAS DE MUR?  C EST 0
                int[] coord = {this.directionX,this.directionY};//mur bas
                listePassage.add(coord);


            }
            if(board.detectionSimpleHorizontale(this.x, this.y )==0) {//SI IL N Y A PAS DE MUR?  C EST 0
                int[] coord = {this.directionX, this.directionY};//mur haut
                listePassage.add(coord);
            }
            if( board.detectionSimpleVerticale(this.x-1, this.y)==0){//mur gauche

                int[] coord = {this.directionY,this.directionX};
                listePassage.add(coord);
            }
            int directionAleatoire = random.nextInt(listePassage.size());
            int[] newDirection= listePassage.get(directionAleatoire);
            this.directionX=newDirection[0];
            this.directionY=newDirection[1];

        }

        if(this.directionX == 1 ){
            if(board.detectionSimpleHorizontale(this.x, this.y + 20)==0){//SI IL N Y A PAS DE MUR?  C EST 0
                int[] coord = {this.directionX,this.directionY};//mur bas
                listePassage.add(coord);

            }
            if(board.detectionSimpleHorizontale(this.x, this.y )==0) {//SI IL N Y A PAS DE MUR?  C EST 0
                int[] coord = {this.directionX, this.directionY};//mur haut
                listePassage.add(coord);
            }
            if(board.detectionSimpleVerticale(this.x + 20, this.y)==0){//mur droite
                int[] coord = {-this.directionY,-this.directionX};
                listePassage.add(coord);
            }
            int directionAleatoire = random.nextInt(listePassage.size());
            int[] newDirection= listePassage.get(directionAleatoire);
            this.directionX=newDirection[0];
            this.directionY=newDirection[1];

        }

    }

}


/*            int nombreDeChemin=board.detectionSimpleHorizontale(this.x, this.y - 1 ) + board.detectionSimpleVerticale(this.x-1, this.y) + board.detectionSimpleVerticale(this.x + 20, this.y);
            if(nombreDeChemin >= 2){ //  on a 2 choix possibles (pas de demi-tour)
                int directionAleatoire = random.nextInt(nombreDeChemin);
                if(nombreDeChemin==3){ // On a 0,1 , 2 en attente
                    if(directionAleatoire==0){
                        this.directionY=-1;
                    }
                    if(directionAleatoire==1){
                        this.directionX=-1;
                    }
                    if(directionAleatoire==2){
                        this.directionX=1;
                    }

                }
                if(nombreDeChemin==2){
                    if(board.detectionSimpleHorizontale(this.x, this.y - 1 )==0){ // ON DETECTE UN MURS DEVAnt CAR ==0
                            this.directionX=-1;
                        }
                        if(directionAleatoire==1){
                            this.directionX=1;
                        }

                    }

                }


            }


        }*/



