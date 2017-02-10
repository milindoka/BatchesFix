package in.refort.batchesfix;


import javax.swing.*;
import java.awt.BorderLayout;

public class View {
      
    private JFrame frame;
    private JLabel label;
    private JButton button;
    private JTable table;
    private JPanel topPanel;
    private JPanel btnPanel;
    private JScrollPane scrollPane;
    
    public View(String text){
        frame = new JFrame("View");                                    
        frame.getContentPane().setLayout(new BorderLayout());                                          
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);           
        frame.setSize(200,200);
        frame.setLocationRelativeTo(null);
        frame.setVisible(true);
        
        

        //headers for the table
        String[] columns = new String[] {
            "Id", "Name", "Hourly Rate", "Part Time"
        };
         
        //actual data for the table in a 2d array
        Object[][] data = new Object[][] {
            {1, "John", 40.0, false },
            {2, "Rambo", 70.0, false },
            {3, "Zorro", 60.0, true },
        };
 
        //create table with data
        table = new JTable(data, columns);
         
        //add the table to the frame
      //  frame.getContentPane().add(new JScrollPane(table),BorderLayout.SOUTH);
        
        

        topPanel = new JPanel();
        btnPanel = new JPanel();
        label = new JLabel(text);
        button = new JButton("Button");
        
        topPanel.setLayout(new BorderLayout());
        
        
        frame.getContentPane().add(topPanel);
        frame.getContentPane().add(btnPanel);
       
      //  frame.getContentPane().add(label);
        scrollPane = new JScrollPane(table);
         
        topPanel.add(scrollPane,BorderLayout.CENTER);
        JButton addButton = new JButton("ADD");
        JButton delButton = new JButton("DELETE");
        btnPanel.add(button);
        btnPanel.add(addButton);
        btnPanel.add(delButton);
        btnPanel.add(label);
        
        frame.getContentPane().add(topPanel, BorderLayout.CENTER);
        frame.getContentPane().add(btnPanel, BorderLayout.SOUTH);

        
     //   frame.getContentPane().add(button, BorderLayout.NORTH);   
        
        
        
        
    }
        
    public JButton getButton(){
        return button;
    }
    
    public void setText(String text){
        label.setText(text);
    }
    
    
}