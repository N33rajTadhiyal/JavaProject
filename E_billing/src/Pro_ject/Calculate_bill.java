package Pro_ject;
import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
public class Calculate_bill extends JFrame implements ActionListener {
	
	JLabel jl,jl1,jl2,jl3,jl4,jl5;
	JLabel l , l1,l2,l3;
	JTextField jt,jt1,jt2,jt4;
	Choice c2;
	JTextArea jt3;
	JButton jb ,jb1,jb2;
	JPanel jp ;
	ImageIcon ic ;
	double db,charge,amount;
	
	public Calculate_bill() {
		
       jl = new JLabel("Enter your name");
       jl.setBounds(50, 100, 200,30);
	   add(jl);
	   jt = new JTextField();
	   jt.setBounds(250, 100, 150,25);
	   add(jt);
	   
	   
       jl1 = new JLabel("Enter your meter number");
       jl1.setBounds(50, 170, 150,30);
	   add(jl1);	   
	   jt1 = new JTextField();
	   jt1.setBounds(250, 170, 150,25);
	   add(jt1);
	   

	 

	   
	   //bill screen
	   
	   jt3 = new JTextArea(50,15);
	   jt3.setBounds(450, 30, 300,400);
	  
	   jt3.setBorder(BorderFactory.createBevelBorder(1));
	   jt3.setText("\tOyaaa suuuu\n");
       jt3.append("\tBaka daro ka??");
       JScrollPane sp = new JScrollPane(jt3);
       add(jt3);
	   
	   jl4 = new JLabel("Unit Consume");
	   jl4.setBounds(50, 310, 150,30);
	   add(jl4);
	   jt4 = new JTextField();
	   
	   jt4.setBounds(250, 310, 150,25);
	   add(jt4);
	   
	   
       jl2 = new JLabel("Month");
       jl2.setBounds(50, 240, 150,30);
	   add(jl2);
	   c2= new Choice();
       c2.add("January");
       c2.add("February");
       c2.add("March");
       c2.add("April");
       c2.add("May");
       c2.add("June");
       c2.add("July");
       c2.add("August");
       c2.add("September");
       c2.add("October");
       c2.add("November");
       c2.add("December");
       c2.setBounds(250, 240, 150,30);
       add(c2);
	   
		
       jb = new JButton("Submit");
       jb.setBounds(50, 380, 90,30);
       jb.addActionListener(this);
       add(jb);
       
       jb1 = new JButton("back");
       jb1.setBounds(179, 380, 90,30);
       add(jb1);
       jb1.addActionListener(this);
       
       ic = new ImageIcon("D:\\java_photo\\bg.png");
       Image ik = ic.getImage().getScaledInstance(800, 500, Image.SCALE_DEFAULT);
       jl5 =new JLabel();
       jl5.setIcon(new ImageIcon(ik));
       jl5.setBounds(0, 0, 800, 500);
       add(jl5);
       
		setSize(800,500);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		setTitle("Calculate bill");
		setLocationRelativeTo(null);
		setLayout(new BorderLayout());
		setResizable(false);
		setVisible(true);
		
	}
	

	@Override
	public void actionPerformed(ActionEvent e) {
		if(e.getSource()==jb)
		{
		   double unit= Double.parseDouble(jt4.getText());
		   double charge ,amount;
		   
		   if(unit <=200)
		   {
			   charge = 4.00;
		   }
		   else if(unit >=201 && unit <=400)
		   {
			   charge =5.50;
		   }
		   else {
			   charge = 6.75;
		   }
	 
		   amount = unit*charge;
		   
	     jt3.append("\tUnit conseume :"+unit);
	     jt3.append("\tCharge  :"+charge);
	     jt3.append("\tTotal amount :"+amount);
			
		}
		if(e.getSource() == jb1)
		{
			new Second_page();
			dispose();
		}
		
	}

}
