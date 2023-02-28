import java.util.*;
public class Game {
    private Hero hero;
    private Character evil;
    private Character enemy1;
    private Character enemy2;
    private Character enemy3;
    List<Character> enemyList = new ArrayList<Character>();
    
    private Chest chest1;
    private Chest chest2;
    private Chest chest3;
    private Chest chest4;
    private Chest chest5;
    List<Chest> chestList = new ArrayList<Chest>();

    private Object weapon;
    private Object artifact1;
    private Object artifact2;
    private Object potion1;
    private Object potion2;

    private Scanner in;
    private InOut inOut;
    private Dungeon dungeon;
    private boolean gameOver = false;
    
    public Game(Hero hero, Character evil, Character enemy1, Character enemy2, Character enemy3,
            List<Character> enemyList, Chest chest1, Chest chest2, Chest chest3, Chest chest4, Chest chest5,
            List<Chest> chestList, Object weapon, Object artifact1, Object artifact2, Object potion1, Object potion2,
            Scanner in, InOut inOut, Dungeon dungeon) {
        this.hero = hero;
        this.evil = evil;
        this.enemy1 = enemy1;
        this.enemy2 = enemy2;
        this.enemy3 = enemy3;
        this.enemyList = enemyList;
        this.chest1 = chest1;
        this.chest2 = chest2;
        this.chest3 = chest3;
        this.chest4 = chest4;
        this.chest5 = chest5;
        this.chestList = chestList;
        this.weapon = weapon;
        this.artifact1 = artifact1;
        this.artifact2 = artifact2;
        this.potion1 = potion1;
        this.potion2 = potion2;
        this.in = in;
        this.inOut = inOut;
        this.dungeon = dungeon;
    }

    public Hero getHero() {
        return hero;
    }

    public void setHero(Hero hero) {
        this.hero = hero;
    }

    public Character getEvil() {
        return evil;
    }

    public void setEvil(Character evil) {
        this.evil = evil;
    }

    public Character getEnemy1() {
        return enemy1;
    }

    public void setEnemy1(Character enemy1) {
        this.enemy1 = enemy1;
    }

    public Character getEnemy2() {
        return enemy2;
    }

    public void setEnemy2(Character enemy2) {
        this.enemy2 = enemy2;
    }

    public Character getEnemy3() {
        return enemy3;
    }

    public void setEnemy3(Character enemy3) {
        this.enemy3 = enemy3;
    }

    public List<Character> getEnemyList() {
        return enemyList;
    }

    public void setEnemyList(List<Character> enemyList) {
        this.enemyList = enemyList;
    }

    public Chest getChest1() {
        return chest1;
    }

    public void setChest1(Chest chest1) {
        this.chest1 = chest1;
    }

    public Chest getChest2() {
        return chest2;
    }

    public void setChest2(Chest chest2) {
        this.chest2 = chest2;
    }

    public Chest getChest3() {
        return chest3;
    }

    public void setChest3(Chest chest3) {
        this.chest3 = chest3;
    }

    public Chest getChest4() {
        return chest4;
    }

    public void setChest4(Chest chest4) {
        this.chest4 = chest4;
    }

    public Chest getChest5() {
        return chest5;
    }

    public void setChest5(Chest chest5) {
        this.chest5 = chest5;
    }

    public List<Chest> getChestList() {
        return chestList;
    }

    public void setChestList(List<Chest> chestList) {
        this.chestList = chestList;
    }

    public Object getWeapon() {
        return weapon;
    }

    public void setWeapon(Object weapon) {
        this.weapon = weapon;
    }

    public Object getArtifact1() {
        return artifact1;
    }

    public void setArtifact1(Object artifact1) {
        this.artifact1 = artifact1;
    }

    public Object getArtifact2() {
        return artifact2;
    }

    public void setArtifact2(Object artifact2) {
        this.artifact2 = artifact2;
    }

    public Object getPotion1() {
        return potion1;
    }

    public void setPotion1(Object potion1) {
        this.potion1 = potion1;
    }

    public Object getPotion2() {
        return potion2;
    }

    public void setPotion2(Object potion2) {
        this.potion2 = potion2;
    }

    public Scanner getIn() {
        return in;
    }

    public void setIn(Scanner in) {
        this.in = in;
    }

    public InOut getInOut() {
        return inOut;
    }

    public void setInOut(InOut inOut) {
        this.inOut = inOut;
    }

    public Dungeon getDungeon() {
        return dungeon;
    }

    public void setDungeon(Dungeon dungeon) {
        this.dungeon = dungeon;
    }

    public boolean isGameOver() {
        return gameOver;
    }

    public void setGameOver(boolean gameOver) {
        this.gameOver = gameOver;
    }

