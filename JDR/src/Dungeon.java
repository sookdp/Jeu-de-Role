public class Dungeon {
	private int posX;
	private int posY;
	private int [][] wall;
	private int [][] hero;
	private int [][] enemy;
	private int [][] chest;
	private int [][] evil;

	public Dungeon(int posX, int posY, int[][] wall, int[][] hero, int[][] enemy, int[][] chest, int[][] evil) {
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
		boolean isWall = false;
		for (int i = 0; i < wall.length; i++) {
			if(posX == wall[i][0] && posY == wall[i][1]){
				isWall = true;
			}
		}
		return isWall;
	}
	public boolean isChest(int posX, int posY){
		boolean isWall = false;
		for (int i = 0; i < wall.length; i++) {
			if(posX == wall[i][0] && posY == wall[i][1]){
				isWall = true;
			}
		}
		return isWall;
	}
	public boolean isEvil(int posX, int posY){
		boolean isWall = false;
		for (int i = 0; i < wall.length; i++) {
			if(posX == wall[i][0] && posY == wall[i][1]){
				isWall = true;
			}
		}
		return isWall;
	}
}