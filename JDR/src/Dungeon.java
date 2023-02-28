public class Dungeon {
	private int posX;
	private int posY;
	private int [][] wall;
	private int [][] hero;
	private int [][] enemy;
	private int [][] chest;
	private int [][] evil;

	public Dungeon(int posX, int posY, int[][] wall, int[][] evil, int[][] chest,int[][] enemy, int[][] hero) {
		this.posX = posX;
		this.posY = posY;
		this.wall = wall;
		this.hero = hero;
		this.enemy = enemy;
		this.chest = chest;
		this.evil = evil;
	}
	public int getX() {
		return posX;
	}
	public void setX(int posX) {
		this.posX = posX;
	}
	public int getY() {
		return posY;
	}
	public void setY(int posY) {
		this.posY = posY;
	}
	public int[][] getWall() {
		return wall;
	}
	public void setWall(int[][] wall) {
		this.wall = wall;
	}
	public int[][] getHero() {
		return hero;
	}
	public void setHero(int[][] hero) {
		this.hero = hero;
	}
	public int[][] getEnemy() {
		return enemy;
	}
	public void setEnemy(int[][] enemy) {
		this.enemy = enemy;
	}
	public int[][] getChest() {
		return chest;
	}
	public void setChest(int[][] chest) {
		this.chest = chest;
	}
	public int[][] getEvil() {
		return evil;
	}
	public void setEvil(int[][] evil) {
		this.evil = evil;
	}
	public boolean isWall(int posX, int posY){
		boolean isWall = false;
		for (int i = 0; i < wall.length; i++) {
			if(posX == wall[i][0] && posY == wall[i][1]){
				isWall = true;
			}
		}
		return isWall;
	}
	public boolean isHero(int posX, int posY){
		boolean isHero = false;
		for (int i = 0; i < hero.length; i++) {
			if(posX == hero[i][0] && posY == hero[i][1]){
				isHero = true;
			}
		}
		return isHero;
	}
	public boolean isEnemy(int posX, int posY){
		boolean isEnemy = false;
		for (int i = 0; i < enemy.length; i++) {
			if(posX == enemy[i][0] && posY == enemy[i][1]){
				isEnemy = true;
			}
		}
		return isEnemy;
	}
	public boolean isChest(int posX, int posY){
		boolean isChest = false;
		for (int i = 0; i < chest.length; i++) {
			if(posX == chest[i][0] && posY == chest[i][1]){
				isChest = true;
			}
		}
		return isChest;
	}
	public boolean isEvil(int posX, int posY){
		boolean isEvil = false;
		for (int i = 0; i < evil.length; i++) {
			if(posX == evil[i][0] && posY == evil[i][1]){
				isEvil = true;
			}
		}
		return isEvil;
	}
	public void showMap (int playerX, int playerY){
		for (int i = 0; i < posX; i++){
            for (int j = 0; j < posY; j++){
                if (this.isWall(i, j)) {
                    System.out.print("X\t");
                } 
                else if (this.isEvil(i, j)){
                    System.out.print("Ev\t");
                }
                else if (this.isChest(i, j)){
                    System.out.print("C\t");
                }
                else if (this.isEnemy(i, j)){
                    System.out.print("E\t");
                }
                else if (playerY == j && playerX == i){
                    System.out.print("H\t");
                }
                else {
                    System.out.print(".\t");
                }  
            }
            System.out.println();
        }
	}
	
}