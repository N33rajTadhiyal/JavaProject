package Pro_ject;

import javax.swing.*;


import java.awt.*;

public class Splash_Screen extends JFrame {

	   public static void main(String args[])
	   {
			 screen sc = new screen();
			 sc.setVisible(true);

		     int i,x=1;
			 for(i=2;i<600;i+=4 ,x+=1)
			 {
				 sc.setLocation(800-((i+x)/2), 500-(i/2));
				 sc.setSize(i+x,i);
				 try {
					Thread.sleep(10);
				} catch (Exception e) {
					// TODO: handle exception
				}
			 }
	   }
  	
	
}
class screen extends JFrame implements Runnable{
	JLabel jl ;
	ImageIcon i;
	Thread t;
	public screen()
	{
		i = new ImageIcon("D:\\java_photo\\elect.jpg");
		Image ik = i.getImage().getScaledInstance(730, 550, Image.SCALE_DEFAULT);
		
		jl = new JLabel();
		jl.setIcon(new ImageIcon(ik));
		
		add(jl);
		t= new Thread(this);
		t.start();		
		
	}
	@Override
	public void run() {
		try {
			Thread.sleep(7000);
			new Front_page();			
			dispose();
		} catch (Exception e) {
			System.out.println(e+" came");
		}
		
	}
}
