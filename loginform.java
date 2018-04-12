import java.io.*;
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import javax.swing.border.*;
import javax.sql.*;

class login extends JDialog implements ActionListener
{
	static login ob;
	static loadingform ld;
	
	Container cn;
	JLabel l1,l2,l3,l0,co1;
	static JTextField tx1;
	static JPasswordField pf;
	JButton b1,b2,b3;
	String s1,s2,str1,str2;
	JPanel jp1,jp2,jp3;
	static Color cl1,cl3,cl2,cl4;
	LineBorder lbr1;
	TitledBorder tbr1,tbr2,tbr3;
	BevelBorder bbr;
	
	public static void main(String a[])
	{
		ob=new login();
		ob.setSize(600,600);
		ob.setVisible(true);
		ob.setTitle("Login Form");
	}
		
	public login()
	{
		cl1=new Color(175,208,235);//jp2 pane
		cl2=new Color(202,213,208);//Background & line border
		cl3=new Color(71,147,209);//jp1 message
		Font ft1=new Font("Times New Roman",Font.BOLD,12);
		Font ft2=new Font("Times New Roman",Font.BOLD,14);
		Font ft=new Font("Times New Roman",Font.BOLD,20);
		ImageIcon mm=new ImageIcon("2.jpg");
		b3=new JButton(mm);
		cn=getContentPane();
		cn.setLayout(null);
	    cn.setBackground(cl2);
		
		bbr=new BevelBorder(BevelBorder.LOWERED);
		jp2=new JPanel();
		jp2.setLayout(null);
		jp2.setBackground(cl1);
		jp2.setBounds(0,0,600,100);
		jp2.setBorder(bbr);
		cn.add(jp2);
		
		co1=new JLabel("Welcome in Corporate Recruitment System");
		co1.setFont(ft);
		co1.setBounds(10,10,570,70);
		jp2.add(co1);
		
		jp1=new JPanel();
		jp1.setLayout(null);
		jp1.setBackground(cl3);
		jp1.setBounds(100,200,400,40);
		cn.add(jp1);
		
		lbr1=new LineBorder(cl2);
		tbr1=new TitledBorder(lbr1,"Message");
		jp1.setBorder(tbr1);
		
		l1=new JLabel("Enter User Name and Password to sign in.");
		l1.setFont(ft1);
		l2=new JLabel("User Name");
		l2.setFont(ft2);
		l3=new JLabel("Password");
		l3.setFont(ft2);
		tx1=new JTextField();
		pf=new JPasswordField(3);
		pf.setEchoChar('*');
		b1=new JButton("Sign in");
		b2=new JButton("Close");
		
		l1.setBounds(50,15,500,20);
		l2.setBounds(100,260,100,30);
		l3.setBounds(100,300,100,30);
		tx1.setBounds(210,260,100,30);
		pf.setBounds(210,300,100,30);
		b1.setBounds(230,350,75,20);
		b2.setBounds(320,350,70,20);
		b3.setBounds(20,380,500,200);
		jp1.add(l1);
		cn.add(l2);
		cn.add(l3);
		cn.add(tx1);
		cn.add(pf);
		cn.add(b1);
		cn.add(b2);
		//cn.add(b3);
		b1.addActionListener(this);
		b2.addActionListener(this);
		
		s1="corporate";
		s2="corporate";
	}
	public void actionPerformed(ActionEvent ae)
	{
		if(ae.getSource()==b1)
		{
			str1=tx1.getText();
			str1=str1.trim();
			str2=pf.getText();
			str2=str2.trim();
			if(str1.equalsIgnoreCase(s1)==true && str2.equalsIgnoreCase(s2)==true)
			{
				JOptionPane.showMessageDialog(null,"Congatrgulates ! you are an authorized person to use the application.","Authorized Entry",JOptionPane.INFORMATION_MESSAGE);
				ob.dispose();
				ld=new loadingform();
				ld.setSize(400,400);
				ld.setVisible(true);
				ld.setTitle("Loading Form");
			}
			else
			{
				int r=JOptionPane.showConfirmDialog(null,"You entered wrong user name or password.\n"+"Do you want to retry?","Unauthorized Entry",JOptionPane.YES_NO_OPTION,JOptionPane.QUESTION_MESSAGE);
				if(r==0)
				{
					tx1.setText("");
					pf.setText("");
					tx1.requestFocus();
				}
				else
					System.exit(0);
			}
				
		}
		if(ae.getSource()==b2)
		{
			JOptionPane.showMessageDialog(null,"You are exiting from your application","Warning",JOptionPane.WARNING_MESSAGE);
			System.exit(0);
		}
	}
}