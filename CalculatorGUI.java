package Calculator;

import javax.swing.*;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;


public class CalculatorGUI extends JFrame{
	String pre_input = "";
	
	public CalculatorGUI() {
		this.setSize(330, 400);
		this.setTitle("Calculator");
		init();
		this.setVisible(true);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}
	
	private void init() {
		this.setLayout(new BorderLayout());
		
		JTextField textField = new JTextField();
		textField.disable();
		textField.setPreferredSize(new Dimension(this.getWidth(), 50));
		this.add(textField,BorderLayout.NORTH);
		
		JPanel panel = new JPanel();
		panel.setLayout(new GridLayout(4, 4));
		JButton[] stdButton = new JButton[16];
		String str[] = {"1","2","3","+",
				"4","5","6","-",
				"7","8","9","*",
				"C","0","=","/"};
		for(int i = 0; i < stdButton.length; i ++) {
			stdButton[i] = new JButton(str[i]);
			String text = stdButton[i].getText();
			stdButton[i].addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
					if(text.equals("C")) {
						pre_input = "";
						textField.setText("");
					}
					else if(textField.getText().length() > 32) {
						textField.setText("Input Too Long.Press C to reboot.");
					}
					else if(text.equals("=")) {
						if(is_operator(pre_input)) {
							pre_input = "";
							textField.setText("Error:expected an oprand.Press C to reboot.");
						}
						String expression = textField.getText();
						Calculator cal = new Calculator();
						textField.setText(cal.evalExpression(expression)+"");
					}
					else if(is_operator(text)) {
						if(is_operator(pre_input)) {
							pre_input = "";
							textField.setText("Error:expected an oprand.Press C to reboot.");
						}
						else {
							pre_input = text;
							textField.setText(textField.getText()+text);
						}
					}
					else {
						if(pre_input.equals("/") && text.equals("0")) {
							pre_input = "";
							textField.setText("Error:can\'t divide zero.Press C to reboot.");
						}
						else {
							pre_input = text;
							textField.setText(textField.getText()+text);
						}
					}
				}
			});
			panel.add(stdButton[i]);
		}
		this.add(panel, BorderLayout.CENTER);
		
	}
	
	private boolean is_operator(String str) {
		if(str.equals("+") || str.equals("-") || str.equals("*") || str.equals("/"))
			return true;
		return false;
	}
}
