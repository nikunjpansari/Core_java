import java.io.*;
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import javax.swing.border.*;
import java.sql.*;
import javax.swing.table.*;

public class employee extends JFrame implements ActionListener
{
	public static void main(String s[])
	{
		employee emp=new employee();
		emp.setSize(1080,800);
		emp.setVisible(true);
		emp.setTitle("SIM Activation Agency Management System");
	}
	
	Container cn;
	static delemp d;
	static employee emp;
	static editemp em;
	static show sh;
	static report rp;
	
	JTabbedPane tp;
	JPanel p0,p1,p2,p,p4;
	Color cl1,cl2,cl3;
	LineBorder lbr1;
	TitledBorder tbr1,tbr2,tbr3,tbr4,tbr5,tbr6;
	CompoundBorder cm1,cm2,cm3,cm4,cm5,cm6;
	ButtonGroup bg1,bg2;
	String strn1,strn2,strn3,strn4,strn5,strn6,strn7;
	Font ft1,ft3;
	ImageIcon icon,icon1;
	JLabel il;
	
	//employee object
	JLabel lb1,lb2,lb3,lb4,lb5,lb6,lb7,lb8,lb9,lb10,lb11,lb12,lb13,lb14,lb15,lb16;
	JButton b1,b2,b3,b4,b5,b6,b7,b8,b9,b10,b11;
	JPanel ep1,ep2,ep3,ep4;
	JComboBox cb1,cb2,cb3,cb4,cb5,cb6;
	JTextField t1,t2,t3,t4,t5,t6,t7,t8;
	JTextArea ta1,ta2;
	JRadioButton rd1,rd2,rd3,rd4,rd5;
	JCheckBox ch1,ch2,ch3,ch4,jc;
	
	//warehouse object
	JLabel wl1,wl2,wl3,wl4;
	JTextField wt1,wt2,wt3;
	JTextArea wta1,ta;
	JPanel p21,p22;
	JButton wb1,wb2,wb3,wb4,wb5;
	
	//Agency objects
	JLabel al1,al2,al3,al4;
	JTextField at1,at2,at3;
	JTextArea ata1,ata;
	JPanel ap21,ap22;
	JButton ab1,ab2,ab3,ab4,ab5;
	
	//Welcome objects
	JPanel pw;
	JLabel co1,co2,co3,co4,co5,co6,co7,co8,co9;
	BevelBorder bbr1,bbr2;
	Font ft;
	
	//Salary objects
	JLabel sl1;
	JButton sb1;
	
	//help objects
	JLabel lp1,lp2,lp3,lp4;
	JTextArea jta1,jta2,jta3;
	JScrollPane sp2,sp3,sp4;
	JButton hb1,hb2;
	
