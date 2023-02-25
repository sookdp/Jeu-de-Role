public class Weapon extends Object {
	private String spec;
	
	public Weapon(String spec, String name, int posX, int posY) {
		super (name, posX, posY);
		this.spec = spec;
	}
	
	public String getSpec () {
		return spec;
	}
	public void setSpec (String spec) {
		this.spec = spec;
	}
}