public class Dungeon {
	private int posX;
	private int posY;
	public Dungeon (int posX, int posY) {
		this.posX = posX;
		this.posY = posY;
	}
	public int getX () {
	   	 return posX;
	}
	public int getY () {
	   	 return posY;
	}
	
	public void setX (int posX) {
		this.posX = posX;
	}
	public void setY (int posY) {
		this.posY = posY;
	}

}