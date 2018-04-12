import java.io.*;
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import javax.swing.border.*;
import java.sql.*;
import javax.swing.table.*;
class help extends JDialog implements ActionListener
{
	static mainform mf;
	static help hp;
	Container cn;
	JPanel p1;
	Color cl1,cl2;
	JLabel lb;
	JTextArea jta;
	JButton bt;
	JScrollPane sp;
	BevelBorder bbr2;
	help()
	{
		cl2=new Color(71,147,209);//background & line color
		cl1=new Color(188,220,234);//panel color
		bbr2=new BevelBorder(BevelBorder.LOWERED);
		
		cn=getContentPane();
		cn.setLayout(null);
		
		p1=new JPanel();
		p1.setLayout(null);
		p1.setBounds(0,0,500,500);
		p1.setBackground(cl2);
		cn.add(p1);
		
		lb=new JLabel("    Carefully read these to know how to proccess on proccess chart.");
		lb.setOpaque(false);
		lb.setBackground(cl1);
		lb.setBounds(0,0,500,50);
		p1.add(lb);
		
		jta=new JTextArea("\n\n   On the screen you are seeing three check boxes which can show details related to their topics on the table which is blank\n\n"+"   Their are five buttons are showing --\n\n"+"      i  - 'SEARCH' This button is used to search a unique record whose informationis will be given in given Text Box.\n"+"      ii - 'CLOSE' The button will close the panel and you can reach on 'WELCOME' Panel.\n"+"      iii- 'LOGOUT' This will exit you to the application.\n"+"      iv - 'SHOW' It can show whole records with togather which are save on database.\n"+"      v  - 'HELP' This shows help about proccess chart.\n\n\n"+"   How to work with these bottons --\n\n"+"      i   - 'Search'  Firstly click on check box, then text box will be enabled, Further enter the information & click on 'search'.\n"+"      ii - 'Show'  Primarily click on check box, then click on 'show' button.\n");
		sp=new JScrollPane(jta,JScrollPane.VERTICAL_SCROLLBAR_AS_NEEDED,JScrollPane.HORIZONTAL_SCROLLBAR_AS_NEEDED);
		jta.setEditable(false);
		sp.setBounds(40,70,420,380);
		sp.setBorder(bbr2);
		p1.add(sp);
		
		bt=new JButton("Close");
		bt.setMnemonic('o');
		bt.setBounds(400,470,70,20);
		p1.add(bt);
		
		bt.addActionListener(this);
		
	}
	public void actionPerformed(ActionEvent ae)
	{
		if(ae.getSource()==bt)
		{
			mainform.hp.dispose();
		}
	}
}