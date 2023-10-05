package Pro_ject;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.*;
public class Second_page extends JFrame implements ActionListener {
	
	
	JMenuBar jb;
	JMenu jm1,jm2,jm3,jm4,jm5;
	JMenuItem i1,i2,i3,i4,i5,i6,i7,i8,i9,i10,i11;
    JLabel jl;
    ImageIcon ic,ic1,ic2,ic3,ic4,ic5,ic6,ic7,ic8,ic9,ic10;
	
	public Second_page()
	{
		
		ic = new ImageIcon("D:\\java_photo\\elect1.jpg");
		Image ik = ic.getImage().getScaledInstance(1900, 950, Image.SCALE_DEFAULT);
		ic1 = new ImageIcon(ik);
		jl = new JLabel(ic1);
		jl.setBounds(0, 0, 1900, 950);
		add(jl);
		
		jb = new JMenuBar();
		
		
		jm1 = new JMenu("Master");
		
		i1 = new JMenuItem("New Customer");
		ic = new ImageIcon("D:\\java_photo\\icon12.jpg");
		Image ig = ic.getImage().getScaledInstance(25, 25, Image.SCALE_DEFAULT);
		i1.setIcon(new ImageIcon(ig));
		i1.addActionListener(this);
		
		
		i2 = new JMenuItem("Customer Detail");
		ic1 = new ImageIcon("D:\\java_photo\\icon6.png");
		Image ig1 = ic1.getImage().getScaledInstance(25, 25, Image.SCALE_DEFAULT);
		i2.setIcon(new ImageIcon(ig1));
		i2.addActionListener(this);
		
		
		i3 = new JMenuItem("Deposit Detail");
		ic2 = new ImageIcon("D:\\java_photo\\icon3.png");
		Image ig2 = ic2.getImage().getScaledInstance(25, 25, Image.SCALE_DEFAULT);
		i3.setIcon(new ImageIcon(ig2));
		i3.addActionListener(this);

		
        jm1.add(i1);
        jm1.add(i2); 
        jm1.add(i3);
		
		
		jm2 = new JMenu("User");
		

		
		
		i4 = new JMenuItem("Pay Bill");
		ic3 = new ImageIcon("D:\\java_photo\\icon4.png");
		Image ig3 = ic3.getImage().getScaledInstance(25, 25, Image.SCALE_DEFAULT);
		i4.setIcon(new ImageIcon(ig3));
		i4.addActionListener(this);

		
		i5 = new JMenuItem("Calculate Bill");		
		ic4 = new ImageIcon("D:\\java_photo\\icon9.png");
		Image ig4 = ic4.getImage().getScaledInstance(25, 25, Image.SCALE_DEFAULT);
		i5.setIcon(new ImageIcon(ig4));
		i5.addActionListener(this);
		
		
		i6 = new JMenuItem("last Bill");
		ic5 = new ImageIcon("D:\\java_photo\\icon6.png");
		Image ig5 = ic5.getImage().getScaledInstance(25, 25, Image.SCALE_DEFAULT);
		i6.setIcon(new ImageIcon(ig5));
		i6.addActionListener(this);
		
		
		jm2.add(i4);
		jm2.add(i5);
		jm2.add(i6);
		
		
		
		jm3 = new JMenu("Report");
		i7 = new JMenuItem("Genrate Bill");
		ic6 = new ImageIcon("D:\\java_photo\\icon7.png");
		Image ig6 = ic6.getImage().getScaledInstance(25, 25, Image.SCALE_DEFAULT);
		i7.setIcon(new ImageIcon(ig6));
		i7.addActionListener(this);
		
		
		jm3.add(i7);
		
		jm4 = new JMenu("Utility");
		
		i8= new JMenuItem("Note pad");
		ic7 = new ImageIcon("D:\\java_photo\\icon12.jpg");
		Image ig7 = ic7.getImage().getScaledInstance(25, 25, Image.SCALE_DEFAULT);
		i8.setIcon(new ImageIcon(ig7));
		i8.addActionListener(this);
		
		i9 = new JMenuItem("Calculator");
		ic8 = new ImageIcon("D:\\java_photo\\icon9.png");
		Image ig8 = ic8.getImage().getScaledInstance(25, 25, Image.SCALE_DEFAULT);
		i9.setIcon(new ImageIcon(ig8));
		i9.addActionListener(this);
		
		i10 = new JMenuItem("Chrome");
		ic9 = new ImageIcon("D:\\java_photo\\icon10.png");
		Image ig9 = ic9.getImage().getScaledInstance(25, 25, Image.SCALE_DEFAULT);
		i10.setIcon(new ImageIcon(ig9));
		i10.addActionListener(this);
		

		jm4.add(i8);
		jm4.add(i9);
		jm4.add(i10);
		
		
		
		jm5 = new JMenu("Exit");
		
		i11 = new JMenuItem("close app");
		ic10 = new ImageIcon("D:\\java_photo\\icon11.png");
		Image ig10 = ic10.getImage().getScaledInstance(25, 25, Image.SCALE_DEFAULT);
		i11.setIcon(new ImageIcon(ig10));
		i11.addActionListener(this);
		jm5.add(i11);

		
		
		
		
		jm5.setForeground(Color.RED);
		
		
		jb.add(jm1);
		jb.add(jm2);
		jb.add(jm3);
		jb.add(jm4);
		jb.add(jm5);
		
		
		
		
		setJMenuBar(jb);
		
		setTitle("");
		setSize(1920,1030);
		setLayout(new BorderLayout());
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		setLocationRelativeTo(null);
		
		setVisible(true);
		
	}
	
	

	@Override
	public void actionPerformed(ActionEvent e) {
		if(e.getSource()==i1)
		{
			new New_Costumer();
			dispose();
		}
		
		if(e.getSource()==i2)
		{
			new Costumer_Detail();
			dispose();
		}
		if(e.getSource()==i5)
		{
			new Calculate_bill();
			dispose();
		}
		
		if(e.getSource()==i8)
		{
			try {
				Runtime.getRuntime().exec("C:\\Program Files\\Notepad++\\notepad++.exe");
			} catch (Exception e2) {
				System.out.println(e2+" Occur in Notepad");
			}
		}
		
		if(e.getSource()==i9)
		{
        try {
        	Runtime.getRuntime().exec("calc.exe");
			} catch (Exception e2) {
				System.out.println(e2+"Occur ");
			}
		}
		
		if(e.getSource()==i10)
		{
			try {
				Runtime.getRuntime().exec("C:\\Program Files (x86)\\Google\\Chrome\\Application\\chrome.exe");
			} catch (Exception e2) {
				System.out.println(e2+"Occur ");
			}
		}
		if(e.getSource()==i11)
		{
			System.exit(0);
		}
		
	}

}
