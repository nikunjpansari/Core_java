import java.io.*;
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import javax.swing.border.*;
import java.sql.*;
import javax.swing.table.*;

public class edit extends JFrame implements ActionListener
{
	static edit jf;
	Container cn;
	Color cl1,cl2,cl3,cl4;
	JLabel lb1,lb2,lb3,lb4,lb5,lb6,lb7,lb8,lb9,lb10,lb11;
	JTextField tf1,tf2,tf3,tf4,tf5,tf6,tf7,tf8,tf9,tf10,tf11;
	JPanel p51,p52,p53;
	TitledBorder tbr4,tbr5,tbr6;
	JButton b45,b55,b65;
	JPanel up;
	BevelBorder bbr1,bbr2;
	CompoundBorder cbr4,cbr5,cbr6;
	Font ft1,ft2,ft3;
	LineBorder lbr1;
	
	public edit()
	{
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
		tbr4=new TitledBorder(lbr1,"Distributor Details");
		tbr5=new TitledBorder(lbr1,"");
		tbr6=new TitledBorder(lbr1,"CAF Recieving Details");
		cbr4=new CompoundBorder(bbr1,tbr4);
		cbr5=new CompoundBorder(bbr1,tbr5);
		cbr6=new CompoundBorder(bbr1,tbr6);
		
		cn=getContentPane();
		cn.setLayout(null);
		
		up=new JPanel();
		up.setLayout(null);
		up.setBounds(0,0,800,800);
		up.setBackground(cl2);
		cn.add(up);
		
		p51=new JPanel();
		p52=new JPanel();
		p53=new JPanel();
		p51.setLayout(null);
		p52.setLayout(null);
		p53.setLayout(null);
		p51.setBackground(cl1);
		p52.setBackground(cl1);
		p53.setBackground(cl1);
		p51.setBorder(cbr4);
		p52.setBorder(cbr5);
		p53.setBorder(cbr6);
		lb1=new JLabel("Dis_Code");
		lb1.setFont(ft1);
		lb2=new JLabel("Dis_Nmae");
		lb2.setFont(ft1);
		lb2.setEnabled(false);
		lb3=new JLabel("Dis_Address");
		lb3.setFont(ft1);
		lb3.setEnabled(false);
		lb4=new JLabel("Location");
		lb4.setFont(ft1);
		lb4.setEnabled(false);
		lb5=new JLabel("Dis_Contact_No");
		lb5.setFont(ft1);
		lb5.setEnabled(false);
		lb6=new JLabel("FOS_Name");
		lb6.setFont(ft1);
		lb6.setEnabled(false);
		lb7=new JLabel("Current_Date");
		lb7.setFont(ft1);
		lb7.setEnabled(false);
		lb8=new JLabel("Send_Date");
		lb8.setFont(ft1);
		lb8.setEnabled(false);
		lb9=new JLabel("Send_CAF_Count");
		lb9.setFont(ft1);
		lb9.setEnabled(false);
		lb10=new JLabel("Recieved_Date");
		lb10.setFont(ft1);
		lb10.setEnabled(false);
		lb11=new JLabel("Recieved_CAF_Count");
		lb11.setFont(ft1);
		lb11.setEnabled(false);
		tf1=new JTextField();
		tf2=new JTextField();
		tf2.setEnabled(false);
		tf3=new JTextField();
		tf3.setEnabled(false);
		tf4=new JTextField();
		tf4.setEnabled(false);
		tf5=new JTextField();
		tf5.setEnabled(false);
		tf6=new JTextField();
		tf6.setEnabled(false);
		tf7=new JTextField();
		tf7.setEnabled(false);
		tf8=new JTextField();
		tf8.setEnabled(false);
		tf9=new JTextField();
		tf9.setEnabled(false);
		tf10=new JTextField();
		tf10.setEnabled(false);
		tf11=new JTextField();
		tf11.setEnabled(false);
		b45=new JButton("Close");
		b45.setMnemonic('o');
		b55=new JButton("Show");
		b55.setMnemonic('w');
		b65=new JButton("Update");
		b65.setMnemonic('d');
		b65.setEnabled(false);
	
		//b55.setBounds(100,500,70,20);
		b55.setBounds(250,500,80,20);
		b65.setBounds(350,500,90,20);
		b45.setBounds(460,500,70,20);
		p51.setBounds(40,40,740,160);
		p52.setBounds(40,220,740,60);
		p53.setBounds(40,300,740,160);
		lb1.setBounds(100,30,100,20);
		tf1.setBounds(210,30,150,20);
		lb2.setBounds(450,30,100,20);
		tf2.setBounds(560,30,100,20);//EO 1st line
		lb3.setBounds(100,70,100,20);
		tf3.setBounds(210,70,150,20);
		lb4.setBounds(450,70,100,20);
		tf4.setBounds(560,70,100,20);//EO 2nd line
		lb5.setBounds(100,110,100,20);
		tf5.setBounds(210,110,150,20);
		
		lb6.setBounds(100,20,100,20);
		tf6.setBounds(210,20,150,20);
		
		lb7.setBounds(100,30,100,20);
		tf7.setBounds(210,30,150,20);//EO 1st line
		lb8.setBounds(100,70,100,20);
		tf8.setBounds(210,70,150,20);
		lb9.setBounds(450,70,150,20);
		tf9.setBounds(610,70,100,20);//EO 2nd line
		lb10.setBounds(100,110,100,20);
		tf10.setBounds(210,110,150,20);
		lb11.setBounds(450,110,150,20);
		tf11.setBounds(610,110,100,20);//EO 3rd line
		
		
		up.add(p51);
		up.add(p52);
		up.add(p53);
		p51.add(lb1);
		p51.add(tf1);
		p51.add(tf2);
		p51.add(lb2);
		p51.add(lb3);
		p51.add(lb4);
		p51.add(lb5);
		p51.add(tf3);
		p51.add(tf4);
		p51.add(tf5);
		p52.add(lb6);
		p52.add(tf6);
		p53.add(lb7);
		p53.add(lb8);
		p53.add(lb9);
		p53.add(lb10);
		p53.add(lb11);
		p53.add(tf7);
		p53.add(tf8);
		p53.add(tf9);
		p53.add(tf10);
		p53.add(tf11);
		up.add(b45);
		up.add(b55);
		up.add(b65);
		
		b45.addActionListener(this);
		b55.addActionListener(this);
		b65.addActionListener(this);
	}
	public void actionPerformed(ActionEvent ae)
	{
		try
		{
			if(ae.getSource()==b45)
			{
				mainform.jf.dispose();
			}
			if(ae.getSource()==b55)
			{
				Class.forName("sun.jdbc.odbc.JdbcOdbcDriver");
				String s1="system";
				String s2="system";
				Connection con=DriverManager.getConnection("jdbc:odbc:c",s1,s2);
				Statement st=con.createStatement();
				String s=tf1.getText();
				int flag=1;
				ResultSet rs=st.executeQuery("Select dis_code from dis");
				while(rs.next()==true)
				{
					String ss1=rs.getString(1);
					if(ss1.equals(s))
						flag=0;
				}
				int len=s.length();
				if(flag==0)
				{
					lb2.setEnabled(true);
					lb3.setEnabled(true);
					lb4.setEnabled(true);
					lb5.setEnabled(true);
					lb6.setEnabled(true);
					lb7.setEnabled(true);
					lb8.setEnabled(true);
					lb9.setEnabled(true);
					lb10.setEnabled(true);
					lb11.setEnabled(true);
					tf11.setEnabled(true);
					tf2.setEnabled(true);
					tf3.setEnabled(true);
					tf4.setEnabled(true);
					tf5.setEnabled(true);
					tf6.setEnabled(true);
					tf7.setEnabled(true);
					tf8.setEnabled(true);
					tf9.setEnabled(true);
					tf10.setEnabled(true);
					tf2.requestFocus();
					b65.setEnabled(true);
				}
				else
				{
					tf1.requestFocus();
					JOptionPane.showMessageDialog(null,"ID doesn't exist.","Warning Message",JOptionPane.INFORMATION_MESSAGE);
				}
				
				ResultSet rs1=st.executeQuery("select * from dis where dis_code='"+tf1.getText()+"'");
				while(rs1.next()==true)
				{
					tf1.setText(rs1.getString(1));
					tf2.setText(rs1.getString(2));
					tf3.setText(rs1.getString(3));
					tf4.setText(rs1.getString(4));
					tf5.setText(rs1.getString(5));
					tf6.setText(rs1.getString(6));
					tf7.setText(rs1.getString(7));
					tf8.setText(rs1.getString(8));
					tf9.setText(rs1.getString(9));
					tf10.setText(rs1.getString(10));
					tf11.setText(rs1.getString(11));
				}
				con.close();
			}

			if(ae.getSource()==b65)
			{
				Class.forName("sun.jdbc.odbc.JdbcOdbcDriver");
				String s1="system";
				String s2="system";
				Connection con=DriverManager.getConnection("jdbc:odbc:c",s1,s2);
				Statement st=con.createStatement();
				
				st.executeQuery("update dis set dis_code='"+tf1.getText()+"',dis_name='"+tf2.getText()+"',dis_address='"+tf3.getText()+"',location='"+tf4.getText()+"',contact_no='"+tf5.getText()+"',fos_name='"+tf6.getText()+"',current_date='"+tf7.getText()+"',send_date='"+tf8.getText()+"',send_caf_count='"+tf9.getText()+"',rec_date='"+tf10.getText()+"',rec_caf_count='"+tf11.getText()+"' where dis_code='"+tf1.getText()+"'");
				con.close();
				
				tf1.setText("");
				tf2.setText("");
				tf3.setText("");
				tf4.setText("");
				tf5.setText("");
				tf6.setText("");
				tf7.setText("");
				tf8.setText("");
				tf9.setText("");
				tf10.setText("");
				tf11.setText("");
				tf1.requestFocus();
			}
		}
		catch(Exception e)
		{
			JOptionPane.showMessageDialog(null,e.getMessage(),"Warning Message",JOptionPane.INFORMATION_MESSAGE);
		}
	}
}