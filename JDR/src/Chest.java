public class Chest extends Object{
	private boolean content = true;
	
	public Chest (String name, int posX, int posY) {
		super (name, posX, posY);
	}
	
	public boolean getContent() {
		return content;
	}

	public void setContent (boolean content) {
		this.content = content;
	}
}