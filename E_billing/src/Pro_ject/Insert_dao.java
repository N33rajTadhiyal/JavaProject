package Pro_ject;

import java.sql.*;

import javax.swing.JOptionPane;

public class Insert_dao {

	public boolean add( String name , String pass,String phno,String city)
	{
		 
		boolean f = false;
		try {
			Connection con = Conn.create();
			String st ="insert into information (name , password,phno,city) values(?,?,?,?)";
			PreparedStatement pr = con.prepareStatement(st);
			pr.setString(1, name);
			pr.setString(2, pass);
			pr.setString(3, phno);
			pr.setString(4, city);
			
			pr.executeUpdate();
			f= true;
			pr.close();
			con.close();
		}catch (Exception e) {
			// TODO: handle exceptio		
			System.out.println(e+" occur");
			JOptionPane.showMessageDialog(null, "Something happn in insert dao");
		}
		
		
		return f;
	}

	public boolean costumerInjection(String name,String adress,String state,String city,String Email,String number,int mnumber) {
	    boolean f = false;
		try {
			New_Costumer nc = new New_Costumer();
			
			Connection con = Conn.create();
			
			
			String st ="insert into new_costumer (name ,meterno,adress,state,city,email,phno ) values(?,?,?,?,?,?,?)";
			PreparedStatement pr = con.prepareStatement(st);
			pr.setString(1,name);
			pr.setInt(2,mnumber);
			pr.setString(3,adress);
			pr.setString(4,state);
			pr.setString(5,city);
			pr.setString(6,Email);
			pr.setString(7, number);		
		
			
			pr.executeUpdate();
			f= true;
			pr.close();
			con.close();
		}catch (Exception e) {
			// TODO: handle exceptio		
			System.out.println(e+" occur");
			JOptionPane.showMessageDialog(null, "Something happn in insert dao");
		}
	    
		return f;
	}

	public void show(int no) {
		
		
		try {
			Connection con = Conn.create();
			String st = "Select * from new_costumer where meterno ="+no;
			Statement stq = con.createStatement();
			ResultSet rs = stq.executeQuery(st);
			
			while(rs.next())
			{
				try {
					Thread.sleep(1000);
					cst c = new cst();
					   c.jt.setText(rs.getString(2));
					   c.jt1.setText(rs.getInt(3)+"");
					   c.jt2.setText(rs.getString(4));
					   c.jt3.setText(rs.getString(5));
					   c.jt4.setText(rs.getString(6));
					   c.jt5.setText(rs.getString(7));
					   c.jt6.setText(rs.getString(8));
				} catch (Exception e) {
					// TODO: handle exception
				}

			}
			
			rs.close();
			con.close();
		} catch (Exception e) {
			System.out.println(e+" Came");
		}
		
	}
	
}
