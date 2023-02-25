public class Enemy extends Character{
	Weapon [] weapon = new Weapon [2];
	Potion [] potions = new Potion [5];
	
	public Enemy (String name, int posX, int posY, int velocity, int life, int defense, int attack, int exp, boolean alive) {
		super (name, posX, posY, velocity, life, defense, attack, exp, alive);
	}
}