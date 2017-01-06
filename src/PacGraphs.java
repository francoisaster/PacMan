import org.newdawn.slick.*;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.List;

/**
 * Created by Aster on 13/12/2016.
 */
public class PacGraphs extends BasicGame {


    private Player player1;
    private Monster monster1;


    private Wall wall0;
    private Wall wall00;
    private Wall wall000;
    private Wall wall0000;
    private Wall wall1;
    private Wall wall2;
    private Wall wall11;
    private Wall wall22;
    private Wall wall3;
    private Wall wall33;
    private Wall wall4;
    private Wall wall44;
    private Wall wall444;
    private Wall wall5;
    private Wall wall55;
    private Wall wall555;
    private Wall wall5555;
    private Wall wall6;
    private Wall wall66;
    private Wall wall666;
    private Wall wall6666;

    private Wall wall1Bis;


    private Wall wallHaut;
    private Wall wallBas;
    private Wall wallDroite;
    private Wall wallGauche;

    private ArrayList<Wall> listeMur;
    private ArrayList<Player> listePlayer;
    private ArrayList<Monster> listeMonster;

    private Board board;





    public PacGraphs(String title) {
        super(title);
    }




    @Override
    public void init(GameContainer gameContainer){

        this.player1 = new Player(100, 250);
        this.monster1 = new Monster(292, 80); // 60 60



        this.wall0 = new Wall("wall0", 186, 0, 20, 62);
        this.wall00= new Wall("wall00", 186, 104, 20, 52);
        this.wall000 = new Wall("wall000", 186, 268, 20, 52);
        this.wall0000 = new Wall("wall0000", 186, 368, 20, 52);

        this.wall1 = new Wall("Wall1", 42, 41, 40, 20);
        this.wall1Bis = new Wall("wall1Bis", 43, 42, 38, 18);
        this.wall11 = new Wall("Wall11", 313, 41, 40, 20);

        this.wall2 = new Wall("Wall2", 104, 42, 60, 20); // 24
        this.wall22 = new Wall("Wall22", 229, 42, 60, 20);

        this.wall3 = new Wall("Wall3", 42, 84, 40, 10);
        this.wall33 = new Wall("Wall33", 313, 84, 40, 10);

        this.wall4 = new Wall("Wall4", 145, 84, 100, 20);
        this.wall44 = new Wall("Wall44", 145, 248, 100, 20);
        this.wall444 = new Wall("Wall444", 145, 348, 100, 20);

        this.wall5 = new Wall("Wall5", 20, 117, 60, 40);
        this.wall55 = new Wall("Wall55", 313, 117, 64, 40);
        this.wall555 = new Wall("Wall555", 20, 179, 60, 40);
        this.wall5555 = new Wall("Wall5555", 313, 179, 64, 40);

        this.wall6 = new Wall("wall6", 102, 84, 20, 80);
        this.wall66 = new Wall("wall66", 268, 84, 20, 80);
        this.wall666 = new Wall("wall666", 122, 126, 40, 20);
        this.wall6666 = new Wall("wall6666", 228, 126, 40, 20);


        this.wallHaut = new Wall ("wallHaut", 0, 0, 397, 20);
        this.wallBas = new Wall ("wallBas", 0, 420, 397, 20);
        this.wallDroite = new Wall ("wallDroite", 377, 0, 20, 440); // abs 420
        this.wallGauche = new Wall ("wallGauche", 0, 0, 20, 440);

        this.listeMur = new ArrayList<Wall>();

        listeMur.add(this.wall0);
        listeMur.add(this.wall00);
        listeMur.add(this.wall000);
        listeMur.add(this.wall0000);
        listeMur.add(this.wall1);
        listeMur.add(this.wall11);
        listeMur.add(this.wall2);
        listeMur.add(this.wall22);
        listeMur.add(this.wall3);
        listeMur.add(this.wall33);
        listeMur.add(this.wall4);
        listeMur.add(this.wall44);
        listeMur.add(this.wall444);
        listeMur.add(this.wall5);
        listeMur.add(this.wall55);
        listeMur.add(this.wall555);
        listeMur.add(this.wall5555);
        listeMur.add(this.wall6);
        listeMur.add(this.wall66);
        listeMur.add(this.wall666);
        listeMur.add(this.wall666);
        listeMur.add(this.wallHaut);
        listeMur.add(this.wallBas);
        listeMur.add(this.wallDroite);
        listeMur.add(this.wallGauche);

        this.board = new Board("board principal", listeMur);

        this.board.tableauCoordonneeMurs();
        //Pour avoir un quadrillage avec tous les murs en


    }


