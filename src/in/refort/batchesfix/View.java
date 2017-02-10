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
    private FixedColumnTable fct;
    public View(String text){
        frame = new JFrame("View");                                    
        frame.getContentPane().setLayout(new BorderLayout());                                          
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);           
        frame.setSize(400,200);
        frame.setLocationRelativeTo(null);
        frame.setVisible(true);
        
        JTable table = new JTable(10, 90);
        table.setAutoResizeMode(JTable.AUTO_RESIZE_OFF);
        table.getColumnModel().getColumn(0).setPreferredWidth(50);
        table.getColumnModel().getColumn(1).setPreferredWidth(100);
        JScrollPane scrollPane= new JScrollPane( table );
        fct = new FixedColumnTable(2, scrollPane);        
        

        topPanel = new JPanel();
        btnPanel = new JPanel();
        label = new JLabel(text);
        button = new JButton("Button");
        
        topPanel.setLayout(new BorderLayout());
        
        
        frame.getContentPane().add(topPanel);
        frame.getContentPane().add(btnPanel);
       
      //  frame.getContentPane().add(label);
        //''scrollPane = new JScrollPane(table);
        //fct=new FixedColumnTable(1,scrollPane);
        
        
        
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