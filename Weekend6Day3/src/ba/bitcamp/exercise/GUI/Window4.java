package ba.bitcamp.exercise.GUI;

import java.awt.BorderLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;

public class Window4 extends JFrame {

	/**
	 * 
	 */
	private static final long serialVersionUID = -6243766666914671111L;
	private int counter;
	private JLabel text = new JLabel("Don't press it");

	private JButton button = new JButton("Button");

	public Window4() {

		setVisible(true);
		setTitle("Window1");
		setSize(400, 300);
		setLocation(500, 250);

		text.setHorizontalAlignment(NORMAL);
		setLayout(new BorderLayout());

		add(button, BorderLayout.SOUTH);
		add(text, BorderLayout.CENTER);

		button.addActionListener(new Action());

		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

	}

	public static void main(String[] args) {
		new Window4();

	}

	private class Action implements ActionListener {

		@Override
		public void actionPerformed(ActionEvent e) {
			String[] s = { "Message1", "Message2", "MEssage3", "Message4" };

			if (e.getSource() == button ) {
				text.setText(s[counter]);
				counter++;
				if (counter == s.length) {
					counter = 0;
					// System.exit(3);

				}
			}
		}

	}

}
