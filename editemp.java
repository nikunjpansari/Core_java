import java.io.*;
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import javax.swing.border.*;
import java.sql.*;
import javax.swing.table.*;

class editemp extends JFrame implements ActionListener
{
	static editemp em;
	Container cn;
	Color cl1,cl2,cl3;
	LineBorder lbr1;
	TitledBorder tbr1,tbr2,tbr3,tbr4,tbr5;
	CompoundBorder cm1,cm2,cm3,cm4,cm5;
	ButtonGroup bg1,bg2;
	String strn1,strn2,strn3,strn4,strn5,strn6,strn7;
	JPanel p;
	BevelBorder bbr1,bbr2;
	JPanel p1;
	
	JLabel lb1,lb2,lb3,lb4,lb5,lb6,lb7,lb8,lb9,lb10,lb11,lb12,lb13,lb14,lb15,lb16;
	JButton b1,b2,b3,b4,b5,b6,b7,b8,b9,b10;
	JPanel ep1,ep2,ep3,ep4;
	JComboBox cb1,cb2,cb3,cb4,cb5,cb6;
	JTextField t1,t2,t3,t4,t5,t6,t7,t8;
	JTextArea ta1,ta2;
	JRadioButton rd1,rd2,rd3,rd4,rd5;
	JCheckBox ch1,ch2,ch3,ch4;
	
