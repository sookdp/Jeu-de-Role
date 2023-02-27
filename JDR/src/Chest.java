import java.util.ArrayList;
import java.util.List;

public class Chest{
	private int posX;
	private int posY;
	private boolean content = true; // c'est rempli
	List <Object> contentList = new ArrayList<Object>();
	public Chest(int posX, int posY) {
		this.posX = posX;
		this.posY = posY;
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
	public boolean isContent() {
		return content;
	}
	public void setContent(boolean content) {
		this.content = content;
	}
	public Object getContentList() {
		return contentList.get(0);
	}
	public void setContentList(List<Object> contentList) {
		this.contentList = contentList;
	}
	public void take() {
		this.setContent(false);
		contentList.remove (0);
	}
	public void lay(Object object) {
		this.setContent(true);
		contentList.add (object);
	}
	public void viewContent() {
		System.out.println("--------------------------------------------------------------------------------------------\n"+
							"Ce coffre contient...\n" + this.contentList.get(0).getDescription() +"\n" +
							"-------------------------------------------------------------------------------------------\n");
	}
}