import java.io.*;
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import javax.swing.border.*;
import java.sql.*;
import javax.swing.table.*;


public class mainform extends JFrame implements ActionListener
{
	public static void main(String s[])
	{
		mainform mf=new mainform();
		mf.setSize(1080,900);
		mf.setVisible(true);
		mf.setTitle("Corporate Recruitement System");
	}
//	static edit jf;
//	static del d;
	static loadingform ld;
	static login ob;
	static JTextField tx1;
	static JPasswordField pf;
	static mainform mf;
//	static help hp;
		
	Container cn,cn1;
	JTabbedPane tp;
	static JPanel p0,p1,p2,p3,p4,p5,p6;
	LineBorder lbr1;
	TitledBorder tbr1,tbr2,tbr3,tbr9;
	Color cl1,cl2,cl3;
	JButton b2,b3,b4,b5;
	static JScrollPane sp1,sp5,sp6;
	Font ft1,ft2,ft3;
	BevelBorder bbr1,bbr2,bbr3;
	CompoundBorder cbr1,cbr2,cbr3,cbr4,cbr5,cbr6,cbr7,cbr8,cbr9;
	ImageIcon icon,icon1;
	JLabel il,il1;
	
	//WELCOME
	JLabel co1,co2,co3,co4,co5,co6,co7,co8,co9,co10,co0;
	JPanel pw;
	Color cl4;
	Font ft;
	
	//Proccess chart
	static DefaultTableModel tm;
	JPanel pc1,pc2,pc3;
	TitledBorder tbr12;
	JCheckBox c1,c2,c3;
	JButton pb1,pb2,pb3,pb4,pb5;
	JTable jt;
	JLabel pl1,pl2,pl3;
	JTextField pt1,pt2,pt3;
	
	//caf objects
	JButton b1;
	JLabel l1,l2,l3,l4,l5,l6,l7,l8,l9,l10,l11,l12,l13,l14,l15,l16,l17,l18,l19,l20,l21,l22,l23,l24,l25,l26,l27,l28,l29,l30,l31,l32;
	JTextField t1,t2,t3,t4,t5,t6,t7,t8,t9,t10,t11,t12,t13,t14,t15,t16,t17,t18,t19;
	JRadioButton to1,to2,to3,to4,to5,to6,to7,to8,to9,to10,to11,to12,to13;
	static JComboBox cb1,cb2,cb3,cb4,cb5,cb6,cb7,cb8;
	ButtonGroup bg1,bg2,bg3,bg4,bg5,bg6;
	JCheckBox jc;
	JPanel p31,p32,p33;
	String arr2[]=new String[31];
	
	//Rejected CAF object
	JPanel p41,p42;
	JLabel l41,l42,l43,l44,l45,l46,l47,l48,l49,l410,l411,l412;
	JTextField t41,t42,t43,t44,t45,t46,t47,t48,t49,t410,t411,t412;
	JButton b41,b42,b43,b44;
	TitledBorder tbr7,tbr8;
	String arr[]=new String[12];
	
	//Distributor objects
	static JLabel lb1,lb2,lb3,lb4,lb5,lb6,lb7,lb8,lb9,lb10,lb11,lb12,lb13;
	JTextField tf1,tf2,tf3,tf4,tf5,tf6,tf7,tf8,tf9,tf10,tf11;
	JPanel p51,p52,p53;
	TitledBorder tbr4,tbr5,tbr6;
	JButton b25,b35,b45,b55,b65,b75;
	String arr1[]=new String[11];

	//help objects
	JLabel lp1,lp2,lp3,lp4;
	JTextArea jta1,jta2,jta3;
	JScrollPane sp2,sp3,sp4;
	JButton hb1,hb2;
	
