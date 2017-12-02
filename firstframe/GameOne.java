package firstframe;

import java.awt.Color;
import java.awt.Font;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.SwingConstants;

public class GameOne extends JFrame {

	//private JPanel contentPane;
	
	static final int BOARDHEIGHT=600;
	static final int BOARDWIDTH=600;

	
	public static void main(String[] args) {
		
					GameOne frame=new GameOne();
					frame.setVisible(true);
				
			}
		private void askForClose()
		{
			int choose=JOptionPane.showConfirmDialog(this, "DO YOU WANT TO LEAVE THIS GAME", "Gaming Portal", JOptionPane.YES_NO_OPTION);
			if(choose==JOptionPane.YES_OPTION)
			{ this.setVisible(false);
			this.dispose();
			}
			else
				if(choose==JOptionPane.NO_OPTION){
				return;
				}
				}
			
	
	
	public GameOne() {
		this.addWindowListener(new WindowAdapter() {
			@Override
			public void windowClosing(WindowEvent e) {
				askForClose();
			}
		});
		
	
		setDefaultCloseOperation(JFrame.DO_NOTHING_ON_CLOSE);
		//setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setTitle("ZOMBIE KILL");
		this.setSize(BOARDWIDTH, BOARDHEIGHT);
		this.setLocationRelativeTo(null);
		//setBounds(100, 100, 450, 300);
		//contentPane = new JPanel();
		//contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		
       
		this.getContentPane().setLayout(null);;
		Board board=new Board();
		this.getContentPane().add(board);
		
	
	}

}
