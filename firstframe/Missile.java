package firstframe;

import java.awt.Image;
import java.awt.Rectangle;

import javax.swing.ImageIcon;

public class Missile {
	private int x;
	private int y;
	private Image image;
	private int width;
	private int height;
	private boolean isVisible;
	private final String IMAGE_NAME = "missile.jpg";
	
	public Rectangle getRectangle(){
		Rectangle rectangle = new Rectangle(x, y, width, height);
		return rectangle;
	}
	Missile(){
		image = new ImageIcon(Missile.class.getResource(IMAGE_NAME)).getImage();
		width = image.getWidth(null);
		height = image.getHeight(null);
		isVisible = true;
	}

	public void moveMissile(){
		if(x<=GameOne.BOARDWIDTH){
			x++;
		}
		else{
			isVisible = false;
		}
	}
	
	public int getX() {
		return x;
	}

	public void setX(int x) {
		this.x = x;
	}

	public int getY() {
		return y;
	}

	public void setY(int y) {
		this.y = y;
	}

	public Image getImage() {
		return image;
	}

	public void setImage(Image image) {
		this.image = image;
	}

	public int getWidth() {
		return width;
	}

	public void setWidth(int width) {
		this.width = width;
	}

	public int getHeight() {
		return height;
	}

	public void setHeight(int height) {
		this.height = height;
	}

	public boolean isVisible() {
		return isVisible;
	}

	public void setVisible(boolean isVisible) {
		this.isVisible = isVisible;
	}
	
	

}