	employee()
	{
		cl3=new Color(175,208,235);
		
		cn=getContentPane();
		cn.setLayout(null);
		
		ft3=new Font("Times New Roman",Font.BOLD|Font.ITALIC,16);
		icon=new ImageIcon("ic/imagesCABF6TFI.jpg");
		il=new JLabel("Activation Agency",icon,SwingConstants.LEFT);
		il.setFont(ft3);
		il.setOpaque(false);
		
		p=new JPanel();
		p.setLayout(null);
		p.setBackground(cl3);
		p.setBounds(0,0,1080,80);
		cn.add(p);
		il.setBounds(0,0,1000,80);
		p.add(il);
		
		cl1=new Color(188,220,234);//upper panel color
		cl2=new Color(71,147,209);//background panel & line color
		lbr1=new LineBorder(cl2,2);
		tbr1=new TitledBorder(lbr1,"Profesional Details");
		tbr2=new TitledBorder(lbr1,"Personal Details");
		tbr3=new TitledBorder(lbr1,"Qualificational Details");
		tbr4=new TitledBorder(lbr1,"Salary Details");
		tbr5=new TitledBorder(lbr1,"Warehouse Details");
		tbr6=new TitledBorder(lbr1,"Agency Details");
		bbr1=new BevelBorder(BevelBorder.RAISED);
		bbr2=new BevelBorder(BevelBorder.LOWERED);
		cm1=new CompoundBorder(bbr1,tbr1);
		cm2=new CompoundBorder(bbr1,tbr2);
		cm3=new CompoundBorder(bbr1,tbr3);
		cm4=new CompoundBorder(bbr1,tbr4);
		cm5=new CompoundBorder(bbr1,tbr5);
		cm6=new CompoundBorder(bbr1,tbr6);
		ft=new Font("Times New Roman",Font.BOLD|Font.ITALIC,32);
		ft1=new Font("Times New Roman",Font.BOLD,14);
		
		tp=new JTabbedPane();
		tp.setBounds(0,80,1100,800);
		tp.setVisible(true);
		cn.add(tp);
		
		pw=new JPanel();
		pw.setLayout(null);
		pw.setBounds(0,0,1100,100);
		pw.setBackground(cl1);
		pw.setBorder(bbr1);
		
		co1=new JLabel("Welcome in SIM Activation Agency Management System");
		co1.setFont(ft);
		co1.setBounds(10,10,1200,70);
		pw.add(co1);
		
		p0=new JPanel();
		p1=new JPanel();
		p2=new JPanel();
		p4=new JPanel();
		p0.setLayout(null);
		p1.setLayout(null);
		p2.setLayout(null);
		p4.setLayout(null);
		p0.setBackground(cl2);
		p1.setBackground(cl2);
		p2.setBackground(cl2);
		p4.setBackground(cl2);
		tp.add("Welcome",p0);
		tp.add("Employee",p1);
		tp.add("Warehouse & Agency",p2);
		tp.add("Help",p4);
		p0.add(pw);
		
		co1=new JLabel("    Conscience is the first judge of man and bespeaks duty.");
		co2=new JLabel("    Being brilliant is not great feat if you respect nothing.");
		co3=new JLabel("    To be trusted is greater compliment than being loved.");
		co4=new JLabel("    Technology is only a means to achieve what is'Cosidered Valuable'.");
		co5=new JLabel("    Excess of knowledge and power,without holiness,makes human beings devils.");
		co6=new JLabel("    Integrity has no need of rules.");
		co7=new JLabel("    You'r born with intelligence,not with ethics.");
		co8=new JLabel("    A good leader can't get too far ahead of his followers.");
		co9=new JLabel("    The price of greatness is responsbility.");
		co2.setBounds(400,200,500,30);
		co3.setBounds(400,233,500,30);
		co4.setBounds(400,266,500,30);
		co5.setBounds(400,299,500,30);
		co6.setBounds(400,332,500,30);
		co7.setBounds(400,366,500,30);
		co8.setBounds(400,399,500,30);
		co9.setBounds(400,432,500,30);
		co1.setBounds(400,466,500,30);
		co1.setOpaque(true);
		co1.setBackground(cl1);
		co2.setOpaque(true);
		co2.setBackground(cl1);
		co3.setOpaque(false);
		co4.setOpaque(true);
		co4.setBackground(cl1);
		co5.setOpaque(false);
		co6.setOpaque(true);
		co6.setBackground(cl1);
		co7.setOpaque(false);
		co8.setOpaque(true);
		co8.setBackground(cl1);
		co9.setOpaque(false);
		co1.setBorder(bbr2);
		co2.setBorder(bbr2);
		co3.setBorder(bbr2);
		co4.setBorder(bbr2);
		co5.setBorder(bbr2);
		co6.setBorder(bbr2);
		co7.setBorder(bbr2);
		co8.setBorder(bbr2);
		co9.setBorder(bbr2);
		p0.add(co1);
		p0.add(co2);
		p0.add(co3);
		p0.add(co4);
		p0.add(co5);
		p0.add(co6);
		p0.add(co7);
		p0.add(co8);
		p0.add(co9);
		
		//employee objects
		b1=new JButton("Submit");
		b1.setMnemonic('S');
		b2=new JButton("Reset");
		b2.setMnemonic('R');
		b3=new JButton("Close");
		b3.setMnemonic('o');
		b4=new JButton("Logout");
		b4.setMnemonic('g');
		b5=new JButton("Show Record");
		b5.setMnemonic('a');
		b6=new JButton("Delete Record");
		b6.setMnemonic('D');
		b9=new JButton("OK");
		b9.setMnemonic('K');
		b9.setEnabled(false);
		b10=new JButton("Edit Record");
		b10.setMnemonic('t');
		b11=new JButton("Show");
		b11.setMnemonic('w');
		b11.setEnabled(false);
		jc=new JCheckBox("Enable");
		jc.setOpaque(false);
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
		lb5=new JLabel("Salary");
		lb5.setEnabled(false);
		t5=new JTextField();
		t5.setEnabled(false);
		lb6=new JLabel("Presence(Days)");
		lb6.setEnabled(false);
		t6=new JTextField();
		t6.setEnabled(false);
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
		lb13=new JLabel("   Search & Show Records");
		lb14=new JLabel("   Delete Records");
		lb15=new JLabel("   Update Records");
		
		
		lb1.setBounds(70,20,100,20);
		t1.setBounds(180,20,100,20);
		lb2.setBounds(300,20,100,20);
		t2.setBounds(410,20,80,20);
		lb3.setBounds(70,50,100,20);
		t3.setBounds(180,50,100,20);
		lb4.setBounds(300,50,100,20);
		t4.setBounds(410,50,80,20);//1st Panel
		
		jc.setBounds(570,20,80,20);
		lb6.setBounds(40,20,100,20);
		t6.setBounds(150,20,80,20);
		lb5.setBounds(40,60,100,20);
		t5.setBounds(150,60,100,20);
		b9.setBounds(260,60,60,20);
		b11.setBounds(260,20,70,20);//2nd panel
		
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
		ta2.setBounds(570,110,150,40);//3rd Panel
		
		ch1.setBounds(70,30,150,20);
		cb3.setBounds(230,30,100,20);
		ch2.setBounds(440,30,150,20);
		cb4.setBounds(600,30,100,20);
		ch3.setBounds(70,70,150,20);
		cb5.setBounds(230,70,100,20);
		ch4.setBounds(440,70,150,20);
		cb6.setBounds(600,70,100,20);//4th Panel
		
		b1.setBounds(500,500,80,20);
		b2.setBounds(600,500,80,20);
		b3.setBounds(700,500,80,20);
		b4.setBounds(800,500,80,20);
		b5.setBounds(260,540,110,20);
		b6.setBounds(260,570,120,20);
		b10.setBounds(260,600,100,20);//Buttons on Main Panel
		lb13.setBounds(100,540,170,20);
		lb14.setBounds(100,570,150,20);
		lb15.setBounds(100,600,150,20);//Labels on main panel
		
		p1.add(b1);
		p1.add(b2);
		p1.add(b3);
		p1.add(b4);
		p1.add(b5);
		p1.add(b6);
		p1.add(b10);
		p1.add(jc);
		p1.add(lb13);
		p1.add(lb14);
		p1.add(lb15);
		ep4.add(b9);
		ep4.add(b11);
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
		
		//wharehouse Objects
		p21=new JPanel();
		p21.setLayout(null);
		p21.setBounds(40,40,900,150);
		p21.setBackground(cl1);
		p21.setBorder(cm5);
		p2.add(p21);
		wl1=new JLabel("Warehouse ID");
		wl2=new JLabel("Contact No");
		wl3=new JLabel("Address");
		wt1=new JTextField();
		wt2=new JTextField();
		wta1=new JTextArea();
		wta1.setBorder(bbr2);
		
		wl1.setBounds(40,40,100,20);
		wt1.setBounds(150,40,100,20);
		wl2.setBounds(300,40,100,20);
		wt2.setBounds(410,40,100,20);
		wl3.setBounds(40,80,100,20);
		wta1.setBounds(150,80,100,40);
		
		p21.add(wl1);
		p21.add(wt1);
		p21.add(wl2);
		p21.add(wt2);
		p21.add(wl3);
		p21.add(wta1);
		
		wb1=new JButton("Save");
		wb2=new JButton("Edit");
		wb3=new JButton("Show");
		wb4=new JButton("Reset");
		wb5=new JButton("Logout");
		ta=new JTextArea();
		ta.setBorder(bbr2);
		ta.setEditable(false);
		wb1.setBounds(600,210,70,20);
		wb2.setBounds(690,210,70,20);
		wb3.setBounds(780,210,70,20);
		wb4.setBounds(690,330,80,20);
		wb5.setBounds(780,330,80,20);
		ta.setBounds(100,250,800,50);
		p2.add(wb1);
		p2.add(wb2);
		p2.add(wb3);
		p2.add(wb4);
		p2.add(wb5);
		p2.add(ta);
		
		//Agency objects
		ap21=new JPanel();
		ap21.setLayout(null);
		ap21.setBounds(40,370,900,150);
		ap21.setBackground(cl1);
		ap21.setBorder(cm6);
		p2.add(ap21);
		al1=new JLabel("Agency ID");
		al2=new JLabel("Registration No");
		al3=new JLabel("Address");
		at1=new JTextField();
		at2=new JTextField();
		ata1=new JTextArea();
		ata1.setBorder(bbr2);
		
		al1.setBounds(40,40,100,20);
		at1.setBounds(150,40,100,20);
		al2.setBounds(300,40,100,20);
		at2.setBounds(410,40,100,20);
		al3.setBounds(40,80,100,20);
		ata1.setBounds(150,80,100,40);
		
		ap21.add(al1);
		ap21.add(at1);
		ap21.add(al2);
		ap21.add(at2);
		ap21.add(al3);
		ap21.add(ata1);
		
		ab1=new JButton("Save");
		ab2=new JButton("Edit");
		ab3=new JButton("Show");
		ab4=new JButton("Reset");
		ab5=new JButton("Logout");
		ata=new JTextArea();
		ata.setBorder(bbr2);
		ata.setEditable(false);
		ab1.setBounds(600,530,70,20);
		ab2.setBounds(690,530,70,20);
		ab3.setBounds(780,530,70,20);
		ab4.setBounds(690,600,80,20);
		ab5.setBounds(780,600,80,20);
		ata.setBounds(100,560,800,30);
		p2.add(ab1);
		p2.add(ab2);
		p2.add(ab3);
		p2.add(ab4);
		p2.add(ab5);
		p2.add(ata);
		
		//Salary Objects
		sl1=new JLabel("   See salary report");
		sb1=new JButton("Report");
		sl1.setBounds(100,630,150,20);
		sb1.setBounds(260,630,80,20);
		p1.add(sl1);
		p1.add(sb1);
		
		//help objects
		hb1=new JButton("Logout");
		hb1.setMnemonic('g');
		hb2=new JButton("Close");
		hb2.setMnemonic('o');
		lp1=new JLabel("   Employee Information");
		lp1.setFont(ft1);
		lp3=new JLabel("   Wharehouse Information");
		lp3.setFont(ft1);
		lp4=new JLabel(" If you want to be aware of this application please read carefully this whole information which have a lot of knowledge.");
		lp4.setBounds(20,10,800,20);
		lp1.setBounds(40,40,400,20);
		lp3.setBounds(40,500,400,20);
		hb1.setBounds(920,10,80,20);
		hb2.setBounds(820,10,80,20);
		lp1.setBorder(bbr1);
		lp3.setBorder(bbr1);
		lp1.setOpaque(true);
		lp3.setOpaque(true);
		lp1.setBackground(cl1);
		lp3.setBackground(cl1);
		p4.add(lp1);
		p4.add(lp3);
		p4.add(lp4);
		p4.add(hb2);
		p4.add(hb1);
		jta1=new JTextArea("\n   To fill Employee Form,   Firstly type the 10 Digit CAF No. and click on the 'CHECK' button,\n"+"   If the message box shows a positive message, then all of the form will be enabled else a negative message will show on the message box.\n"+"   Please read the message carefully and proceed according to that.\n\n\n"+"   Note:-  Don't leave any field empty, it can never submit your information in database.\n\n\n"+"   There are many types of messages which are displayed on the message box, if you enter insufficient information.\n\n"+"   These informations are --\n"+"   i  - You can enter CAF or MDN No. less than 10 digits.\n"+"   ii - You can enter CAF or MDN No. more than 10 digits.\n"+"   iii- May be CAF No. not matched in database.\n\n"+"   Proccess on buttons(Submit,Reset,Close,Logout):--\n"+"   i  - Submit button is used to save the data entered into CAF.\n"+"   ii - If any wrong entry is shown on the display, then Reset button is used to set again CAF.\n"+"   iii- We can close the showing panel and come to the 1st panel.\n"+"   iv - To close the mainform and return to login form.\n");
		jta3=new JTextArea("\n   Note:-  Don't leave any field empty, it can never submit your information in database.\n\n"+"      We can submit, update, delete records through this frame --\n\n"+"        'SUBMIT', Enter the whole information which belongs to the distributor or needed to fullfil entry.\n"+"       'UPDATE', Cilck on 'edit' button then a next frame is opened, then enter distrbutor/dealer code to enable the form,and then make changes.\n"+"      'DELETE', Enter the distributor/deaker code, which record is to delete.");
		sp2=new JScrollPane(jta1,JScrollPane.VERTICAL_SCROLLBAR_AS_NEEDED,JScrollPane.HORIZONTAL_SCROLLBAR_AS_NEEDED);
		sp4=new JScrollPane(jta3,JScrollPane.VERTICAL_SCROLLBAR_AS_NEEDED,JScrollPane.HORIZONTAL_SCROLLBAR_AS_NEEDED);
		sp2.setBounds(40,60,1000,400);
		sp4.setBounds(40,520,1000,100);
		sp2.setForeground(cl1);
		sp4.setBackground(cl1);
		sp2.setBorder(bbr2);
		sp4.setBorder(bbr2);
		jta1.setEditable(false);
		jta3.setEditable(false);
		p4.add(sp2);
		p4.add(sp4);
		
		b1.addActionListener(this);
		b2.addActionListener(this);
		b3.addActionListener(this);
		b4.addActionListener(this);
		b5.addActionListener(this);
		b6.addActionListener(this);
		b9.addActionListener(this);
		b10.addActionListener(this);
		b11.addActionListener(this);
		jc.addActionListener(this);
		ch1.addActionListener(this);
		ch2.addActionListener(this);
		ch3.addActionListener(this);
		ch4.addActionListener(this);
		wb1.addActionListener(this);
		wb2.addActionListener(this);
		wb3.addActionListener(this);
		wb4.addActionListener(this);
		wb5.addActionListener(this);
		sb1.addActionListener(this);
		hb1.addActionListener(this);
		hb2.addActionListener(this);
	}
	