	editemp()
	{
		cl3=new Color(175,208,235);
		
		cn=getContentPane();
		cn.setLayout(null);
		
		p=new JPanel();
		p.setLayout(null);
		p.setBackground(cl3);
		p.setBounds(0,0,1080,80);
		cn.add(p);
		
		cl1=new Color(188,220,234);//upper panel color
		cl2=new Color(71,147,209);//background panel & line color
		lbr1=new LineBorder(cl2,2);
		tbr1=new TitledBorder(lbr1,"Profesional Details");
		tbr2=new TitledBorder(lbr1,"Personal Details");
		tbr3=new TitledBorder(lbr1,"Qualificational Details");
		tbr4=new TitledBorder(lbr1,"Daily Details");
		tbr5=new TitledBorder(lbr1,"Warehouse Details");
		bbr1=new BevelBorder(BevelBorder.RAISED);
		bbr2=new BevelBorder(BevelBorder.LOWERED);
		cm1=new CompoundBorder(bbr1,tbr1);
		cm2=new CompoundBorder(bbr1,tbr2);
		cm3=new CompoundBorder(bbr1,tbr3);
		cm4=new CompoundBorder(bbr1,tbr4);
		cm5=new CompoundBorder(bbr1,tbr5);
		
		p1=new JPanel();
		p1.setLayout(null);
		p1.setBackground(cl2);
		p1.setBounds(0,80,1080,800);
		cn.add(p1);
		
		b1=new JButton("Show");
		b1.setMnemonic('w');
		b2=new JButton("Update");
		b2.setMnemonic('t');
		b3=new JButton("Reset");
		b3.setMnemonic('R');
		b4=new JButton("Close");
		b4.setMnemonic('o');
		b9=new JButton("OK");
		b9.setMnemonic('K');
		bg1=new ButtonGroup();
		bg2=new ButtonGroup();
		String str3[]={"Science","Commerce","Art"};
		String str4[]={"Math","Biology","Commerce","Art","No"};
		String str5[]={"B.A.","B.Sc.","B.Com.","B.C.A.","B.B.A.","No"};
		String str6[]={"M.A.","M.Sc.","M.Com.","M.B.A","M.C.A","No"};
		ep1=new JPanel();
		ep2=new JPanel();
		ep3=new JPanel();
		ep4=new JPanel();
		ep1.setLayout(null);
		ep2.setLayout(null);
		ep3.setLayout(null);
		ep4.setLayout(null);
		ep1.setBackground(cl1);
		ep2.setBackground(cl1);
		ep3.setBackground(cl1);
		ep4.setBackground(cl1);
		ep1.setBounds(40,40,500,100);
		ep2.setBounds(40,150,900,180);
		ep3.setBounds(40,340,900,120);
		ep4.setBounds(570,40,360,100);
		ep1.setBorder(cm1);
		ep2.setBorder(cm2);
		ep3.setBorder(cm3);
		ep4.setBorder(cm4);
		p1.add(ep1);
		p1.add(ep2);
		p1.add(ep3);
		p1.add(ep4);
		lb1=new JLabel("Emp_ID");
		t1=new JTextField();
		lb2=new JLabel("Designation");
		t2=new JTextField();
		lb3=new JLabel("ID Proof");
		t3=new JTextField();
		lb4=new JLabel("ID Reference");
		t4=new JTextField();
		lb5=new JLabel("Presence(Y/N)");
		t5=new JTextField();
		lb6=new JLabel("Date");
		t6=new JTextField();
		lb7=new JLabel("Name");
		t7=new JTextField();
		lb8=new JLabel("Gender");
		rd4=new JRadioButton("Male");
		rd5=new JRadioButton("Female");
		rd4.setOpaque(false);
		rd5.setOpaque(false);
		lb9=new JLabel("Salutation");
		rd1=new JRadioButton("Mr.");
		rd2=new JRadioButton("Mrs.");
		rd3=new JRadioButton("Ms.");
		rd1.setOpaque(false);
		rd2.setOpaque(false);
		rd3.setOpaque(false);
		lb10=new JLabel("Date of Birth");
		cb1=new JComboBox();
		int i;
		for(i=1;i<=31;i++)
		{
			String str1=" "+i;
			cb1.addItem(str1);
		}
		String str2[]={"Jan","Feb","Mar","Apr","May","Jun","Jul","Aug","Sep","Oct","Nov","Dec"};
		cb2=new JComboBox(str2);
		t8=new JTextField();
		lb11=new JLabel("Local Address");
		ta1=new JTextArea();
		ta1.setBorder(bbr2);
		lb12=new JLabel("Permanent Address");
		ta2=new JTextArea();
		ta2.setBorder(bbr2);
		ch1=new JCheckBox("Matric");
		ch1.setOpaque(false);
		cb3=new JComboBox(str3);
		cb3.setEnabled(false);
		ch2=new JCheckBox("InterMediate");
		ch2.setOpaque(false);
		cb4=new JComboBox(str4);
		cb4.setEnabled(false);
		ch3=new JCheckBox("Graduation");
		ch3.setOpaque(false);
		cb5=new JComboBox(str5);
		cb5.setEnabled(false);
		ch4=new JCheckBox("Post Graduation");
		ch4.setOpaque(false);
		cb6=new JComboBox(str6);
		cb6.setEnabled(false);
		
		lb2.setEnabled(false);
		lb3.setEnabled(false);
		lb4.setEnabled(false);
		lb5.setEnabled(false);
		lb6.setEnabled(false);
		lb7.setEnabled(false);
		lb8.setEnabled(false);
		lb9.setEnabled(false);
		lb10.setEnabled(false);
		lb11.setEnabled(false);
		lb12.setEnabled(false);
		t2.setEnabled(false);
		t3.setEnabled(false);
		t4.setEnabled(false);
		t5.setEnabled(false);
		t6.setEnabled(false);
		t7.setEnabled(false);
		t8.setEnabled(false);
		ta1.setEnabled(false);
		ta2.setEnabled(false);
		ch1.setEnabled(false);
		ch2.setEnabled(false);
		ch3.setEnabled(false);
		ch4.setEnabled(false);
		rd1.setEnabled(false);
		rd2.setEnabled(false);
		rd3.setEnabled(false);
		rd4.setEnabled(false);
		rd5.setEnabled(false);
		cb1.setEnabled(false);
		cb2.setEnabled(false);
		b9.setEnabled(false);
		b2.setEnabled(false);
		b3.setEnabled(false);
		
		lb1.setBounds(70,20,100,20);
		t1.setBounds(180,20,100,20);
		lb2.setBounds(300,20,100,20);
		t2.setBounds(410,20,80,20);
		lb3.setBounds(70,50,100,20);
		t3.setBounds(180,50,100,20);
		lb4.setBounds(300,50,100,20);
		t4.setBounds(410,50,80,20);
		
		lb6.setBounds(40,20,100,20);
		t6.setBounds(150,20,100,20);
		lb5.setBounds(40,60,100,20);
		t5.setBounds(150,60,100,20);
		b9.setBounds(260,60,60,20);
		
		lb8.setBounds(70,30,80,20);
		rd4.setBounds(150,30,70,20);
		rd5.setBounds(230,30,70,20);
		lb9.setBounds(440,30,80,20);
		rd1.setBounds(530,30,50,20);
		rd2.setBounds(580,30,50,20);
		rd3.setBounds(630,30,50,20);
		lb7.setBounds(70,70,80,20);
		t7.setBounds(160,70,150,20);
		lb10.setBounds(440,70,80,20);
		cb1.setBounds(535,70,50,20);
		cb2.setBounds(590,70,50,20);
		t8.setBounds(650,70,70,20);
		lb11.setBounds(70,110,100,20);
		ta1.setBounds(160,110,150,40);
		lb12.setBounds(440,110,150,20);
		ta2.setBounds(570,110,150,40);
		
		ch1.setBounds(70,30,150,20);
		cb3.setBounds(230,30,100,20);
		ch2.setBounds(440,30,150,20);
		cb4.setBounds(600,30,100,20);
		ch3.setBounds(70,70,150,20);
		cb5.setBounds(230,70,100,20);
		ch4.setBounds(440,70,150,20);
		cb6.setBounds(600,70,100,20);
		
		b1.setBounds(500,500,80,20);
		b2.setBounds(600,500,80,20);
		b3.setBounds(700,500,80,20);
		b4.setBounds(800,500,80,20);
		
		p1.add(b1);
		p1.add(b2);
		p1.add(b3);
		p1.add(b4);
		ep4.add(b9);
		bg1.add(rd4);
		bg1.add(rd5);
		bg2.add(rd1);
		bg2.add(rd2);
		bg2.add(rd3);
		ep1.add(lb1);
		ep1.add(t1);
		ep4.add(lb6);
		ep4.add(t6);
		ep4.add(lb5);
		ep4.add(t5);
		ep1.add(lb2);
		ep1.add(t2);
		ep1.add(lb3);
		ep1.add(t3);
		ep1.add(lb4);
		ep1.add(t4);
		ep2.add(lb8);
		ep2.add(rd4);
		ep2.add(rd5);
		ep2.add(lb9);
		ep2.add(rd1);
		ep2.add(rd2);
		ep2.add(rd3);
		ep2.add(lb7);
		ep2.add(t7);
		ep2.add(lb10);
		ep2.add(cb1);
		ep2.add(cb2);
		ep2.add(t8);
		ep2.add(lb11);
		ep2.add(ta1);
		ep2.add(lb12);
		ep2.add(ta2);
		ep3.add(ch1);
		ep3.add(ch1);
		ep3.add(cb3);
		ep3.add(ch2);
		ep3.add(cb4);
		ep3.add(ch3);
		ep3.add(cb5);
		ep3.add(ch4);
		ep3.add(cb6);
		
		b1.addActionListener(this);
		b2.addActionListener(this);
		b3.addActionListener(this);
		b4.addActionListener(this);
	}
	public void actionPerformed(ActionEvent ae)
	{
		try
		{
			if(ae.getSource()==b4)
			{
				employee.d.dispose();
			}
			
			if(ae.getSource()==b1)
			{
				Class.forName("sun.jdbc.odbc.JdbcOdbcDriver");
				String s1="system";
				String s2="system";
				Connection con=DriverManager.getConnection("jdbc:odbc:c",s1,s2);
				Statement st=con.createStatement();
			
				String s=t1.getText();
				int flag=1;
				ResultSet rs1=st.executeQuery("Select emp_id from emp");
				while(rs1.next()==true)
				{
					String ss1=rs1.getString(1);
					if(ss1.equals(s))
						flag=0;
				}
				int len=s.length();
				if(flag==0)
				{
					lb2.setEnabled(true);
					lb3.setEnabled(true);
					lb4.setEnabled(true);
					lb7.setEnabled(true);
					lb8.setEnabled(true);
					lb9.setEnabled(true);
					lb10.setEnabled(true);
					lb11.setEnabled(true);
					lb12.setEnabled(true);
					t2.setEnabled(true);
					t3.setEnabled(true);
					t4.setEnabled(true);
					t7.setEnabled(true);
					t8.setEnabled(true);
					ta1.setEnabled(true);
					ta2.setEnabled(true);
					ch1.setEnabled(true);
					ch2.setEnabled(true);
					ch3.setEnabled(true);
					ch4.setEnabled(true);
					rd1.setEnabled(true);
					rd2.setEnabled(true);
					rd3.setEnabled(true);
					rd4.setEnabled(true);
					rd5.setEnabled(true);
					cb1.setEnabled(true);
					cb2.setEnabled(true);
					cb3.setEnabled(true);
					cb4.setEnabled(true);
					cb5.setEnabled(true);
					cb6.setEnabled(true);
					cb1.setSelectedIndex(0);
					cb2.setSelectedIndex(0);
					cb3.setSelectedIndex(0);
					cb4.setSelectedIndex(0);
					cb5.setSelectedIndex(0);
					cb6.setSelectedIndex(0);
					b2.setEnabled(true);
					b3.setEnabled(true);
				}
				else
				{
					t1.requestFocus();
					JOptionPane.showMessageDialog(null,"ID doesn't exist.","Warning Message",JOptionPane.INFORMATION_MESSAGE);
				}
					
		
				ResultSet rs=st.executeQuery("select * from emp where emp_id='"+s+"'");
				while(rs.next()==true)
				{				
					t1.setText(rs.getString(1));
					t2.setText(rs.getString(2));
					t3.setText(rs.getString(3));
					t4.setText(rs.getString(4));
					String srd=rs.getString(5);
					if((rd4.getText()).equals(srd))
						rd4.setSelected(true);
					else
						rd5.setSelected(true);
					
					String sal=rs.getString(6);	
					if((rd1.getText()).equals(sal))
						rd1.setSelected(true);
					else if(rd2.getText().equals(sal))
						rd2.setSelected(true);
					else
						rd3.setSelected(true);
					t7.setText(rs.getString(7));	
					String dob[]=rs.getString(8).split("/");
					cb1.setSelectedItem(dob[0]);
					cb2.setSelectedItem(dob[1]);
					t8.setText(dob[2]);
					
					ta1.setText(rs.getString(9));
					ta2.setText(rs.getString(10));
					ch1.setSelected(true);
					ch2.setSelected(true);
					ch3.setSelected(true);
					ch4.setSelected(true);
					cb3.setSelectedItem(rs.getString(11));
					cb4.setSelectedItem(rs.getString(12));
					cb5.setSelectedItem(rs.getString(13));
					cb6.setSelectedItem(rs.getString(14));
				}
				con.close();
			}
			
			if(ae.getSource()==b2)
			{
					Class.forName("sun.jdbc.odbc.JdbcOdbcDriver");
				String s1="system";
				String s2="system";
				Connection con=DriverManager.getConnection("jdbc:odbc:c",s1,s2);
				Statement st=con.createStatement();
				
				if(rd4.isSelected()==true)
					strn1=rd4.getText();
				else
					strn1=rd5.getText();
				
				if(rd1.isSelected()==true)
					strn2=rd1.getText();
				else if(rd2.isSelected()==true)
					strn2=rd2.getText();
				else
					strn2=rd3.getText();
				
				strn3=""+cb1.getSelectedItem()+"/"+cb2.getSelectedItem()+"/"+t8.getText();
				strn4=""+cb3.getSelectedItem();
				strn5=""+cb4.getSelectedItem();
				strn6=""+cb5.getSelectedItem();
				strn7=""+cb6.getSelectedItem();
				
				String str1=t1.getText();
				st.executeUpdate("update emp set emp_id='"+t1.getText()+"',designation='"+t2.getText()+"',id_proof='"+t3.getText()+"',id_ref='"+t4.getText()+"',gender='"+strn1+"',salutation='"+strn2+"',name='"+t7.getText()+"',dob='"+strn3+"',l_add='"+ta1.getText()+"',p_add='"+ta2.getText()+"',matric='"+strn4+"',intermediate='"+strn5+"',grad='"+strn6+"',p_grad='"+strn7+"' where emp_id='"+str1+"'");
				con.close();
				
				t1.setText("");
				t2.setText("");
				t3.setText("");
				t4.setText("");
				t5.setText("");
				t6.setText("");
				t7.setText("");
				t8.setText("");
				ta1.setText("");
				ta2.setText("");
				cb1.setSelectedIndex(0);
				cb2.setSelectedIndex(0);
				cb3.setSelectedIndex(0);
				cb4.setSelectedIndex(0);
				cb5.setSelectedIndex(0);
				cb6.setSelectedIndex(0);
				t1.requestFocus();
				ch1.setSelected(false);
				ch2.setSelected(false);
				ch3.setSelected(false);
				ch4.setSelected(false);
				
				if(ch1.isSelected()==true)
					cb3.setEnabled(true);
				else
					cb3.setEnabled(false);
			
				if(ch2.isSelected()==true)
					cb4.setEnabled(true);
				else
					cb4.setEnabled(false);
				
				if(ch3.isSelected()==true)
					cb5.setEnabled(true);
				else
					cb5.setEnabled(false);
			
				if(ch4.isSelected()==true)
					cb6.setEnabled(true);
				else
					cb6.setEnabled(false);
				
				lb2.setEnabled(false);
				lb3.setEnabled(false);
				lb4.setEnabled(false);
				lb5.setEnabled(false);
				lb6.setEnabled(false);
				lb7.setEnabled(false);
				lb8.setEnabled(false);
				lb9.setEnabled(false);
				lb10.setEnabled(false);
				lb11.setEnabled(false);
				lb12.setEnabled(false);
				t2.setEnabled(false);
				t3.setEnabled(false);
				t4.setEnabled(false);
				t5.setEnabled(false);
				t6.setEnabled(false);
				t7.setEnabled(false);
				t8.setEnabled(false);
				ta1.setEnabled(false);
				ta2.setEnabled(false);
				ch1.setEnabled(false);
				ch2.setEnabled(false);
				ch3.setEnabled(false);
				ch4.setEnabled(false);
				rd1.setEnabled(false);
				rd2.setEnabled(false);
				rd3.setEnabled(false);
				rd4.setEnabled(false);
				rd5.setEnabled(false);
				cb1.setEnabled(false);
				cb2.setEnabled(false);
				b9.setEnabled(false);
				b2.setEnabled(false);
				b3.setEnabled(false);
			}
	
			if(ae.getSource()==b3)
			{
				t1.setText("");
				t2.setText("");
				t3.setText("");
				t4.setText("");
				t5.setText("");
				t6.setText("");
				t7.setText("");
				t8.setText("");
				ta1.setText("");
				ta2.setText("");
				cb1.setSelectedIndex(0);
				cb2.setSelectedIndex(0);
				cb3.setSelectedIndex(0);
				cb4.setSelectedIndex(0);
				cb5.setSelectedIndex(0);
				cb6.setSelectedIndex(0);
				t1.requestFocus();
				ch1.setSelected(false);
				ch2.setSelected(false);
				ch3.setSelected(false);
				ch4.setSelected(false);
				
				if(ch1.isSelected()==true)
					cb3.setEnabled(true);
				else
					cb3.setEnabled(false);
			
				if(ch2.isSelected()==true)
					cb4.setEnabled(true);
				else
					cb4.setEnabled(false);
				
				if(ch3.isSelected()==true)
					cb5.setEnabled(true);
				else
					cb5.setEnabled(false);
			
				if(ch4.isSelected()==true)
					cb6.setEnabled(true);
				else
					cb6.setEnabled(false);
					
				lb2.setEnabled(false);
				lb3.setEnabled(false);
				lb4.setEnabled(false);
				lb5.setEnabled(false);
				lb6.setEnabled(false);
				lb7.setEnabled(false);
				lb8.setEnabled(false);
				lb9.setEnabled(false);
				lb10.setEnabled(false);
				lb11.setEnabled(false);
				lb12.setEnabled(false);
				t2.setEnabled(false);
				t3.setEnabled(false);
				t4.setEnabled(false);
				t5.setEnabled(false);
				t6.setEnabled(false);
				t7.setEnabled(false);
				t8.setEnabled(false);
				ta1.setEnabled(false);
				ta2.setEnabled(false);
				ch1.setEnabled(false);
				ch2.setEnabled(false);
				ch3.setEnabled(false);
				ch4.setEnabled(false);
				rd1.setEnabled(false);
				rd2.setEnabled(false);
				rd3.setEnabled(false);
				rd4.setEnabled(false);
				rd5.setEnabled(false);
				cb1.setEnabled(false);
				cb2.setEnabled(false);
				b9.setEnabled(false);
				b2.setEnabled(false);
				b3.setEnabled(false);
							
			}
		}
		catch(Exception e)
		{
			JOptionPane.showMessageDialog(null,e.getMessage(),"Warning Message",JOptionPane.INFORMATION_MESSAGE);
		}			
	}
}