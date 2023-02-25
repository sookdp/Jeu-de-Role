public class Potion extends Object {
	private String power;
	
	public Potion(String power, String name, int posX, int posY) {
		super (name, posX, posY);
		this.power = power;
	}
	
	public String getPower () {
		return power;
	}
	public void setPower (String power) {
		this.power = power;
	}
}