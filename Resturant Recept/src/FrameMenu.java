import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JCheckBox;
import javax.swing.JPanel;
import javax.swing.border.TitledBorder;
import javax.swing.JSpinner;
import javax.swing.UIManager;
import java.awt.Color;
import javax.swing.JLabel;
import java.awt.Font;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

import javax.swing.JEditorPane;
import javax.swing.JButton;

public class FrameMenu extends Login {
	public static String userName;
	public static String passWord; 
	static JLabel lblNamee;
	 

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private JFrame frmRestaurantRecept;

	/**
	 * Launch the application.
	 */
	public static void NewScreen() {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					FrameMenu window = new FrameMenu();
					window.frmRestaurantRecept.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public FrameMenu() {
		super ();
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frmRestaurantRecept = new JFrame();
		frmRestaurantRecept.setTitle("Restaurant Recept");
		frmRestaurantRecept.setBounds(100, 100, 837, 543);
		frmRestaurantRecept.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frmRestaurantRecept.getContentPane().setLayout(null);
		
		JPanel panel = new JPanel();
		panel.setBorder(new TitledBorder(UIManager.getBorder("TitledBorder.border"), "FOOD AND DESERT", TitledBorder.LEADING, TitledBorder.TOP, null, new Color(0, 0, 0)));
		panel.setBounds(258, 114, 485, 150);
		frmRestaurantRecept.getContentPane().add(panel);
		panel.setLayout(null);
		
		JCheckBox chckbxNewCheckBox = new JCheckBox("New check box");
		chckbxNewCheckBox.setFont(new Font("Tahoma", Font.PLAIN, 9));
		chckbxNewCheckBox.setBounds(346, 94, 98, 30);
		panel.add(chckbxNewCheckBox);
		
		JCheckBox chckbxNewCheckBox_1 = new JCheckBox("New check box");
		chckbxNewCheckBox_1.setFont(new Font("Tahoma", Font.PLAIN, 9));
		chckbxNewCheckBox_1.setBounds(176, 31, 97, 23);
		panel.add(chckbxNewCheckBox_1);
		
		JSpinner spinner = new JSpinner();
		spinner.setBounds(279, 32, 29, 20);
		panel.add(spinner);
		
		JSpinner spinner_1 = new JSpinner();
		spinner_1.setBounds(279, 104, 29, 20);
		panel.add(spinner_1);
		
		JSpinner spinner_2 = new JSpinner();
		spinner_2.setBounds(109, 31, 29, 20);
		panel.add(spinner_2);
		
		JCheckBox checkBox = new JCheckBox("New check box");
		checkBox.setFont(new Font("Tahoma", Font.PLAIN, 9));
		checkBox.setBackground(UIManager.getColor("Button.background"));
		checkBox.setBounds(6, 30, 97, 23);
		panel.add(checkBox);
		
		JCheckBox checkBox_1 = new JCheckBox("New check box");
		checkBox_1.setFont(new Font("Tahoma", Font.PLAIN, 9));
		checkBox_1.setBounds(6, 97, 98, 30);
		panel.add(checkBox_1);
		
		JSpinner spinner_3 = new JSpinner();
		spinner_3.setBounds(109, 103, 29, 20);
		panel.add(spinner_3);
		
		JSpinner spinner_4 = new JSpinner();
		spinner_4.setBounds(449, 28, 29, 20);
		panel.add(spinner_4);
		
		JCheckBox checkBox_2 = new JCheckBox("New check box");
		checkBox_2.setFont(new Font("Tahoma", Font.PLAIN, 9));
		checkBox_2.setBounds(346, 27, 97, 23);
		panel.add(checkBox_2);
		
		JCheckBox checkBox_3 = new JCheckBox("New check box");
		checkBox_3.setBounds(346, 94, 98, 30);
		panel.add(checkBox_3);
		
		JSpinner spinner_5 = new JSpinner();
		spinner_5.setBounds(449, 100, 29, 20);
		panel.add(spinner_5);
		
		JCheckBox checkBox_4 = new JCheckBox("New check box");
		checkBox_4.setFont(new Font("Tahoma", Font.PLAIN, 9));
		checkBox_4.setBounds(176, 98, 98, 30);
		panel.add(checkBox_4);
		
		JPanel panel_1 = new JPanel();
		panel_1.setLayout(null);
		panel_1.setBorder(new TitledBorder(UIManager.getBorder("TitledBorder.border"), "DRINK", TitledBorder.LEADING, TitledBorder.TOP, null, new Color(0, 0, 0)));
		panel_1.setBounds(258, 269, 485, 150);
		frmRestaurantRecept.getContentPane().add(panel_1);
		
		JCheckBox checkBox_5 = new JCheckBox("New check box");
		checkBox_5.setFont(new Font("Tahoma", Font.PLAIN, 9));
		checkBox_5.setBounds(346, 94, 98, 30);
		panel_1.add(checkBox_5);
		
		JCheckBox checkBox_6 = new JCheckBox("New check box");
		checkBox_6.setFont(new Font("Tahoma", Font.PLAIN, 9));
		checkBox_6.setBounds(176, 31, 97, 23);
		panel_1.add(checkBox_6);
		
		JSpinner spinner_6 = new JSpinner();
		spinner_6.setBounds(279, 32, 29, 20);
		panel_1.add(spinner_6);
		
		JSpinner spinner_7 = new JSpinner();
		spinner_7.setBounds(279, 104, 29, 20);
		panel_1.add(spinner_7);
		
		JSpinner spinner_8 = new JSpinner();
		spinner_8.setBounds(109, 31, 29, 20);
		panel_1.add(spinner_8);
		
		JCheckBox checkBox_7 = new JCheckBox("New check box");
		checkBox_7.setFont(new Font("Tahoma", Font.PLAIN, 9));
		checkBox_7.setBounds(6, 30, 97, 23);
		panel_1.add(checkBox_7);
		
		JCheckBox checkBox_8 = new JCheckBox("New check box");
		checkBox_8.setFont(new Font("Tahoma", Font.PLAIN, 9));
		checkBox_8.setBounds(6, 97, 98, 30);
		panel_1.add(checkBox_8);
		
		JSpinner spinner_9 = new JSpinner();
		spinner_9.setBounds(109, 103, 29, 20);
		panel_1.add(spinner_9);
		
		JSpinner spinner_10 = new JSpinner();
		spinner_10.setBounds(449, 28, 29, 20);
		panel_1.add(spinner_10);
		
		JCheckBox checkBox_9 = new JCheckBox("New check box");
		checkBox_9.setFont(new Font("Tahoma", Font.PLAIN, 9));
		checkBox_9.setBounds(346, 27, 97, 23);
		panel_1.add(checkBox_9);
		
		JCheckBox checkBox_10 = new JCheckBox("New check box");
		checkBox_10.setBounds(346, 94, 98, 30);
		panel_1.add(checkBox_10);
		
		JSpinner spinner_11 = new JSpinner();
		spinner_11.setBounds(449, 100, 29, 20);
		panel_1.add(spinner_11);
		
		JCheckBox checkBox_11 = new JCheckBox("New check box");
		checkBox_11.setFont(new Font("Tahoma", Font.PLAIN, 9));
		checkBox_11.setBounds(176, 98, 98, 30);
		panel_1.add(checkBox_11);
		
		JLabel lblWelcome = new JLabel("WELCOME");
		lblWelcome.setFont(new Font("Tahoma", Font.PLAIN, 42));
		lblWelcome.setBounds(20, 39, 198, 79);
		frmRestaurantRecept.getContentPane().add(lblWelcome);
		
		JLabel lblPosition = new JLabel("CASHIER \r");
		lblPosition.setFont(new Font("Tahoma", Font.PLAIN, 14));
		lblPosition.setBounds(21, 137, 133, 52);
		frmRestaurantRecept.getContentPane().add(lblPosition);
		
		JEditorPane editorPane = new JEditorPane();
		editorPane.setBounds(20, 355, 217, 99);
		frmRestaurantRecept.getContentPane().add(editorPane);
		
		JLabel lblTotal = new JLabel("TOTAL");
		lblTotal.setFont(new Font("Tahoma", Font.PLAIN, 28));
		lblTotal.setBounds(20, 296, 83, 52);
		frmRestaurantRecept.getContentPane().add(lblTotal);
		
		JButton btnCash = new JButton("CASH");
		btnCash.setBounds(258, 430, 121, 40);
		frmRestaurantRecept.getContentPane().add(btnCash);
		
		JLabel lblName = new JLabel("JOANE STAFANNIE");
		lblName.setFont(new Font("Tahoma", Font.PLAIN, 16));
		lblName.setBounds(20, 186, 182, 52);
		frmRestaurantRecept.getContentPane().add(lblName);
		
		lblNamee=new JLabel("Name");
		lblNamee.setFont(new Font("Tahoma", Font.PLAIN, 16));
		lblNamee.setBounds(21, 103, 182, 52);
		frmRestaurantRecept.getContentPane().add(lblNamee);
	}
	public static Boolean labeldata(){
		Connection connect;
		PreparedStatement pre;
		Boolean status = false;
		try{
			connect =  DriverManager.getConnection("jdbc:ucanaccess:////C:/Users/Admin/Google Drive/PROJEC/Login.accdb", "", "");
			String qry ="SELECT * FROM login"+"WHERE Username=?"+"AND Password=?AND NAME=? AND Family Name=?";
			pre = connect.prepareStatement(qry);
			pre.setString(1, fillusername);
			pre.setString(2, fillpassWord);
			ResultSet rec = pre.executeQuery();
			if(rec.next()) {
				lblNamee.setText(rec.getString("Name")+"  "+rec.getString("FamilyName"));
				status=true;
			}
			else{}
		
		}
		catch(Exception e){
			lblNamee.setText("Access Not Found");
		}
		return status;
		
	}
}
