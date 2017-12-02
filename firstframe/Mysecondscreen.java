package firstframe;



import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.JPanel;
import javax.swing.SwingConstants;
import javax.swing.border.EmptyBorder;

public class Mysecondscreen extends JFrame{
    private String userid;
	private final String Image= "firstscreenbackground.jpg";
	public void startGameOne()
	{
	GameOne gameone=new GameOne();
	gameone.setVisible(true);
	}

	

	
	public Mysecondscreen(String userid) {
		setExtendedState(JFrame.MAXIMIZED_BOTH);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		JPanel contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		this.userid=userid;
		
		JLabel lblWelcomUser = new JLabel("Hey.."+userid+" Welcome to the zombie WORLD..!!");
		lblWelcomUser.setForeground(Color.RED);
		lblWelcomUser.setFont(new Font("Copperplate Gothic Light", Font.BOLD | Font.ITALIC, 24));
		lblWelcomUser.setHorizontalAlignment(SwingConstants.CENTER);
		lblWelcomUser.setBounds(65, 77, 941, 48);
		contentPane.add(lblWelcomUser);
		
		JLabel label = new JLabel("");
		label.setBounds(335, 89, 169, 23);
		contentPane.add(label);
		
		JLabel lblNewLabel = new JLabel("");
		lblNewLabel.setIcon(new ImageIcon(Mysecondscreen.class.getResource(Image)));
		lblNewLabel.setBounds(0, 0, 1362, 684);
		//lblNewLabel.setIcon(new ImageIcon(Mysecondscreen.class.getResource(IMAGE)));
		contentPane.add(lblNewLabel);
		
		JMenuBar menubar=new JMenuBar();
		this.setJMenuBar(menubar);
		
		JMenu mnFile = new JMenu("File");
		menubar.add(mnFile);
		
		JMenuItem mntmGame = new JMenuItem("Game 1");
		mntmGame.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				startGameOne();
			}
		});
		mnFile.add(mntmGame);
		
		JMenuItem mntmGame_1 = new JMenuItem("Game 2");
		mnFile.add(mntmGame_1);
	}
}