    public void start() {
        inOut.start (in);
        while(gameOver == false){
            inOut.playerChoice(in, hero,this);
        }
        System.out.println("---------------------------------------------------------------------------------------\n"+
						    "Je n'ai pas bien saisi...\n" +
							"---------------------------------------------------------------------------------------");
    }
    
    public Character whichEnemy(int posX, int posY, List<Character>enemyList) {
        Character enemy = new Character(null, posX, posY, posY, posY, posY, posX, posY);
        for (int i = 0; i < enemyList.size(); ++i){
            if (enemyList.get(i).getX() == posX && enemyList.get(i).getY() == posY) {
                enemy = enemyList.get(i);
            }
        }
        return enemy;
    }

    public void fight(Hero hero, Character enemy, InOut inOut) {
        int playerExperience = hero.getExp();
        int enemyExperience = enemy.getExp();
        Character fighter_1;
        Character fighter_2;
        if(playerExperience >= enemyExperience){
            fighter_1 = hero; 
            fighter_2 = enemy;
        }
        else{ 
            fighter_1 = enemy; 
            fighter_2 = hero;   
        }
        System.out.println();     
        System.out.println("--------------------------------------------------------------------\n"+
                            "Un combat vient de se lancer, "+ fighter_1.getName() +" va commencer !\n"+
                            "--------------------------------------------------------------------");
        System.out.println(); 

        while(hero.getIsAlive() == false || enemy.getIsAlive() == false){
            int round = 1;
            if(round % 2 == 0){
                // demander au joueur s'il veut attaquer
                fighter_2.attack(fighter_1);
                fighter_2.getIsAlive();
                fighter_1.setIsAlive(gameOver);

            }
            else{ 
                fighter_1.attack(fighter_2);
                fighter_2.setIsAlive(gameOver);
            }
            ++round;
        }

        if(hero.getIsAlive() == false){
            System.out.println(); 
            System.out.println("--------------------------------------------------------------------\n"+ 
                                "Vous avez perdu... GAME OVER\n"+
                                "--------------------------------------------------------------------\n");
            System.out.println();             
            gameOver = true;
        }

        else{
            System.out.println(); 
            System.out.println("--------------------------------------------------------------------\n"+ 
                                "A vous la victoire !\n"+
                                "--------------------------------------------------------------------\n");
            System.out.println();             
            hero.setExp(hero.getExp() +1);
            enemy.setX(0);
            enemy.setY(0);
        }
    }

