import java.io.*;
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import javax.swing.border.*;
import java.sql.*;
import javax.swing.table.*;

class report extends JFrame implements ActionListener
{
	static report rp;
	Container cn;
	BevelBorder bbr1,bbr2;
	Font ft1,ft2,ft3;
	LineBorder lbr1;
	TitledBorder tbr1;
	CompoundBorder cm;
	Color cl1,cl2,cl3,cl4;
	JPanel up;
	JButton b1,b2,b3,b4,b5;
	JLabel lb1,lb2;
	JTextField tf1;
	JPanel p1;
	String arr[]=new String[14];
	
	JTable jt;
	DefaultTableModel dtm;
	JScrollPane sp;
	
	JComboBox cb1,cb2,cb3,cb4,cb5,cb6;
	JTextField t1,t2,t3,t4,t5,t6,t7,t8;
	JTextArea ta1,ta2;
	JRadioButton rd1,rd2,rd3,rd4,rd5;
	JCheckBox ch1,ch2,ch3,ch4;
	String strn1,strn2,strn3,strn4,strn5,strn6,strn7;
	
	report()
	{
		t1=new JTextField();
		t2=new JTextField();
		t3=new JTextField();
		t4=new JTextField();
		t5=new JTextField();
		t6=new JTextField();
		t7=new JTextField();
		rd4=new JRadioButton("Male");
		rd5=new JRadioButton("Female");
		rd4.setOpaque(false);
		rd5.setOpaque(false);
		rd1=new JRadioButton("Mr.");
		rd2=new JRadioButton("Mrs.");
		rd3=new JRadioButton("Ms.");
		rd1.setOpaque(false);
		rd2.setOpaque(false);
		rd3.setOpaque(false);
		cb1=new JComboBox();
		String str2[]={"Jan","Feb","Mar","Apr","May","Jun","Jul","Aug","Sep","Oct","Nov","Dec"};
		cb2=new JComboBox(str2);
		t8=new JTextField();
		ta1=new JTextArea();
		ta1.setBorder(bbr2);
		ta2=new JTextArea();
		String str3[]={"Science","Commerce","Art"};
		String str4[]={"Math","Biology","Commerce","Art","No"};
		String str5[]={"B.A.","B.Sc.","B.Com.","B.C.A.","B.B.A.","No"};
		String str6[]={"M.A.","M.Sc.","M.Com.","M.B.A","M.C.A","No"};
		ch1=new JCheckBox("Matric");
		cb3=new JComboBox(str3);
		ch2=new JCheckBox("InterMediate");
		cb4=new JComboBox(str4);
		ch3=new JCheckBox("Graduation");
		cb5=new JComboBox(str5);
		ch4=new JCheckBox("Post Graduation");
		cb6=new JComboBox(str6);
				
		cl1=new Color(188,220,234);//panel color
		cl2=new Color(71,147,209);//background & line color
		cl3=new Color(175,208,235);
		cl4=new Color(253,240,237);
		ft1=new Font("Times New Roman",Font.BOLD,14);
		ft2=new Font("Times New Roman",Font.BOLD,11);
		ft3=new Font("Times New Roman",Font.BOLD|Font.ITALIC,16);
		bbr1=new BevelBorder(BevelBorder.RAISED);
		bbr2=new BevelBorder(BevelBorder.LOWERED);
		lbr1=new LineBorder(cl2);
		tbr1=new TitledBorder(lbr1,"");
		cm=new CompoundBorder(bbr1,tbr1);
		
		cn=getContentPane();
		cn.setLayout(null);
		
		up=new JPanel();
		up.setLayout(null);
		up.setBounds(0,0,800,800);
		up.setBackground(cl2);
		cn.add(up);
		
		p1=new JPanel();
		p1.setLayout(null);
		p1.setBounds(40,100,320,60);
		p1.setBackground(cl1);
		p1.setBorder(cm);
		up.add(p1);
		
		lb1=new JLabel("      Enter Employee ID");
		lb1.setFont(ft1);
		lb2=new JLabel("Emp_ID");
		lb1.setFont(ft1);
		tf1=new JTextField();
		
		lb1.setBounds(100,50,200,20);
		lb2.setBounds(40,20,100,20);
		tf1.setBounds(150,20,100,20);
		
		String str[]={""};
		dtm=new DefaultTableModel(str,0);
		jt=new JTable(dtm);
		sp=new JScrollPane(jt,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
		sp.setVisible(true);
		sp.setBounds(40,190,720,450);
		up.add(sp);
	
		b1=new JButton("Search");
		b1.setMnemonic('h');
		b4=new JButton("Close");
		b4.setMnemonic('o');
		b5=new JButton("Show all");
		b5.setMnemonic('a');
		b1.setBounds(200,690,80,20);
		b4.setBounds(410,690,80,20);
		b5.setBounds(300,690,90,20);
		up.add(b1);
		up.add(b4);
		up.add(b5);
		p1.add(lb2);
		p1.add(tf1);
		up.add(lb1);
		
		b1.addActionListener(this);
		b4.addActionListener(this);
		b5.addActionListener(this);
	}
	public void actionPerformed(ActionEvent ae)
	{
		try
		{
			Class.forName("sun.jdbc.odbc.JdbcOdbcDriver");
			String s1="system";
			String s2="system";
			Connection con=DriverManager.getConnection("jdbc:odbc:c",s1,s2);
			Statement st=con.createStatement();
			
			String s=tf1.getText();
			int len=s.length();
			
			if(ae.getSource()==b4)
			{
				employee.rp.dispose();
			}
			
			if(ae.getSource()==b5)
			{
				if(len>0 && ae.getSource()==b5)
				{
					tf1.requestFocus();
					JOptionPane.showMessageDialog(null,"Invalid Action.","Warning Message",JOptionPane.INFORMATION_MESSAGE);
				}
				else
				{
					String str[]={"Emp_ID","Designation","ID_proof","ID_Ref","Name","Presence(days)","Salary"};
					dtm=new DefaultTableModel(str,0);
					jt=new JTable(dtm);
					sp=new JScrollPane(jt,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
					sp.setVisible(true);
					sp.setBounds(40,190,720,450);
					up.add(sp);
					
					ResultSet rs=st.executeQuery("select * from salary");
					while(rs.next()==true)
					{
						arr[0]=rs.getString(1);
						arr[1]=rs.getString(2);
						arr[2]=rs.getString(3);
						arr[3]=rs.getString(4);
						arr[4]=rs.getString(5);
						arr[5]=rs.getString(6);
						arr[6]=rs.getString(7);
						dtm.addRow(arr);
					}
					con.close();
				}	
			}
			if(ae.getSource()==b1)
			{
				int flag=1;
				ResultSet rs1=st.executeQuery("Select emp_id from salary");
				while(rs1.next()==true)
				{
					String ss1=rs1.getString(1);
					if(ss1.equals(s))
						flag=0;
				}
				
				if(flag==0)
				{
					String str[]={"Emp_ID","Designation","ID_proof","ID_Ref","Name","Presence(days)","Salary"};
					dtm=new DefaultTableModel(str,0);
					jt=new JTable(dtm);
					sp=new JScrollPane(jt,JScrollPane.VERTICAL_SCROLLBAR_AS_NEEDED,JScrollPane.HORIZONTAL_SCROLLBAR_AS_NEEDED);
					sp.setVisible(true);
					sp.setBounds(40,190,720,450);
					up.add(sp);
					
					//String ss=tf1.getText();
					ResultSet rs=st.executeQuery("select * from salary where emp_id='"+s+"'");
					while(rs.next()==true)
					{
						arr[0]=rs.getString(1);
						arr[1]=rs.getString(2);
						arr[2]=rs.getString(3);
						arr[3]=rs.getString(4);
						arr[4]=rs.getString(5);
						arr[5]=rs.getString(6);
						arr[6]=rs.getString(7);
						dtm.addRow(arr);
					}
					con.close();
				}
				else
				{
					tf1.requestFocus();
					JOptionPane.showMessageDialog(null,"ID doesn't exist.","Warning Message",JOptionPane.INFORMATION_MESSAGE);
				}
			}
			
		}
		catch(Exception e)
		{
			JOptionPane.showMessageDialog(null,e.getMessage(),"Warning Message",JOptionPane.INFORMATION_MESSAGE);
		}
	}
}