package Pro_ject;

import javax.swing.*;



import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;


public class Front_page extends JFrame implements ActionListener {

	
	ImageIcon i,i1,i2;
	JLabel jl,jl1,jl2;
	JButton jb,jb1;

	
	
	 public Front_page() {
	
		 i = new ImageIcon("D:\\java_photo\\elect2.jpg");
		 Image ii= i.getImage().getScaledInstance(400, 400, Image.SCALE_DEFAULT);
		 jl = new JLabel();
		 jl.setIcon(new ImageIcon(ii));
		 jl.setBounds(1, 1, 400, 400);
		 
		 jb= new JButton("Login");
		 jb.setBounds(30, 300, 75, 25);
		 jb.addActionListener(this);
		 
		 
		 jb1 = new JButton("Register");
		 jb1.setBounds(120,300,  100, 25);
		 jb1.addActionListener(this);
         
		 
		 add(jb);
		 add(jb1);
		 add(jl);
		 
			setTitle("Electricity billing");
			setSize(400,400);
			setLayout(new BorderLayout());
			setDefaultCloseOperation(EXIT_ON_CLOSE);
			setLocationRelativeTo(null);
			setResizable(false);
			setVisible(true);
	}
		@Override
		public void actionPerformed(ActionEvent e) {
			if(e.getSource()==jb)
			{
				new Logiin();
				dispose();
			}
			
			if(e.getSource() == jb1)
			{
				new Register();
				dispose();
				
			}
		}
	
	
}
