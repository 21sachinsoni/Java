package firstframe;



import java.awt.Image;
import java.awt.Rectangle;
import java.awt.Toolkit;
import java.awt.event.KeyEvent;
import java.util.ArrayList;

import javax.swing.ImageIcon;



public class Plane  {

	
	private int x;
	private int y;
	private Image image;
	private int width;
	private int height;
	private boolean isVisible;
	private int veloxPlane;
	private int veloyPlane;
	private ArrayList<Missile> missileList=new ArrayList<>();	
	
	public void donotMove()
	{
		veloxPlane=0;
		veloyPlane=0;
	}
	
	
	public Rectangle getRectangle(){
		Rectangle rectangle=new Rectangle(x,y,width,height);
		return rectangle;
		
	}
	  
	public void missileLaunch()
	{
	    Missile missile = new Missile();
		missile.setX(this.getX()+this.getWidth());
		missile.setY(this.getY());
		
		this.missileList.add(missile);
		Toolkit.getDefaultToolkit().beep();
		System.out.println("Missile Launched "+this);
		
	}
		
	
	
	
	
	public void direction(KeyEvent e)
		{
			if(e.getKeyCode()==KeyEvent.VK_SPACE)
			{
				missileLaunch();
			}
			
			
			
			
			
			if (e.getKeyCode() == KeyEvent.VK_UP)
				{if (y<5)
				{
					veloyPlane=0;
				}
				else
				   veloyPlane=-1;
				}
		else
			if(e.getKeyCode() == KeyEvent.VK_DOWN)
			{
				
			if(y>GameOne.BOARDHEIGHT-image.getHeight(null))
			{
				veloyPlane=0;
			}
			else
			   veloyPlane=1;
			}
		}
	 /*  else
	   	if(e.getKeyCode( )== KeyEvent.VK_LEFT){
	    		if (x<5)
	    		{
	    			veloxPlane=0;
	    		}
	    		else
	    		veloxPlane=-1;
	    	}
			
	   else
           if(e.getKeyCode() == KeyEvent.VK_RIGHT)
        	   if(x >GameOne.BOARDWIDTH-image.getWidth(null)){
        		   veloxPlane=0;
        	  }
        	   else
		        veloxPlane=1;
		}*/
		
		
		public void move()
		{
			x=x+veloxPlane;
			y=y+veloyPlane;
		}
		
		
		
		 Plane() 
			{
			    x=50 ;
			    y=80;
			   
				this.image=new ImageIcon(Plane.class.getResource("abcd2.jpg"+ "")).getImage();
				this.width=image.getWidth(null);
				height=image.getHeight(null);
				isVisible= true;
				
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

		public ArrayList<Missile> getMissileList() {
			return missileList;
		}
		public void setMissileList(ArrayList<Missile> missileList) {
			this.missileList = missileList;
		}
		
		
		
		
		
		}


