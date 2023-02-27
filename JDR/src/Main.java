import java.util.*;
public class Main {
    public static void main(String[] args){
		//Création des personnages
        Hero hero = new Hero("Hero", 5, 9, 5, 5, 4, 5, 0);
        Character evil = new Character("The evil", 5, 0, 10, 15, 15, 15, 3);
        Character enemy1 = new Character("Monster 1", 4, 7, 5, 10, 10, 10, 0);
        Character enemy2 = new Character("Monster 2", 2, 5, 5, 10, 10, 10, 1);
        Character enemy3 = new Character("Monster 3", 3, 3, 5, 10, 10, 10, 2);
        List<Character> enemyList = new ArrayList<Character>();

        enemyList.add(enemy1);
        enemyList.add(enemy2);
        enemyList.add(enemy3);

        //Création des coffres
        Chest chest1 = new Chest(5, 1);
        Chest chest2 = new Chest(8, 2);
        Chest chest3 = new Chest(3, 4);
        Chest chest4 = new Chest(7, 6);
        Chest chest5 = new Chest(5, 8);
        List<Chest> chestList = new ArrayList<Chest>();

        chestList.add(chest1);
        chestList.add(chest2);
        chestList.add(chest3);
        chestList.add(chest4);
        chestList.add(chest5);

		//Création des objets
        Object weapon = new Object("Weapon", "Epée", 3, 0);
        Object artifact1 = new Object("Artifact", "Casque : défense", 4, 7);
        Object artifact2 = new Object("Artifact", "Gilet de protection : défense", 2, 8);
        Object potion1 = new Object("Potion", "Potion de pouvoir", 2, 3);
        Object potion2 = new Object("Potion", "Potion de pouvoir", 3, 9);
		chest1.lay(weapon);
        chest2.lay(potion1);
        chest3.lay(artifact1);
        chest4.lay(potion2);
        chest5.lay(artifact2);
        
		//Création de la carte
        int[][] wall = {
        {0,0},{1,0},{2,0},{3,0},{4,0},      {6,0},{7,0},{8,0},{9,0},
        {0,1},{1,1},                                    {8,1},{9,1},
        {0,2},{1,2},                                          {9,2},
        {0,3},                                                {9,3},
        {0,4},      {2,4},            {5,4},{6,4},            {9,4},
        {0,5},                        {5,5},{6,5},            {9,5},
        {0,6},                                                {9,6},
        {0,7},                                                {9,7},
        {0,8},{1,8},{2,8},{3,8},{4,8},      {6,8},{7,8},{8,8},{9,8},
        {0,9},{1,9},{2,9},{3,9},{4,9},      {6,9},{7,9},{8,9},{9,9}};
        
        int[][] heroPos = {{hero.getX(), hero.getY()}};
        int[][] enemy = {
        {enemy1.getX(), enemy1.getY()}, 
        {enemy2.getX(), enemy2.getY()}, 
        {enemy3.getX(), enemy3.getY()}};
        
        int[][] chest = {
        {chest1.getPosX(), chest1.getPosY()}, 
        {chest2.getPosX(), chest2.getPosY()}, 
        {chest3.getPosX(), chest3.getPosY()}, 
        {chest4.getPosX(), chest4.getPosY()}, 
        {chest5.getPosX(), chest5.getPosY()}};

        Dungeon map = new Dungeon(10, 10, wall, heroPos, enemy, chest, chest);

        // Lancement du jeu
		InOut inOut = new InOut();
		Scanner in = new Scanner (System.in);
        Game game = new Game(hero, evil, enemy1, enemy2, enemy3, enemyList, chest1, chest2, chest3, chest4, chest5, chestList, weapon, artifact1, artifact2, potion1, potion2, in, inOut, map, false);
		game.start();
		System.out.println("Hero1 X : " + hero.getX());
		System.out.println("Hero1 Y : " + hero.getY());
		game.playerMove(in, hero);
		System.out.println("Hero1 X : " + hero.getX());
		System.out.println("Hero1 Y : " + hero.getY());
    }
}
