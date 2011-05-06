package gorillabankSping;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JButton;
import javax.swing.AbstractAction;
import java.awt.event.ActionEvent;
import javax.swing.Action;
import java.awt.event.ActionListener;

import javax.swing.JLabel;
import javax.swing.JTextField;
import java.awt.Font;
import javax.swing.SwingConstants;

public class GorillaWindow {

	private JFrame frame;
	private JButton btnClose;
	private JButton btnPayIn;
	private JButton btnPayOut; 
	private JLabel lblMessage;
	private final Action close = new Close();
	private final Action payOut = new PayOut();
	private final Action payIn = new PayIn();
	private JTextField textField;
	private JLabel lblAccountBalance;
	private JLabel label;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					GorillaWindow window = new GorillaWindow();
					window.frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public GorillaWindow() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 316, 275);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		lblMessage = new JLabel("Message");
		lblMessage.setVerticalAlignment(SwingConstants.TOP);
		lblMessage.setBounds(31, 113, 252, 60);
		frame.getContentPane().add(lblMessage);
		
		btnClose = new JButton("Close Me");
		btnClose.setText("Close");
		btnClose.setBounds(180, 186, 103, 25);
		btnClose.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
												
			}
		});
		btnClose.setAction(close);
		frame.getContentPane().add(btnClose);
		
		btnPayOut = new JButton("Pay Out");
		btnPayOut.setAction(payOut);
		btnPayOut.setBounds(180, 75, 103, 25);
		frame.getContentPane().add(btnPayOut);
		
		btnPayIn = new JButton("Pay In");
		btnPayIn.setAction(payIn);
		btnPayIn.setBounds(180, 48, 103, 25);
		frame.getContentPane().add(btnPayIn);
		
		textField = new JTextField();
		textField.setText("100");
		textField.setBounds(180, 13, 103, 22);
		frame.getContentPane().add(textField);
		textField.setColumns(10);
		
		lblAccountBalance = new JLabel("Account Balance:");
		lblAccountBalance.setBounds(31, 13, 137, 25);
		frame.getContentPane().add(lblAccountBalance);
		
		label = new JLabel("100");
		label.setFont(new Font("Tahoma", Font.BOLD, 17));
		label.setBounds(29, 43, 125, 30);
		frame.getContentPane().add(label);
	}

	
	/***
	 * Payout Button 
	 */	
	private class PayIn extends AbstractAction {
		private static final long serialVersionUID = 1L;
		public PayIn() {
			putValue(NAME, "Pay in");
			putValue(SHORT_DESCRIPTION, "Pay in cash.");
		}
		public void actionPerformed(ActionEvent e) {
			lblMessage.setText("PAY IN Clicked it " + new java.util.Date().toString());
		}
	}
	
	/***
	 * Payout Button 
	 */
	private class PayOut extends AbstractAction {
		private static final long serialVersionUID = 1L;
		public PayOut() {
			putValue(NAME, "Pay out");
			putValue(SHORT_DESCRIPTION, "Pay out cash");
		}
		public void actionPerformed(ActionEvent e) {
			lblMessage.setText("PAY OUT Clicked it " + new java.util.Date().toString());
		}
	}


	/***
	 * Close Button 
	 */
	private class Close extends AbstractAction {
		private static final long serialVersionUID = 1L;

		public Close() {
			putValue(NAME, "Close");
			putValue(SHORT_DESCRIPTION, "Close window.");
		}
		
		public void actionPerformed(ActionEvent e) {
			lblMessage.setText("CLOSE Clicked it " + new java.util.Date().toString());			
		}
	}
		
}
