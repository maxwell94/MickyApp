import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.EventQueue;
import java.awt.Image;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.border.LineBorder;
import java.awt.SystemColor;
import java.awt.Font;
import javax.swing.SwingConstants;

public class DashBoardFrame extends JFrame {

	private JPanel contentPane;
	private Image img_close = new ImageIcon(LoginFrame.class.getResource("res/close_white.png")).getImage().getScaledInstance(40, 40, Image.SCALE_SMOOTH);

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					//DashBoardFrame frame = new DashBoardFrame();
					//frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public DashBoardFrame() {
		
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(350, 80, 1200, 900);
		contentPane = new JPanel();
		contentPane.setBackground(new Color(0, 128, 128));
		contentPane.setBorder(new LineBorder(new Color(85, 107, 47)));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JPanel panel_menu_options = new JPanel();
		panel_menu_options.setBackground(new Color(0, 128, 128));
		panel_menu_options.setBounds(0, 0, 404, 900);
		contentPane.add(panel_menu_options);
		panel_menu_options.setLayout(null);
		
		JPanel panel_evolution = new JPanel();
		panel_evolution.addMouseListener(new PanelButtonMouseAdapter(panel_evolution));
		//panel_evolution.setBackground(new Color(0, 128, 128));
		panel_evolution.setBackground(new Color(47,79,79));
		panel_evolution.setBounds(10, 46, 384, 39);
		panel_menu_options.add(panel_evolution);
		panel_evolution.setLayout(null);
		
		JLabel label_evolution = new JLabel("Evolution");
		label_evolution.setHorizontalAlignment(SwingConstants.CENTER);
		label_evolution.setFont(new Font("Arial", Font.BOLD, 18));
		label_evolution.setForeground(Color.WHITE);
		label_evolution.setBounds(148, 11, 92, 17);
		panel_evolution.add(label_evolution);
		
		JPanel panel_isoftBet = new JPanel();
		panel_isoftBet.addMouseListener(new PanelButtonMouseAdapter(panel_isoftBet));
		panel_isoftBet.setBackground(new Color(47,79,79));
		panel_isoftBet.setBounds(10, 83, 384, 39);
		panel_menu_options.add(panel_isoftBet);
		panel_isoftBet.setLayout(null);
		
		JLabel lblIsoftbet = new JLabel("IsoftBet");
		lblIsoftbet.setHorizontalAlignment(SwingConstants.CENTER);
		lblIsoftbet.setHorizontalTextPosition(SwingConstants.CENTER);
		lblIsoftbet.setForeground(Color.WHITE);
		lblIsoftbet.setFont(new Font("Arial", Font.BOLD, 18));
		lblIsoftbet.setBounds(144, 11, 98, 17);
		panel_isoftBet.add(lblIsoftbet);
		
		JPanel panel_casumo = new JPanel();
		panel_casumo.addMouseListener(new PanelButtonMouseAdapter(panel_casumo));
		panel_casumo.setBackground(new Color(47,79,79));
		panel_casumo.setBounds(10, 122, 384, 39);
		panel_menu_options.add(panel_casumo);
		panel_casumo.setLayout(null);
		
		JLabel lblCasumo = new JLabel("Casumo");
		lblCasumo.setHorizontalTextPosition(SwingConstants.CENTER);
		lblCasumo.setHorizontalAlignment(SwingConstants.CENTER);
		lblCasumo.setForeground(Color.WHITE);
		lblCasumo.setFont(new Font("Arial", Font.BOLD, 18));
		lblCasumo.setBounds(145, 11, 98, 17);
		panel_casumo.add(lblCasumo);
		
		JPanel panel_evenBet = new JPanel();
		panel_evenBet.addMouseListener(new PanelButtonMouseAdapter(panel_evenBet));
		panel_evenBet.setBackground(new Color(47,79,79));
		panel_evenBet.setBounds(10, 161, 384, 39);
		panel_menu_options.add(panel_evenBet);
		panel_evenBet.setLayout(null);
		
		JLabel lblEvenbet = new JLabel("EvenBet");
		lblEvenbet.setHorizontalTextPosition(SwingConstants.CENTER);
		lblEvenbet.setHorizontalAlignment(SwingConstants.CENTER);
		lblEvenbet.setForeground(Color.WHITE);
		lblEvenbet.setFont(new Font("Arial", Font.BOLD, 18));
		lblEvenbet.setBounds(141, 11, 98, 17);
		panel_evenBet.add(lblEvenbet);
		
		JPanel panel_booming = new JPanel();
		panel_booming.addMouseListener(new PanelButtonMouseAdapter(panel_booming));
		panel_booming.setBackground(new Color(47,79,79));
		panel_booming.setBounds(10, 200, 384, 39);
		panel_menu_options.add(panel_booming);
		panel_booming.setLayout(null);
		
		JLabel lblBooming = new JLabel("Booming");
		lblBooming.setHorizontalTextPosition(SwingConstants.CENTER);
		lblBooming.setHorizontalAlignment(SwingConstants.CENTER);
		lblBooming.setForeground(Color.WHITE);
		lblBooming.setFont(new Font("Arial", Font.BOLD, 18));
		lblBooming.setBounds(143, 11, 98, 17);
		panel_booming.add(lblBooming);
		
