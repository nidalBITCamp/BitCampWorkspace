package ba.bitcamp.exercise.GUI;

import java.awt.BorderLayout;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;


public class Window3 extends JFrame {

	/**
	 * 
	 */
	private static final long serialVersionUID = -592766556104199268L;

	private int counter;

	private JLabel text = new JLabel("Press one to disable the other...");

	private JButton button = new JButton("Button1");
	private JButton button1 = new JButton("Button2");

	public Window3() {

		setVisible(true);
		setTitle("Window1");
		setSize(400, 300);
		setLocation(500, 250);
		setLayout(new BorderLayout());

		Font f = new Font("Cambria", Font.BOLD, 18);
		Font f1 = new Font("Calibri", Font.ITALIC, 16);

		text.setHorizontalAlignment(NORMAL);
		text.setFont(f);

		button.setFont(f1);
		button1.setFont(f1);

		add(button, BorderLayout.SOUTH);
		add(button1, BorderLayout.NORTH);
		button1.setEnabled(false);
		add(text, BorderLayout.CENTER);

		button.addActionListener(new Action());
		button1.addActionListener(new Action());

		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

	}

	public static void main(String[] args) {
		new Window3();

	}

	private class Action implements ActionListener {

		@Override
		public void actionPerformed(ActionEvent e) {

			if (e.getSource() == button) {
				button1.setEnabled(true);
				button.setEnabled(false);
				counter++;

			}
			if (e.getSource() == button1) {
				button.setEnabled(true);
				button1.setEnabled(false);
				counter++;
			}

			if (counter >= 5)
				System.exit(3);
		}

	}

}
