package Pro_ject;

import javax.swing.*;


import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Register extends JFrame implements ActionListener {
    	
	JLabel name,password,phno,city,re;
	JTextField jt,jt1,jt2,jt3,jt4;
	JPasswordField jp,jp1;
	JButton jb,jb1;
	
	Insert_dao ins = new Insert_dao();
	
	 public Register()

	{
		
		name = new JLabel("Name");
		password = new JLabel("Password");
		re = new JLabel("re Enter the password");
		phno = new JLabel("phone number");
		city = new JLabel("city");
		
		jt = new JTextField();
		jt1= new JTextField();
		jt2 = new JTextField();
		jt3= new JTextField();
		jt4 = new JTextField();
		jp= new  JPasswordField();
		jp1= new JPasswordField();
		
		
		jb = new JButton("Submit");
		jb.setBounds(150, 300, 75, 25);
		jb.addActionListener(this);
			
		
		jb1= new JButton("back");
		jb1.setBounds(250, 300, 75, 25);
		jb1.addActionListener(this);
		
		
		name.setBounds(50,60 , 100,25);
		jt1.setBounds(190,60 , 100,25);
		
		
		password.setBounds(50, 100, 100,25);
		jp.setBounds(190, 100, 100, 25);
		
		re.setBounds(50, 140, 150, 25);
		jp1.setBounds(190, 140, 100, 25);
		
				
		phno.setBounds(50, 180, 100,25);
		jt3.setBounds(190, 180, 100, 25);
		
		
		city.setBounds(50,220 , 100,25);
		jt4.setBounds(190, 220, 100, 25);
		
		
		add(name);
		add(phno);
		add(city);
		add(password);
		add(re);
		add(jp);
		add(jp1);
		add(jt1);
		add(jt3);
		add(jt4);
		add(jb);
		add(jb1);
		
		setTitle("Register");
		setSize(500,500);
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
			String pass= jp.getText();
			String repas = jp1.getText();
			
			if( pass.length()<10 && pass.length()>=6)
			{
				if(pass.contentEquals(repas))
				{
					
					
					String na = jt1.getText();
					String pas=jp.getText();
					String ph=jt3.getText();
					String ci = jt4.getText();
					
					boolean ans = ins.add(na,pass,ph,ci);
					
					if(ans)
					{
						try {
							JOptionPane.showMessageDialog(null,"All done wait 3 sec");
						  new Second_page();
							Thread.sleep(2000);
                            
							
						} catch (Exception e2) {
							JOptionPane.showMessageDialog(null,"came");
						}
					}
					else {
						JOptionPane.showMessageDialog(null,"sorry our Fault");
					}
					
				}
				else {
					JOptionPane.showMessageDialog(null,"The Passwords dosnt match");
					jp.setText("");
					jp1.setText("");
				}
				
			}
			else
			{
              if(pass.length() < 6)
              {
  				JOptionPane.showMessageDialog(null,"The Passwords length should be greater then 5 words");
  				jp.setText("");
  				jp1.setText("");
              }
              else {
  				JOptionPane.showMessageDialog(null,"The Passwords length should be smaller then 10 words");
  				jp.setText("");
  				jp1.setText("");
              }
			}
			
		}
		
		if(e.getSource() ==jb1)
		{
			new Front_page();
			dispose();
		}
		
	}

}
