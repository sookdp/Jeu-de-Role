public class Hero extends Character{
	Weapon [] weapon = new Weapon [2];
	Artifact [] artifacts = new Artifact [3];
	Potion [] potions = new Potion [5];
	
	 public Hero (String name, int posX, int posY, int velocity, int life, int defense, int attack, int exp) {
		 super (name, posX, posY, velocity, life, defense, attack, exp);
	 }
	 public void up() {
		 this.setY(this.getY() -1);
	 }
	public void down() {
		this.setY(this.getY() +1);
			 
		 }
	public void left() {
		this.setX(this.getX() -1);
	}
	public void right() {
		this.setX(this.getY() +1);
	}
	
	 
}