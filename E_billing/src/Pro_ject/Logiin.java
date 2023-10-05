package Pro_ject;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

import javax.swing.*;

import java.awt.*;

public class Logiin extends JFrame implements ActionListener {

	
	   
		ImageIcon ic,i1,i2;
	    JLabel jl,jl1,jl2;
	    JTextField jt;
	    JPasswordField jp;
	    JButton jb,jb2;
		public Logiin()
		{
			
			ic=new ImageIcon("D:\\java_photo\\pop.png");
			Image i = ic.getImage().getScaledInstance(100, 100, Image.SCALE_DEFAULT);
			jl2= new JLabel();
			jl2.setIcon(new ImageIcon(i));
			
			jl2.setBounds(20, 30,100 , 100);

			jl = new JLabel("Name");
			jl1= new JLabel("Password");
	 
			jl.setBounds(150, 40, 75, 25);
			jl1.setBounds(150, 80, 75, 25);
			
			jt= new JTextField(20);
			jt.setBounds(220,40 , 120, 25);
			
			jp = new JPasswordField();
			jp.setBounds(220, 80, 120, 25);

			
			jb= new JButton("Login");
			jb.setBounds(150, 130, 90, 25);
		
			jb.setFocusable(false);
			i1=new ImageIcon("D:\\java_photo\\login.png");
			Image ik = i1.getImage().getScaledInstance(20, 20, Image.SCALE_DEFAULT);
			jb.setIcon(new ImageIcon(ik));
			
			jb.addActionListener(this);
			
			
			jb2= new JButton("cancle");
			jb2.setBounds(250, 130, 100, 25);
			jb2.setFocusable(false);
			
			i2= new ImageIcon("D:\\java_photo\\cancel.png");
			Image id = i2.getImage().getScaledInstance(20, 20, Image.SCALE_DEFAULT);
			jb2.setIcon(new ImageIcon(id));
			
			jb2.addActionListener(this);
			
			add(jl2);
			add(jl);
			add(jt);
			add(jl1);
			add(jp);
			add(jb);
			add(jb2);
			
			setTitle("Login");
			setSize(400,250);
			setLayout(new BorderLayout());
			setDefaultCloseOperation(EXIT_ON_CLOSE);
			setLocationRelativeTo(null);
			setResizable(false);
			setVisible(true);
			
			
	}
	
	
	@Override
	public void actionPerformed(ActionEvent e) {
		if(e.getSource()==jb2)
		{
			jt.setText("");
			jp.setText("");
		}
		if(e.getSource()==jb)
		{
			String name = jt.getText();
			String pass = jp.getText();
			
			try {
				Connection con = Conn.create();
				String st ="select * from information where name =? and password =?";
                PreparedStatement ps = con.prepareStatement(st);
                ps.setString(1, name);
                ps.setString(2, pass);
                ResultSet rs = ps.executeQuery();
                
                if(rs.next())
                {
                	new Second_page();
                	dispose();
                }
                else {
                	JOptionPane.showMessageDialog(null, "invalid user name or ID ");
                	jt.setText("");
                	jp.setText("");
                }
				con.close();
			}
			catch (Exception e1)
			{
				// TODO: handle exceptio		
				System.out.println(e1+" occur");
				JOptionPane.showMessageDialog(null, "Something happn in insert dao");
			}
			
		
		}
		
	}

}
