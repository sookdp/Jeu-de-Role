public class Object {
	private String name;
	private int posX;
	private int posY;
	
	public Object (String name, int posX, int posY) {
		this.name = name;
		this.posX = posX;
		this.posY = posY;
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
	
	public void setName (String name) {
		this.name = name;
	}
	public void setX (int posX) {
		this.posX = posX;
	}
	public void setY (int posY) {
		this.posY = posY;
	}

}