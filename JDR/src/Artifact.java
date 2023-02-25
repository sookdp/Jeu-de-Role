public class Artifact extends Object {
	private String spec;
	
	public Artifact(String spec, String name, int posX, int posY) {
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