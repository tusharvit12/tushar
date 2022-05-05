package jdbcwithframes;

import java.awt.BorderLayout;
import java.awt.Dimension;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.*;
import java.time.format.DateTimeFormatter;

import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

@SuppressWarnings("serial")
public class JTest extends JPanel {

    private static JComboBox comboBox;
    private static JTextField idTextField = new JTextField(10);
    private static JTextField nameTextField= new JTextField(10);
    private static JTextField emailTextField= new JTextField(10);
    private static JTextField addTextField= new JTextField(10);
    private static JTextField mobTextField= new JTextField(10);
    private static JTextField dobTextField= new JTextField(10);
    
    private static JLabel idLabel=new JLabel("Enter Primary ID:");
    private static JLabel nameLabel=new JLabel("Enter Name:");
    private static JLabel emailLabel=new JLabel("Enter email ID");
    private static JLabel addLabel=new JLabel("Enter Address");
    private static JLabel mobLabel=new JLabel("Enter Mobile No");
    private static JLabel dobLabel=new JLabel("Enter Date of Birth");
    
    

    // Create a form with the fields
    public JTest(JFrame f) {
        super(new BorderLayout());
        try {
        	
        
	        DriverManager.registerDriver(new org.hsqldb.jdbc.JDBCDriver());
	    	Connection conn = DriverManager.getConnection("jdbc:hsqldb:hsql://localhost/xdb", "SA", "");
	    	PreparedStatement pst = conn.prepareStatement("INSERT INTO BANK_APPLICANT VALUES (?,?,?,?,?,?) ");
	       
	        // Panel for the labels
	        JPanel labelPanel = new JPanel(new GridLayout(2, 1)); // 7 rows 1 column
	        add(labelPanel, BorderLayout.WEST);
	
	        // Panel for the fields
	        JPanel fieldPanel = new JPanel(new GridLayout(2, 1)); // 2 rows 1 column
	        add(fieldPanel, BorderLayout.EAST);
	
	                // Combobox
	        JLabel labelCombo = new JLabel("Select");
	        
	        // Options in the combobox
	        String[] options = { "Create Record", "Insert Record", "Update Record", "Delete Record"};
	        comboBox = new JComboBox(options);
	        comboBox.setSize(30,10);
	        fieldPanel.add(comboBox);
	        
	        JLabel labelTextField = new JLabel();
	        
	        labelPanel.add(labelCombo);
	        labelPanel.add(labelTextField);
	        
	        
	        //Labels for Table Insert fields
	       
	        comboBox.addActionListener(
	        		new ActionListener()
	        		{
	        	
			            @Override
			            public void actionPerformed(ActionEvent e) 
			            {
			            	System.err.println(comboBox.getSelectedItem());
			            	switch ((String)comboBox.getSelectedItem())
			            	{
			            		case "Create Record":
			            		
			            			
			            		case "Insert Record":  	setPreferredSize(new Dimension(700, 500));
			            								JPanel newp=new JPanel(new GridLayout(6, 2, 10, 15));
			            								add(newp, BorderLayout.SOUTH);
			            								newp.add(idLabel);
			            								newp.add(idTextField);
			            								newp.add(nameLabel);
			                    					    newp.add(nameTextField);
			                    					    newp.add(emailLabel);
			                    					    newp.add(emailTextField);
			                    					    newp.add(addLabel);
			                    					    newp.add(addTextField);
			                    					    newp.add(mobLabel);
			                    					    newp.add(mobTextField);
			                    					    newp.add(dobLabel);
			                    					    newp.add(dobTextField);
			                    					    f.pack();
			                    					    
			                    					    JButton insert=new JButton("Insert");
			                    					    
			                    				        insert.addActionListener(new ActionListener() 
			                    				        {	
			                    				        	 public void actionPerformed(ActionEvent e) {
			                    					    		
				                    					    try {
					                    					    pst.setInt(1, Integer.parseInt(idTextField.getText()));
					                    						pst.setString(2, nameTextField.getText());
					                    						pst.setString(3, emailTextField.getText());
					                    						pst.setString(4, addTextField.getText());
					                    						pst.setString(5, mobTextField.getText());
					                    						DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd");
					                    						java.util.Date date = Date.valueOf(dobTextField.getText());
					                    						java.sql.Date sqlDate= new java.sql.Date(date.getTime());
					                    						pst.setDate(6, sqlDate);
					                    						int row = pst.executeUpdate();
					                    						pst.close();
					                    						
				                    					    }catch(SQLException se) {
				                    					    	System.out.println(se.getMessage());
				                    					    	
				                    					    }catch(NumberFormatException noe) {
				                    					    	System.out.println(noe.getMessage());
				                    					    }
			                    				        }
			                    				        });
			                    				        
			                    					    break;
			                                       	
			            		case "Update Record":
			            			
			            								break;
			            			
			            		case "Delete Record":
			            		
			            	}
			
			           }
	        });
	        
	        conn.close();
        }catch(SQLException se) {
        	
        }
       
 
    }

    public static void main(String[] args) {
    		
	    	
	    	JFrame f = new JFrame("Welcome");
	        final JTest form = new JTest(f);
	
	        // Button submit
	        JButton submit = new JButton("Submit Form");
	        submit.addActionListener(new ActionListener() {
	            @Override
	            public void actionPerformed(ActionEvent e) {
	                createIban((String) comboBox.getSelectedItem(), idTextField.getText());
	            }
	        });
	
	        // Frame for our test
	       // JFrame f = new JFrame("Welcome");
	        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	        f.getContentPane().add(form, BorderLayout.NORTH);
	
	        // Panel with the submit button
	        JPanel p = new JPanel();
	        p.add(submit);
	        f.getContentPane().add(p, BorderLayout.SOUTH);
	        
	
	
	        // Show the frame
	       
	        f.setSize(500, 300);
	        f.setVisible(true);
	
    }

    private static void createIban(String selectedItem, String text) {
        // Do stuff with your data
        System.out.println("Im in createIban with the values: " + selectedItem + " and " + text);
    }
}