package firstframe;

import java.awt.Image;
import java.awt.Rectangle;

import javax.swing.ImageIcon;

public class Enemy 
{
	private int x;
	private int y;
	private Image image;
	private int width;
	private int height;
	private int velox;
	private int veloy;
    private boolean isVisible;
	private final String Image="Zombie1.gif";
	
	
	
	public Rectangle getRectangle(){
		Rectangle rectangle = new Rectangle(velox, veloy, width, height);
		return rectangle;
	}
  

   public Enemy(int x,int y)
        {
	   this.velox=this.x=x;
	   this.veloy=this.y=y;
	   
	   isVisible = true;
	   
    	 image=new ImageIcon(Enemy.class.getResource(Image)).getImage();
    	 width=image.getWidth(null);
    	 height=image.getHeight(null);
    	
    	  }
  
   
   
   
   
  
   
   
   
   
   
    public void moveEnemy()
    {
    	if(velox>0)
    	{
    		velox--;
    	}
        else
        	if(velox==0)
        {
        		velox=x;
    	//isVisible = false;
        }
    }
    
    
    
    
    public int getX()
    {
    	return x;
    }
    public void setX(int x)
    {
    	this.x=x;
    } 
    
    
    public int getVelox()
    {
    	return velox;
    }
    public void setVelox(int velox)
    {
    	this.velox=velox;
    }
    
    public int getVeloy()
    {
    	return veloy;
    }
    public void setVeloy(int veloy)
    {
    	this.veloy=veloy;
    }
    
    
    public int getY()
    {
    	return y;
    }
    public void setY(int y)
    {
    	this.y=y;
    }
    
    public Image getImage()
    {
    	return image;
    }
    public void setImage(Image image)
    {
    	this.image=image;
    }
    
    public int getWidth()
    {
    	return width;
    }
    public void setWidth(int width)
    {
    	this.width=width;
    }
    
    public int getHeight()
    {
    	return height;
    }
    public void setHeight(int height)
    {
    	this.height=height;
    }
    
    public boolean isVisible()
    {
    	return isVisible;
    }
    public void setIsVisible(boolean isVisible)
    {
    	this.isVisible=isVisible;
    }
	
	
    
    
    
    
}
    