	public void actionPerformed(ActionEvent ae)
	{
		try
		{
			if(ae.getSource()==b1)
				b1.setToolTipText("Save Record");
			if(ae.getSource()==b2)
				b2.setToolTipText("Reset");
			if(ae.getSource()==b3)
				b3.setToolTipText("Close");
			if(ae.getSource()==b4)
				b4.setToolTipText("Logout");
			if(ae.getSource()==b5)
				b5.setToolTipText("Show all Records");
			if(ae.getSource()==b6)
				b6.setToolTipText("Delete Record");
			/*if(ae.getSource()==b7)
				b7.setToolTipText("Next Record");
			if(ae.getSource()==b8)
				b8.setToolTipText("Previous Record");*/
			
			if(ae.getSource()==b2)
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
			}
			if(ae.getSource()==b4)
			{
			//	loading.emp.dispose();
			//	loginemp.lg.show();
			}
			if(ae.getSource()==ch1)
			{
				if(ch1.isSelected()==true)
					cb3.setEnabled(true);
				else
					cb3.setEnabled(false);
			}
			if(ae.getSource()==ch2)
			{
				if(ch2.isSelected()==true)
					cb4.setEnabled(true);
				else
					cb4.setEnabled(false);
			}
			if(ae.getSource()==ch3)
			{
				if(ch3.isSelected()==true)
					cb5.setEnabled(true);
				else
					cb5.setEnabled(false);
			}
			if(ae.getSource()==ch4)
			{
				if(ch4.isSelected()==true)
					cb6.setEnabled(true);
				else
					cb6.setEnabled(false);
			}
			if(ae.getSource()==b9)
			{
				t5.requestFocus();
			}
			
			if(ae.getSource()==b1)
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
				
				st.executeUpdate("insert into emp values('"+t1.getText()+"','"+t2.getText()+"','"+t3.getText()+"','"+t4.getText()+"','"+strn1+"','"+strn2+"','"+t7.getText()+"','"+strn3+"','"+ta1.getText()+"','"+ta2.getText()+"','"+strn4+"','"+strn5+"','"+strn6+"','"+strn7+"');");
				st.executeUpdate("insert into salary values('"+t1.getText()+"','"+t2.getText()+"','"+t3.getText()+"','"+t4.getText()+"','"+t7.getText()+"','"+t6.getText()+"','"+t5.getText()+"');");
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
				
			}
			
