package ba.bitcamp.exercise.GUI;

import java.awt.BorderLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;


public class Window2 extends JFrame {

	/**
	 * 
	 */
	private static final long serialVersionUID = -1124066425695988168L;

	private JLabel text = new JLabel("Hello World");

	private JButton button = new JButton("Exit");
	private JButton button1 = new JButton("Do not exit");

	public Window2() {

		setVisible(true);
		setTitle("Window2");
		setSize(400, 300);
		setLocation(700, 250);

		text.setHorizontalAlignment(NORMAL);
		setLayout(new BorderLayout());

		add(button, BorderLayout.SOUTH);
		add(button1, BorderLayout.NORTH);
		add(text, BorderLayout.CENTER);

		button.addActionListener(new Action());
		button1.addActionListener(new Action());
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

	}

	public static void main(String[] args) {
		new Window2();

	}

	private class Action implements ActionListener {

		@Override
		public void actionPerformed(ActionEvent e) {
			if (e.getSource() == button) {
				System.exit(3);
			}
			if (e.getSource() == button1){
				text.setText("It did not exit");
				
			}
		}

	}
}