    @Override
    public void update(GameContainer gameContainer, int i){                       // logique de jeu, controle sur le jeu

        this.player1.move(gameContainer);
        this.monster1.move(gameContainer);

        this.monster1.detection();
       // System.out.println();




    }


    @Override
    public void render(GameContainer gameContainer, Graphics graphics){

        this.player1.draw(graphics);
        this.monster1.draw(graphics);

        for (Wall o : this.listeMur){         //Pour afficher la liste
            o.afficheWall(graphics);
        }




    }





    ///////////////////////////////////////////////
    public Player getPlayer1() {
        return player1;
    }

    public void setPlayer1(Player player1) {
        this.player1 = player1;
    }

    public Monster getMonster1() {
        return monster1;
    }

    public void setMonster1(Monster monster1) {
        this.monster1 = monster1;
    }

    public Wall getWall0() {
        return wall0;
    }

    public void setWall0(Wall wall0) {
        this.wall0 = wall1;
    }

    public Wall getWall1() {
        return wall1;
    }

    public void setWall1(Wall wall1) {
        this.wall1 = wall1;
    }
    /////////////////////////////////////////////////////










/*
        for (Wall o : this.listeMur){         //Pour afficher la liste
            o.collisionMonster();
        }

        this.wall0.collisionPlayer();
        this.wall0.collisionMonster();

        this.wall00.collisionPlayer();
        this.wall00.collisionMonster();

        this.wall000.collisionPlayer();
        this.wall000.collisionMonster();

        this.wall0000.collisionPlayer();
        this.wall0000.collisionMonster();

        this.wall1.collisionPlayer();
        this.wall1.collisionMonster();

        this.wall1Bis.collisionPlayer();
        this.wall1Bis.collisionMonster();

        this.wall2.collisionPlayer();
        this.wall2.collisionMonster();

        this.wall11.collisionPlayer();
        this.wall11.collisionMonster();

        this.wall22.collisionPlayer();
        this.wall22.collisionMonster();

        this.wall3.collisionPlayer();
        this.wall3.collisionMonster();

        this.wall33.collisionPlayer();
        this.wall33.collisionMonster();

        this.wall4.collisionPlayer();
        this.wall4.collisionMonster();

        this.wall44.collisionPlayer();
        this.wall44.collisionMonster();

        this.wall444.collisionPlayer();
        this.wall444.collisionMonster();

        this.wall5.collisionPlayer();
        this.wall5.collisionMonster();

        this.wall55.collisionPlayer();
        this.wall55.collisionMonster();

        this.wall555.collisionPlayer();
        this.wall555.collisionMonster();

        this.wall5555.collisionPlayer();
        this.wall5555.collisionMonster();

        this.wall6.collisionPlayer();
        this.wall6.collisionMonster();

        this.wall66.collisionPlayer();
        this.wall66.collisionMonster();

        this.wall666.collisionPlayer();
        this.wall666.collisionMonster();

        this.wall6666.collisionPlayer();
        this.wall6666.collisionMonster();



        this.wallHaut.collisionPlayer();
        this.wallHaut.collisionMonster();

        this.wallBas.collisionPlayer();
        this.wallBas.collisionMonster();

        this.wallDroite.collisionPlayer();
        this.wallDroite.collisionMonster();

        this.wallGauche.collisionPlayer();
        this.wallGauche.collisionMonster();

*/









/*
        this.wall0.afficheWall(graphics);
        this.wall00.afficheWall(graphics);
        this.wall000.afficheWall(graphics);
        this.wall0000.afficheWall(graphics);
        this.wall1.afficheWall(graphics);
        this.wall1Bis.afficheWall(graphics);
        this.wall2.afficheWall(graphics);
        this.wall11.afficheWall(graphics);
        this.wall22.afficheWall(graphics);
        this.wall3.afficheWall(graphics);
        this.wall33.afficheWall(graphics);
        this.wall4.afficheWall(graphics);
        this.wall44.afficheWall(graphics);
        this.wall444.afficheWall(graphics);
        this.wall5.afficheWall(graphics);
        this.wall55.afficheWall(graphics);
        this.wall555.afficheWall(graphics);
        this.wall5555.afficheWall(graphics);
        this.wall6.afficheWall(graphics);
        this.wall66.afficheWall(graphics);
        this.wall666.afficheWall(graphics);
        this.wall6666.afficheWall(graphics);




        this.wallHaut.afficheWall(graphics);
        this.wallBas.afficheWall(graphics);
        this.wallDroite.afficheWall(graphics);
        this.wallGauche.afficheWall(graphics);
*/






}