			if(ae.getSource()==b6)
			{
				delemp d=new delemp();
				d.setSize(400,400);
				d.setVisible(true);
				d.setTitle("Delete Records");
			}
			
			if(ae.getSource()==b5)
			{
				show sh=new show();
				sh.setSize(800,800);
				sh.setVisible(true);
				sh.setTitle("Show Records");
			}
			if(ae.getSource()==b10)
			{
				editemp em=new editemp();
				em.setSize(1080,800);
				em.setVisible(true);
				em.setTitle("Update Records");
			}
			if(ae.getSource()==wb1)
			{
				Class.forName("sun.jdbc.odbc.JdbcOdbcDriver");
				String s1="system";
				String s2="system";
				Connection con=DriverManager.getConnection("jdbc:odbc:c",s1,s2);
				Statement st=con.createStatement();
				
				st.executeUpdate("insert into wh values('"+wt1.getText()+"','"+wt2.getText()+"','"+wta1.getText()+"');");
				con.close();
				
				wt1.setText("");
				wt2.setText("");
				wt3.setText("");
				wta1.setText("");
			}
			if(ae.getSource()==wb2)
			{
				Class.forName("sun.jdbc.odbc.JdbcOdbcDriver");
				String s1="system";
				String s2="system";
				Connection con=DriverManager.getConnection("jdbc:odbc:c",s1,s2);
				Statement st=con.createStatement();
				
				st.executeUpdate("update wh set wh_id='"+wt1.getText()+"',w_contact_no='"+wt2.getText()+"',w_add='"+wta1.getText()+"'");
				con.close();
				
				wt1.setText("");
				wt2.setText("");
				wta1.setText("");
			}
			if(ae.getSource()==wb3)
			{	
				Class.forName("sun.jdbc.odbc.JdbcOdbcDriver");
				String s1="system";
				String s2="system";
				Connection con=DriverManager.getConnection("jdbc:odbc:c",s1,s2);
				Statement st=con.createStatement();
				
				ResultSet rs=st.executeQuery("select * from wh");
				while(rs.next()==true)
				{
					wt1.setText(rs.getString(1));
					wt2.setText(rs.getString(2));
					wta1.setText(rs.getString(3));
	
				}
				String str=""+wt1.getText()+"  "+wt2.getText()+"  "+wta1.getText();
				ta.setText(str);
				con.close();
			}
			if(ae.getSource()==wb4)
			{
				wt1.setText("");
				wt2.setText("");
				wta1.setText("");
				ta.setText("");
			}
			if(ae.getSource()==wb5)
			{
				//loadingemp.emp.dispose();
			}
			
