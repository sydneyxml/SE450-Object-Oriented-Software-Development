package SE450HW3;

// Ximan Liu

import java.awt.Dimension;


import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;
import static java.lang.Math.*;

public class ConverterGUI {
	// You should add ActionListener for the Convert button
	private  String[] units={"Mile","Yard","Foot"};
    private JFrame frame;

 
    public ConverterGUI() {
        
        initializeFrame();
    }

 
    private void initializeFrame() {
        frame = new JFrame("Length Converter");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        initUI();
        frame.setLayout(null);
        frame.setPreferredSize(new Dimension(700, 300));
        frame.pack();
        frame.setVisible(true);
    }

   
    private void initUI() {
        JTextField inputField = new JTextField(15);
        inputField.setBounds(60, 50, 200, 30);
        JLabel kilometer = new JLabel("Kilometer");
        kilometer.setFont(new Font(Font.MONOSPACED, Font.BOLD, 20));
        kilometer.setBounds (300, 50, 200, 30);
       
        JTextField outputField = new JTextField(15);
        outputField.setEditable(false);
        outputField.setLocation(10, 200);
        
        outputField.setBounds(60, 100, 200, 30);
        JComboBox outputUnit = new JComboBox<String>();
        for (String u : units) {
            outputUnit.addItem(u);
        }
        outputUnit.setBounds (300, 100, 60, 30);
        JButton convertButton = new JButton("Convert!");
        
        convertButton.setBounds (60, 150, 200, 30);
        convertButton.setFont(new Font(Font.MONOSPACED, Font.BOLD, 20));
        
        setActionListner(convertButton, inputField, outputField, outputUnit);
        
        frame.add(inputField);
        frame.add(kilometer);
        frame.add(outputField);
        frame.add(outputUnit);
        frame.add(convertButton);
    
    }
    
    //Here you have to implement the action listener..
    
    public void setActionListner(JButton button, JTextField inputField, JTextField outputField, JComboBox<String> outputUnit) {
	
	button.addActionListener(new ActionListener() {
		
		@Override
		public void actionPerformed(ActionEvent e) {
			
			double km = Double.parseDouble(inputField.getText());
			double result = 0.0;
            String unit;

            String outUnit = String.valueOf(outputUnit.getSelectedItem());
                
            if (outUnit.equals(units[0])) {
            	result = km * 0.621371;
                unit = " Miles";
            }
            else if (outUnit.equals(units[1])) {
            	result = km * 1093.61;
                unit = " Yards";
            }
            else {
            	result = km * 3280.84;
                unit = " Feet";
            }
            
            String decimals = String.format("%.2f", result);
                
            String output = String.format("%1e", Double.parseDouble(decimals));

            output += unit;

            outputField.setText(output);
            }
        });
    }
}

