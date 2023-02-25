public class Monster extends Character {
	String power;
	private boolean willAttack = true;
	
	public Monster (String power, String name, int posX, int posY, int velocity, int life, int defense, int attack, int exp) {
		super (name, posX, posY, velocity, life, defense, attack, exp);
	}
	
	public String getPower() {
		return power;
	}
	public boolean getWillAttack() {
		return willAttack;
	}

	public void setPower (String power) {
		this.power = power;
	}
	public void setWillAttack (boolean willAttack) {
		this.willAttack = willAttack;
	}
}