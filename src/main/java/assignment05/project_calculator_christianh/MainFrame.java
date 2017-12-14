package assignment05.project_calculator_christianh;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JTextField;
import javax.swing.JLabel;

public class MainFrame {

	private JFrame frmCalculator;
	CalculatorBasicOperations calculator = new CalculatorBasicOperations();

	private JTextField tfFirstNumber;
	private JTextField tfSecondNumber;
	JLabel lblResult = new JLabel("Result: ");
	
	CalculatorAdvancedOperations calc = new CalculatorAdvancedOperations();
	private JTextField textField;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					MainFrame window = new MainFrame();
					window.frmCalculator.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public MainFrame() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frmCalculator = new JFrame();
		frmCalculator.setTitle("Calculator");
		frmCalculator.setBounds(100, 100, 450, 300);
		frmCalculator.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frmCalculator.getContentPane().setLayout(null);
		
		JButton btnNewButton = new JButton("/");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				double firstNumber = Double.parseDouble(tfFirstNumber.getText().toString());
				double secondNumber = Double.parseDouble(tfSecondNumber.getText().toString());				
				double result = calculator.division(firstNumber, secondNumber);
				lblResult.setText("Result: "+ result);
			}
		});
		btnNewButton.setBounds(349, 48, 79, 25);
		frmCalculator.getContentPane().add(btnNewButton);
		
		JButton btnNewButton_1 = new JButton("X");
		btnNewButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				double firstNumber = Double.parseDouble(tfFirstNumber.getText().toString());
				double secondNumber = Double.parseDouble(tfSecondNumber.getText().toString());
				double result = calculator.multiplication(firstNumber, secondNumber);
				lblResult.setText("Result: " + result);
			}
		});
		btnNewButton_1.setBounds(349, 80, 79, 25);
		frmCalculator.getContentPane().add(btnNewButton_1);
		
		JButton btnNewButton_2 = new JButton("-");
		btnNewButton_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				double firstNumber = Double.parseDouble(tfFirstNumber.getText().toString());
				double secondNumber = Double.parseDouble(tfSecondNumber.getText().toString());
				double result = calculator.subtraction(firstNumber, secondNumber);
				lblResult.setText("Result: " + result);
			}
		});
		btnNewButton_2.setBounds(349, 109, 79, 25);
		frmCalculator.getContentPane().add(btnNewButton_2);
		
		JButton btnNewButton_3 = new JButton("+");
		btnNewButton_3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				double firstNumber = Double.parseDouble(tfFirstNumber.getText().toString());
				double secondNumber = Double.parseDouble(tfSecondNumber.getText().toString());
				double result = calculator.addition(firstNumber, secondNumber);
				lblResult.setText("Result " + result);
			}
		});
		btnNewButton_3.setBounds(349, 135, 79, 25);
		frmCalculator.getContentPane().add(btnNewButton_3);
		
		tfFirstNumber = new JTextField();
		tfFirstNumber.setBounds(123, 12, 209, 19);
		frmCalculator.getContentPane().add(tfFirstNumber);
		tfFirstNumber.setColumns(10);
		
		tfSecondNumber = new JTextField();
		tfSecondNumber.setText("");
		tfSecondNumber.setBounds(123, 51, 209, 19);
		frmCalculator.getContentPane().add(tfSecondNumber);
		tfSecondNumber.setColumns(10);
		
		lblResult.setBounds(30, 85, 199, 15);
		frmCalculator.getContentPane().add(lblResult);
		
		JButton btnNewButton_4 = new JButton("x2");
		btnNewButton_4.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			
			}
		});
		btnNewButton_4.setBounds(12, 109, 87, 25);
		frmCalculator.getContentPane().add(btnNewButton_4);
		
		JButton btnNewButton_5 = new JButton("AC");
		btnNewButton_5.setBounds(12, 135, 87, 25);
		frmCalculator.getContentPane().add(btnNewButton_5);
		
		JButton btnNewButton_6 = new JButton("(");
		btnNewButton_6.setBounds(12, 159, 87, 25);
		frmCalculator.getContentPane().add(btnNewButton_6);
		
		JButton btnNewButton_7 = new JButton(")");
		btnNewButton_7.setBounds(106, 159, 87, 25);
		frmCalculator.getContentPane().add(btnNewButton_7);
		
		JButton btnNewButton_8 = new JButton("log");
		btnNewButton_8.setBounds(12, 184, 87, 25);
		frmCalculator.getContentPane().add(btnNewButton_8);
		
		JButton btnNewButton_9 = new JButton("deg");
		btnNewButton_9.setBounds(12, 208, 87, 25);
		frmCalculator.getContentPane().add(btnNewButton_9);
		
		JButton btnNewButton_10 = new JButton("rad");
		btnNewButton_10.setBounds(12, 235, 87, 25);
		frmCalculator.getContentPane().add(btnNewButton_10);
		
		
	}
}
