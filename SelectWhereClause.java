import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.*;
import java.util.*;
import javax.swing.*;


import com.sbi.exceptions.ApplicantNotFoundException;

class WelcomeFrame extends JFrame implements ActionListener{
	
	JLabel welcomeLabel = new JLabel("PLease select basic CRUD operations and Just Have Fun!");
	JLabel buttonsLabel = new JLabel();
	JButton createText = new JButton("Create Table");
	JButton insertText = new JButton("Insert Record Into Table");
	JButton updateText = new JButton("Update Table Record");
	JButton deleteText = new JButton("Delete Record/s from Table");
	
	JButton exit = new JButton("Exit");
	//JFrame welcomeFrame=new JFrame("WELCOME");
	public WelcomeFrame() {
		// TODO Auto-generated constructor stub
		setTitle("Welcome");
		setLayout(new GridBagLayout());
		
		add(welcomeLabel);
		
		GridBagConstraints place = new GridBagConstraints();
		place.gridx = 0;
		place.gridy = 0;
		add(createText, place);
		
		place.gridx = 1;
		place.gridy = 0;
		add(insertText, place);
		
		place.gridx = 2;
		place.gridy = 0;
		add(updateText, place);
		
		place.gridx = 3;
		place.gridy = 0;
		add(deleteText, place);
		
		place.gridx = 2;
		place.gridy = 1;
		add(exit, place);
			
		setSize(500,300);
		setLocation(100,100);
		//setResizable(false);
		setVisible(true);
		
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		createText.addActionListener(this);
		insertText.addActionListener(this);
		updateText.addActionListener(this);
		deleteText.addActionListener(this);
		exit.addActionListener(this);
	}
	
	public void actionPerformed(ActionEvent ae) {
		try {
			System.out.println(ae.getActionCommand());
			switch (ae.getActionCommand()) {
			
			case "Create Table":
				
								
			case "Insert Record Into Table":
											insertFrame();
				
			case "Update Table Record":
				
			case "Delete Record/s from Table":
				
			case "Exit":
			
			}
			 
			throw new ApplicantNotFoundException("The applicant with this id is not found : ");
			
		}catch(ApplicantNotFoundException aNFE) {
			System.out.println(aNFE.getMessage());
		}
		
		
	}
	
	private void insertFrame() {
		try {
			setTitle("Insert Record into Table");
			DriverManager.registerDriver(new org.hsqldb.jdbc.JDBCDriver());
			Connection conn = DriverManager.getConnection("jdbc:hsqldb:hsql://localhost/xdb", "SA", "");
			PreparedStatement pst = conn.prepareStatement("INSERT INTO BANK_APPLICANT VALUES (?,?,?,?,?,?) ");
			
			
		}catch (SQLException se) {
			
		}
		
	}
	
	
	
	
	
	
}

@SuppressWarnings("serial")
class MyFrame extends JFrame implements ActionListener
{
	
	
	JLabel l = new JLabel("");
	JTextField t = new JTextField(20);
	JButton b = new JButton("Search");
	
	
	JTextField t1 = new JTextField(20);
	JTextField t2 = new JTextField(20);
	JTextField t3 = new JTextField(20);
	
	
	MyFrame() {
		add(l);
		add(t);
		add(b);
		add(t1);
		add(t2);
		add(t3);
		setLayout(new FlowLayout());
		setSize(300,300);
		setLocation(100,100);
		setResizable(false);
		setVisible(true);
		b.addActionListener(this);
	}
	public void actionPerformed(ActionEvent ae) {
		try
		{
		int value = Integer.parseInt(t.getText());
		System.out.println("Button is clicked...."+value);
		
		DriverManager.registerDriver(new org.hsqldb.jdbc.JDBCDriver());
		System.out.println("Driver loaded.../registered....");
	
		Connection conn = DriverManager.getConnection("jdbc:hsqldb:hsql://localhost/xdb", "SA", "");
		System.out.println("Connected to the db....");
		
		Statement st = conn.createStatement();
		System.out.println("statement is created..."+st);
		
		int appId = value ;
		
		ResultSet rs = st.executeQuery("SELECT * FROM BANK_APPLICANT where APPLICANT_ID="+appId);
		System.out.println("query fired...got the results....");
		
		if(rs.next()) {
			System.out.println("APPLICANT ID     : "+rs.getInt(1));
			System.out.println("APPLICANT NAME   : "+rs.getString(2));
			t1.setText(rs.getString(2));
			
			System.out.println("APPLICANT EMAIL  : "+rs.getString(3));
			t2.setText(rs.getString(3));
			
			System.out.println("APPLICANT ADDRESS: "+rs.getString(4));
			t3.setText(rs.getString(4));
			
			System.out.println("APPLICANT Mobile : "+rs.getString(5));
			System.out.println("APPLICANT DOB    : "+rs.getDate(6));
			System.out.println("-----------------------------");
		}
		else {
			throw new ApplicantNotFoundException("The applicant with this id is not found : "+appId);
			
		}
		
		rs.close();
		st.close();
		conn.close();
		}
		catch(SQLException e) {
			System.out.println("Some problem1 : "+e);
		}
		catch(ApplicantNotFoundException e) {
			//System.out.println("Some problem2 : "+e);
			JOptionPane.showMessageDialog(this, e.getMessage());
			t1.setText("");
			t2.setText("");
			t3.setText("");
			
		}
		System.out.println("DisConnected from the db....");
		
	}
	public void actionPerformed1(ActionEvent e) {
		// TODO Auto-generated method stub
		
	}
	
}

public class SelectWhereClause {

	public static void main(String[] args)  
	{
		MyFrame m = new MyFrame();
		m.setVisible(true);
		
		
	
		final WelcomeFrame wFrame=new WelcomeFrame();
		wFrame.setVisible(true);
		
		
		
	}

}