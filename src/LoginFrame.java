import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.border.LineBorder;

import java.awt.Color;
import java.awt.SystemColor;
import javax.swing.JTextField;
import javax.swing.JPasswordField;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.SwingConstants;
import java.awt.Font;
import java.awt.Image;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.event.FocusAdapter;
import java.awt.event.FocusEvent;

public class LoginFrame extends JFrame {

	
	private Image img_logo = new ImageIcon(LoginFrame.class.getResource("res/user.png")).getImage().getScaledInstance(150, 140, Image.SCALE_SMOOTH);
	private Image img_username = new ImageIcon(LoginFrame.class.getResource("res/username.jpg")).getImage().getScaledInstance(30, 30, Image.SCALE_SMOOTH);
	private Image img_password = new ImageIcon(LoginFrame.class.getResource("res/password.png")).getImage().getScaledInstance(30, 30, Image.SCALE_SMOOTH);
	private Image img_close = new ImageIcon(LoginFrame.class.getResource("res/close_white.png")).getImage().getScaledInstance(40, 40, Image.SCALE_SMOOTH);
	
	private JPanel contentPane;
	private JTextField text_username;
	private JPasswordField text_password;
	private JLabel label_msg_login_error;
	DashBoardFrame dashBoardFrame ; 

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					LoginFrame frame = new LoginFrame();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public LoginFrame() {
		
		/*------------------------------------------------[Frame login]-------------------------------------------------*/
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		//setBounds( posX , posY , width , height)
		setBounds(700, 180, 639, 480);
		contentPane = new JPanel();
		contentPane.setBackground(new Color(0, 128, 128));
		contentPane.setBorder(new LineBorder(new Color(85, 107, 47)));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		
		/*Inizializzazione della classe dashBoardFrame */
		dashBoardFrame = new DashBoardFrame();
		
		JPanel panel_username = new JPanel();
		panel_username.setBackground(Color.WHITE);
		panel_username.setBounds(153, 210, 323, 48);
		contentPane.add(panel_username);
		panel_username.setLayout(null);
		
		text_username = new JTextField();
		text_username.addFocusListener(new FocusAdapter() {
			@Override
			public void focusGained(FocusEvent e) {
				
				if(text_username.getText().equals("Username")) {
					text_username.setText("");
				}
				else {
					text_username.selectAll();
				}
			}
			@Override
			public void focusLost(FocusEvent e) {
				
				if(text_username.getText().equals("")) {
					text_username.setText("Username");
				}
			}
		});
		text_username.setBorder(null);
		text_username.setFont(new Font("Arial", Font.PLAIN, 16));
		text_username.setText("Username");
		text_username.setBounds(10, 11, 251, 26);
		panel_username.add(text_username);
		text_username.setColumns(10);
		
		JLabel label_username = new JLabel("");
		label_username.setBounds(271, 0, 30, 48);
		label_username.setIcon(new ImageIcon(img_username));
		panel_username.add(label_username);
		
		JPanel panel_password = new JPanel();
		panel_password.setBackground(Color.WHITE);
		panel_password.setBounds(153, 269, 323, 48);
		contentPane.add(panel_password);
		panel_password.setLayout(null);
		
		text_password = new JPasswordField();
		text_password.addFocusListener(new FocusAdapter() {
			@Override
			public void focusGained(FocusEvent e) {
				
				if(text_password.getText().equals("Password")) {
					text_password.setEchoChar('●');
					text_password.setText("");
				}
				else {
					text_password.selectAll();
				}
			}
			@Override
			public void focusLost(FocusEvent e) {
				
				if(text_password.getText().equals("")) {
					text_password.setText("Password");
				}
			}
			
		});
		text_password.setBorder(null);
		text_password.setFont(new Font("Arial", Font.PLAIN, 16));
		text_password.setText("Password");
		text_password.setBounds(10, 11, 250, 26);
		panel_password.add(text_password);
		
		JLabel label_password = new JLabel("");
		label_password.setBounds(270, 0, 30, 48);
		label_password.setIcon(new ImageIcon(img_password));
		panel_password.add(label_password);
		
		JPanel panel = new JPanel();
		panel.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				if( text_username.getText().equals("Username") || text_password.getText().equals("") ||
					text_username.getText().equals("") || text_password.getText().equals("Password")) {
					
					label_msg_login_error.setText("Dati inseriti non validi!! riprovare");
				}
				else {
					
					label_msg_login_error.setText("");
					dashBoardFrame.setVisible(true);
				}
			}
		});
		panel.setBackground(new Color(60, 179, 113));
		panel.setBounds(153, 371, 323, 57);
		contentPane.add(panel);
		panel.setLayout(null);
		
		JLabel label_btn_login = new JLabel("LOG IN");
		label_btn_login.setForeground(Color.WHITE);
		label_btn_login.setFont(new Font("Arial", Font.BOLD, 18));
		label_btn_login.setBounds(139, 11, 127, 35);
		panel.add(label_btn_login);
		
		JLabel label_login_img = new JLabel("");
		label_login_img.setBackground(Color.WHITE);
		label_login_img.setBounds(226, 21, 150, 153);
		label_login_img.setIcon(new ImageIcon(img_logo));
		contentPane.add(label_login_img);
		
		JLabel label_btn_close = new JLabel("");
		label_btn_close.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				
				if( JOptionPane.showConfirmDialog(null, "Sei sicuro di voler uscire?","Conferma", JOptionPane.YES_NO_OPTION) == 0) {
					LoginFrame.this.dispose();
				}
			}

		});
		label_btn_close.setBounds(599, 0, 40, 34);
		label_btn_close.setIcon(new ImageIcon(img_close));
		contentPane.add(label_btn_close);
		
		label_msg_login_error = new JLabel("");
		label_msg_login_error.setFont(new Font("Arial", Font.PLAIN, 13));
		label_msg_login_error.setHorizontalAlignment(SwingConstants.CENTER);
		label_msg_login_error.setForeground(Color.RED);
		label_msg_login_error.setBounds(175, 339, 258, 14);
		contentPane.add(label_msg_login_error);
		
		/*toglie praticamente la possibilità di chiudere il frame, abbassarlo , o ingrandirlo*/
		setUndecorated(true);
		
		setLocationRelativeTo(null);
		/*------------------------------------------------[Fine]---------------------------------------------------------*/
		
		
	}
}
