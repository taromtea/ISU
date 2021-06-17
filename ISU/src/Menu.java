import java.awt.Color;
import java.awt.Container;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class Menu {
	JFrame window;
	Container con;
	JPanel titleNamePanel, startButtonPanel, gm1Panel, gm2Panel;
	JLabel titleNameLabel;
	Font titleFont = new Font("Times New Roman", Font.PLAIN, 100);
	Font normalFont = new Font("Times New Roman", Font.PLAIN, 30);
	JButton startButton, gm1B, gm2B;

	MenuHandler MHandler = new MenuHandler();

	public static void main(String[] args) {
		new Menu();
	}
	public Menu() {
		window = new JFrame();
		window.setSize(800, 600);
		window.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		window.getContentPane().setBackground(Color.black);
		window.setLayout(null);
		window.setVisible(true);
		con = window.getContentPane();

		titleNamePanel = new JPanel();
		titleNamePanel.setBounds(100, 100, 600, 150);
		titleNamePanel.setBackground(Color.black);
		titleNameLabel = new JLabel("Color Memory");
		titleNameLabel.setForeground(Color.white);
		titleNameLabel.setFont(titleFont);

		startButtonPanel = new JPanel();
		startButtonPanel.setBounds(300, 400, 200, 100);
		startButtonPanel.setBackground(Color.black);
		startButton = new JButton("START");
		startButton.setBackground(Color.black);
		startButton.setForeground(Color.white);
		startButton.setFont(normalFont);
		startButton.addActionListener(MHandler);

		titleNamePanel.add(titleNameLabel);
		startButtonPanel.add(startButton);
		con.add(titleNamePanel);
		con.add(startButtonPanel);
	}

	public class MenuHandler implements ActionListener {
		public void actionPerformed(ActionEvent event) {
			window.dispose();  
			Gamemode1 gm1 = new Gamemode1();
			gm1.runGame();
		}
	}

}
