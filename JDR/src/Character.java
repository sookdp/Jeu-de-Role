public class Character {
	private String name;
	private int posX;
	private int posY;
	private int velocity;
	private int life;
	private int defense;
	private int attack;
	private int exp;
	private boolean alive = true;
	
	public Character (String name, int posX, int posY, int velocity, int life, int defense, int attack, int exp) {
		this.name = name;
		this.posX = posX;
		this.posY = posY;
		this.velocity = velocity;
		this.life = life;
		this.defense = defense;
		this.attack = attack;
		this.exp = exp;
	}
	public String getName () {
		return name;
	}
	public int getX () {
	   	 return posX;
	}
	public int getY () {
	   	 return posY;
	}
	public int getVelocity () {
	   	 return velocity;
	}
	public int getLife () {
	   	 return life;
	}
	public int getDefense () {
	   	 return defense;
	}
	public int getAttack () {
	   	 return attack;
	}
	public int getExp () {
	   	 return exp;
	}
	public boolean getIsAlive () {
		return alive;
	}
	
	public void setName (String name) {
		this.name = name;
	}
	public void setX (int posX) {
		this.posX = posX;
	}
	public void setY (int posY) {
		this.posY = posY;
	}
	public void setVelocity (int velocity) {
		this.velocity = velocity;
	}
	public void setLife (int life) {
		this.life = life;
	}
	public void setDefense (int defense) {
		this.defense = defense;
	}
	public void setAttack (int attack) {
		this.attack = attack;
	}
	public void setExp (int exp) {
		this.exp = exp;
	}
	public void setIsAlive (boolean alive){
		this.alive = alive;
	}
	public void fight(Character victim) {
		int newLife = victim.getLife() - getAttack() + victim.getDefense();
		victim.setLife(newLife);
	}
	public void attack (Character enemy){
		int newLife = enemy.getLife() - getAttack() + enemy.getDefense();
		enemy.setLife(newLife);
	}
}