		JPanel panel_1x2 = new JPanel();
		panel_1x2.addMouseListener(new PanelButtonMouseAdapter(panel_1x2));
		panel_1x2.setBackground(new Color(47,79,79));
		panel_1x2.setBounds(10, 239, 384, 39);
		panel_menu_options.add(panel_1x2);
		panel_1x2.setLayout(null);
		
		JLabel lblx = new JLabel("1x2");
		lblx.setHorizontalTextPosition(SwingConstants.CENTER);
		lblx.setHorizontalAlignment(SwingConstants.CENTER);
		lblx.setForeground(Color.WHITE);
		lblx.setFont(new Font("Arial", Font.BOLD, 18));
		lblx.setBounds(145, 11, 98, 17);
		panel_1x2.add(lblx);
		
		JPanel panel_gaming_corps = new JPanel();
		panel_gaming_corps.addMouseListener(new PanelButtonMouseAdapter(panel_gaming_corps));
		panel_gaming_corps.setBackground(new Color(47,79,79));
		panel_gaming_corps.setBounds(10, 276, 384, 39);
		panel_menu_options.add(panel_gaming_corps);
		panel_gaming_corps.setLayout(null);
		
		JLabel lblGamingCorps = new JLabel("Gaming Corps");
		lblGamingCorps.setHorizontalTextPosition(SwingConstants.CENTER);
		lblGamingCorps.setHorizontalAlignment(SwingConstants.CENTER);
		lblGamingCorps.setForeground(Color.WHITE);
		lblGamingCorps.setFont(new Font("Arial", Font.BOLD, 18));
		lblGamingCorps.setBounds(142, 11, 140, 17);
		panel_gaming_corps.add(lblGamingCorps);
		
		JPanel panel_playson = new JPanel();
		panel_playson.addMouseListener(new PanelButtonMouseAdapter(panel_playson));
		panel_playson.setBackground(new Color(47,79,79));
		panel_playson.setBounds(10, 358, 384, 39);
		panel_menu_options.add(panel_playson);
		panel_playson.setLayout(null);
		
		JLabel lblPlayson = new JLabel("Playson");
		lblPlayson.setHorizontalTextPosition(SwingConstants.CENTER);
		lblPlayson.setHorizontalAlignment(SwingConstants.CENTER);
		lblPlayson.setForeground(Color.WHITE);
		lblPlayson.setFont(new Font("Arial", Font.BOLD, 18));
		lblPlayson.setBounds(128, 0, 140, 39);
		panel_playson.add(lblPlayson);
		
		JPanel panel_storm = new JPanel();
		panel_storm.addMouseListener(new PanelButtonMouseAdapter(panel_storm));
		panel_storm.setBackground(new Color(47,79,79));
		panel_storm.setBounds(10, 313, 384, 45);
		panel_menu_options.add(panel_storm);
		panel_storm.setLayout(null);
		
		JLabel lblStorm = new JLabel("Storm");
		lblStorm.setHorizontalTextPosition(SwingConstants.CENTER);
		lblStorm.setHorizontalAlignment(SwingConstants.CENTER);
		lblStorm.setForeground(Color.WHITE);
		lblStorm.setFont(new Font("Arial", Font.BOLD, 18));
		lblStorm.setBounds(131, 11, 140, 17);
		panel_storm.add(lblStorm);
		
		JPanel panel_contents = new JPanel();
		panel_contents.setBackground(Color.WHITE);
		panel_contents.setBounds(403, 46, 768, 736);
		contentPane.add(panel_contents);
		
		
		JLabel label_btn_close = new JLabel("");
		label_btn_close.setBounds(1160, 0, 40, 40);
		contentPane.add(label_btn_close);
		label_btn_close.setForeground(Color.GREEN);
		label_btn_close.setBackground(Color.WHITE);
		label_btn_close.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				
				if( JOptionPane.showConfirmDialog(null, "Sei sicuro di voler uscire?","Conferma", JOptionPane.YES_NO_OPTION) == 0) {
					DashBoardFrame.this.dispose();
				}
			}

		});
		label_btn_close.setIcon(new ImageIcon(img_close));
		
		
		/*toglie praticamente la possibilità di chiudere il frame, abbassarlo , o ingrandirlo*/
		setUndecorated(true);
	}
	
	private class PanelButtonMouseAdapter extends MouseAdapter {
		
		JPanel panel; 
		
		
		public PanelButtonMouseAdapter(JPanel panel) {
			// TODO Auto-generated constructor stub
			this.panel = panel ; 
		}
		
		@Override
		public void mouseEntered(MouseEvent e) {
			panel.setBackground(new Color(112,128,144));
		}
		
		
		@Override
		public void mouseExited(MouseEvent e) {
			panel.setBackground(new Color(47,79,79));
		}
		
		@Override
		public void mousePressed(MouseEvent e) {
			panel.setBackground(new Color(112,128,144));
		}
		
		@Override
		public void mouseReleased(MouseEvent e) {
			panel.setBackground(new Color(112,128,144));
		}
	}

}
