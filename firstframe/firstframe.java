package firstframe;

import java.awt.Color;
import java.awt.Font;
import java.awt.Image;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPasswordField;
import javax.swing.JTextField;
import javax.swing.SwingConstants;


public class firstframe extends JFrame{
    private final String IMAGE ="loginBackground.jpg";
	
	private JFrame frame;
	private JTextField usernameField;
	private JPasswordField passwordField;
    
	private void login()
    {
    	String userid=usernameField.getText();
     String password=passwordField.getText();
     String check=null;
    /*  if((usernameField.equals(null)))
	 {
		 JLabel lblusername = null;
		lblusername.setText("field can't be empty");
		
	 }
     
      else*/
    	  if(userid.equals(password))
     {    music.music();
    	 this.setVisible(false);
    	 this.dispose();
    	
    	 Mysecondscreen ss=new Mysecondscreen(userid);
    	 ss.setVisible(true);
     }
     else{
    	 JOptionPane.showMessageDialog(this, "Invalid Userid or Password");
     }
    }
	
	
   


	private void reset()
     {
    		usernameField.setText("");
			passwordField.setText("");
	        usernameField.requestFocus();
     }
    
   
	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		
			
				
					firstframe window = new firstframe();
					window.frame.setVisible(true);
					
				} 
				
			
	

	/**
	 * Create the application.
	 */
	public firstframe() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 450, 300);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JLabel lblNewLabel = new JLabel("LOGIN TO KILL ZOMBIES");
		lblNewLabel.setBounds(100, 11, 242, 37);
		lblNewLabel.setFont(new Font("Sitka Subheading", Font.BOLD, 18));
		lblNewLabel.setForeground(Color.RED);
		lblNewLabel.setHorizontalAlignment(SwingConstants.CENTER);
		frame.getContentPane().add(lblNewLabel);
		
		JLabel lblUserName = new JLabel("USER NAME");
		lblUserName.setBounds(31, 86, 100, 29);
		lblUserName.setFont(new Font("Tahoma", Font.BOLD, 12));
		lblUserName.setForeground(new Color(0, 0, 0));
		frame.getContentPane().add(lblUserName);
		
		
		
		
		
		
		
		
		JLabel lblPassword = new JLabel("PASSWORD");
		lblPassword.setBounds(31, 133, 100, 37);
		lblPassword.setFont(new Font("Tahoma", Font.BOLD, 12));
		frame.getContentPane().add(lblPassword);
		
		usernameField = new JTextField();
		usernameField.setBounds(182, 91, 133, 24);
		frame.getContentPane().add(usernameField);
		usernameField.setColumns(10);
		
		JButton btnLogin = new JButton("LOGIN");
		btnLogin.setBounds(81, 208, 89, 23);
		btnLogin.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				login();
			}
		});
		btnLogin.setFont(new Font("Tahoma", Font.BOLD, 13));
		frame.getContentPane().add(btnLogin);
		
		JButton btnReset = new JButton("RESET");
		btnReset.setBounds(226, 209, 89, 23);
		btnReset.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
			reset();
			}
		});
		btnReset.setFont(new Font("Tahoma", Font.BOLD, 13));
		frame.getContentPane().add(btnReset);
		
		passwordField = new JPasswordField();
		passwordField.setBounds(182, 142, 133, 24);
		frame.getContentPane().add(passwordField);
		
		JLabel lblusername = new JLabel("");
		lblusername.setBounds(182, 117, 133, 14);
		lblusername.setForeground(Color.RED);
		lblusername.setFont(new Font("Tahoma", Font.ITALIC, 11));
		frame.getContentPane().add(lblusername);
		
		JLabel lblpassword = new JLabel("");
		lblpassword.setBounds(182, 166, 133, 14);
		lblpassword.setFont(new Font("Tahoma", Font.ITALIC, 11));
		lblpassword.setForeground(Color.RED);
		frame.getContentPane().add(lblpassword);
		
		JLabel lblNewLabel_1 = new JLabel("\r\n");
		lblNewLabel_1.setIcon(new ImageIcon(firstframe.class.getResource(IMAGE)));
		lblNewLabel_1.setBounds(0, 0, 434, 261);
		frame.getContentPane().add(lblNewLabel_1);
	}
}