			if(ae.getSource()==ab1)
			{
				Class.forName("sun.jdbc.odbc.JdbcOdbcDriver");
				String s1="system";
				String s2="system";
				Connection con=DriverManager.getConnection("jdbc:odbc:c",s1,s2);
				Statement st=con.createStatement();
				
				st.executeUpdate("insert into ag values('"+at1.getText()+"','"+at2.getText()+"','"+ata1.getText()+"');");
				con.close();
				
				at1.setText("");
				at2.setText("");
				ata1.setText("");
			}
			if(ae.getSource()==ab2)
			{
				Class.forName("sun.jdbc.odbc.JdbcOdbcDriver");
				String s1="system";
				String s2="system";
				Connection con=DriverManager.getConnection("jdbc:odbc:c",s1,s2);
				Statement st=con.createStatement();
				
				st.executeUpdate("update ag set ag_id='"+at1.getText()+"',ag_reg_no='"+at2.getText()+"',ag_add='"+ata1.getText()+"'");
				con.close();
				
				at1.setText("");
				at2.setText("");
				ata1.setText("");
			}
			if(ae.getSource()==ab3)
			{	
				Class.forName("sun.jdbc.odbc.JdbcOdbcDriver");
				String s1="system";
				String s2="system";
				Connection con=DriverManager.getConnection("jdbc:odbc:c",s1,s2);
				Statement st=con.createStatement();
				
				ResultSet rs=st.executeQuery("select * from ag");
				while(rs.next()==true)
				{
					at1.setText(rs.getString(1));
					at2.setText(rs.getString(2));
					ata1.setText(rs.getString(3));
				}
				String str=""+at1.getText()+"  "+at2.getText()+"  "+ata1.getText();
				ata.setText(str);
				con.close();
			}
			if(ae.getSource()==ab4)
			{
				at1.setText("");
				at2.setText("");
				ata1.setText("");
				ata.setText("");
			}
			if(ae.getSource()==ab5)
			{
				//loadingemp.emp.dispose();
			}
			
