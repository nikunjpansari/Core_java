import java.awt.*;
import javax.swing.*;
import javax.swing.border.*;
import java.io.*;

class frame extends JFrame
{
	Container cn;
	Color cl1,cl2,cl3;
	JPanel p1,p2,p3;
	EtchedBorder ebr1;
	BevelBorder bbr1;
	LineBorder lbr1,lbr2;
	TitledBorder tbr1,tbr2,tbr3;
	JLabel lb1,lb2,lb3,lb4,lb5,lb6,lb7;
	JTextField tf1,tf2,tf3,tf4,tf5,tf6,tf7;
	JButton btn1,btn2;
	
	public static void main(String args[])	
	{
		frame nw=new frame();
	}
	
	public frame()
	{
		cl1=new Color(211,226,211);
		cl2=new Color(166,210,155);
		cl3=new Color(185,210,175);
				
		cn=getContentPane();
		cn.setLayout(null);
		cn.setBackground(cl3);
		setVisible(true);
		setSize(500,400);
		setTitle("Sanju Gupta");
				
		p1=new JPanel();
		p1.setLayout(null);
		p1.setBackground(cl1);
		p1.setBounds(20,20,450,300);
		p1.setVisible(true);
		cn.add(p1);
		
		
		/*ebr1=new EtchedBorder(EtchedBorder.RAISED);
		p1.setBorder(ebr1);
		
		bbr1=new BevelBorder(BevelBorder.RAISED);
		p1.setBorder(bbr1);*/
		
		lbr1=new LineBorder(cl2);
		lbr2=new LineBorder(cl3);
				
		tbr1=new TitledBorder(lbr1,"Personal Information");
		p1.setBorder(tbr1);
					
		
		lb1=new JLabel("Enter your name:-");
		lb2=new JLabel("Enter your father's name:-");
		lb3=new JLabel("Enter your mother's name:-");
		lb4=new JLabel("Enter your age:-");
		lb5=new JLabel("Enter your religion:-");
		lb6=new JLabel("Enter your phone number:-");
		lb7=new JLabel("Enter your address:-");
		
		lb1.setBounds(10,30,160,25);
		lb2.setBounds(10,65,160,25);
		lb3.setBounds(10,100,160,25);
		lb4.setBounds(10,135,160,25);
		lb5.setBounds(10,170,160,25);
		lb6.setBounds(10,205,160,25);
		lb7.setBounds(10,240,160,25);
		
		lb1.setBorder(lbr2);
		lb2.setBorder(lbr2);
		lb3.setBorder(lbr2);
		lb4.setBorder(lbr2);
		lb5.setBorder(lbr2);
		lb6.setBorder(lbr2);
		lb7.setBorder(lbr2);
		
		p1.add(lb1);
		p1.add(lb2);
		p1.add(lb3);
		p1.add(lb4);
		p1.add(lb5);
		p1.add(lb6);
		p1.add(lb7);
		
		
		tf1=new JTextField();
		tf2=new JTextField();
		tf3=new JTextField();
		tf4=new JTextField();
		tf5=new JTextField();
		tf6=new JTextField();
		tf7=new JTextField();
		
		tf1.setBounds(180,30,255,25);
		tf2.setBounds(180,65,255,25);
		tf3.setBounds(180,100,255,25);
		tf4.setBounds(180,135,255,25);
		tf5.setBounds(180,170,255,25);
		tf6.setBounds(180,205,255,25);
		tf7.setBounds(180,240,255,25);
		
			
		p1.add(tf1);
		p1.add(tf2);
		p1.add(tf3);
		p1.add(tf4);
		p1.add(tf5);
		p1.add(tf6);
		p1.add(tf7);
		
		
		p2=new JPanel();
		p2.setLayout(null);
		p2.setBackground(cl1);
		p2.setBounds(20,350,450,300);
		p2.setVisible(true);
		cn.add(p2);
		
		
		tbr1=new TitledBorder(lbr1,"Educational Qualification");
		p2.setBorder(tbr1);
					
		
		lb1=new JLabel("Enter your name:-");
		lb2=new JLabel("High School:-");
		lb3=new JLabel("Intermediate:-");
		lb4=new JLabel("Graduation:-");
		lb5=new JLabel("Post Graduation:-");
		lb6=new JLabel("Experience:-");
		lb7=new JLabel("Salary:-");
		
		lb1.setBounds(10,30,160,25);
		lb2.setBounds(10,65,160,25);
		lb3.setBounds(10,100,160,25);
		lb4.setBounds(10,135,160,25);
		lb5.setBounds(10,170,160,25);
		lb6.setBounds(10,205,160,25);
		lb7.setBounds(10,240,160,25);
		
		lb1.setBorder(lbr2);
		lb2.setBorder(lbr2);
		lb3.setBorder(lbr2);
		lb4.setBorder(lbr2);
		lb5.setBorder(lbr2);
		lb6.setBorder(lbr2);
		lb7.setBorder(lbr2);
		
		p2.add(lb1);
		p2.add(lb2);
		p2.add(lb3);
		p2.add(lb4);
		p2.add(lb5);
		p2.add(lb6);
		p2.add(lb7);
		
		
		tf1=new JTextField();
		tf2=new JTextField();
		tf3=new JTextField();
		tf4=new JTextField();
		tf5=new JTextField();
		tf6=new JTextField();
		tf7=new JTextField();
		
		tf1.setBounds(180,30,255,25);
		tf2.setBounds(180,65,255,25);
		tf3.setBounds(180,100,255,25);
		tf4.setBounds(180,135,255,25);
		tf5.setBounds(180,170,255,25);
		tf6.setBounds(180,205,255,25);
		tf7.setBounds(180,240,255,25);
		
			
		p2.add(tf1);
		p2.add(tf2);
		p2.add(tf3);
		p2.add(tf4);
		p2.add(tf5);
		p2.add(tf6);
		p2.add(tf7);
		
		
	}
}