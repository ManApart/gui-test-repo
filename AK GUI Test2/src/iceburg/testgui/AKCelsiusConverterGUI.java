package iceburg.testgui;

import java.awt.EventQueue;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.GroupLayout;
import javax.swing.GroupLayout.Alignment;
import javax.swing.LayoutStyle.ComponentPlacement;
import javax.swing.JButton;
import org.eclipse.wb.swing.FocusTraversalOnArray;
import java.awt.Component;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.AbstractAction;
import javax.swing.Action;

public class AKCelsiusConverterGUI extends javax.swing.JFrame {
	private JFrame frmCelsiusConverter;
	private JTextField textField;
	private JLabel fahrenheitLabel;
	private final Action action = new ConvertButtonACT();

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					new AKCelsiusConverterGUI().setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public AKCelsiusConverterGUI() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setTitle("Celsius Converter");
		textField = new JTextField();
		JLabel lblCelsius = new JLabel("Celsius");
		fahrenheitLabel = new JLabel("Fahrenheit");
		JButton btnConvert = new JButton("");
		btnConvert.setAction(action);
		btnConvert.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		GroupLayout groupLayout = new GroupLayout(getContentPane());
		
		groupLayout.setHorizontalGroup(
			groupLayout.createParallelGroup(Alignment.LEADING)
				.addGroup(groupLayout.createSequentialGroup()
					.addContainerGap()
					.addGroup(groupLayout.createParallelGroup(Alignment.LEADING)
						.addComponent(textField, 0, 0, Short.MAX_VALUE)
						.addComponent(btnConvert, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
					.addPreferredGap(ComponentPlacement.RELATED)
					.addGroup(groupLayout.createParallelGroup(Alignment.LEADING)
						.addComponent(lblCelsius)
						.addComponent(fahrenheitLabel))
					.addContainerGap(30, Short.MAX_VALUE))
					
		);
		groupLayout.setVerticalGroup(
			groupLayout.createParallelGroup(Alignment.LEADING)
				.addGroup(groupLayout.createSequentialGroup()
					.addContainerGap()
					.addGroup(groupLayout.createParallelGroup(Alignment.TRAILING)
						.addComponent(textField, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
						.addComponent(lblCelsius))
					.addPreferredGap(ComponentPlacement.RELATED)
					.addGroup(groupLayout.createParallelGroup(Alignment.TRAILING)
						.addComponent(btnConvert)
						.addComponent(fahrenheitLabel))
					.addContainerGap(GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
		);
		
		getContentPane().setLayout(groupLayout);
		getContentPane().setFocusTraversalPolicy(new FocusTraversalOnArray(new Component[]{textField, btnConvert, lblCelsius, fahrenheitLabel}));
		initialize();
		pack();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {

		
		
		
	}
	private class ConvertButtonACT extends AbstractAction {
		public ConvertButtonACT() {
			putValue(NAME, "Convert!");
			putValue(SHORT_DESCRIPTION, "Convert Celsius to Fahrenheit");
		}
		public void actionPerformed(ActionEvent e) {
			int tempfar = (int) ((Double.parseDouble(textField.getText()))
				* 1.8 + 32);
			fahrenheitLabel.setText(tempfar + " Fahrenheit");
		}
	}
}
