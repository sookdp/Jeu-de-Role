public class Chest extends Object{
	private boolean content = true; // c'est rempli
	
	public Chest (String name, int posX, int posY) {
		super (name, posX, posY);
	}
	
	public boolean getContent() {
		return content;
	}

	public void setContent (boolean content) {
		this.content = content;
	}
	public void isEmpty(boolean content) {
		this.content = false;
	}
	public void isFull (boolean content) {
		this.content = true;
	}
}