    public void playerMove(Scanner in, Hero hero) {
		boolean choiceMove = false;
		while (!choiceMove) {
			boolean validInput;
			do {
				System.out.println( "Où voulez-vous aller ?\n" +
									"---------------------------------------------------------------------------------------\n"+
									"1  : En haut\n" + "2  : En bas\n" + "3  : À gauche\n" + "4  : À droite\n" +
									"---------------------------------------------------------------------------------------\n");
				int move = in.nextInt();
				validInput = true;
				switch (move) {
				case 1 : 
					choiceMove = true;
                    // changements
                    if(dungeon.isWall(hero.getX(), hero.getY() + 1) == true){
                        System.out.println("---------------------------------------------------------------------------------------\n"+
                                            "Vous êtes face à un mur, veuillez choisir autre direction\n" +
                                            "---------------------------------------------------------------------------------------\n");
                        break;
                    }
                    hero.up();
                    System.out.println("---------------------------------------------------------------------------------------\n"+
                                        "Vous êtes maintenant à la position : \n" + "X : " + hero.getX()+ "\n" + "Y : " + hero.getY()+ "\n" +
                                        "---------------------------------------------------------------------------------------\n");
                    System.out.println( "---------------------------------------------------------------------------------------\n"+
                                        "Votre position sur la carte : \n" +
                                        "---------------------------------------------------------------------------------------\n");
                    dungeon.showMap(hero.getX(), hero.getY());
					if (dungeon.isChest(hero.getX(), hero.getY()) == true) {
                        inOut.crossChest(in, hero, chest1);
                    }
                    else if (dungeon.isEnemy(hero.getX(), hero.getY()) == true) {
                        Character enemy = whichEnemy(hero.getX(), hero.getY(), enemyList);
                        fight(hero, enemy, inOut);
                    }
                    else if (dungeon.isEvil(hero.getX(), hero.getY()) == true) {
                        System.out.println("---------------------------------------------------------------------------------------\n"+
                                        "Vous allez affronter un méchant \n" +
                                        "---------------------------------------------------------------------------------------\n");
                        fight(hero, evil, inOut);
                        if (evil.getIsAlive() == false) {
                            gameOver = true;
                        }
                    }
					break;
				case 2 :
					choiceMove = true;
                    if(dungeon.isWall(hero.getX(), hero.getY() - 1) == true){
                        System.out.println("---------------------------------------------------------------------------------------\n"+
                                            "Vous êtes face à un mur, veuillez choisir autre direction\n" +
                                            "---------------------------------------------------------------------------------------\n");
                        break;
                    }
                    hero.down();
                    System.out.println("---------------------------------------------------------------------------------------\n"+
                                        "Vous êtes maintenant à la position : \n" + "X : " + hero.getX()+ "\n" + "Y : " + hero.getY()+ "\n" +
                                        "---------------------------------------------------------------------------------------\n");
                    System.out.println( "---------------------------------------------------------------------------------------\n"+
                                        "Votre position sur la carte : \n" +
                                        "---------------------------------------------------------------------------------------\n");
                    dungeon.showMap(hero.getX(), hero.getY());
					if (dungeon.isChest(hero.getX(), hero.getY()) == true) {
                        inOut.crossChest(in, hero, chest1);
                    }
                    else if (dungeon.isEnemy(hero.getX(), hero.getY()) == true) {
                        Character enemy = whichEnemy(hero.getX(), hero.getY(), enemyList);
                        fight(hero, enemy, inOut);
                    }
                    else if (dungeon.isEvil(hero.getX(), hero.getY()) == true) {
                        System.out.println("---------------------------------------------------------------------------------------\n"+
                                        "Vous allez affronter un méchant \n" +
                                        "---------------------------------------------------------------------------------------\n");
                        fight(hero, evil, inOut);
                        if (evil.getIsAlive() == false) {
                            gameOver = true;
                        }
                    }
				
					break;
				case 3 :
					choiceMove = true;
                    if(dungeon.isWall(hero.getX()-1, hero.getY()) == true){
                        System.out.println("---------------------------------------------------------------------------------------\n"+
                                            "Vous êtes face à un mur, veuillez choisir autre direction\n" +
                                            "---------------------------------------------------------------------------------------\n");
                        break;
                    }
                    hero.left();
                    System.out.println("---------------------------------------------------------------------------------------\n"+
                                        "Vous êtes maintenant à la position : \n" + "X : " + hero.getX()+ "\n" + "Y : " + hero.getY()+ "\n" +
                                        "---------------------------------------------------------------------------------------\n");
                    System.out.println( "---------------------------------------------------------------------------------------\n"+
                                        "Votre position sur la carte : \n" +
                                        "---------------------------------------------------------------------------------------\n");
                    dungeon.showMap(hero.getX(), hero.getY());
					if (dungeon.isChest(hero.getX(), hero.getY()) == true) {
                        inOut.crossChest(in, hero, chest1);
                    }
                    else if (dungeon.isEnemy(hero.getX(), hero.getY()) == true) {
                        Character enemy = whichEnemy(hero.getX(), hero.getY(), enemyList);
                        fight(hero, enemy, inOut);
                    }
                    else if (dungeon.isEvil(hero.getX(), hero.getY()) == true) {
                        System.out.println("---------------------------------------------------------------------------------------\n"+
                                        "Vous allez affronter un méchant \n" +
                                        "---------------------------------------------------------------------------------------\n");
                        fight(hero, evil, inOut);
                        if (evil.getIsAlive() == false) {
                            gameOver = true;
                        }
                    }
					break;
				case 4 :
					choiceMove = true;
                    if(dungeon.isWall(hero.getX() + 1, hero.getY()) == true){
                        System.out.println("---------------------------------------------------------------------------------------\n"+
                                            "Vous êtes face à un mur, veuillez choisir autre direction\n" +
                                            "---------------------------------------------------------------------------------------\n");
                        break;
                    }
                    hero.right();
                    System.out.println("---------------------------------------------------------------------------------------\n"+
                                        "Vous êtes maintenant à la position : \n" + "X : " + hero.getX()+ "\n" + "Y : " + hero.getY()+ "\n" +
                                        "---------------------------------------------------------------------------------------\n");
                    System.out.println( "---------------------------------------------------------------------------------------\n"+
                                        "Votre position sur la carte : \n" +
                                        "---------------------------------------------------------------------------------------\n");
                    dungeon.showMap(hero.getX(), hero.getY());
					if (dungeon.isChest(hero.getX(), hero.getY()) == true) {
                        inOut.crossChest(in, hero, chest1);
                    }
                    else if (dungeon.isEnemy(hero.getX(), hero.getY()) == true) {
                        Character enemy = whichEnemy(hero.getX(), hero.getY(), enemyList);
                        fight(hero, enemy, inOut);
                    }
                    else if (dungeon.isEvil(hero.getX(), hero.getY()) == true) {
                        System.out.println("---------------------------------------------------------------------------------------\n"+
                                        "Vous allez affronter un méchant \n" +
                                        "---------------------------------------------------------------------------------------\n");
                        fight(hero, evil, inOut);
                        if (evil.getIsAlive() == false) {
                            gameOver = true;
                        }
                    }
					break;
				default :
					System.out.println("Merci de saisir une autre valeur");
					validInput = false;
					break;
				}
			}while(!validInput);
		}
	}
}