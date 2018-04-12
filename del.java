import java.io.*;
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import javax.swing.border.*;
import java.sql.*;
import javax.swing.table.*;

public class del extends JDialog implements ActionListener
{
	static del d;
	Container cn;
	JButton b45,b65;
	JLabel lb1,lb2;
	JTextField tf1;
	JPanel up;
	BevelBorder bbr1,bbr2;
	Font ft1,ft2,ft3;
	LineBorder lbr1;
	JPanel p1;
	TitledBorder tbr1;
	CompoundBorder cm;
	Color cl1,cl2,cl3,cl4;
	
	del()
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
		tbr1=new TitledBorder(lbr1,"");
		cm=new CompoundBorder(bbr1,tbr1);
		
		cn=getContentPane();
		cn.setLayout(null);
		
		up=new JPanel();
		up.setLayout(null);
		up.setBounds(0,0,400,400);
		up.setBackground(cl2);
		cn.add(up);
		
		
		p1=new JPanel();
		p1.setLayout(null);
		p1.setBounds(40,100,320,60);
		p1.setBackground(cl1);
		p1.setBorder(cm);
		up.add(p1);
		
		lb1=new JLabel("Enter Distributor/Dealer Code");
		lb1.setFont(ft1);
		lb2=new JLabel("Dis_Code");
		lb1.setFont(ft1);
		tf1=new JTextField();
		
		lb1.setBounds(100,50,200,20);
		lb2.setBounds(40,20,100,20);
		tf1.setBounds(150,20,100,20);
		
		b45=new JButton("Close");
		b45.setMnemonic('o');
		b65=new JButton("Delete");
		b65.setMnemonic('e');
		
		b65.setBounds(200,200,80,20);
		b45.setBounds(290,200,80,20);
		
		up.add(lb1);
		up.add(b45);
		up.add(b65);
		p1.add(lb2);
		p1.add(tf1);
		
		b45.addActionListener(this);
		b65.addActionListener(this);
	}
	public void actionPerformed(ActionEvent ae)
	{
		if(ae.getSource()==b45)
		{
			mainform.d.dispose();
		}
		
		if(ae.getSource()==b65)
		{
			try
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
				if(flag==0)
				{
					int r=JOptionPane.showConfirmDialog(null,"Are you sure to delete the record ?","Unauthorized Entry",JOptionPane.YES_NO_OPTION,JOptionPane.QUESTION_MESSAGE);
					if(r==0)
					{
						st.executeUpdate("delete from dis where dis_code='"+tf1.getText()+"'");
					}
					else
					{
						tf1.setText("");
						tf1.requestFocus();
					}
				}
					
				else
				{
					tf1.requestFocus();
					JOptionPane.showMessageDialog(null,"ID doesn't exist.","Warning Message",JOptionPane.INFORMATION_MESSAGE);
				}
				con.close();
				tf1.requestFocus();
			}
			catch(Exception e)
			{
				JOptionPane.showMessageDialog(null,e.getMessage(),"Warning Message",JOptionPane.INFORMATION_MESSAGE);
			}
		}
	}
}