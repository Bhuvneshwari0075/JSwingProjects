package notePad_Project;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JMenuBar;
import javax.swing.JMenu;
import javax.swing.JMenuItem;
import javax.swing.JOptionPane;

import java.awt.Font;
import java.awt.event.ActionListener;
import java.io.IOException;
import java.awt.event.ActionEvent;
import javax.swing.JScrollBar;
import javax.swing.JTextArea;
import java.awt.ScrollPane;
import java.awt.Color;
import java.awt.TextArea;
import java.awt.Point;
import java.awt.Scrollbar;
import java.awt.Button;
import javax.swing.KeyStroke;
import java.awt.event.KeyEvent;
import java.awt.event.InputEvent;

public class NotePad implements ActionListener{

    JFrame frame;
	TextArea textArea;
	Function_file file=new Function_file(this);
	

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					NotePad window = new NotePad();
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
	public NotePad() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(0, 0, 1024, 800);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JMenuBar jmb = new JMenuBar();
		jmb.setBounds(10, 10, 368, 56);
		frame.getContentPane().add(jmb);
		
		JMenu jmenu = new JMenu("File");
		jmenu.setFont(new Font("Times New Roman", Font.BOLD, 25));
		jmb.add(jmenu);
		
		JMenuItem mntmNewMenuItem_1 = new JMenuItem("New        Ctrl+N");
		
		mntmNewMenuItem_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				//JOptionPane.showMessageDialog(null,"My New is Woking");
			}
				
			
			
		});
		mntmNewMenuItem_1.setActionCommand("New");
		jmenu.add(mntmNewMenuItem_1);
		
		JMenuItem mntmNewMenuItem_2 = new JMenuItem("Open      Ctrl+O");
		jmenu.add(mntmNewMenuItem_2);
		
		JMenuItem mntmNewMenuItem = new JMenuItem("Save       Ctrl+S");
		jmenu.add(mntmNewMenuItem);
		
		JMenuItem mntmNewMenuItem_3 = new JMenuItem("SaveAs   Ctrl+A");
		jmenu.add(mntmNewMenuItem_3);
		
		JMenuItem mntmNewMenuItem_4 = new JMenuItem("PageSetup");
		jmenu.add(mntmNewMenuItem_4);
		
		JMenuItem mntmNewMenuItem_5 = new JMenuItem("Print      Ctrl+P");
		jmenu.add(mntmNewMenuItem_5);
		
		JMenuItem mntmNewMenuItem_6 = new JMenuItem("Exit");
		jmenu.add(mntmNewMenuItem_6);
		
		JMenu mnNewMenu = new JMenu("Edit");
		mnNewMenu.setFont(new Font("Times New Roman", Font.BOLD, 25));
		jmb.add(mnNewMenu);
		
		JMenuItem mntmNewMenuItem_7 = new JMenuItem("Undo");
		mnNewMenu.add(mntmNewMenuItem_7);
		
		JMenuItem mntmNewMenuItem_8 = new JMenuItem("Cut");
		mnNewMenu.add(mntmNewMenuItem_8);
		
		JMenuItem mntmNewMenuItem_9 = new JMenuItem("Copy");
		mnNewMenu.add(mntmNewMenuItem_9);
		
		JMenuItem mntmNewMenuItem_10 = new JMenuItem("Paste");
		mnNewMenu.add(mntmNewMenuItem_10);
		
		JMenuItem mntmNewMenuItem_11 = new JMenuItem("Delete");
		mnNewMenu.add(mntmNewMenuItem_11);
		
		JMenuItem mntmNewMenuItem_12 = new JMenuItem("Find");
		mnNewMenu.add(mntmNewMenuItem_12);
		
		JMenuItem mntmNewMenuItem_13 = new JMenuItem("Find Next");
		mnNewMenu.add(mntmNewMenuItem_13);
		
		JMenuItem mntmNewMenuItem_14 = new JMenuItem("Replace");
		mnNewMenu.add(mntmNewMenuItem_14);
		
		JMenuItem mntmNewMenuItem_15 = new JMenuItem("Go To");
		mnNewMenu.add(mntmNewMenuItem_15);
		
		JMenuItem mntmNewMenuItem_16 = new JMenuItem("Select All");
		mnNewMenu.add(mntmNewMenuItem_16);
		
		JMenuItem mntmNewMenuItem_17 = new JMenuItem("Date");
		mnNewMenu.add(mntmNewMenuItem_17);
		
		JMenu mnNewMenu_1 = new JMenu("Format");
		mnNewMenu_1.setFont(new Font("Times New Roman", Font.BOLD, 25));
		jmb.add(mnNewMenu_1);
		
		JMenuItem mntmNewMenuItem_18 = new JMenuItem("WordRap");
		mnNewMenu_1.add(mntmNewMenuItem_18);
		
		JMenuItem mntmNewMenuItem_19 = new JMenuItem("Font");
		mnNewMenu_1.add(mntmNewMenuItem_19);
		
		JMenu mnNewMenu_2 = new JMenu("View");
		mnNewMenu_2.setFont(new Font("Times New Roman", Font.BOLD, 25));
		jmb.add(mnNewMenu_2);
		
		JMenuItem mntmNewMenuItem_20 = new JMenuItem("Status Bar");
		mnNewMenu_2.add(mntmNewMenuItem_20);
		
		JMenu mnNewMenu_3 = new JMenu("Help");
		mnNewMenu_3.setFont(new Font("Times New Roman", Font.BOLD, 25));
		jmb.add(mnNewMenu_3);
		
		JMenuItem mntmNewMenuItem_21 = new JMenuItem("View Help");
		mnNewMenu_3.add(mntmNewMenuItem_21);
		
		JMenuItem mntmNewMenuItem_22 = new JMenuItem("About");
		mnNewMenu_3.add(mntmNewMenuItem_22);
		
		TextArea textArea = new TextArea();
		textArea.setBounds(10, 72, 953, 664);
		frame.getContentPane().add(textArea);
		frame.setTitle("NotePad");
		
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		String command=e.getActionCommand();
		switch(command) {
		case "New":
			file.newFile();
		    break;
		}
	}
}
