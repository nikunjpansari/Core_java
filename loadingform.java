import java.io.*;
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import javax.swing.border.*;
import javax.sql.*;

public class loadingform extends JDialog
{
	static loadingform ld;
	static mainform mf;
	
	Container cn;
	static JProgressBar pb;
	static JLabel lb,l1,l2;
	JPanel jp;
	Color cl1,cl2,cl3;
	BevelBorder bb,bbr;
	
	public loadingform()
	{
		cl1=new Color(175,208,235);
		cl2=new Color(232,243,248);
		cl3=new Color(202,208,180);//progress bar color
		
		cn=getContentPane();
		cn.setLayout(null);
		cn.setBackground(cl2);
		
		bb=new BevelBorder(BevelBorder.LOWERED);
		bbr=new BevelBorder(BevelBorder.RAISED);
		jp=new JPanel();
		jp.setLayout(null);
		jp.setBounds(0,0,500,50);
		jp.setVisible(true);
		jp.setBorder(bb);
		//cn.add(jp);
		
		ImageIcon mm=new ImageIcon("2.jpg");
		JButton rb=new JButton(mm);
		rb.setBounds(10,150,350,300);
		//cn.add(rb);
		lb=new JLabel("Work in Progress..........");
		lb.setBounds(30,120,210,20);
		lb.setBorder(bb);
		cn.add(lb);
		pb=new JProgressBar(JProgressBar.HORIZONTAL,0,100);
		pb.setLayout(null);
		pb.setBounds(30,150,300,20);
		pb.setForeground(cl3);
		pb.setBorder(bbr);
		cn.add(pb);
		l2=new JLabel();
		l2.setBounds(200,120,50,20);
	//	cn.add(l2);
		
		thread th=new thread();
		th.start();
	}
	
	class thread extends Thread
	{
		public void run()
		{
				int i,j;
				for(i=0;i<=100;i++)
				{
					pb.setValue(i);
					for(j=0;j<=100;j++)
					{
						l2.setText(i+"."+j+"%");	
						try
						{
					    	sleep(1);
						}
						catch(Exception e)
						{
							System.out.print(e.getMessage());
						}
					}		
				}
				if(i==101)
				{
					login.ld.dispose();
					mainform mf=new mainform();
					mf.setSize(1080,900);
					mf.setVisible(true);
					mf.setTitle("Corporate Recruitment System");
				}
		}
	}
}