	public mainform()
	{
		cl1=new Color(188,220,234);//panel color
		cl2=new Color(71,107,209);//background & line color
		cl3=new Color(175,208,235);
		cl4=new Color(253,240,237);
		ft=new Font("Times New Roman",Font.BOLD|Font.ITALIC,32);
		ft1=new Font("Times New Roman",Font.BOLD,14);
		ft2=new Font("Times New Roman",Font.BOLD,11);
		ft3=new Font("Times New Roman",Font.BOLD|Font.ITALIC,16);
		
		bbr1=new BevelBorder(BevelBorder.RAISED);
		bbr2=new BevelBorder(BevelBorder.LOWERED);
		lbr1=new LineBorder(cl2);
		tbr1=new TitledBorder(lbr1,"Service Details");
		tbr2=new TitledBorder(lbr1,"Customer Details");
		tbr3=new TitledBorder(lbr1,"Address/Identity Details");
		cbr1=new CompoundBorder(bbr1,tbr1);
		cbr2=new CompoundBorder(bbr1,tbr2);
		cbr3=new CompoundBorder(bbr1,tbr3);
				
		cn=getContentPane();
		cn.setLayout(null);
		tp=new JTabbedPane();
		tp.setBounds(0,70,1080,800);
		tp.setVisible(true);
		cn.add(tp);
		
		icon=new ImageIcon("6.jpg");
		il=new JLabel("Corporate Recruitement System",icon,SwingConstants.LEFT);
		il.setFont(ft3);
		il.setOpaque(false);
		
		icon1=new ImageIcon("ic/imagesCABQNX72.jpg");
		il1=new JLabel(icon1,SwingConstants.LEFT);
		il1.setBounds(100,150,250,400);
				
		p0=new JPanel();
		p0.setLayout(null);
		p0.setBackground(cl3);
		p0.setBounds(0,0,1080,100);
		cn.add(p0);
		il.setBounds(0,0,1000,80);
		p0.add(il);

		p1=new JPanel();
		p2=new JPanel();
		p3=new JPanel();
		p4=new JPanel();
		p5=new JPanel();	
		p6=new JPanel();
		p1.setLayout(null);
		p2.setLayout(null);
		p3.setLayout(null);
		p4.setLayout(null);
		p5.setLayout(null);
		p6.setLayout(null);
		p1.setBackground(cl2);
		p2.setBackground(cl2);
		p3.setBackground(cl2);
		p4.setBackground(cl2);
		p5.setBackground(cl2);
		p6.setBackground(cl2);
		tp.add("Welcome",p1);
		tp.add("Process Chart",p2);
		tp.add("CAF(Customer Application Form)",p3);
		tp.add("Rejected CAF",p4);
		tp.add("Distributor",p5);
		tp.add("Help",p6);
		p1.add(il1);
		
		//caf objects
		b2=new JButton("Submit");
		b2.setMnemonic('S');
		b3=new JButton("Reset");
		b3.setMnemonic('R');
		b4=new JButton("Close");
		b4.setMnemonic('o');
		b5=new JButton("Logout");
		b5.setMnemonic('g');
		p31=new JPanel();
		p32=new JPanel();
		p33=new JPanel();
		p31.setLayout(null);
		p32.setLayout(null);
		p33.setLayout(null);
		p31.setBounds(40,20,1000,100);
		p32.setBounds(40,130,1000,470);
		p33.setBounds(40,610,1000,70);
		b2.setBounds(600,700,80,20);
		b3.setBounds(700,700,70,20);
		b4.setBounds(795,700,70,20);
		b5.setBounds(890,700,80,20);
		b2.setEnabled(false);
		b3.setEnabled(false);
		p31.setBackground(cl1);
		p32.setBackground(cl1);
		p33.setBackground(cl1);
		p31.setBorder(cbr1);
		p32.setBorder(cbr2);
		p33.setBorder(cbr3);
		p3.add(p31);
		p3.add(p32);
		p3.add(p33);
		p3.add(b2);
		p3.add(b3);
		p3.add(b4);
		p3.add(b5);
				
		//Caf objects
		jc=new JCheckBox("Local Address");
		jc.setFont(ft3);
		jc.setEnabled(false);
		l1=new JLabel("CAF No");
		l1.setFont(ft1);
		l2=new JLabel("Dealer Code");
		l2.setFont(ft1);
		l2.setEnabled(false);
		l3=new JLabel("MDN");
		l3.setFont(ft1);
		l3.setEnabled(false);
		l4=new JLabel("RSN");
		l4.setFont(ft1);
		l4.setEnabled(false);
		l5=new JLabel("Photograph");
		l5.setFont(ft1);
		l5.setEnabled(false);
		l6=new JLabel("Category");
		l6.setFont(ft1);
		l6.setEnabled(false);
		l7=new JLabel("Salutation");
		l7.setFont(ft1);
		l7.setEnabled(false);
		l8=new JLabel("First Name");
		l8.setFont(ft1);
		l8.setEnabled(false);
		l9=new JLabel("Middle Name");
		l9.setFont(ft1);
		l9.setEnabled(false);
		l10=new JLabel("Last Name");
		l10.setFont(ft1);
		l10.setEnabled(false);
		l11=new JLabel("Gender");
		l11.setFont(ft1);
		l11.setEnabled(false);
		l12=new JLabel("Marital Status");
		l12.setFont(ft1);
		l12.setEnabled(false);
		l13=new JLabel("Date of Birth");
		l13.setFont(ft1);
		l13.setEnabled(false);
		l14=new JLabel("Nationality");
		l14.setFont(ft1);
		l14.setEnabled(false);
		l15=new JLabel("Father/Husband's Name");
		l15.setFont(ft1);
		l15.setEnabled(false);
		l16=new JLabel("Address(As per Proof)");
		l16.setFont(ft3);
		l16.setEnabled(false);
		l17=new JLabel("Address Line");
		l17.setFont(ft1);
		l17.setEnabled(false);
		l18=new JLabel("State");
		l18.setFont(ft1);
		l18.setEnabled(false);
		l19=new JLabel("City");
		l19.setFont(ft1);
		l19.setEnabled(false);
		l20=new JLabel("Pin Code");
		l20.setFont(ft1);
		l20.setEnabled(false);
		l21=new JLabel("District");
		l21.setFont(ft1);
		l21.setEnabled(false);
		l22=new JLabel("Alternative No");
		l22.setFont(ft1);
		l22.setEnabled(false);
		l23=new JLabel("Address Line");
		l23.setFont(ft1);
		l23.setEnabled(false);
		l24=new JLabel("State");
		l24.setFont(ft1);
		l24.setEnabled(false);
		l25=new JLabel("City");
		l25.setFont(ft1);
		l25.setEnabled(false);
		l26=new JLabel("Pin Code");
		l26.setFont(ft1);
		l26.setEnabled(false);
		l27=new JLabel("District");
		l27.setFont(ft1);
		l27.setEnabled(false);
		l28=new JLabel("Alternative No");
		l28.setFont(ft1);
		l28.setEnabled(false);
		l28.setEnabled(false);
		l29=new JLabel("Proof of Identity");
		l29.setFont(ft1);
		l29.setEnabled(false);
		l30=new JLabel("Proof of Address");
		l30.setFont(ft1);
		l30.setEnabled(false);
		l31=new JLabel("POI_Reference");
		l31.setFont(ft1);
		l31.setEnabled(false);
		l32=new JLabel("POA_Reference");
		l32.setFont(ft1);
		l32.setEnabled(false);
		to1=new JRadioButton ("Yes");
		to1.setFont(ft2);
		to1.setEnabled(false);
		to2=new JRadioButton ("No");
		to2.setFont(ft2);
		to2.setEnabled(false);
		to3=new JRadioButton ("Urban");
		to3.setFont(ft2);
		to3.setEnabled(false);
		to4=new JRadioButton ("Rural");
		to4.setFont(ft2);
		to4.setEnabled(false);
		to5=new JRadioButton ("Mr.");
		to5.setFont(ft2);
		to5.setEnabled(false);
		to6=new JRadioButton ("Mrs.");
		to6.setFont(ft2);
		to6.setEnabled(false);
		to7=new JRadioButton ("Ms.");
		to7.setFont(ft2);
		to7.setEnabled(false);
		to8=new JRadioButton ("Male");
		to8.setFont(ft2);
		to8.setEnabled(false);
		to9=new JRadioButton ("Female");
		to9.setFont(ft2);
		to9.setEnabled(false);
		to10=new JRadioButton ("Married");
		to10.setFont(ft2);
		to10.setEnabled(false);
		to11=new JRadioButton ("Single");
		to11.setFont(ft2);
		to11.setEnabled(false);
		to12=new JRadioButton ("Indian");
		to12.setFont(ft2);
		to12.setEnabled(false);
		to13=new JRadioButton ("Foreigner");
		to13.setFont(ft2);
		to13.setEnabled(false);
		cb1=new JComboBox ();
		int i;
		for(i=1;i<=31;i++)
		{
			String str1=" "+i;
			cb1.addItem(str1);
		}
		cb1.setEnabled(false);
		String str2[]={"Jan","Feb","Mar","Apr","May","Jun","Jul","Aug","Sep","Oct","Nov","Dec"};
		cb2=new JComboBox (str2);
		cb2.setEnabled(false);
		String str3[]={"Andhra Pradesh","Arunanchal Pradesh","Assam","Andaman & Nicobar","Bihar","Chandigarh","Chhattisgarh","Dadra & Nagar Haweli","Delhi","Dman & Diu","Goa","Gujarat","Jammu & Kashmir","Jharkhand","Karnataka","Kerala","Lakshadweep","Madhya Pradesh","Maharashtra","Manipur","Meghalaya","Mizoram","Nagaland","Orissa","Punjab","Rajasthan","Sikkim","Tamil Nadu","Tripura","Uttarakhand","Uttar Pradesh","West Bengal"};
		cb3=new JComboBox (str3);
		cb3.setEnabled(false);
		String str4[]={"Bhadohi","Chakia","Chandauli","Mathura","Merut","Sonbhadra","","Varanasi"};
		cb4=new JComboBox (str4);
		cb4.setEnabled(false);
		String str5[]={"Andhra Pradesh","Arunanchal Pradesh","Assam","Andman & Nicobar","Bihar","Chandigarh","Chhatisgarh","Dadra & Nagar Haweli","Delhi","Dman & Diu","Goa","Gujrat","Jammu & Kashmir","Jharkhand","Karnataka","Kerala","Lakshadeep","Madhya Pradesh","Maharastra","Manipur","Meghalaya","Mizoram","Nagaland","Orrisa","Punjab","Rajasthan","Sikkim","Tamil Nadu","Tripura","Uttarakhand","Uttar Pradesh","West Bengal"};
		cb5=new JComboBox (str5);
		cb5.setEnabled(false);
		String str6[]={"Bhadohi","Chakia","Chandauli","Mathura","Merut","Sonbhadra","","Varanasi"};
		cb6=new JComboBox (str6);
		cb6.setEnabled(false);
		String str7[]={"Collage ID Card","PAN Card","Driving License","Ration Card","Voter ID Card","Passbook","Passport"};
		cb7=new JComboBox (str7);
		cb7.setEnabled(false);
		String str8[]={"Domicile Certificate(Valid for 6 months)","Diriving License","Ration Card","Voter ID Card","Ration Card","Electricity bill","Water bill","Passport"};
		cb8=new JComboBox (str8);
		cb8.setEnabled(false);
		t1=new JTextField();
		t2=new JTextField();
		t2.setEnabled(false);
		t3=new JTextField();
		t3.setEnabled(false);
		t4=new JTextField();
		t4.setEnabled(false);
		t5=new JTextField();
		t5.setEnabled(false);
		t6=new JTextField();
		t6.setEnabled(false);
		t7=new JTextField();
		t7.setEnabled(false);
		t8=new JTextField();
		t8.setEnabled(false);
		t9=new JTextField();
		t9.setEnabled(false);
		t10=new JTextField();
		t10.setEnabled(false);
		t11=new JTextField();
		t11.setEnabled(false);
		t12=new JTextField();
		t12.setEnabled(false);
		t13=new JTextField();
		t13.setEnabled(false);
		t14=new JTextField();
		t14.setEnabled(false);
		t15=new JTextField();
		t15.setEnabled(false);
		t16=new JTextField();
		t16.setEnabled(false);
		t17=new JTextField();
		t17.setEnabled(false);
		t18=new JTextField();
		t18.setEnabled(false);
		t19=new JTextField();
		t19.setEnabled(false);
		b1=new JButton ("Check");
		b1.setMnemonic('e');
		bg1=new ButtonGroup();
		bg2=new ButtonGroup();
		bg3=new ButtonGroup();
		bg4=new ButtonGroup();
		bg5=new ButtonGroup();
		bg6=new ButtonGroup();
				
		l1.setBounds(100,25,50,20);//40,20,1000,100
		t1.setBounds(160,25,150,20);
		b1.setBounds(320,25,70,20);
		l2.setBounds(580,25,100,20);
		t2.setBounds(660,25,150,20);
		l3.setBounds(100,55,50,20);
		t3.setBounds(160,55,150,20);
		l4.setBounds(580,55,40,20);
		t4.setBounds(660,55,150,20);
		
		l5.setBounds(100,30,100,20);//40,130,1000,550
		to1.setBounds(210,30,50,20);
		to1.setOpaque(false);
		to2.setBounds(260,30,50,20);
		to2.setOpaque(false);
		l6.setBounds(380,30,100,20);
		to3.setBounds(490,30,60,20);
		to3.setOpaque(false);
		to4.setBounds(550,30,70,20);
		to4.setOpaque(false);
		l7.setBounds(640,30,100,20);
		to5.setBounds(750,30,50,20);
		to5.setOpaque(false);
		to6.setBounds(800,30,50,20);
		to6.setOpaque(false);
		to7.setBounds(850,30,50,20);
		to7.setOpaque(false);		//EO 1st line
		l8.setBounds(100,70,100,20);
		t5.setBounds(210,70,100,20);
		l9.setBounds(380,70,100,20);
		t6.setBounds(490,70,100,20);
		l10.setBounds(640,70,100,20);
		t7.setBounds(750,70,180,20);//EO 2nd line
		l11.setBounds(100,110,100,20);
		to8.setBounds(210,110,60,20);
		to8.setOpaque(false);
		to9.setBounds(260,110,70,20);
		to9.setOpaque(false);
		l12.setBounds(380,110,100,20);
		to10.setBounds(490,110,70,20);
		to10.setOpaque(false);
		to11.setBounds(560,110,80,20);
		to11.setOpaque(false);
		l13.setBounds(640,110,100,20);
		cb1.setBounds(750,110,40,20);
		cb2.setBounds(800,110,50,20);
		t8.setBounds(860,110,70,20);//EO 3rd line
		l14.setBounds(100,150,100,20);
		to12.setBounds(210,150,60,20);
		to12.setOpaque(false);
		to12.setSelected(true);
		to13.setBounds(270,150,100,20);
		to13.setOpaque(false);
		l15.setBounds(490,150,150,20);
		t9.setBounds(670,150,260,20);//EO 4th line
		l16.setBounds(70,190,200,20);
		l17.setBounds(100,230,100,20);
		t10.setBounds(210,230,400,20);
		l18.setBounds(100,270,100,20);
		cb3.setBounds(210,270,100,20);
		l19.setBounds(380,270,100,20);
		cb4.setBounds(490,270,100,20);
		l20.setBounds(640,270,100,20);
		t11.setBounds(770,270,150,20);
		l21.setBounds(100,310,100,20);
		t12.setBounds(210,310,400,20);
		l22.setBounds(640,310,100,20);
		t13.setBounds(770,310,150,20);//EO address line proof
		jc.setBounds(70,340,200,20);
		jc.setOpaque(false);
		l23.setBounds(100,370,100,20);
		t14.setBounds(210,370,400,20);
		l24.setBounds(100,400,100,20);
		cb5.setBounds(210,400,100,20);
		l25.setBounds(380,400,100,20);
		cb6.setBounds(490,400,100,20);
		l26.setBounds(640,400,100,20);
		t15.setBounds(770,400,150,20);
		l27.setBounds(100,440,100,20);
		t16.setBounds(210,440,400,20);
		l28.setBounds(640,440,100,20);
		t17.setBounds(770,440,150,20);//EO local address
		
		l29.setBounds(90,25,150,20);//40,610,1000,70
		cb7.setBounds(210,25,80,20);
		l31.setBounds(310,25,100,20);
		t18.setBounds(420,25,80,20);
		l30.setBounds(550,25,150,20);
		cb8.setBounds(700,25,80,20);
		l32.setBounds(800,25,100,20);
		t19.setBounds(900,25,80,20);
		
		//caf objects
		bg1.add(to1);
		bg1.add(to2);
		bg2.add(to3);
		bg2.add(to4);
		bg3.add(to5);
		bg3.add(to6);
		bg3.add(to7);
		bg4.add(to8);
		bg4.add(to9);
		bg5.add(to10);
		bg5.add(to11);
		bg6.add(to12);
		bg6.add(to13);
		p31.add(b1);
		p31.add(l1);
		p31.add(l2);
		p31.add(l3);
		p31.add(l4);
		p32.add(l5);
		p32.add(l6);
		p32.add(l7);
		p32.add(l8);
		p32.add(l9);
		p32.add(l10);
		p32.add(l11);
		p32.add(l12);
		p32.add(l13);
		p32.add(l14);
		p32.add(l15);
		p32.add(l16);
		p32.add(l17);
		p32.add(l18);
		p32.add(l19);
		p32.add(l20);
		p32.add(l21);
		p32.add(l22);
		p32.add(l23);
		p32.add(l24);
		p32.add(l25);
		p32.add(l26);
		p32.add(l27);
		p32.add(l28);
		p33.add(l29);
		p33.add(l30);
		p33.add(l31);
		p33.add(l32);
		p31.add(t1);
		p31.add(t2);
		p31.add(t3);
		p31.add(t4);
		p32.add(t5);
		p32.add(t6);
		p32.add(t7);
		p32.add(t8);
		p32.add(t9);
		p32.add(t10);
		p32.add(t11);
		p32.add(t12);
		p32.add(t13);
		p32.add(t14);
		p32.add(t15);
		p32.add(t16);
		p32.add(t17);
		p33.add(t18);
		p33.add(t19);
		p32.add(to1);
		p32.add(to2);
		p32.add(to3);
		p32.add(to4);
		p32.add(to5);
		p32.add(to6);
		p32.add(to7);
		p32.add(to8);
		p32.add(to9);
		p32.add(to10);
		p32.add(to11);
		p32.add(to12);
		p32.add(to13);
		p32.add(cb1);
		p32.add(cb2);
		p32.add(cb3);
		p32.add(cb4);
		p32.add(cb5);
		p32.add(cb6);
		p33.add(cb7);
		p33.add(cb8);
		p32.add(jc);
		
		//distributor object panel 5
		p51=new JPanel();
		p52=new JPanel();
		p53=new JPanel();
		p51.setLayout(null);
		p52.setLayout(null);
		p53.setLayout(null);
		p51.setBackground(cl1);
		p52.setBackground(cl1);
		p53.setBackground(cl1);
		tbr4=new TitledBorder(lbr1,"Distributor Details");
		tbr5=new TitledBorder(lbr1,"");
		tbr6=new TitledBorder(lbr1,"CAF Recieving Details");
		cbr4=new CompoundBorder(bbr1,tbr4);
		cbr5=new CompoundBorder(bbr1,tbr5);
		cbr6=new CompoundBorder(bbr1,tbr6);
		p51.setBorder(cbr4);
		p52.setBorder(cbr5);
		p53.setBorder(cbr6);
		lb1=new JLabel("Dis_Code");
		lb1.setFont(ft1);
		lb2=new JLabel("Dis_Nmae");
		lb2.setFont(ft1);
		lb3=new JLabel("Dis_Address");
		lb3.setFont(ft1);
		lb4=new JLabel("Location");
		lb4.setFont(ft1);
		lb5=new JLabel("Dis_Contact_No");
		lb5.setFont(ft1);
		lb6=new JLabel("FOS_Name");
		lb6.setFont(ft1);
		lb7=new JLabel("Current_Date");
		lb7.setFont(ft1);
		lb8=new JLabel("Send_Date");
		lb8.setFont(ft1);
		lb9=new JLabel("Send_CAF_Count");
		lb9.setFont(ft1);
		lb10=new JLabel("Recieved_Date");
		l10.setFont(ft1);
		lb11=new JLabel("Recieved_CAF_Count");
		lb11.setFont(ft1);
		lb12=new JLabel("To update any record, Click on 'Edit' button");
		lb12.setFont(ft1);
		lb13=new JLabel("To delete any record, Click on 'Delete' button");
		lb13.setFont(ft1);
		tf1=new JTextField();
		tf2=new JTextField();
		tf3=new JTextField();
		tf4=new JTextField();
		tf5=new JTextField();
		tf6=new JTextField();
		tf7=new JTextField();
		tf8=new JTextField();
		tf9=new JTextField();
		tf10=new JTextField();
		tf11=new JTextField();
		b25=new JButton("Submit");
		b25.setMnemonic('S');
		b35=new JButton("Reset");
		b35.setMnemonic('R');
		b45=new JButton("Close");
		b45.setMnemonic('o');
		b55=new JButton("Logout");
		b55.setMnemonic('g');
		b65=new JButton("Edit");
		b65.setMnemonic('d');
		b75=new JButton("Delete");
		b75.setMnemonic('e');
		
		b25.setBounds(600,500,80,20);
		b35.setBounds(700,500,70,20);
		b45.setBounds(795,500,70,20);
		b55.setBounds(890,500,80,20);
		b65.setBounds(600,550,70,20);
		b75.setBounds(600,590,70,20);
		p51.setBounds(40,40,1000,160);
		p52.setBounds(40,220,1000,60);
		p53.setBounds(40,300,1000,160);
		lb1.setBounds(100,30,100,20);
		tf1.setBounds(210,30,150,20);
		lb2.setBounds(450,30,100,20);
		tf2.setBounds(560,30,150,20);//EO 1st line
		lb3.setBounds(100,70,100,20);
		tf3.setBounds(210,70,150,20);
		lb4.setBounds(450,70,100,20);
		tf4.setBounds(560,70,150,20);//EO 2nd line
		lb5.setBounds(100,110,100,20);
		tf5.setBounds(210,110,150,20);
		
		lb6.setBounds(100,20,100,20);
		tf6.setBounds(210,20,150,20);
		
		lb7.setBounds(100,30,100,20);
		tf7.setBounds(210,30,150,20);//EO 1st line
		lb8.setBounds(100,70,100,20);
		tf8.setBounds(210,70,150,20);
		lb9.setBounds(450,70,150,20);
		tf9.setBounds(610,70,150,20);//EO 2nd line
		lb10.setBounds(100,110,100,20);
		tf10.setBounds(210,110,150,20);
		lb11.setBounds(450,110,150,20);
		tf11.setBounds(610,110,150,20);//EO 3rd line
		
		lb12.setBounds(200,550,350,20);
		lb13.setBounds(200,590,350,20);
		
		p5.add(p51);
		p5.add(p52);
		p5.add(p53);
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
		p5.add(lb12);
		p5.add(lb13);
		p53.add(tf7);
		p53.add(tf8);
		p53.add(tf9);
		p53.add(tf10);
		p53.add(tf11);
		p5.add(b25);
		p5.add(b35);
		p5.add(b45);
		p5.add(b55);
		p5.add(b65);
		p5.add(b75);
		
		//Welcome
		co1=new JLabel("Welcome in CORPORATE RECRUITEMENT SYSTEM");
		co1.setFont(ft);
		co2=new JLabel("    They conquer who help themselves.");
		co3=new JLabel("    The truth is rarely pure and never simple.");
		co4=new JLabel("    Without trust their is nothing.");
		co5=new JLabel("    He who wants a rose must respect the thorn.");
		co6=new JLabel("    Integrity is the essence of everything successful.");
		co7=new JLabel("    Adversity reveals genius,prosperity conceals it.");
		co8=new JLabel("    Everyone hears only what he understand.");
		co9=new JLabel("    Men are respectable only as they respect.");
		co10=new JLabel("    The body must obey the mind always.");
		co0=new JLabel("    Needs are hierarchical in nature.");
		pw=new JPanel();
		pw.setLayout(null);
		pw.setBounds(0,0,1100,100);
		pw.setBackground(cl1);
		pw.setBorder(bbr1);
		p1.add(pw);
		co1.setBounds(10,10,1200,70);
		co2.setBounds(400,200,500,30);
		co3.setBounds(400,233,500,30);
		co4.setBounds(400,256,500,30);
		co5.setBounds(400,289,500,30);
		co6.setBounds(400,322,500,30);
		co7.setBounds(400,356,500,30);
		co8.setBounds(400,389,500,30);
		co9.setBounds(400,422,500,30);
		co10.setBounds(400,456,500,30);
		co0.setBounds(400,489,500,30);
		pw.add(co1);
		co2.setBorder(bbr2);
		co3.setBorder(bbr2);
		co4.setBorder(bbr2);
		co5.setBorder(bbr2);
		co6.setBorder(bbr2);
		co7.setBorder(bbr2);
		co8.setBorder(bbr2);
		co9.setBorder(bbr2);
		co10.setBorder(bbr2);
		co0.setBorder(bbr2);
		co2.setOpaque(true);
		co3.setOpaque(false);
		co4.setOpaque(true);
		co5.setOpaque(false);
		co6.setOpaque(true);
		co7.setOpaque(false);
		co8.setOpaque(true);
		co9.setOpaque(false);
		co10.setOpaque(true);
		co0.setOpaque(false);
		co2.setBackground(cl1);
		co3.setBackground(cl1);
		co4.setBackground(cl1);
		co5.setBackground(cl1);
		co6.setBackground(cl1);
		co7.setBackground(cl1);
		co8.setBackground(cl1);
		co9.setBackground(cl1);
		co10.setBackground(cl1);
		co0.setBackground(cl1);
		p1.add(co2);
		p1.add(co3);
		p1.add(co4);
		p1.add(co5);
		p1.add(co6);
		p1.add(co7);
		p1.add(co8);
		p1.add(co9);
		p1.add(co10);
		p1.add(co0);
		
		//rejected caf objects panel 4
		p41=new JPanel();
		p42=new JPanel();
		p41.setLayout(null);
		p42.setLayout(null);
		p41.setBackground(cl1);
		p42.setBackground(cl1);
		tbr7=new TitledBorder(lbr1,"");
		tbr8=new TitledBorder(lbr1,"Rejected CAF Details");
		cbr7=new CompoundBorder(bbr1,tbr7);
		cbr8=new CompoundBorder(bbr1,tbr8);
		p41.setBounds(40,40,1000,150);
		p42.setBounds(40,200,1000,200);
		p41.setBorder(cbr7);
		p42.setBorder(cbr8);
		p4.add(p41);
		p4.add(p42);
		l41=new JLabel("Current Date");
		l41.setFont(ft1);
		l42=new JLabel("Recieved Date");
		l42.setFont(ft1);
		l43=new JLabel("Dealer Code");
		l43.setFont(ft1);
		l44=new JLabel("Distributer Name");
		l44.setFont(ft1);
		l45=new JLabel("FOS Name");
		l45.setFont(ft1);
		l46=new JLabel("CAF No");
		l46.setFont(ft1);
		l47=new JLabel("MDN No");
		l47.setFont(ft1);
		l48=new JLabel("Rejection Date");
		l48.setFont(ft1);
		l49=new JLabel("Reason_1st_Level");
		l49.setFont(ft1);
		l410=new JLabel("Reason_2nd_Level");
		l410.setFont(ft1);
		l411=new JLabel("Send Date");
		l411.setFont(ft1);
		l412=new JLabel("Status");
		l412.setFont(ft1);
		t41=new JTextField();
		t42=new JTextField();
		t43=new JTextField();
		t44=new JTextField();
		t45=new JTextField();
		t46=new JTextField();
		t47=new JTextField();
		t48=new JTextField();
		t49=new JTextField();
		t410=new JTextField();
		t411=new JTextField();
		t412=new JTextField();
		b41=new JButton("Submit");
		b41.setMnemonic('S');
		b42=new JButton("Reset");
		b42.setMnemonic('R');
		b43=new JButton("Close");
		b43.setMnemonic('o');
		b44=new JButton("Logout");
		b44.setMnemonic('g');
		
		l41.setBounds(100,30,150,20);
		t41.setBounds(260,30,150,20);
		l42.setBounds(450,30,150,20);
		t42.setBounds(610,30,150,20);
		l43.setBounds(100,70,150,20);
		t43.setBounds(260,70,150,20);
		l44.setBounds(450,70,150,20);
		t44.setBounds(610,70,150,20);
		l45.setBounds(100,110,150,20);
		t45.setBounds(260,110,150,20);//EO 1st panel
		l46.setBounds(100,30,150,20);
		t46.setBounds(260,30,150,20);
		l47.setBounds(450,30,150,20);
		t47.setBounds(610,30,150,20);
		l48.setBounds(100,70,150,20);
		t48.setBounds(260,70,150,20);
		l49.setBounds(100,110,150,20);
		t49.setBounds(260,110,150,20);
		l410.setBounds(450,110,150,20);
		t410.setBounds(610,110,150,20);
		l411.setBounds(100,150,150,20);
		t411.setBounds(260,150,150,20);
		l412.setBounds(450,150,150,20);
		t412.setBounds(610,150,150,20);//EO 2nd Panel
		b41.setBounds(600,450,80,20);
		b42.setBounds(700,450,70,20);
		b43.setBounds(795,450,70,20);
		b44.setBounds(890,450,80,20);
		
		p41.add(l41);
		p41.add(l42);
		p41.add(l43);
		p41.add(l44);
		p41.add(l45);
		p41.add(t41);
		p41.add(t42);
		p41.add(t43);
		p41.add(t44);
		p41.add(t45);
		p42.add(l46);
		p42.add(l47);
		p42.add(l48);
		p42.add(l49);
		p42.add(l410);
		p42.add(l411);
		p42.add(l412);
		p42.add(t46);
		p42.add(t47);
		p42.add(t48);
		p42.add(t49);
		p42.add(t410);
		p42.add(t411);
		p42.add(t412);
		p4.add(b41);
		p4.add(b42);
		p4.add(b43);
		p4.add(b44);
		
		//Proccess chart objects
		String str[]={""};
		tm=new DefaultTableModel(str,0);
		jt=new JTable(tm);
		sp1=new JScrollPane(jt,JScrollPane.VERTICAL_SCROLLBAR_AS_NEEDED,JScrollPane.HORIZONTAL_SCROLLBAR_AS_NEEDED);
		sp1.setVisible(true);
		sp1.setBounds(40,300,1000,400);
		p2.add(sp1);
		pc1=new JPanel();
		pc2=new JPanel();
		pc3=new JPanel();
		pc1.setLayout(null);
		pc2.setLayout(null);
		pc3.setLayout(null);
		pc1.setBackground(cl1);
		pc2.setBackground(cl1);
		pc3.setBackground(cl1);
		pc1.setBounds(40,40,1000,50);
		pc2.setBounds(40,100,1000,50);
		pc3.setBounds(40,160,1000,50);
		c1=new JCheckBox("Distributor Details");
		c1.setBounds(2,5,150,10);
		c1.setOpaque(false);
		c2=new JCheckBox("Customer Details");
		c2.setBounds(2,5,150,10);
		c2.setOpaque(false);
		c3=new JCheckBox("Rejected CAF Details");
		c3.setBounds(2,5,150,10);
		c3.setOpaque(false);
		tbr12=new TitledBorder(lbr1,"");
		cbr9=new CompoundBorder(bbr1,tbr12);
		pc1.setBorder(cbr9);
		pc2.setBorder(cbr9);
		pc3.setBorder(cbr9);
		pc1.add(c1);
		pc2.add(c2);
		pc3.add(c3);
		p2.add(pc1);
		p2.add(pc2);
		p2.add(pc3);
		pb1=new JButton("Search");
		pb1.setMnemonic('r');
		pb2=new JButton("Close");
		pb2.setMnemonic('o');
		pb3=new JButton("Logout");
		pb3.setMnemonic('g');
		pb4=new JButton("Show");
		pb4.setMnemonic('w');
		pb5=new JButton("Help");
		pb5.setMnemonic('H');
		pb1.setBounds(500,250,80,20);
		pb2.setBounds(600,250,80,20);
		pb3.setBounds(700,250,80,20);
		pb4.setBounds(800,250,70,20);
		pb5.setBounds(890,250,70,20);
		p2.add(pb1);
		p2.add(pb2);
		p2.add(pb3);
		p2.add(pb4);
		p2.add(pb5);
		
		pl1=new JLabel("Dealer Code");
		pl1.setFont(ft1);
		pl2=new JLabel("MDN No.");
		pl2.setFont(ft1);
		pl3=new JLabel("MDN No.");
		pl3.setFont(ft1);
		pt1=new JTextField();
		pt1.setEnabled(false);
		pt2=new JTextField();
		pt2.setEnabled(false);
		pt3=new JTextField();
		pt3.setEnabled(false);
		pl1.setBounds(100,20,100,20);
		pt1.setBounds(210,20,100,20);
		pl2.setBounds(100,20,100,20);
		pt2.setBounds(210,20,100,20);
		pl3.setBounds(100,20,100,20);
		pt3.setBounds(210,20,100,20);
		pc1.add(pl1);
		pc1.add(pt1);
		pc2.add(pl2);
		pc2.add(pt2);
		pc3.add(pl3);
		pc3.add(pt3);
		
		//help objects
		hb1=new JButton("Logout");
		hb1.setMnemonic('g');
		hb2=new JButton("Close");
		hb2.setMnemonic('o');
		lp1=new JLabel("   CAF(Customer Application Form) Information");
		lp1.setFont(ft1);
		lp2=new JLabel("   Distributor Information");
		lp2.setFont(ft1);
		lp3=new JLabel("   Rejected Form Information");
		lp3.setFont(ft1);
		lp4=new JLabel(" If you want to be aware of this application please read carefully this whole information which have a lot of knowledge.");
		lp4.setBounds(20,10,800,20);
		lp1.setBounds(40,40,400,20);
		lp2.setBounds(40,270,400,20);
		lp3.setBounds(40,500,400,20);
		hb1.setBounds(920,10,80,20);
		hb2.setBounds(820,10,80,20);
		lp1.setBorder(bbr1);
		lp2.setBorder(bbr1);
		lp3.setBorder(bbr1);
		lp1.setOpaque(true);
		lp2.setOpaque(true);
		lp3.setOpaque(true);
		lp1.setBackground(cl1);
		lp2.setBackground(cl1);
		lp3.setBackground(cl1);
		p6.add(lp1);
		p6.add(lp2);
		p6.add(lp3);
		p6.add(lp4);
		p6.add(hb2);
		p6.add(hb1);
		jta1=new JTextArea("\n   To fill CAF,\n\n"+"   Firstly type the 10 Digit CAF No. and click on the 'CHECK' button,\n"+"   If the message box shows a positive message, then all of the form will be enabled else a negative message will show on the message box.\n"+"   Please read the message carefully and proceed according to that.\n\n\n"+"   Note:-  Don't leave any field empty, it can never submit your information in database.\n\n\n"+"   There are many types of messages which are displayed on the message box, if you enter insufficient information.\n\n"+"   These informations are --\n"+"   i  - You can enter CAF or MDN No. less than 10 digits.\n"+"   ii - You can enter CAF or MDN No. more than 10 digits.\n"+"   iii- May be CAF No. not matched in database.\n\n"+"   Proccess on buttons(Submit,Reset,Close,Logout):--\n"+"   i  - Submit button is used to save the data entered into CAF.\n"+"   ii - If any wrong entry is shown on the display, then Reset button is used to set again CAF.\n"+"   iii- We can close the showing panel and come to the 1st panel.\n"+"   iv - To close the mainform and return to login form.\n");
		jta2=new JTextArea("\n   To fill Distributor Information,\n\n\n"+"   Note:-  Don't leave any field empty, it can never submit your information in database.\n\n"+"      We can submit, update, delete records through this frame --\n\n"+"        'SUBMIT', Enter the whole information which belongs to the distributor or needed to fullfil entry.\n"+"       'UPDATE', Cilck on 'edit' button then a next frame is opened, then enter distrbutor/dealer code to enable the form,and then make changes.\n"+"      'DELETE', Enter the distributor/deaker code, which record is to delete.");
		jta3=new JTextArea("\n   To fill Rejected CAF Information,\n\n\n"+"   Note:-  Don't leave any field empty, it can never submit your information in database.\n\n"+"      Rejected CAF records are not possible to delete and update, these are only for submitted.");
		sp2=new JScrollPane(jta1,JScrollPane.VERTICAL_SCROLLBAR_AS_NEEDED,JScrollPane.HORIZONTAL_SCROLLBAR_AS_NEEDED);
		sp3=new JScrollPane(jta2,JScrollPane.VERTICAL_SCROLLBAR_AS_NEEDED,JScrollPane.HORIZONTAL_SCROLLBAR_AS_NEEDED);
		sp4=new JScrollPane(jta3,JScrollPane.VERTICAL_SCROLLBAR_AS_NEEDED,JScrollPane.HORIZONTAL_SCROLLBAR_AS_NEEDED);
		sp2.setBounds(40,60,1000,200);
		sp3.setBounds(40,290,1000,200);
		sp4.setBounds(40,520,1000,200);
		sp2.setForeground(cl1);
		sp3.setBackground(cl1);
		sp4.setBackground(cl1);
		sp2.setBorder(bbr2);
		sp3.setBorder(bbr2);
		sp4.setBorder(bbr2);
		jta1.setEditable(false);
		jta2.setEditable(false);
		jta3.setEditable(false);
		p6.add(sp2);
		p6.add(sp3);
		p6.add(sp4);
		
		jc.addActionListener(this);
		b1.addActionListener(this);
		b2.addActionListener(this);
		b3.addActionListener(this);
		b4.addActionListener(this);
		c1.addActionListener(this);
		c2.addActionListener(this);
		c3.addActionListener(this);
		b41.addActionListener(this);
		b42.addActionListener(this);
		b43.addActionListener(this);
		b44.addActionListener(this);
		b25.addActionListener(this);
		b35.addActionListener(this);
		b45.addActionListener(this);
		b55.addActionListener(this);
		b65.addActionListener(this);
		b75.addActionListener(this);
		pb1.addActionListener(this);
		pb2.addActionListener(this);
		pb3.addActionListener(this);
		pb4.addActionListener(this);
		b2.addActionListener(this);
		b3.addActionListener(this);
		b1.addActionListener(this);
		b4.addActionListener(this);
		b5.addActionListener(this);
		t1.addActionListener(this);
		pb5.addActionListener(this);
		hb1.addActionListener(this);
		hb2.addActionListener(this);
	}
	public void actionPerformed(ActionEvent ae)
	{
		try
		{
			String sss1=pt1.getText();
			String sss2=pt2.getText();
			String sss3=pt3.getText();
			int len1=sss1.length();
			int len2=sss2.length();
			int len3=sss3.length();
	
			
				
			if(ae.getSource()==b2)
				b2.setToolTipText("Save Record");
			if(ae.getSource()==b3)
				b3.setToolTipText("Reset");
			if(ae.getSource()==b4)
				b4.setToolTipText("Close Tab");
			if(ae.getSource()==b5)
				b5.setToolTipText("Logout Window");
			if(ae.getSource()==b1)
				b1.setToolTipText("Enable Form");
			if(ae.getSource()==pb1)
				pb1.setToolTipText("Search Record");
			if(ae.getSource()==pb2)
				pb2.setToolTipText("Search Record");
			if(ae.getSource()==pb3)
				pb3.setToolTipText("Search Record");
			if(ae.getSource()==pb4)
				pb4.setToolTipText("Search Record");
			if(ae.getSource()==b25)
				b25.setToolTipText("Save Record");
			if(ae.getSource()==b35)
				b35.setToolTipText("Reset");
			if(ae.getSource()==b45)
				b45.setToolTipText("Close Tab");
			if(ae.getSource()==b55)
				b55.setToolTipText("Logout Window");
			if(ae.getSource()==b41)
				b41.setToolTipText("Save Record");
			if(ae.getSource()==b42)
				b42.setToolTipText("Reset");
			if(ae.getSource()==b43)
				b43.setToolTipText("Close Tab");
			if(ae.getSource()==b44)
				b44.setToolTipText("Logout Window");
				
			if(ae.getSource()==b1)
			{
				Class.forName("sun.jdbc.odbc.JdbcOdbcDriver");
				String s1="system";
				String s2="system";
				Connection con=DriverManager.getConnection("jdbc:odbc:c",s1,s2);
				Statement st=con.createStatement();
			
				int flag=1;
				String cs=t1.getText();
				ResultSet rs=st.executeQuery("Select cafno from link");
				
				while(rs.next()==true)
				{
					String cs1=rs.getString(1);
					if(cs1.equals(cs))
						flag=0;
				}							
				
				int len=cs.length();
				if(flag==0)
				{
					t2.requestFocus();
					l2.setEnabled(true);
					l3.setEnabled(true);
					l4.setEnabled(true);
					l5.setEnabled(true);
					l5.setEnabled(true);
					l6.setEnabled(true);
					l7.setEnabled(true);
					l8.setEnabled(true);
					l9.setEnabled(true);
					l10.setEnabled(true);
					l11.setEnabled(true);
					l12.setEnabled(true);
					l13.setEnabled(true);
					l14.setEnabled(true);
					l15.setEnabled(true);
					l16.setEnabled(true);
					l17.setEnabled(true);
					l18.setEnabled(true);
					l19.setEnabled(true);
					l20.setEnabled(true);
					l21.setEnabled(true);
					l22.setEnabled(true);
					l29.setEnabled(true);
					l30.setEnabled(true);
					l31.setEnabled(true);
					l32.setEnabled(true);
					t2.setEnabled(true);
					t3.setEnabled(true);
					t4.setEnabled(true);
					t5.setEnabled(true);
					t6.setEnabled(true);
					t7.setEnabled(true);
					t8.setEnabled(true);
					t9.setEnabled(true);
					t10.setEnabled(true);
					t11.setEnabled(true);
					t12.setEnabled(true);
					t13.setEnabled(true);
					t18.setEnabled(true);
					t19.setEnabled(true);
					to1.setEnabled(true);
					to2.setEnabled(true);
					to3.setEnabled(true);
					to4.setEnabled(true);
					to5.setEnabled(true);
					to6.setEnabled(true);
					to7.setEnabled(true);
					to8.setEnabled(true);
					to9.setEnabled(true);
					to10.setEnabled(true);
					to11.setEnabled(true);
					to12.setEnabled(true);
					to13.setEnabled(true);
					cb1.setEnabled(true);
					cb2.setEnabled(true);
					cb3.setEnabled(true);
					cb4.setEnabled(true);
					cb7.setEnabled(true);
					cb8.setEnabled(true);
					b2.setEnabled(true);
					b3.setEnabled(true);
					jc.setEnabled(true);
					cb1.setSelectedIndex(0);
					cb2.setSelectedIndex(0);
					cb3.setSelectedIndex(0);
					cb4.setSelectedIndex(0);
					cb5.setSelectedIndex(0);
					cb6.setSelectedIndex(0);
					cb7.setSelectedIndex(0);
					cb8.setSelectedIndex(0);
				}
				else
				{
					t1.requestFocus();
					JOptionPane.showMessageDialog(null,"ID doesn't exist.","Warning Message",JOptionPane.INFORMATION_MESSAGE);
				}
				
			}
			
			if(ae.getSource()==b2)
			{
				Class.forName("sun.jdbc.odbc.JdbcOdbcDriver");
				String s1="system";
				String s2="system";
				Connection con=DriverManager.getConnection("jdbc:odbc:c",s1,s2);
				Statement st=con.createStatement();
					
				String strn1,strn2,strn3,strn4,strn5,strn6,strn7,strn8,strn9,strn10,strn11,strn12,strn13;
				
				if(to1.isSelected()==true)
					strn1=to1.getText();
				else
					strn1=to2.getText();
					
				if(to3.isSelected()==true)
					strn2=to3.getText();
				else
					strn2=to4.getText();
					
				if(to5.isSelected()==true)
					strn3=to5.getText();
				else if(to6.isSelected()==true)
					strn3=to6.getText();
				else
					strn3=to7.getText();
					
				if(to8.isSelected()==true)
					strn4=to8.getText();
				else
					strn4=to9.getText();
					
				if(to10.isSelected()==true)
					strn5=to10.getText();
				else
					strn5=to11.getText();
				
				if(to12.isSelected()==true)
					strn13=to12.getText();
				else
					strn13=to13.getText();
					
				strn6=""+cb1.getSelectedItem()+cb2.getSelectedItem()+t8.getText();
				strn7=""+cb3.getSelectedItem();
				strn8=""+cb4.getSelectedItem();
				strn9=""+cb5.getSelectedItem();
				strn10=""+cb6.getSelectedItem();
				strn11=""+cb7.getSelectedItem();
				strn12=""+cb8.getSelectedItem();
				
				st.executeUpdate("insert into caf values('"+t1.getText()+"','"+t2.getText()+"','"+t3.getText()+"','"+t4.getText()+"','"+strn1+"','"+strn2+"','"+strn3+"','"+t5.getText()+"','"+t6.getText()+"','"+t7.getText()+"','"+strn4+"','"+strn5+"','"+strn6+"','"+strn13+"','"+t9.getText()+"','"+t10.getText()+"','"+strn7+"','"+strn8+"','"+t11.getText()+"','"+t12.getText()+"','"+t13.getText()+"','"+t14.getText()+"','"+strn9+"','"+strn10+"','"+t15.getText()+"','"+t16.getText()+"',"+t17.getText()+",'"+strn11+"','"+t18.getText()+"','"+strn12+"','"+t19.getText()+"');");
				con.close();
				
				t1.setText("");
				t2.setText("");
				t3.setText("");
				t4.setText("");
				t5.setText("");
				t6.setText("");
				t7.setText("");
				t8.setText("");
				t9.setText("");
				t10.setText("");
				t11.setText("");
				t12.setText("");
				t13.setText("");
				t14.setText("");
				t15.setText("");
				t16.setText("");
				t17.setText("");
				t18.setText("");
				t19.setText("");
				cb1.setSelectedIndex(0);
				cb2.setSelectedIndex(0);
				cb3.setSelectedIndex(0);
				cb4.setSelectedIndex(0);
				cb5.setSelectedIndex(0);
				cb6.setSelectedIndex(0);
				cb7.setSelectedIndex(0);
				cb8.setSelectedIndex(0);
				t1.requestFocus();
				l2.setEnabled(false);
				l3.setEnabled(false);
				l4.setEnabled(false);
				l5.setEnabled(false);
				l5.setEnabled(false);
				l6.setEnabled(false);
				l7.setEnabled(false);
				l8.setEnabled(false);
				l9.setEnabled(false);
				l10.setEnabled(false);
				l11.setEnabled(false);
				l12.setEnabled(false);
				l13.setEnabled(false);
				l14.setEnabled(false);
				l15.setEnabled(false);
				l16.setEnabled(false);
				l17.setEnabled(false);
				l18.setEnabled(false);
				l19.setEnabled(false);
				l20.setEnabled(false);
				l21.setEnabled(false);
				l22.setEnabled(false);
				l29.setEnabled(false);
				l30.setEnabled(false);
				l31.setEnabled(false);
				l32.setEnabled(false);
				t2.setEnabled(false);
				t3.setEnabled(false);
				t4.setEnabled(false);
				t5.setEnabled(false);
				t6.setEnabled(false);
				t7.setEnabled(false);
				t8.setEnabled(false);
				t9.setEnabled(false);
				t10.setEnabled(false);
				t11.setEnabled(false);
				t12.setEnabled(false);
				t13.setEnabled(false);
				t18.setEnabled(false);
				t19.setEnabled(false);
				to1.setEnabled(false);
				to2.setEnabled(false);
				to3.setEnabled(false);
				to4.setEnabled(false);
				to5.setEnabled(false);
				to6.setEnabled(false);
				to7.setEnabled(false);
				to8.setEnabled(false);
				to9.setEnabled(false);
				to10.setEnabled(false);
				to11.setEnabled(false);
				to12.setEnabled(false);
				to13.setEnabled(false);
				cb1.setEnabled(false);
				cb2.setEnabled(false);
				cb3.setEnabled(false);
				cb4.setEnabled(false);
				cb7.setEnabled(false);
				cb8.setEnabled(false);
				b2.setEnabled(false);
				b3.setEnabled(false);
				jc.setEnabled(false);
				l23.setEnabled(false);
				l24.setEnabled(false);
				l25.setEnabled(false);
				l26.setEnabled(false);
				l27.setEnabled(false);
				l28.setEnabled(false);
				t14.setEnabled(false);
				t15.setEnabled(false);
				t16.setEnabled(false);
				t17.setEnabled(false);
				cb5.setEnabled(false);
				cb6.setEnabled(false);
			}
		
			if(ae.getSource()==jc)
			{
				if(jc.isSelected()==true)
				{
					l23.setEnabled(true);
					l24.setEnabled(true);
					l25.setEnabled(true);
					l26.setEnabled(true);
					l27.setEnabled(true);
					l28.setEnabled(true);
					t14.setEnabled(true);
					t15.setEnabled(true);
					t16.setEnabled(true);
					t17.setEnabled(true);
					cb5.setEnabled(true);
					cb6.setEnabled(true);
					t14.requestFocus();
				}
				else
				{
					l23.setEnabled(false);
					l24.setEnabled(false);
					l25.setEnabled(false);
					l26.setEnabled(false);
					l27.setEnabled(false);
					l28.setEnabled(false);
					t14.setEnabled(false);
					t15.setEnabled(false);
					t16.setEnabled(false);
					t17.setEnabled(false);
					cb5.setEnabled(false);
					cb6.setEnabled(false);
					t14.setText("");
					t15.setText("");
					t16.setText("");
					t17.setText("");
				}
			}
			
			if(ae.getSource()==b41)
			{
				Class.forName("sun.jdbc.odbc.JdbcOdbcDriver");
				String s1="system";
				String s2="system";
				Connection con=DriverManager.getConnection("jdbc:odbc:c",s1,s2);
				Statement st=con.createStatement();
				
				st.executeUpdate("insert into rej values('"+t41.getText()+"','"+t42.getText()+"','"+t43.getText()+"','"+t44.getText()+"','"+t45.getText()+"','"+t46.getText()+"','"+t47.getText()+"','"+t48.getText()+"','"+t49.getText()+"','"+t410.getText()+"','"+t411.getText()+"','"+t412.getText()+"');");
				con.close();
				
				t41.setText("");
				t42.setText("");
				t43.setText("");
				t44.setText("");
				t45.setText("");
				t46.setText("");
				t47.setText("");
				t48.setText("");
				t49.setText("");
				t410.setText("");
				t411.setText("");
				t412.setText("");
				t41.requestFocus();
			}
			
			if(ae.getSource()==b25)
			{
				Class.forName("sun.jdbc.odbc.JdbcOdbcDriver");
				String s1="system";
				String s2="system";
				Connection con=DriverManager.getConnection("jdbc:odbc:c",s1,s2);
				Statement st=con.createStatement();
				
				st.executeUpdate("insert into dis values('"+tf1.getText()+"','"+tf2.getText()+"','"+tf3.getText()+"','"+tf4.getText()+"','"+tf5.getText()+"','"+tf6.getText()+"','"+tf7.getText()+"','"+tf8.getText()+"','"+tf9.getText()+"','"+tf10.getText()+"','"+tf11.getText()+"');");
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
			
			if(c1.isSelected()==true)
			{
				pt1.setEnabled(true);
				pt1.requestFocus();
			}	
			else
				pt1.setEnabled(false);
			if(c2.isSelected()==true)
			{
				pt2.setEnabled(true);
				pt2.requestFocus();
			}
			else
				pt2.setEnabled(false);
			if(c3.isSelected()==true)
			{
				pt3.setEnabled(true);
				pt3.requestFocus();
			}
			else
				pt3.setEnabled(false);
			
			if(c1.isSelected()==true && c2.isSelected()==true && c3.isSelected()==true && ae.getSource()==pb4)
			{
				JOptionPane.showMessageDialog(null,"It is invalid to select all boxes with togather.\n"+"Plz select any one choice.","INFORMATION MESSAGE",JOptionPane.INFORMATION_MESSAGE);				
			}
			else if(c1.isSelected()==true && c2.isSelected()==true && ae.getSource()==pb4)
			{
				JOptionPane.showMessageDialog(null,"It is invalid to select two boxes with togather.\n"+"Plz select any one choice.","INFORMATION MESSAGE",JOptionPane.INFORMATION_MESSAGE);				
			}
			else if(c1.isSelected()==true && c3.isSelected()==true && ae.getSource()==pb4)
			{
				JOptionPane.showMessageDialog(null,"It is invalid to select two boxes with togather.\n"+"Plz select any one choice.","INFORMATION MESSAGE",JOptionPane.INFORMATION_MESSAGE);				
			}
			else if(c2.isSelected()==true && c3.isSelected()==true && ae.getSource()==pb4)
			{
				JOptionPane.showMessageDialog(null,"It is invalid to select two boxes with togather.\n"+"Plz select any one choice.","INFORMATION MESSAGE",JOptionPane.INFORMATION_MESSAGE);				
			}
			else if(c1.isSelected()==false && c2.isSelected()==false && c3.isSelected()==false && ae.getSource()==pb4)
			{
				JOptionPane.showMessageDialog(null,"Minimum one choice is selected.","INFORMATION MESSAGE",JOptionPane.INFORMATION_MESSAGE);
			}
			else
			{
				if(c1.isSelected()==true && ae.getSource()==pb4 && len1==0) 
				{
					Class.forName("sun.jdbc.odbc.JdbcOdbcDriver");
					String s1="system";
					String s2="system";
					Connection con=DriverManager.getConnection("jdbc:odbc:c",s1,s2);
					Statement st=con.createStatement();
				
					String strn[]={"Dis_Code","Dis_name","Address","Location","Cont_No","FOS_name","C_Date","Send_Date","Send_CAF_Co","Rec_Date","Rec_CAF_Co"};
					DefaultTableModel tm1=new DefaultTableModel(strn,0);
					JTable jt1=new JTable(tm1);
					JScrollPane sp11=new JScrollPane(jt1,JScrollPane.VERTICAL_SCROLLBAR_AS_NEEDED,JScrollPane.HORIZONTAL_SCROLLBAR_AS_NEEDED);
					sp11.setVisible(true);
					sp11.setBounds(40,300,1000,400);
					p2.add(sp11);
					ResultSet rs=st.executeQuery("Select * from dis");
					while(rs.next()==true)
					{
						arr1[0]=rs.getString(1);
						arr1[1]=rs.getString(2);
						arr1[2]=rs.getString(3);
						arr1[3]=rs.getString(4);
						arr1[4]=rs.getString(5);
						arr1[5]=rs.getString(6);
						arr1[6]=rs.getString(7);
						arr1[7]=rs.getString(8);
						arr1[8]=rs.getString(9);
						arr1[9]=rs.getString(10);
						arr1[10]=rs.getString(11);
						tm1.addRow(arr1);
					}
					con.close();		
				}
				else if(c2.isSelected()==true && ae.getSource()==pb4 && len2==0)
				{
					Class.forName("sun.jdbc.odbc.JdbcOdbcDriver");
					String s1="system";
					String s2="system";
					Connection con=DriverManager.getConnection("jdbc:odbc:c",s1,s2);
					Statement st=con.createStatement();
					
					String strn[]={"CAF_no","Dealer_code","MDN_no","RSN_no","Photograph","Category","Salutation","First_name","Mid_Nmae","Last_name","Gender","Marital_st","DOB","Nationnality","F/H_name","P_Address","P_State","P_City","Pin_code","District","Alt_no","L_Address","L_State","L_City","Pin_code","District","Alt_no","POI","POI_ref","POA","POA_ref"};
					DefaultTableModel tm1=new DefaultTableModel(strn,0);
					JTable jt1=new JTable(tm1);
					JScrollPane sp11=new JScrollPane(jt1,JScrollPane.VERTICAL_SCROLLBAR_AS_NEEDED,JScrollPane.HORIZONTAL_SCROLLBAR_AS_NEEDED);
					sp11.setVisible(true);
					sp11.setBounds(40,300,1000,400);
					p2.add(sp11);
					
					ResultSet rs=st.executeQuery("Select * from caf");
					while(rs.next()==true)
					{
						arr2[0]=rs.getString(1);
						arr2[1]=rs.getString(2);
						arr2[2]=rs.getString(3);
						arr2[3]=rs.getString(4);
						arr2[4]=rs.getString(5);
						arr2[5]=rs.getString(6);
						arr2[6]=rs.getString(7);
						arr2[7]=rs.getString(8);
						arr2[8]=rs.getString(9);
						arr2[9]=rs.getString(10);
						arr2[10]=rs.getString(11);
						arr2[11]=rs.getString(12);
						arr2[12]=rs.getString(13);
						arr2[13]=rs.getString(14);
						arr2[14]=rs.getString(15);
						arr2[15]=rs.getString(16);
						arr2[16]=rs.getString(17);
						arr2[17]=rs.getString(18);
						arr2[18]=rs.getString(19);
						arr2[19]=rs.getString(20);
						arr2[20]=rs.getString(21);
						arr2[21]=rs.getString(22);
						arr2[22]=rs.getString(23);
						arr2[23]=rs.getString(24);
						arr2[24]=rs.getString(25);
						arr2[25]=rs.getString(26);
						arr2[26]=rs.getString(27);
						arr2[27]=rs.getString(28);
						arr2[28]=rs.getString(29);
						arr2[29]=rs.getString(30);
						arr2[30]=rs.getString(31);
						tm1.addRow(arr2);
					}
					con.close();
					
				}
				else if(c3.isSelected()==true && ae.getSource()==pb4 && len3==0)
				{
					Class.forName("sun.jdbc.odbc.JdbcOdbcDriver");
					String s1="system";
					String s2="system";
					Connection con=DriverManager.getConnection("jdbc:odbc:c",s1,s2);
					Statement st=con.createStatement();
					
					String strn[]={"Current_date","Rec_date","Dis_code","Dis_name","FOS_name","CAF_no","MDN_no","Rej_date","Rej_1st_lvl","Rej_2nd_lvl","Send_date","Status"};
					DefaultTableModel tm1=new DefaultTableModel(strn,0);
					JTable jt1=new JTable(tm1);
					JScrollPane sp11=new JScrollPane(jt1,JScrollPane.VERTICAL_SCROLLBAR_AS_NEEDED,JScrollPane.HORIZONTAL_SCROLLBAR_AS_NEEDED);
					sp11.setVisible(true);
					sp11.setBounds(40,300,1000,400);
					p2.add(sp11);
					ResultSet rs=st.executeQuery("Select * from rej");
					while(rs.next()==true)
					{
						arr[0]=rs.getString(1);
						arr[1]=rs.getString(2);
						arr[2]=rs.getString(3);
						arr[3]=rs.getString(4);
						arr[4]=rs.getString(5);
						arr[5]=rs.getString(6);
						arr[6]=rs.getString(7);
						arr[7]=rs.getString(8);
						arr[8]=rs.getString(9);
						arr[9]=rs.getString(10);
						arr[10]=rs.getString(11);
						arr[11]=rs.getString(12);
						tm1.addRow(arr);
					}
					con.close();
				}
				else if(len1>0 && ae.getSource()==pb4)
				{
					JOptionPane.showMessageDialog(null,"Invalid Action","Warning Message",JOptionPane.INFORMATION_MESSAGE);
				}
				else if(len2>0 && ae.getSource()==pb4)
				{
					JOptionPane.showMessageDialog(null,"Invalid Action","Warning Message",JOptionPane.INFORMATION_MESSAGE);
				}
				else if(len3>0 && ae.getSource()==pb4)
				{
					JOptionPane.showMessageDialog(null,"Invalid Action","Warning Message",JOptionPane.INFORMATION_MESSAGE);
				}
				else
				{
					String str[]={""};
					tm=new DefaultTableModel(str,0);
					jt=new JTable(tm);
					sp1=new JScrollPane(jt,JScrollPane.VERTICAL_SCROLLBAR_AS_NEEDED,JScrollPane.HORIZONTAL_SCROLLBAR_AS_NEEDED);
					sp1.setVisible(true);
					sp1.setBounds(40,300,1000,400);
					p2.add(sp1);
				}
				
				
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
				t9.setText("");
				t10.setText("");
				t11.setText("");
				t12.setText("");
				t13.setText("");
				t14.setText("");
				t15.setText("");
				t16.setText("");
				t17.setText("");
				t18.setText("");
				t19.setText("");
		//		l2.setEnabled(false);
		//		l3.setEnabled(false);
				l4.setEnabled(false);
				l5.setEnabled(false);
				l5.setEnabled(false);
				l6.setEnabled(false);
				l7.setEnabled(false);
				l8.setEnabled(false);
				l9.setEnabled(false);
				l10.setEnabled(false);
				l11.setEnabled(false);
				l12.setEnabled(false);
				l13.setEnabled(false);
				l14.setEnabled(false);
				l15.setEnabled(false);
				l16.setEnabled(false);
				l17.setEnabled(false);
				l18.setEnabled(false);
				l19.setEnabled(false);
				l20.setEnabled(false);
				l21.setEnabled(false);
				l22.setEnabled(false);
				l29.setEnabled(false);
				l30.setEnabled(false);
				l31.setEnabled(false);
				l32.setEnabled(false);
				t2.setEnabled(false);
				t3.setEnabled(false);
				t4.setEnabled(false);
				t5.setEnabled(false);
				t6.setEnabled(false);
				t7.setEnabled(false);
				t8.setEnabled(false);
				t9.setEnabled(false);
				t10.setEnabled(false);
				t11.setEnabled(false);
				t12.setEnabled(false);
				t13.setEnabled(false);
				t18.setEnabled(false);
				t19.setEnabled(false);
				to1.setEnabled(false);
				to2.setEnabled(false);
				to3.setEnabled(false);
				to4.setEnabled(false);
				to5.setEnabled(false);
				to6.setEnabled(false);
				to7.setEnabled(false);
				to8.setEnabled(false);
				to9.setEnabled(false);
				to10.setEnabled(false);
				to11.setEnabled(false);
				to12.setEnabled(false);
				to13.setEnabled(false);
				cb1.setEnabled(false);
				cb2.setEnabled(false);
				cb3.setEnabled(false);
				cb4.setEnabled(false);
				cb7.setEnabled(false);
				cb8.setEnabled(false);
				b2.setEnabled(false);
				b3.setEnabled(false);
				jc.setEnabled(false);
				l23.setEnabled(false);
				l24.setEnabled(false);
				l25.setEnabled(false);
				l26.setEnabled(false);
				l27.setEnabled(false);
				l28.setEnabled(false);
				t14.setEnabled(false);
				t15.setEnabled(false);
				t16.setEnabled(false);
				t17.setEnabled(false);
				cb5.setEnabled(false);
				cb6.setEnabled(false);
				cb1.setSelectedIndex(0);
				cb2.setSelectedIndex(0);
				cb3.setSelectedIndex(0);
				cb4.setSelectedIndex(0);
				cb5.setSelectedIndex(0);
				cb6.setSelectedIndex(0);
				cb7.setSelectedIndex(0);
				cb8.setSelectedIndex(0);
				t1.requestFocus();
			}
			if(ae.getSource()==b42)
			{
				t41.setText("");
				t42.setText("");
				t43.setText("");
				t44.setText("");
				t45.setText("");
				t46.setText("");
				t47.setText("");
				t48.setText("");
				t49.setText("");
				t410.setText("");
				t411.setText("");
				t412.setText("");
				t41.requestFocus();
			}
			if(ae.getSource()==b35)
			{
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
			
			if(c1.isSelected()==true && c2.isSelected()==true && c3.isSelected()==true && ae.getSource()==pb1)
			{
				JOptionPane.showMessageDialog(null,"It is invalid to select all boxes with togather.\n"+"Plz select any one choice.","INFORMATION MESSAGE",JOptionPane.INFORMATION_MESSAGE);				
			}
			else if(c1.isSelected()==true && c2.isSelected()==true && ae.getSource()==pb1)
			{
				JOptionPane.showMessageDialog(null,"It is invalid to select two boxes with togather.\n"+"Plz select any one choice.","INFORMATION MESSAGE",JOptionPane.INFORMATION_MESSAGE);				
			}
			else if(c1.isSelected()==true && c3.isSelected()==true && ae.getSource()==pb1)
			{
				JOptionPane.showMessageDialog(null,"It is invalid to select two boxes with togather.\n"+"Plz select any one choice.","INFORMATION MESSAGE",JOptionPane.INFORMATION_MESSAGE);				
			}
			else if(c2.isSelected()==true && c3.isSelected()==true && ae.getSource()==pb1)
			{
				JOptionPane.showMessageDialog(null,"It is invalid to select two boxes with togather.\n"+"Plz select any one choice.","INFORMATION MESSAGE",JOptionPane.INFORMATION_MESSAGE);				
			}
			else if(c1.isSelected()==false && c2.isSelected()==false && c3.isSelected()==false && ae.getSource()==pb1)
			{
				JOptionPane.showMessageDialog(null,"Minimum one choice is selected.","INFORMATION MESSAGE",JOptionPane.INFORMATION_MESSAGE);
			}
			else
			{	
				if(len1>0 && c1.isSelected()==true && ae.getSource()==pb1)
				{
					Class.forName("sun.jdbc.odbc.JdbcOdbcDriver");
					String s1="system";
					String s2="system";
					Connection con=DriverManager.getConnection("jdbc:odbc:c",s1,s2);
					Statement st=con.createStatement();
					
					String strn[]={"Dis_Code","Dis_name","Address","Location","Cont_No","FOS_name","C_Date","Send_Date","Send_CAF_Co","Rec_Date","Rec_CAF_Co"};
					DefaultTableModel tm1=new DefaultTableModel(strn,0);
					JTable jt1=new JTable(tm1);
					JScrollPane sp11=new JScrollPane(jt1,JScrollPane.VERTICAL_SCROLLBAR_AS_NEEDED,JScrollPane.HORIZONTAL_SCROLLBAR_AS_NEEDED);
					sp11.setVisible(true);
					sp11.setBounds(40,300,1000,400);
					p2.add(sp11);
					
					String str=pt1.getText();
					ResultSet rs=st.executeQuery("select * from dis where dis_code='"+str+"'");
					while(rs.next()==true)
					{
						arr1[0]=rs.getString(1);
						arr1[1]=rs.getString(2);
						arr1[2]=rs.getString(3);
						arr1[3]=rs.getString(4);
						arr1[4]=rs.getString(5);
						arr1[5]=rs.getString(6);
						arr1[6]=rs.getString(7);
						arr1[7]=rs.getString(8);
						arr1[8]=rs.getString(9);
						arr1[9]=rs.getString(10);
						arr1[10]=rs.getString(11);
						tm1.addRow(arr1);
					}
					con.close();
					pt1.requestFocus();
				}
				
				else if(len2>0 && c2.isSelected()==true && ae.getSource()==pb1)
				{
					Class.forName("sun.jdbc.odbc.JdbcOdbcDriver");
					String s1="system";
					String s2="system";
					Connection con=DriverManager.getConnection("jdbc:odbc:c",s1,s2);
					Statement st=con.createStatement();
					
					String strn[]={"CAF_no","Dealer_code","MDN_no","RSN_no","Photograph","Category","Salutation","First_name","Mid_Nmae","Last_name","Gender","Marital_st","DOB","Nationnality","F/H_name","P_Address","P_State","P_City","Pin_code","District","Alt_no","L_Address","L_State","L_City","Pin_code","District","Alt_no","POI","POI_ref","POA","POA_ref"};
					DefaultTableModel tm1=new DefaultTableModel(strn,0);
					JTable jt1=new JTable(tm1);
					JScrollPane sp11=new JScrollPane(jt1,JScrollPane.VERTICAL_SCROLLBAR_AS_NEEDED,JScrollPane.HORIZONTAL_SCROLLBAR_AS_NEEDED);
					sp11.setVisible(true);
					sp11.setBounds(40,300,1000,400);
					p2.add(sp11);
					
					String str=pt2.getText();
					ResultSet rs=st.executeQuery("select * from caf where mdn='"+str+"'");
					while(rs.next()==true)
					{
						arr2[0]=rs.getString(1);
						arr2[1]=rs.getString(2);
						arr2[2]=rs.getString(3);
						arr2[3]=rs.getString(4);
						arr2[4]=rs.getString(5);
						arr2[5]=rs.getString(6);
						arr2[6]=rs.getString(7);
						arr2[7]=rs.getString(8);
						arr2[8]=rs.getString(9);
						arr2[9]=rs.getString(10);
						arr2[10]=rs.getString(11);
						arr2[11]=rs.getString(12);
						arr2[12]=rs.getString(13);
						arr2[13]=rs.getString(14);
						arr2[14]=rs.getString(15);
						arr2[15]=rs.getString(16);
						arr2[16]=rs.getString(17);
						arr2[17]=rs.getString(18);
						arr2[18]=rs.getString(19);
						arr2[19]=rs.getString(20);
						arr2[20]=rs.getString(21);
						arr2[21]=rs.getString(22);
						arr2[22]=rs.getString(23);
						arr2[23]=rs.getString(24);
						arr2[24]=rs.getString(25);
						arr2[25]=rs.getString(26);
						arr2[26]=rs.getString(27);
						arr2[27]=rs.getString(28);
						arr2[28]=rs.getString(29);
						arr2[29]=rs.getString(30);
						arr2[30]=rs.getString(31);
						tm1.addRow(arr2);
					}
					con.close();
					
					pt2.requestFocus();
				}
				else if(len3>0 && c3.isSelected()==true && ae.getSource()==pb1)
				{
					Class.forName("sun.jdbc.odbc.JdbcOdbcDriver");
					String s1="system";
					String s2="system";
					Connection con=DriverManager.getConnection("jdbc:odbc:c",s1,s2);
					Statement st=con.createStatement();
					
					String strn[]={"Current_date","Rec_date","Dis_code","Dis_name","FOS_name","CAF_no","MDN_no","Rej_date","Rej_1st_lvl","Rej_2nd_lvl","Send_date","Status"};
					DefaultTableModel tm1=new DefaultTableModel(strn,0);
					JTable jt1=new JTable(tm1);
					JScrollPane sp11=new JScrollPane(jt1,JScrollPane.VERTICAL_SCROLLBAR_AS_NEEDED,JScrollPane.HORIZONTAL_SCROLLBAR_AS_NEEDED);
					sp11.setVisible(true);
					sp11.setBounds(40,300,1000,400);
					p2.add(sp11);
					
					String str=pt3.getText();
					ResultSet rs=st.executeQuery("select * from rej where current_date='"+str+"'");
					while(rs.next()==true)
					{
						arr[0]=rs.getString(1);
						arr[1]=rs.getString(2);
						arr[2]=rs.getString(3);
						arr[3]=rs.getString(4);
						arr[4]=rs.getString(5);
						arr[5]=rs.getString(6);
						arr[6]=rs.getString(7);
						arr[7]=rs.getString(8);
						arr[8]=rs.getString(9);
						arr[9]=rs.getString(10);
						arr[10]=rs.getString(11);
						arr[11]=rs.getString(12);
						tm1.addRow(arr);
					}
					con.close();
					pt3.requestFocus();
				}
				else if(len1==0 && ae.getSource()==pb1)
				{
					JOptionPane.showMessageDialog(null,"Invalid Action","Warning Message",JOptionPane.INFORMATION_MESSAGE);
				}
				else if(len2==0 && ae.getSource()==pb1)
				{
					JOptionPane.showMessageDialog(null,"Invalid Action","Warning Message",JOptionPane.INFORMATION_MESSAGE);
				}
				else if(len3==0 && ae.getSource()==pb1)
				{
					JOptionPane.showMessageDialog(null,"Invalid Action","Warning Message",JOptionPane.INFORMATION_MESSAGE);
				}
				else
				{
					String str[]={""};
					tm=new DefaultTableModel(str,0);
					jt=new JTable(tm);
					sp1=new JScrollPane(jt,JScrollPane.VERTICAL_SCROLLBAR_AS_NEEDED,JScrollPane.HORIZONTAL_SCROLLBAR_AS_NEEDED);
					sp1.setVisible(true);
					sp1.setBounds(40,300,1000,400);
					p2.add(sp1);
					
					pt1.setText("");
					pt2.setText("");
					pt3.setText("");
				}	
			}
			
			if(ae.getSource()==pb5)
			{
//				help hp=new help();
//				hp.setSize(500,500);
//				hp.setVisible(true);
//				hp.setTitle("Help");
			}
			
			if(ae.getSource()==b5||ae.getSource()==b55||ae.getSource()==b44||ae.getSource()==hb1)
			{
				loadingform.mf.dispose();
				login.ob.show();
			}
			
			if(ae.getSource()==hb2||ae.getSource()==b4||ae.getSource()==b43)
			{
				p1.show();
			}
			
			if(ae.getSource()==b65)
			{
		//		edit jf=new edit();
		//		jf.setSize(810,600);
		//		jf.setVisible(true);
		//		jf.setTitle("Update Records");	
			}
			
			if(ae.getSource()==b75)
			{
		//		del d=new del();
		//		d.setSize(400,400);
		//		d.setVisible(true);
		//		d.setTitle("Delete Records");
			}
		}
		catch(Exception e)
		{
			JOptionPane.showMessageDialog(null,e.getMessage(),"Warning Message",JOptionPane.INFORMATION_MESSAGE);
		}
	}
}