package calculator;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import java.awt.BorderLayout;
import javax.swing.JButton;
import javax.swing.JTextField;
import java.awt.Color;
import java.awt.Container;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.StringTokenizer;
import java.awt.event.ActionEvent;
import java.awt.event.FocusAdapter;
import java.awt.event.FocusEvent;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

public class Calculator_Sys {

	private JFrame frame;
	private JTextField display;
	// store operator and operands
    String s0="", s1="", s2="";
    private JTextField display1;
   

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Calculator_Sys window = new Calculator_Sys();
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
	public Calculator_Sys() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 1030, 541);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JPanel panel = new JPanel();
		panel.setBounds(76, 10, 854, 484);
		frame.getContentPane().add(panel);
		panel.setLayout(null);
		
		JPanel panel_1 = new JPanel();
		panel_1.setBounds(167, 10, 397, 115);
		panel.add(panel_1);
		panel_1.setLayout(null);
		
		display = new JTextField();
		display.setEnabled(false);
		display.addMouseListener(new MouseAdapter() {
			@Override
			public void mousePressed(MouseEvent e) {
				
				
			}
			@Override
			public void mouseClicked(MouseEvent e) {
				display1.setEnabled(false);

				display.setEnabled(true);
							}
		});
		display.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		display.addFocusListener(new FocusAdapter() {
			@Override
			public void focusGained(FocusEvent e) {
			}
		});
		display.setBackground(Color.PINK);
		display.setBounds(27, 27, 257, 34);
		panel_1.add(display);
		display.setColumns(10);
		
		display1 = new JTextField();
		display1.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				display.setEnabled(false);
				display1.setEnabled(true);
				
			}
		});
		display1.setEnabled(false);
		display1.setColumns(10);
		display1.setBackground(Color.PINK);
		display1.setBounds(27, 71, 257, 34);
		panel_1.add(display1);
		
		JPanel panel_2 = new JPanel();
		panel_2.setBounds(144, 150, 479, 287);
		panel.add(panel_2);
		panel_2.setLayout(null);
		
		JButton btnNewButton = new JButton("1");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(display.isEnabled()) {
				String num1=display.getText()+"1";
				display.setText(num1);}
				else if(display1.isEnabled())
				{String num2=display1.getText()+"1";
				display1.setText(num2);
				}
				}
		});
		btnNewButton.setBounds(10, 27, 71, 50);
		panel_2.add(btnNewButton);
		
		JButton btnNewButton_1 = new JButton("2");
		btnNewButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(display.isEnabled()) {
					String num1=display.getText()+"2";
					display.setText(num1);}
					else if(display1.isEnabled())
					{String num2=display1.getText()+"2";
					display1.setText(num2);
					}
					}
			}
		);
		btnNewButton_1.setBounds(91, 27, 71, 50);
		panel_2.add(btnNewButton_1);
		
		JButton btnNewButton_2 = new JButton("3");
		//private Container panel_2;
		btnNewButton_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(display.isEnabled()) {
					String num1=display.getText()+"3";
					display.setText(num1);}
					else if(display1.isEnabled())
					{String num2=display1.getText()+"3";
					display1.setText(num2);
					}
			}
});
		btnNewButton_2.setBounds(174, 27, 71, 50);
		panel_2.add(btnNewButton_2);
		
		JButton btnNewButton_2_1 = new JButton("4");
		btnNewButton_2_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(display.isEnabled()) {
					String num1=display.getText()+"4";
					display.setText(num1);}
					else if(display1.isEnabled())
					{String num2=display1.getText()+"4";
					display1.setText(num2);
					}
			}
		});
		btnNewButton_2_1.setBounds(270, 27, 71, 50);
		panel_2.add(btnNewButton_2_1);
		
		JButton btnNewButton_2_2 = new JButton("5");
		btnNewButton_2_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(display.isEnabled()) {
					String num1=display.getText()+"5";
					display.setText(num1);}
					else if(display1.isEnabled())
					{String num2=display1.getText()+"5";
					display1.setText(num2);
					}
			}
		});
		btnNewButton_2_2.setBounds(356, 27, 71, 50);
		panel_2.add(btnNewButton_2_2);
		
		JButton btnNewButton_2_3 = new JButton("6");
		btnNewButton_2_3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(display.isEnabled()) {
					String num1=display.getText()+"6";
					display.setText(num1);}
					else if(display1.isEnabled())
					{String num2=display1.getText()+"6";
					display1.setText(num2);
					}
			}
		});
		btnNewButton_2_3.setBounds(10, 96, 71, 50);
		panel_2.add(btnNewButton_2_3);
		
		JButton btnNewButton_2_4 = new JButton("7");
		btnNewButton_2_4.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(display.isEnabled()) {
					String num1=display.getText()+"7";
					display.setText(num1);}
					else if(display1.isEnabled())
					{String num2=display1.getText()+"7";
					display1.setText(num2);
					}
			}
		});
		btnNewButton_2_4.setBounds(91, 96, 71, 50);
		panel_2.add(btnNewButton_2_4);
		
		JButton btnNewButton_2_5 = new JButton("8");
		btnNewButton_2_5.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(display.isEnabled()) {
					String num1=display.getText()+"8";
					display.setText(num1);}
					else if(display1.isEnabled())
					{String num2=display1.getText()+"8";
					display1.setText(num2);
					}
			}
		});
		btnNewButton_2_5.setBounds(174, 96, 71, 50);
		panel_2.add(btnNewButton_2_5);
		
		JButton btnNewButton_2_6 = new JButton("9");
		btnNewButton_2_6.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(display.isEnabled()) {
					String num1=display.getText()+"9";
					display.setText(num1);}
					else if(display1.isEnabled())
					{String num2=display1.getText()+"9";
					display1.setText(num2);
					}
			}
		});
		btnNewButton_2_6.setBounds(270, 96, 71, 50);
		panel_2.add(btnNewButton_2_6);
		
		JButton btnNewButton_2_7 = new JButton("0");
		btnNewButton_2_7.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(display.isEnabled()) {
					String num1=display.getText()+"0";
					display.setText(num1);}
					else if(display1.isEnabled())
					{String num2=display1.getText()+"0";
					display1.setText(num2);
					}
			}
		});
		btnNewButton_2_7.setBounds(356, 96, 71, 50);
		panel_2.add(btnNewButton_2_7);
		
		JButton btnNewButton_2_8 = new JButton("+");
		btnNewButton_2_8.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				int number=Integer.parseInt(display.getText());
				int number2=Integer.parseInt(display1.getText());
				int result=number+number2;
				String Final=Integer.toString(result);
				display.setText(Final);
				display1.setText(null);

			}
		});
		btnNewButton_2_8.setBounds(198, 172, 71, 50);
		panel_2.add(btnNewButton_2_8);
		
		JButton btnNewButton_2_9 = new JButton("-");
		btnNewButton_2_9.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String num=display.getText()+"-";
				display.setText(num);
			}
		});
		btnNewButton_2_9.setBounds(286, 172, 71, 50);
		panel_2.add(btnNewButton_2_9);
		
		JButton btnNewButton_2_10 = new JButton("/");
		btnNewButton_2_10.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String num=display.getText()+"/";
				display.setText(num);
			}
		});
		btnNewButton_2_10.setBounds(10, 172, 71, 50);
		panel_2.add(btnNewButton_2_10);
		
		JButton btnNewButton_2_11 = new JButton("*");
		btnNewButton_2_11.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String num=display.getText()+"*";
				display.setText(num);
			}
		});
		btnNewButton_2_11.setBounds(101, 172, 71, 50);
		panel_2.add(btnNewButton_2_11);
		
		JButton btnNewButton_2_12 = new JButton("=");
		btnNewButton_2_12.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
			}	
		});
		btnNewButton_2_12.setBounds(382, 172, 71, 50);
		panel_2.add(btnNewButton_2_12);
		
		JButton Clear = new JButton("Clear");
		Clear.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				display.setText(null);
				display1.setText(null);
			}
		});
		Clear.setBackground(Color.CYAN);
		Clear.setBounds(174, 227, 71, 50);
		panel_2.add(Clear);
	}
}
