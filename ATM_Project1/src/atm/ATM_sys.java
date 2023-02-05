package atm;

import java.awt.EventQueue;

import javax.swing.JFrame;
import java.awt.Panel;
import java.awt.BorderLayout;
import java.awt.Button;
import javax.swing.JPanel;
//import com.jgoodies.forms.layout.FormLayout;
//import com.jgoodies.forms.layout.ColumnSpec;
//import com.jgoodies.forms.layout.RowSpec;
//import com.jgoodies.forms.layout.FormSpecs;
import javax.swing.border.BevelBorder;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.awt.event.ActionEvent;
import java.awt.Color;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.Font;
import javax.swing.JTextField;
import javax.swing.SwingConstants;
import javax.swing.ImageIcon;
import javax.swing.JTextArea;
import javax.swing.UIManager;
import java.awt.SystemColor;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

public class ATM_sys {

	private JFrame frame;
	private JTextField display;
	private JTextField Interest;
	private JTextField years;
	private JTextField AmtInterest;
	private JTextField MnthlyPay;
	private JTextField TotalPay;
	private JTextArea receipt;
	
	//private JButton jbtnExit;
	//private JButton jbtnReset;
	private JButton jbtnLoan;
	private JButton jbtnReceipt;
	
	private JButton jbtnLoan2;
	private JButton jbtnBalance;
	private JButton jbtnWithdrawal;
	private JButton jbtnDeposit;
	
	private JButton jbtn1,jbtn2,jbtn3,jbtn4,jbtn5,jbtn6,jbtn7,jbtn8,jbtn9,jbtn0;

	int user1=10000,user2=20000,user3=40000,user4=50000,user;
	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					ATM_sys window = new ATM_sys();
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
	public ATM_sys() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(0, 0, 1024,600);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		JPanel panel_1 = new JPanel();
		frame.getContentPane().add(panel_1, BorderLayout.CENTER);
		panel_1.setLayout(null);
		
		JPanel panel_2 = new JPanel();
		panel_2.setBorder(new BevelBorder(BevelBorder.LOWERED, null, null, null, null));
		panel_2.setBounds(40, 24, 107, 178);
		panel_1.add(panel_2);
		panel_2.setLayout(null);
		
		JButton Balance = new JButton("");
		Balance.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				int pin1=Integer.parseInt(display.getText());
				
