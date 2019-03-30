

import java.awt.EventQueue;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import javax.swing.JButton;
import javax.swing.JComponent;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPasswordField;
import javax.swing.JTextField;
import java.awt.Font;
import java.awt.Window;

public class Login extends JFrame {

	public static String userName;
	public static String passWord;
	static JLabel lblWelcome;
	public static String fillusername;
	public static String fillpassWord;

	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				Login form = new Login();
				form.setVisible(true);
			}
		});
	}
	
	
	private class CloseListener implements ActionListener{
	    @Override
	    public void actionPerformed(ActionEvent e) {
	        //DO SOMETHING
	        System.exit(0);
	    }
	}

	
	
	public Login() {
            
		// Create Form Frame
		super("Restaurant Recept");
		setSize(679, 385);
		setLocation(500, 280);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		getContentPane().setLayout(null);
		
		// Label Welcome
		lblWelcome = new JLabel("RESTRAUNT RECEPT",JLabel.CENTER);
		lblWelcome.setBounds(168, 153, 336, 25);
		lblWelcome.setFont(new Font("Tahoma", Font.PLAIN, 20));
		getContentPane().add(lblWelcome);
		
		JButton btnNext = new JButton("NEXT");
		btnNext.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				
				dispose();
				FrameMenu Frme= new FrameMenu();
				Frme.NewScreen();
			}
		});
		btnNext.setBounds(290, 189, 89, 23);
		getContentPane().add(btnNext);
		
		// When Frame Loaded
		addWindowListener(new WindowAdapter() {
			@Override
			public void windowOpened(WindowEvent e) {
				LoginDialog();
			}
		});
					
	}
	
	public static Boolean getLogin() {
		
		Connection connect = null;
		PreparedStatement pre = null;
		Boolean status = false;
		
		try {
			

			connect =  DriverManager.getConnection("jdbc:ucanaccess://C:/Users/Admin/Google Drive/PROJEC/Login.accdb", "", "");	
			
			String qry = " SELECT * FROM  login " +" WHERE Username=?  "+ " AND Password = ? ";
			pre = connect.prepareStatement(qry);
			pre.setString(1, userName);
			pre.setString(2, passWord);
			
			ResultSet rec = pre.executeQuery();
			if(rec.next()) {
				lblWelcome.setText("Welcome : " +rec.getString("Position")+"  "+ rec.getString("Name")+" "+rec.getString("FamilyName"));
				
				status = true;
			} else {
     		

     		
			}
             
		} catch (Exception e) {
			// TODO Auto-generated catch block
			JOptionPane.showMessageDialog(null, e.getMessage());
			e.printStackTrace();
		}
		
		try {
			if(pre != null) {
				pre.close();
				connect.close();
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			System.out.println(e.getMessage());
			e.printStackTrace();
		}
		
		return status;
	}
	
	public static void LoginDialog() {

		JLabel title = new JLabel("Login Username and Password");
		JTextField username = new JTextField();
		JPasswordField password = new JPasswordField();
		final JComponent[] inputs = new JComponent[] {
				title,
				new JLabel("Username"),
				username,
				new JLabel("Password"),
				password
		};
		JOptionPane.showMessageDialog(null, inputs, "Login", JOptionPane.PLAIN_MESSAGE);
		
		userName = username.getText();
		passWord =  new String(password.getPassword()); 
		fillusername=userName;
		fillpassWord=passWord;

		// Check Login
		if(!getLogin())
		{
			LoginDialog();
		}
		
	}
}