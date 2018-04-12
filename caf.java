import java.io.*;
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import javax.swing.border.*;
import javax.sql.*;

public class caf extends mainform implements ActionListener,MouseListener
{
	public static void main(String a[])
	{
		caf cf=new caf();
		cf.setSize(1100,920);
		cf.setVisible(true);
	}
	
	
	public caf()
	{	
		
		
		
		
		mainform.cn.add(tp);
		
		
		
		b1.addMouseListener(this);
		b2.addMouseListener(this);
		b3.addMouseListener(this);
		b4.addMouseListener(this);
		b5.addMouseListener(this);
	}	
		public void actionPerformed(ActionEvent ae)
		{			
		}
		public void mousePressed(MouseEvent me)
		{
		}
		public void mouseClicked(MouseEvent me)
		{
			if(me.getSource()==b5)
			{
				
				login.ob.show();
				//login.tx1.setText("");
				//login.pf.setText("");
				//login.tx1.requestFocus();
				loadingform.mf.dispose();
			}
			if(me.getSource()==b4)
			{
				p1.show();
			}
			if(me.getSource()==b3)
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
				t1.requestFocus();
			}
		}
		public void mouseReleased(MouseEvent me)
		{
		}
		public void mouseEntered(MouseEvent me)
		{
			if(me.getSource()==b2)
				b2.setToolTipText("Save Record,"+"F7");
			if(me.getSource()==b3)
				b3.setToolTipText("Reset,"+"F8");
			if(me.getSource()==b4)
				b4.setToolTipText("Close Tab,F9");
			if(me.getSource()==b5)
				b5.setToolTipText("Logout Window,F10");
			if(me.getSource()==b1)
				b1.setToolTipText("Enable Form,F1");
		}
		public void mouseExited(MouseEvent me)
		{
		}
}