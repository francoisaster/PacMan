import org.newdawn.slick.Color;
import org.newdawn.slick.Graphics;

import java.util.ArrayList;
import java.util.Random;

/**
 * Created by Aster on 03/01/2017.
 */

public class Wall {

    private String name;
    private int abscisse;
    private int ordonnee;
    private int width;
    private int height;
    private Graphics graphics;



    public Wall(String name, int abscisse, int ordonnee, int width, int height){
        this.name = name;
        this.abscisse=abscisse;
        this.ordonnee=ordonnee;
        this.width=width;
        this.height=height;
    }


    public void afficheWall(Graphics graphics){
        graphics.setColor(Color.blue);
        //graphics.fillRect(this.abscisse, this.ordonnee, this.width, this.height);
        graphics.drawRect(this.abscisse, this.ordonnee, this.width, this.height);
    }








// HUGO arraylist monster et joueur





    /*

    public void collisionPlayer(){

        Player player = Main.pacGraphs.getPlayer1(); //Simplification pour l'écriture


        // abscisse
        if( (player.getX() + 20 >= this.abscisse) && (player.getX() <= this.abscisse + this.width)){
            if((player.getY() + 20  >= this.ordonnee) && player.getY() <= this.ordonnee + this.height ) {
                player.setX(player.getX() - (player.getDirectionPlayerX()));
                player.setDirectionPlayerX(0);
            }
        }

        // ordonnee
        if((player.getY() + 20 >= this.ordonnee) &&( player.getY() <= this.ordonnee + this.height)){
            if( ( player.getX() + 20 >= this.abscisse) && (player.getX() <= this.abscisse + this.width)){
                player.setY(player.getY() - player.getDirectionPlayerY());
                player.setDirectionPlayerY(0);
            }
        }

    }

    public void collisionMonster(){

        Monster monster = Main.pacGraphs.getMonster1(); //Simplification pour l'écriture
        Random random = new Random();
        int rand = random.nextInt(2)*2-1;

        //Direction en abscisse


        if(this.abscisse <= monster.getX() + 20 && monster.getX() <= this.abscisse){
            if((monster.getY() >= this.ordonnee) && monster.getY() <= this.ordonnee + this.height ) {
                monster.setX(monster.getX() - monster.getDirectionX());
                monster.setDirectionX(0);
                monster.setDirectionY(rand);
            }
        }
        if(this.abscisse <= monster.getX() && monster.getX() <= this.abscisse + this.width){
            if((monster.getY() >= this.ordonnee) && monster.getY() <= this.ordonnee + this.height ){
                monster.setX(monster.getX() - monster.getDirectionX());
                monster.setDirectionX(0);
                monster.setDirectionY(rand);
            }
        }

        // Direction en ordonnee

        if((monster.getY() + 20 >= this.ordonnee) && ( monster.getY() <= this.ordonnee) ){
            if( (monster.getX() <= this.abscisse + this.width) && monster.getX() >= this.abscisse){
                monster.setY(monster.getY() - monster.getDirectionY());
                monster.setDirectionY(0);
                monster.setDirectionX(rand);
            }
        }
        if((monster.getY() <= this.ordonnee + this.height) && (monster.getY() >= this.ordonnee)){
            if((monster.getX() <= this.abscisse + this.width) && (monster.getX() >= this.abscisse)){
                monster.setY(monster.getY() - monster.getDirectionY());
                monster.setDirectionY(0);
                monster.setDirectionX(rand);
            }
        }

        */









        /* CODE QUI MARCHE AUSSI MAIS QUI DONNE LA MEME CHOSE QU AU DESSUS
        // abscisse
        if( (monster.getX() + 20 >= this.abscisse) && (monster.getX() <= this.abscisse + this.width)){
            if((monster.getY() + 20  >= this.ordonnee) && monster.getY() <= this.ordonnee + this.height ) {
                monster.setX(monster.getX() - monster.getDirectionX());
                monster.setDirectionX(0);
                monster.setDirectionY(rand);
            }
        }

        // ordonnee
        if((monster.getY() + 20 >= this.ordonnee) &&( monster.getY() <= this.ordonnee + this.height)){
            if( ( monster.getX() + 20 >= this.abscisse) && (monster.getX() <= this.abscisse + this.width)){
                monster.setY(monster.getY() - monster.getDirectionY());
                monster.setDirectionY(0);
                monster.setDirectionX(rand);
            }
        }


    }
*/




/////////////////////////////////////////////////////////////
    public String getName() {
    return name;
}

    public void setName(String name) {
        this.name = name;
    }

    public int getAbscisse() {
        return abscisse;
    }

    public void setAbscisse(int abscisse) {
        this.abscisse = abscisse;
    }

    public int getOrdonnee() {
        return ordonnee;
    }

    public void setOrdonnee(int ordonnee) {
        this.ordonnee = ordonnee;
    }

    public int getWidth() {
        return width;
    }

    public void setWidth(int width) {
        this.width = width;
    }

    public int getHeight() {
        return height;
    }

    public void setHeight(int height) {
        this.height = height;
    }


//////////////////////////////////////////////////////////////



}



/*if( monster.getX() >= 500){
            monster.setDirectionX(0);
            monster.setDirectionY(rand); // METTRE EN 4 murs
        }
        if( monster.getX() <= 0){
            monster.setDirectionX(0); // idem
            monster.setDirectionY(rand);
        }*/
//ordonnée
        /*if( monster.getY() >= 500){
            monster.setDirectionY(0);
            monster.setDirectionY(-1);
        }
        if (monster.getY() <= 0){
            monster.setDirectionY(0);
            monster.setDirectionY(+1);
        }*/



        // brouillon Player collision
/*if( player.getX() >= 500 || ( this.abscisse - 5 <= player.getX() && player.getX() <= this.abscisse )){ //500 c'est la taille du cadre, mettre une variable rect x serait mieux

        }
        if ( (this.abscisse <= player.getX() && player.getX() <= this.abscisse + 2) || player.getX() <= 0 ){
            player.setX(player.getX()+1);
        }
        if( player.getY() >= 500 || player.getY() <= 0 || player.getY() >= this.ordonnee + this.height || player.getY() <= this.ordonnee){
            player.setY(player.getY()-1);
        }*/


        // LE DEUXIEME IF Du plyayerCollision
/*  if((player.getX() <= this.abscisse + this.width )&& (player.getX() + 10 >= this.abscisse)){
            if((player.getY() + 10 >= this.ordonnee) && player.getY() <= this.ordonnee + this.height ){
                player.setX(player.getX() - player.getDirectionPlayerX());
            }
        } DEVENU INUTILE ONPEUT RESOUDRE LES ABSCISSES EN UN SEUL "IF" */
/*   if((player.getY() == this.ordonnee + this.height)){ // && (player.getY() >= this.ordonnee + this.height - (2*10))
            if((player.getX() + 5  <= this.abscisse + this.width) && player.getX() + 5 >= this.abscisse){ //
                player.setY(player.getY() - player.getDirectionY());

            }
        } */
