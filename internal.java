import java.io.*;
import java.awt.*;
import javax.swing.*;
import java.awt.event.*;

class internal extends JFrame implements ActionListener
{
	
	public static void main(String a[])
	{
		internal ob=new internal();
		ob.setSize(300,300);
		ob.setVisible(true);
		ob.setTitle("Frame");
	
	}
	JDesktopPane dp;
	Container cn;
	JTextField t1;
	JButton b1,b2;
	JLabel l1,l2;
	JPasswordField p1;
	{
		dp=new JDesktopPane();
		setContentPane(dp);
		dp.setLayout(null);
		
		l1=new JLabel("User");
		l1.setBounds(10,50,80,30);
		dp.add(l1);
		
		l2=new JLabel("Password");
		l2.setBounds(10,100,100,30);
		dp.add(l2);
		
		t1=new JTextField();
		t1.setBounds(150,50,100,30);
		dp.add(t1);
		
		p1=new JPasswordField();
		p1.setBounds(150,100,100,30);
		p1.setEchoChar('*');
		dp.add(p1);
				
		b1=new JButton("Login");
		b1.setBounds(55,190,70,30);
		dp.add(b1);
		b1.addActionListener(this);
		
		b2=new JButton("Exit");
		b2.setBounds(145,190,70,30);	
		dp.add(b2);
		b2.addActionListener(this);
	}
	public void actionPerformed(ActionEvent ae)
	{
		if(ae.getSource()==b1)
		{
				//ob.setVisible(false);
				pbar pb=new pbar(dp);
					
				
		}
		if(ae.getSource()==b2)
		{
			System.exit(0);
		}
	
		
	}
	
}
class pbar extends internal
{
	JProgressBar p;	
	JInternalFrame frm;
		
	public pbar(JDesktopPane dp)
	{
		
		frm=new JInternalFrame("",true,true,true,true);
		frm.setSize(300,200);
		frm.setOpaque(true);
		//frm.setBounds(300,0,300,300);
		frm.setVisible(true);
		
		Container cn=frm.getContentPane();
		cn.setLayout(null);
		dp.add(frm);
		
		p=new JProgressBar(JProgressBar.HORIZONTAL,0,10);
		p.setBounds(10,100,150,20);
		p.setForeground(Color.GREEN);
		cn.add(p);
		
		progress th=new progress();
        th.start();	
			
	}
	
	class progress extends Thread
	{
		int i;
		public void run()
		{						
			for(i=0;i<=10;i++)
			{
				p.setValue(i);
				try
				{
					sleep(100);					
				}
				catch(Exception ex)
				{
					System.out.print("ERROR");
				}
			}
			if(i==11)
			{
				//frm.setVisible(false);
					
			}
			
		}
		
	}
}
