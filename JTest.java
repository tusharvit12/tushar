import java.awt.BorderLayout;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class JTest extends JPanel {

    private static JComboBox comboBox;
    private static JTextField idTextField;
    private static JTextField nameTextField;
    private static JTextField emailTextField;
    private static JTextField addTextField;
    private static JTextField mobTextField;
    private static JTextField dobTextField;
    
    

    // Create a form with the fields
    public JTest() {
        super(new BorderLayout());
        // Panel for the labels
        JPanel labelPanel = new JPanel(new GridLayout(7, 1)); // 7 rows 1 column
        add(labelPanel, BorderLayout.WEST);

        // Panel for the fields
        JPanel fieldPanel = new JPanel(new GridLayout(2, 1)); // 2 rows 1 column
        add(fieldPanel, BorderLayout.CENTER);

        // Combobox
        JLabel labelCombo = new JLabel("Select");
        
        

        // Options in the combobox
        String[] options = { "Create Record", "Insert Record", "Update Record", "Delete Record"};
        comboBox = new JComboBox(options);
        comboBox.addActionListener(new ActionListener() {

            @Override
            public void actionPerformed(ActionEvent e) {
                // Do something when you select a value
            	
            	switch (comboBox.getActionCommand())
            	{
            		case "Create Record":
            		
            			
            		case "Insert Record":  idTextField = new JTextField(10);
                    					   idTextField.setVisible(true);
                    					  
                    					   nameTextField = new JTextField(10);
                    					   nameTextField.setVisible(true);
                    					 
                    					   emailTextField = new JTextField(10);
                    					   emailTextField.setVisible(true);
                    					   
                    					   addTextField = new JTextField(10);
                    					   addTextField.setVisible(true);
                    					  
                    					   mobTextField = new JTextField(10);
                    					   mobTextField.setVisible(true);
                    					   
                    					   dobTextField = new JTextField(10);
                    					   dobTextField.setVisible(true);
                    					     					   
                                       	
            		case "Update Record":
            			
            		case "Delete Record":
            		
            	}

            }
        });

        // Textfield
       
        JLabel labelTextField = new JLabel();
        // Add labels
        labelPanel.add(labelCombo);
        labelPanel.add(labelTextField);

        // Add fields
        fieldPanel.add(comboBox);
        fieldPanel.add(idTextField);
        fieldPanel.add(nameTextField);
        fieldPanel.add(emailTextField);
        fieldPanel.add(addTextField);
        fieldPanel.add(mobTextField);
        fieldPanel.add(dobTextField);
        //fieldPanel.add(textField);
    }

    public static void main(String[] args) {
        final JTest form = new JTest();

        // Button submit
        JButton submit = new JButton("Submit Form");
        submit.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
               // createIban((String) comboBox.getSelectedItem(), textField.getText());
            }
        });

        // Frame for our test
        JFrame f = new JFrame("Text Form Example");
        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        f.getContentPane().add(form, BorderLayout.NORTH);

        // Panel with the button
        JPanel p = new JPanel();
        p.add(submit);
        f.getContentPane().add(p, BorderLayout.SOUTH);

        // Show the frame
        f.pack();
        f.setVisible(true);
    }

    private static void createIban(String selectedItem, String text) {
        // Do stuff with your data
        System.out.println("Im in createIban with the values: " + selectedItem + " and " + text);
    }
}