			if(ae.getSource()==b11)
			{
				Class.forName("sun.jdbc.odbc.JdbcOdbcDriver");
				String s1="system";
				String s2="system";
				Connection con=DriverManager.getConnection("jdbc:odbc:c",s1,s2);
				Statement st=con.createStatement();
				String s=t1.getText();
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
			if(ae.getSource()==b9)
			{
				Class.forName("sun.jdbc.odbc.JdbcOdbcDriver");
				String s1="system";
				String s2="system";
				Connection con=DriverManager.getConnection("jdbc:odbc:c",s1,s2);
				Statement st=con.createStatement();
				
				int day=Integer.parseInt(t6.getText());
				int sal=Integer.parseInt(t5.getText());
				String str1=t1.getText();
				st.executeUpdate("update salary set presence(days)="+day+",salary="+sal+" where emp_id='"+str1+"'");
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
			}
			if(ae.getSource()==sb1)
			{
				report rp=new report();
				rp.setSize(800,800);
				rp.setVisible(true);
				rp.setTitle("Salary Report");
			}
			if(ae.getSource()==jc)
			{
				if(jc.isSelected()==true)
				{
					lb5.setEnabled(true);
					lb6.setEnabled(true);
					t5.setEnabled(true);
					t6.setEnabled(true);
					b9.setEnabled(true);
					b11.setEnabled(true);
				}
				else
				{
					lb5.setEnabled(false);
					lb6.setEnabled(false);
					t5.setEnabled(false);
					t6.setEnabled(false);
					b9.setEnabled(false);
					b11.setEnabled(false);
					t5.setText(" ");
					t6.setText(" ");
				}
			}
		}
		catch(Exception e)
		{
			JOptionPane.showMessageDialog(null,e.getMessage(),"Warning Message",JOptionPane.INFORMATION_MESSAGE);
		}
	}
}