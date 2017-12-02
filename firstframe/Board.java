package firstframe;


import java.awt.Color;
import java.awt.Font;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import java.util.ArrayList;

import javax.swing.ImageIcon;
import javax.swing.JPanel;
import javax.swing.Timer;



public class Board extends JPanel {
	Graphics2D enemy2d; 
	private Timer planetimer;
	private Timer enemytimer;
	Plane plane;
	final int PLANEDELAY = 10;
	final int ENEMYDELAY = 50;
	private ArrayList<Enemy> enemyList=new ArrayList<>();
	private final int MAXENEMY=20;
	private boolean printEnemy=false;
	private boolean gameover=false;
	private boolean gamewin=false;
	public void createEnemy()
	{
		int enemyPosition[][]={
				
				{620,30},{680,120},{1000,400},{980,320},{800,50},
				{600,500},{900,220},{890,200},{790,350},{1200,450},
				{850,140},{900,420},{1010,440},{690,90},{1100,30},
				{740,255},{768,362},{920,430},{1040,440},{830,300}
				
		};
		for(int i=0;i<enemyPosition.length;i++){
			enemyList.add(new Enemy(enemyPosition[i][0] , enemyPosition[i][1]));
		}
	}
	
	
	
	
	
	public void updateGame(){
		planetimer = new Timer(PLANEDELAY,new ActionListener(){
			@Override
			public void actionPerformed(ActionEvent e){
				plane.move();
				
				
				repaint();
				System.out.println("Plane Timer Calling...");
			}
		});
		
		enemytimer=new Timer(ENEMYDELAY , new ActionListener(){
			@Override
		public void actionPerformed(ActionEvent e){
			
			printEnemy=true;
			repaint();
			System.out.println("enemy timer calling...");
		}
				
		});	
				
		
		planetimer.start();
		enemytimer.start();
	}
	
	
	
	
	@Override
	public void paintComponent(Graphics g){
		super.paintComponent(g);
		Graphics2D twoD = (Graphics2D)g;
		this.enemy2d=twoD;
		
        twoD.drawImage(new ImageIcon(Board.class.getResource("gamebackground3.jpg")).getImage(),0,0,this);
		twoD.drawString("Enemy Left"+enemyList.size(),10, 20);
        if(plane.isVisible()){
		twoD.drawImage(plane.getImage(), plane.getX(), plane.getY(), this);
		}
		// My Painting
	
	for(int i = 0 ; i<plane.getMissileList().size(); i++){
		Missile missile = plane.getMissileList().get(i);
		if(missile.isVisible()){
			missile.moveMissile();
			twoD.drawImage(missile.getImage(), missile.getX(), missile.getY(), this);
			
		}
		else{
			plane.getMissileList().remove(i);
		}
	}
	for(int i = 0; i<enemyList.size();i++){
		Enemy enemyObject = enemyList.get(i);
		//System.out.println("here2");
		if(enemyObject.isVisible() ){
			
			enemyObject.moveEnemy();
			twoD.drawImage(enemyObject.getImage(), enemyObject.getVelox(), enemyObject.getVeloy(), this);
		//	System.out.println("here");
		}
		else
		{
			//enemyList.remove(i);
		}
		
	}
	
		//collision detection missile and enemy
		for(int i=0;i<plane.getMissileList().size();i++){
			for(int j=0;j< enemyList.size();j++){
				Missile missile =plane.getMissileList().get(i);
				Enemy enemy=enemyList.get(j);
				if(missile.getRectangle().intersects(enemy.getRectangle()) )
				{missile.setVisible(false);
				enemy.setIsVisible(false);
				enemyList.remove(j);
					
				}
				
			}
		
		}
		//collision detection plane and enemy
		for(int j=0;j<enemyList.size();j++){
			Enemy enemy=enemyList.get(j);
			if(plane.getRectangle().intersects(enemy.getRectangle())){
				gameover=true;
				plane.setVisible(false);
				enemy.setIsVisible(false);
				
				enemyList.remove(j);
				//planetimer.stop();
				//enemytimer.stop();
				
			}
		}
		if(gameover==true){
			planetimer.stop();
			enemytimer.stop();
			twoD.setFont(new Font("Red",Font.BOLD,40));
			twoD.drawString("MISSION FAILED..!!", 80, 350);
			//enemyList.clear();
		}
		
		if(enemyList.size()==0)
		{
			gamewin=true;
		}
		if(gamewin==true){
			planetimer.stop();
			twoD.setFont(new Font("Blue",Font.BOLD,30));
			twoD.drawString("MISSION SUCCESSFUL..!!", 80, 350);
		}
	}

	
	
	
	public Board() {
		setForeground(Color.DARK_GRAY);
		this.setBounds(0, 0, GameOne.BOARDWIDTH, GameOne.BOARDHEIGHT);
		this.setFocusable(true);
		this.setBackground(new Color(0, 191, 255));
		plane = new Plane();
		this.createEnemy();
		this.setFocusable(true);
		setLayout(null);
		this.addKeyListener(new KeyAdapter()
				{public void keyPressed(KeyEvent e)
			{
					plane.direction(e);
					
			}
				@Override
			public void keyReleased(KeyEvent e)
			{
				plane.donotMove();
				
			}
				});
		
		
		updateGame();
		
		
		
		
		
		
		
		
	
	}
}
