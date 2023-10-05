package Pro_ject;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Costumer_Detail extends JFrame implements ActionListener {
	
     JButton jb,jb1;
	 JLabel jl,jl1;
	 JTextField jt;
	 ImageIcon ic;
	 public Costumer_Detail() {


		 
		  jl1= new JLabel("Enter your Meter number");
		  jl1.setBounds(90, 80, 150, 25);
	
		  add(jl1);
		  
		  jt = new JTextField();
		  jt.setBounds( 260, 80, 150, 25);
		  add(jt);
      
	        jb = new JButton("Submit");
	        jb.setBounds(120,200,90,25) ;      
	        add(jb);
	        jb.addActionListener(this);
	        

	        jb1 = new JButton("cancle");
	        jb1.setBounds(280,200,90,25);
	        jb1.setForeground(Color.red);
	        add(jb1);
	        jb1.addActionListener(this); 
	        
		    jl=new JLabel();
			ic= new ImageIcon("D:\\java_photo\\vc.jpg");
			Image i = ic.getImage().getScaledInstance(500, 300, Image.SCALE_DEFAULT);
			jl.setIcon(new ImageIcon(i));
			jl.setBounds(0, 0, 500, 300);
			add(jl);
			
			
		 
			setTitle("Costumer Details");
			setSize(500,300);
			setLayout(new BorderLayout());
			setDefaultCloseOperation(EXIT_ON_CLOSE);
			setLocationRelativeTo(null);
			setResizable(false);
			setVisible(true);	 
		 
	}
	

	@Override
	public void actionPerformed(ActionEvent e) {

		if (e.getSource() == jb)
		{
			try {
				
				int no = Integer.parseInt(jt.getText());
				System.out.println(no+"");
				Insert_dao id = new Insert_dao();
				id.show(no);
			    dispose();
				
			} catch (Exception e2) {
				JOptionPane.showMessageDialog(null, "make sure they are all numeric");
			}
		}
		if (e.getSource() == jb1)
		{
			new Second_page();
			dispose();
		}
	}

}


class cst extends JFrame implements ActionListener {
	
	JLabel jl,jl1,jl2,jl3,jl4,jl5,jl6,jl7;
	JTextField jt,jt1,jt2,jt3,jt4,jt5,jt6;
	JButton jb,jb1;
	ImageIcon i;
	
	
	public cst() {

        
        jl1 = new JLabel("Name");
        jt= new JTextField();
        jt.setBackground(Color.white);
        jt.setEditable(false);
        jl1.setBounds(120,30,100,25);
        jt.setBounds(250, 30, 130, 25);
        add(jt);
        add(jl1);
        
        
        jl2 = new JLabel("Meter number");
        jt1= new JTextField();
        jt1.setBackground(Color.white);
        jt1.setEditable(false);
        jl2.setBounds(120,80,100,25);
        jt1.setBounds(250, 80, 130, 25);
        add(jt1);
        add(jl2);
        
        
        jl3 = new JLabel("Adress");
        jt2= new JTextField();
        jt2.setEditable(false);
        jt2.setBackground(Color.white);
        jl3.setBounds(120,130,100,25);
        jt2.setBounds(250, 130, 130, 25);
        add(jl3);
        add(jt2);
        
        
        jl4 = new JLabel("State");
        jt3= new JTextField();
        jt3.setEditable(false);
        jt3.setBackground(Color.white);
        jl4.setBounds(120,180,100,25);
        jt3.setBounds(250, 180, 130, 25);
        add(jl4);
        add(jt3);
        
        
        jl5 = new JLabel("City");
        jt4= new JTextField();
        jt4.setEditable(false);
        jt4.setBackground(Color.white);
        jl5.setBounds(120,230,100,25);
        jt4.setBounds(250, 230, 130, 25);
        add(jl5);
        add(jt4);
        
        
        jl6 = new JLabel("E-mail");
        jt5= new JTextField();
        jt5.setEditable(false);
        jt5.setBackground(Color.white);
        jl6.setBounds(120,280,100,25);
        jt5.setBounds(250, 280, 130, 25);
        add(jl6);
        add(jt5);        
        
        
        jl7 = new JLabel("phno");
        jt6= new JTextField();
        jt6.setEditable(false);
        jt6.setBackground(Color.white);
        jl7.setBounds(120,330,100,25);
        jt6.setBounds(250, 330, 130, 25);
        add(jl7);
        add(jt6);       
        
      
        

        jb = new JButton("Submit");
        jb.setBounds(150,400,90,25) ;      
        add(jb);
        jb.addActionListener(this);
        

        jb1 = new JButton("back");
        jb1.setBounds(300,400,90,25);
        jb1.setForeground(Color.red);
        add(jb1);
        jb1.addActionListener(this);
        
        i= new ImageIcon("D:\\java_photo\\dabi.jpg");
        Image ik = i.getImage().getScaledInstance(500, 500, Image.SCALE_DEFAULT);
        jl = new JLabel();
        jl.setIcon(new ImageIcon(ik));
        jl.setBounds(0, 0, 500, 500);
        add(jl)  ;
        
		setTitle("Costumer Details");
		setSize(500,500);
		setLayout(new BorderLayout());
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		setLocationRelativeTo(null);
		setResizable(false);
		setVisible(true);	
        
        
	}
	
	

	@Override
	public void actionPerformed(ActionEvent e) {
		if (e.getSource() == jb1)
		{
			new Second_page();
			dispose();
		}
		
	}
	
	
	
}

