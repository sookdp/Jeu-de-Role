public class Object {
	private String name;
	private String description; //ajouter les get et set 
	private int posX;
	private int posY;
	
	public Object(String name, String description, int posX, int posY) {
		this.name = name;
		this.description = description;
		this.posX = posX;
		this.posY = posY;
	}
	
	public String getName () {
		return name;
	}
	public void setName (String name) {
		this.name = name;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public int getPosX() {
		return posX;
	}

	public void setPosX(int posX) {
		this.posX = posX;
	}

	public int getPosY() {
		return posY;
	}

	public void setPosY(int posY) {
		this.posY = posY;
	}

}