				if(pin1==1234) {
					
					user=1;
					display.setText("10000");
				}
					else if(pin1==2345) {
						display.setText("20000");
						user=2;
					}
					else if(pin1==3456) {
						display.setText("30000");
						user=3;
					}
						else if(pin1==4567) {
							display.setText("50000");
							user=4;
				}
						else {
							display.setText("Low Balance");
							user=5;
						}
				
			}
		});
		Balance.setEnabled(false);
		Balance.setIcon(new ImageIcon(ATM_sys.class.getResource("/atm/Rarrow.png")));
		Balance.setBounds(22, 23, 57, 57);
		panel_2.add(Balance);
		
		JButton Withdraw = new JButton("");
		Withdraw.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				int withdrawAmount=Integer.parseInt(display.getText());
				String finalAmount;
				if(user==1 && withdrawAmount<=user1) {
					user1=user1-withdrawAmount;
					finalAmount=Integer.toString(user1);
					display.setText(finalAmount);
				}
				else if(user==2 && withdrawAmount<=user2) {
					user2=user2-withdrawAmount;
					finalAmount=Integer.toString(user2);
					display.setText(finalAmount);
				}
				else if(user==3 && withdrawAmount<=user3) {
					user3=user3-withdrawAmount;
					finalAmount=Integer.toString(user3);
					display.setText(finalAmount);
				}
				else if(user==4 && withdrawAmount<=user4) {
						user4=user4-withdrawAmount;
						finalAmount=Integer.toString(user4);
						display.setText(finalAmount);
				}
						else {
							display.setText("Low Balance");
						}
				
			}
			
		});
		Withdraw.setEnabled(false);
		Withdraw.setIcon(new ImageIcon(ATM_sys.class.getResource("/atm/Rarrow.png")));
		Withdraw.setBounds(22, 90, 57, 57);
		panel_2.add(Withdraw);
		
		JPanel panel_2_1 = new JPanel();
		panel_2_1.setBackground(Color.CYAN);
		panel_2_1.setBorder(new BevelBorder(BevelBorder.LOWERED, null, null, null, null));
		panel_2_1.setBounds(148, 25, 200, 177);
		panel_1.add(panel_2_1);
		panel_2_1.setLayout(null);
		
		JLabel Balance1 = new JLabel("Balance");
		Balance1.setFont(new Font("Tahoma", Font.BOLD, 14));
		Balance1.setBounds(30, 23, 65, 29);
		Balance1.setVisible(false);
		panel_2_1.add(Balance1);
		
		JLabel Loan1 = new JLabel("Loan");
		Loan1.setFont(new Font("Tahoma", Font.BOLD, 14));
		Loan1.setBounds(128, 23, 62, 29);
		Loan1.setVisible(false);
		panel_2_1.add(Loan1);
		
		JLabel Deposit1 = new JLabel("Deposit");
		Deposit1.setFont(new Font("Tahoma", Font.BOLD, 14));
		Deposit1.setBounds(128, 98, 62, 29);
		Deposit1.setVisible(false);
		panel_2_1.add(Deposit1);
		
		JLabel Withdraw1 = new JLabel("Withdraw");
		Withdraw1.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				display.setText(null);
			}
		});
		Withdraw1.setFont(new Font("Tahoma", Font.BOLD, 14));
		Withdraw1.setBounds(30, 98, 76, 29);
		Withdraw1.setVisible(false);
		panel_2_1.add(Withdraw1);
		
		display = new JTextField();
		Withdraw1.setLabelFor(display);
		display.setHorizontalAlignment(SwingConstants.CENTER);
		display.setForeground(new Color(0, 0, 0));
		display.setBackground(Color.ORANGE);
		display.setFont(new Font("Tahoma", Font.BOLD, 14));
		display.setBounds(30, 59, 149, 29);
		panel_2_1.add(display);
		display.setColumns(10);
		
		JPanel panel_2_1_1 = new JPanel();
		panel_2_1_1.setBorder(new BevelBorder(BevelBorder.LOWERED, null, null, null, null));
		panel_2_1_1.setBounds(348, 25, 107, 178);
		panel_1.add(panel_2_1_1);
		panel_2_1_1.setLayout(null);
		
		JButton Loan = new JButton("");
		Loan.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
			}
		});
		Loan.setEnabled(false);
		Loan.setIcon(new ImageIcon(ATM_sys.class.getResource("/atm/LArrow.png")));
		Loan.setBounds(28, 23, 55, 57);
		panel_2_1_1.add(Loan);
		
		JButton Deposit = new JButton("");
		Deposit.setEnabled(false);
		Deposit.setIcon(new ImageIcon(ATM_sys.class.getResource("/atm/LArrow.png")));
		Deposit.setBounds(28, 90, 55, 57);
		panel_2_1_1.add(Deposit);
		
		JPanel panel_2_1_1_1 = new JPanel();
		panel_2_1_1_1.setBorder(new BevelBorder(BevelBorder.LOWERED, null, null, null, null));
		panel_2_1_1_1.setLayout(null);
		panel_2_1_1_1.setBounds(40, 207, 415, 346);
		panel_1.add(panel_2_1_1_1);
		
		JButton jbtn1 = new JButton("");
		jbtn1.setIcon(new ImageIcon(ATM_sys.class.getResource("/atm/1.png")));
		jbtn1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			
				String enterNumber=display.getText()+"1";
				display.setText(enterNumber);
			}
		});
		jbtn1.setBounds(36, 69, 54, 50);
		panel_2_1_1_1.add(jbtn1);
		
		JButton jbtn2 = new JButton("");
		jbtn2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String enterNumber=display.getText()+"2";
				display.setText(enterNumber);
			}
		});
		jbtn2.setIcon(new ImageIcon(ATM_sys.class.getResource("/atm/2.png")));
		jbtn2.setBounds(100, 69, 54, 50);
		panel_2_1_1_1.add(jbtn2);
		
		JButton jbtn3 = new JButton("");
		jbtn3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String enterNumber=display.getText()+"3";
				display.setText(enterNumber);
			}
		});
		jbtn3.setIcon(new ImageIcon(ATM_sys.class.getResource("/atm/3.png")));
		jbtn3.setBounds(167, 69, 54, 50);
		panel_2_1_1_1.add(jbtn3);
		
		JButton jbtnCancel = new JButton("Cancel");
		jbtnCancel.setIcon(null);
		jbtnCancel.setBackground(Color.PINK);
		jbtnCancel.setFont(new Font("Tahoma", Font.BOLD, 25));
		jbtnCancel.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			int enterNumber=Integer.parseInt(display.getText());
			int NewNumber=enterNumber/10;
			String finalnum=Integer.toString(NewNumber);
			display.setText(finalnum);
			
			}
		});
		jbtnCancel.setBounds(253, 69, 132, 50);
		panel_2_1_1_1.add(jbtnCancel);
		
		JButton jbtn4 = new JButton(""); 
		jbtn4.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String enterNumber=display.getText()+"4";
				display.setText(enterNumber);
			}
		});
		jbtn4.setIcon(new ImageIcon(ATM_sys.class.getResource("/atm/4.png")));
		jbtn4.setBounds(36, 145, 54, 50);
		panel_2_1_1_1.add(jbtn4);
		
		JButton jbtn5 = new JButton("");
		jbtn5.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String enterNumber=display.getText()+"5";
				display.setText(enterNumber);
			}
		});
		jbtn5.setIcon(new ImageIcon(ATM_sys.class.getResource("/atm/5.png")));
		jbtn5.setBounds(100, 145, 54, 50);
		panel_2_1_1_1.add(jbtn5);
		
		JButton jbtn6 = new JButton("");
		jbtn6.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String enterNumber=display.getText()+"6";
				display.setText(enterNumber);
			}
		});
		jbtn6.setIcon(new ImageIcon(ATM_sys.class.getResource("/atm/6.png")));
		jbtn6.setBounds(164, 145, 59, 50);
		panel_2_1_1_1.add(jbtn6);
		
		JButton jbtnClear = new JButton("Clear");
		jbtnClear.setBackground(Color.PINK);
		jbtnClear.setFont(new Font("Tahoma", Font.BOLD, 25));
		jbtnClear.addActionListener(new ActionListener() {
			 public void actionPerformed(ActionEvent e) {
				display.setText(null);
				
			}
		});
		jbtnClear.setBounds(253, 145, 132, 50);
		panel_2_1_1_1.add(jbtnClear);
		
		JButton jbtn7 = new JButton("");
		jbtn7.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String enterNumber=display.getText()+"7";
				display.setText(enterNumber);
			}
		});
		jbtn7.setIcon(new ImageIcon(ATM_sys.class.getResource("/atm/7.png")));
		jbtn7.setBounds(36, 211, 54, 50);
		panel_2_1_1_1.add(jbtn7);
		
		JButton jbtn8 = new JButton("");
		jbtn8.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String enterNumber=display.getText()+"8";
				display.setText(enterNumber);
			}
		});
		jbtn8.setIcon(new ImageIcon(ATM_sys.class.getResource("/atm/8.png")));
		jbtn8.setBounds(100, 215, 54, 46);
		panel_2_1_1_1.add(jbtn8);
		
		JButton jbtn9 = new JButton("");
		jbtn9.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String enterNumber=display.getText()+"9";
				display.setText(enterNumber);
			}
		});
		jbtn9.setIcon(new ImageIcon(ATM_sys.class.getResource("/atm/9.png")));
		jbtn9.setBounds(164, 211, 54, 50);
		panel_2_1_1_1.add(jbtn9);
		
		JButton jbtnEnter = new JButton("Enter");
		jbtnEnter.setBackground(Color.PINK);
		jbtnEnter.setFont(new Font("Tahoma", Font.BOLD, 25));
		jbtnEnter.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				int pin1=Integer.parseInt(display.getText());
				int pin2=Integer.parseInt(display.getText());
				int pin3=Integer.parseInt(display.getText());
				int pin4=Integer.parseInt(display.getText());
				if(pin1==1234) {
					Balance.setEnabled(true);
					Loan.setEnabled(true);
					Withdraw.setEnabled(true);
					Deposit.setEnabled(true);
						
					Balance1.setVisible(true);//declared previously :-> Balance1.setVisible(false);
					Loan1.setVisible(true);
					Withdraw1.setVisible(true);
					Deposit1.setVisible(true);
					

				}
				else if(pin2==2345) {
					Balance.setEnabled(true);
					Loan.setEnabled(true);
					Withdraw.setEnabled(true);
					Deposit.setEnabled(true);
					
					Balance1.setVisible(true);
					Loan1.setVisible(true);
					Withdraw1.setVisible(true);
					Deposit1.setVisible(true);
					

				}
				else if(pin3==3456) {
					Balance.setEnabled(true);
					Loan.setEnabled(true);
					Withdraw.setEnabled(true);
					Deposit.setEnabled(true);
					
					Balance1.setVisible(true);
					Loan1.setVisible(true);
					Withdraw1.setVisible(true);
					Deposit1.setVisible(true);
			
			}		
				else if(pin1==4567) {
					Balance.setEnabled(true);
					Loan.setEnabled(true);
					Withdraw.setEnabled(true);
					Deposit.setEnabled(true);
					
					Balance1.setVisible(true);
					Loan1.setVisible(true);
					Withdraw1.setVisible(true);
					Deposit1.setVisible(true);
			
				}
				else{
					display.setText("Invaid Pin");
				}
					//display.setText(null);
				}
		});
		jbtnEnter.setBounds(253, 215, 132, 46);
		panel_2_1_1_1.add(jbtnEnter);
		
		JButton jbtn0 = new JButton("");
		jbtn0.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String enterNumber=display.getText()+"0";
				display.setText(enterNumber);
			}
		});
		jbtn0.setIcon(new ImageIcon(ATM_sys.class.getResource("/atm/0.png")));
		jbtn0.setBounds(100, 276, 54, 50);
		panel_2_1_1_1.add(jbtn0);
		
		JButton btnNewButton_3_11 = new JButton("");
		btnNewButton_3_11.setBounds(164, 276, 54, 46);
		panel_2_1_1_1.add(btnNewButton_3_11);
		
		JButton btnNewButton_3_12 = new JButton("");
		btnNewButton_3_12.setBounds(277, 282, 70, 40);
		panel_2_1_1_1.add(btnNewButton_3_12);
		
		JButton btnNewButton_3_5_1 = new JButton("");
		btnNewButton_3_5_1.setBounds(36, 276, 54, 40);
		panel_2_1_1_1.add(btnNewButton_3_5_1);
		
		JButton btnNewButton_3_9 = new JButton("");
		btnNewButton_3_9.setBounds(64, 463, 127, 57);
		panel_1.add(btnNewButton_3_9);
		
		JPanel panel_3 = new JPanel();
		panel_3.setBorder(new BevelBorder(BevelBorder.LOWERED, null, null, null, null));
		panel_3.setBounds(459, 24, 541, 529);
		panel_1.add(panel_3);
		panel_3.setLayout(null);
		
		JLabel lblNewLabel_1 = new JLabel("Interest Rate");
		lblNewLabel_1.setFont(new Font("Tahoma", Font.BOLD, 24));
		lblNewLabel_1.setBounds(20, 35, 161, 54);
		panel_3.add(lblNewLabel_1);
		
		Interest = new JTextField();
		Interest.setBounds(191, 35, 117, 54);
		panel_3.add(Interest);
		Interest.setColumns(10);
		
		JLabel lblNewLabel_1_2 = new JLabel("No. Of Years");
		lblNewLabel_1_2.setFont(new Font("Tahoma", Font.BOLD, 24));
		lblNewLabel_1_2.setBounds(20, 118, 161, 52);
		panel_3.add(lblNewLabel_1_2);
		
		years = new JTextField();
		years.setColumns(10);
		years.setBounds(191, 118, 117, 54);
		panel_3.add(years);
		
		JLabel lblNewLabel_1_3 = new JLabel("Amt. of Int.");
		lblNewLabel_1_3.setFont(new Font("Tahoma", Font.BOLD, 24));
		lblNewLabel_1_3.setBounds(20, 200, 161, 52);
		panel_3.add(lblNewLabel_1_3);
		
		AmtInterest = new JTextField();
		AmtInterest.setColumns(10);
		AmtInterest.setBounds(191, 200, 117, 54);
		panel_3.add(AmtInterest);
		
		JLabel lblNewLabel_1_4 = new JLabel("Monthly Pay.");
		lblNewLabel_1_4.setFont(new Font("Tahoma", Font.BOLD, 24));
		lblNewLabel_1_4.setBounds(20, 292, 161, 52);
		panel_3.add(lblNewLabel_1_4);
		
		MnthlyPay = new JTextField();
		MnthlyPay.setColumns(10);
		MnthlyPay.setBounds(191, 292, 117, 54);
		panel_3.add(MnthlyPay);
		
		JLabel lblNewLabel_1_4_1 = new JLabel("Total Pmt.");
		lblNewLabel_1_4_1.setFont(new Font("Tahoma", Font.BOLD, 24));
		lblNewLabel_1_4_1.setBounds(20, 377, 161, 52);
		panel_3.add(lblNewLabel_1_4_1);
		
		TotalPay = new JTextField();
		TotalPay.setColumns(10);
		TotalPay.setBounds(191, 377, 117, 54);
		panel_3.add(TotalPay);
		
		JTextArea textArea = new JTextArea();
		textArea.setBounds(429, 35, -59, 121);
		panel_3.add(textArea);
		
		JTextArea receipt = new JTextArea();
		receipt.setBackground(Color.PINK);
		receipt.setBounds(318, 35, 228, 394);
		panel_3.add(receipt);
		
		JButton jbtnLoan = new JButton("Loan");
		jbtnLoan.setBackground(Color.WHITE);
		jbtnLoan.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				double annualInterestRate=Double.parseDouble(Interest.getText());
				int noOfYears=Integer.parseInt(years.getText());
				double monthlyInterestRate=annualInterestRate/1200;
				double loanAmount=Double.parseDouble(AmtInterest.getText());
				//-------------------------------------------------
				double monthlyPayment=loanAmount*monthlyInterestRate/(1-1/Math.pow(1+monthlyInterestRate,noOfYears*12));
				String iMonthlyPayment;
				//----------------------------------------------------
				iMonthlyPayment=Double.toString(monthlyPayment);
				iMonthlyPayment=String.format("£%.2f", monthlyPayment);
				MnthlyPay.setText(iMonthlyPayment);
				//------------------------------------------------------
				double totalPayment=monthlyPayment*noOfYears*12;
				String iTotalPayment;
				iTotalPayment=String.format("£%.2f", totalPayment);
				TotalPay.setText(iTotalPayment);
				//----------------------------------------------------
			}
		});
		jbtnLoan.setFont(new Font("Tahoma", Font.BOLD, 16));
		jbtnLoan.setBounds(36, 449, 98, 46);
		panel_3.add(jbtnLoan);
		
		JButton jbtnReceipt = new JButton("Receipt");
		jbtnReceipt.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String annualInterestRate=String.format(Interest.getText());
				String numberOfYears=String.format(years.getText());
				String loanAmount=String.format(AmtInterest.getText());
				String monthlyPayment=String.format(MnthlyPay.getText());
				String totalPayment=String.format(TotalPay.getText());
				//=======================================================
                 int refs=1325+(int)(Math.random()*4238);//0.0----1.0
				//=======================================================
                 Calendar timer=Calendar.getInstance();
                 timer.getTime();
                 SimpleDateFormat tTime=new SimpleDateFormat("HH:mm:ss");
                 tTime.format(timer.getTime());
                 SimpleDateFormat TDate=new  SimpleDateFormat("dd-MM-yyyy");
                 TDate.format(timer.getTime());
                 //=======================================================
                 
                 receipt.append("Loan Management System\n"+
                 "Reference:"+refs+
                 "\n==========================="+
                 "\n Interest Rate"+annualInterestRate+
                 "\nRepayment years:"+ numberOfYears +
                 "\nAmount of Loan:"+"£"+ loanAmount +
                 "\nMonthly payment:"+ monthlyPayment +
                 "\nTotalPayment:"+ totalPayment +
                 "\n==========================="+
                 "\nDate:"+TDate.format(timer.getTime())+
                 "\nTime:"+tTime.format(timer.getTime())+
                 "\n==========================="+
                 "\nThank you");
			}
            });
		jbtnReceipt.setFont(new Font("Tahoma", Font.BOLD, 16));
		jbtnReceipt.setBounds(167, 449, 98, 46);
		panel_3.add(jbtnReceipt);
		
		JButton jbtnReset = new JButton("Reset");
		jbtnReset.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			
				Interest.setText("null");
				years.setText(null);
				AmtInterest.setText(null);
				MnthlyPay.setText(null);
				TotalPay.setText(null);
				receipt.setText(null);
				}
		
		});
		jbtnReset.setFont(new Font("Tahoma", Font.BOLD, 16));
		jbtnReset.setBounds(301, 449, 98, 46);
		panel_3.add(jbtnReset);
		
		JButton jbtnExit = new JButton("Exit");
		jbtnExit.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				frame=new JFrame();
				if(JOptionPane.showConfirmDialog(frame, "Confirm if you want to exit","ATM System", JOptionPane.YES_NO_OPTION)==JOptionPane.YES_NO_OPTION)
				{System.exit(0);
				
				}
			}
			
		});
		jbtnExit.setFont(new Font("Tahoma", Font.BOLD, 16));
		jbtnExit.setBounds(429, 449, 98, 46);
		panel_3.add(jbtnExit);
	}
}
