package Pro_ject;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.*;

public class New_Costumer extends JFrame implements ActionListener {
	
	JLabel jl,jl1,jl2,jl3,jl4,jl5,jl6,jl7;
	JTextField jt,jt1,jt2,jt3,jt4,jt5,jt6;
	JButton jb,jb1;
	ImageIcon i;
	int mnumber;
	String number;
	public New_Costumer() {
        i= new ImageIcon("D:\\java_photo\\hicon1.jpg");
        Image ik = i.getImage().getScaledInstance(100, 250, Image.SCALE_DEFAULT);
        jl = new JLabel();
        jl.setIcon(new ImageIcon(ik));
        jl.setBounds(10, 100, 100, 250);
        add(jl)  ;
        
        jl1 = new JLabel("Name");
        jt= new JTextField();
        jl1.setBounds(120,30,100,25);
        jt.setBounds(250, 30, 130, 25);
        add(jt);
        add(jl1);
        
        
        jl2 = new JLabel("Meter number");
        jt1= new JTextField();
        jl2.setBounds(120,80,100,25);
        jt1.setBounds(250, 80, 130, 25);
        add(jt1);
        add(jl2);
        
        
        jl3 = new JLabel("Adress");
        jt2= new JTextField();
        jl3.setBounds(120,130,100,25);
        jt2.setBounds(250, 130, 130, 25);
        add(jl3);
        add(jt2);
        
        
        jl4 = new JLabel("State");
        jt3= new JTextField();
        jl4.setBounds(120,180,100,25);
        jt3.setBounds(250, 180, 130, 25);
        add(jl4);
        add(jt3);
        
        
        jl5 = new JLabel("City");
        jt4= new JTextField();
        jl5.setBounds(120,230,100,25);
        jt4.setBounds(250, 230, 130, 25);
        add(jl5);
        add(jt4);
        
        
        jl6 = new JLabel("E-mail");
        jt5= new JTextField();
        jl6.setBounds(120,280,100,25);
        jt5.setBounds(250, 280, 130, 25);
        add(jl6);
        add(jt5);        
        
        
        jl7 = new JLabel("phno");
        jt6= new JTextField();
        jl7.setBounds(120,330,100,25);
        jt6.setBounds(250, 330, 130, 25);
        add(jl7);
        add(jt6);       
        
        
        jb = new JButton("Submit");
        jb.setBounds(150,400,90,25) ;      
        add(jb);
        jb.addActionListener(this);
        

        jb1 = new JButton("cancle");
        jb1.setBounds(300,400,90,25);
        jb1.setForeground(Color.red);
        add(jb1);
        jb1.addActionListener(this);
        
        

		setTitle("New Costumer");
		setSize(500,500);
		setLayout(new BorderLayout());
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		setLocationRelativeTo(null);
		setResizable(false);
		setVisible(true);
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		if(e.getSource() ==jb)
		{
			if((jt.getText().length() !=0) && (jt1.getText().length() !=0) && (jt2.getText().length() !=0) && (jt3.getText().length() !=0) && (jt4.getText().length() !=0) && (jt5.getText().length() !=0) &&(jt6.getText().length()==10))
			{		
				  number = jt6.getText();
				  mnumber = Integer.parseInt(jt1.getText());
				  String name=jt.getText();
				  String adress=jt2.getText();
				  String state=jt3.getText();
				  String city=jt4.getText();
				  String email=jt5.getText();
				  
				 boolean ans = new Insert_dao().costumerInjection(name, adress, state, city, email, number, mnumber);
				 if(ans)
				 {
					 JOptionPane.showMessageDialog(null, " new account successfully created");
					 new Second_page();
					 dispose();
				 }
				 else {
					 JOptionPane.showMessageDialog(null, " OOps something went wrong");
				 }
			}
			else if((jt.getText().length() ==0) && (jt1.getText().length() ==0) && (jt2.getText().length() ==0) && (jt3.getText().length() ==0) && (jt4.getText().length() ==0) && (jt5.getText().length() ==0)) {
				JOptionPane.showMessageDialog(null, "some fields are blank ");
			}
			else {
				JOptionPane.showMessageDialog(null, "phno should be of 10 digits ");
				jt6.setText("");
			}
	      		
		}
		if(e.getSource() == jb1)
		{
			new Second_page();
			dispose();
		}
		
	}
	
}




