package org.com.Calc;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.BorderFactory;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JTextArea;
import javax.swing.border.Border;

public class CalculatorLib implements ActionListener{
	
   JFrame frame=new JFrame();//used to build component like label,button,etc to crate GUI
   JPanel panel=new JPanel();// it w ill provide the screen for user input
   JTextArea textarea=new JTextArea(2,10);//use to provide column n row in text area 2=row and 10=column(10digit)
   
   JButton Button1=new JButton("1");
   JButton Button2=new JButton("2");
   JButton Button3=new JButton("3");
   JButton Button4=new JButton("4");
   JButton Button5=new JButton("5");
   JButton Button6=new JButton("6");
   JButton Button7=new JButton("7");
   JButton Button8=new JButton("8");
   JButton Button9=new JButton("9");
   JButton Button0=new JButton("0");
   

   JButton Buttonadd=new JButton("+");
   JButton Buttonsub=new JButton("-");
   JButton Buttonmul=new JButton("*");
   JButton Buttondiv=new JButton("/"); 
   JButton Buttonclear=new JButton("c");
   JButton Buttondot=new JButton(".");
   JButton Buttonequal=new JButton("=");
   
   private static int number1;
   private static int number11;
   private static int number2;
   private static String action;
   private static float result;
  
   
   public CalculatorLib() {
	   frame.setSize(350,450); //to set the frame size width and height
	   frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);//to show the close option
	   frame.setVisible(true);//to show the frame
	   frame.setTitle("Calculator");
	   
	  // frame.setResizable(false);//frame size is frized
	   frame.add(panel);//here panel is added to the frame white screen
	   panel.setBackground(Color.gray);//here panel's color is set as white
	   Border border=BorderFactory.createLineBorder(Color.RED,4);
	   panel.setBorder(border);
	   
	   panel.add(textarea);
	   
	   textarea.setBackground(Color.WHITE);
	   Border tborder=BorderFactory.createLineBorder(Color.BLACK,3);
	   textarea.setBorder(tborder);
	   
	   Font font=new Font("arial",Font.BOLD,33);
	   
	   textarea.setFont(font);
	   textarea.setForeground(Color.BLACK);
	   
	   
	   textarea.setPreferredSize(new Dimension(2,10));
	   textarea.setLineWrap(true);
	   
	   Button1.setPreferredSize(new Dimension(100,40));
	   panel.add(Button1);
	   Button1.setEnabled(true); 
	   Button1.setBackground(Color.WHITE);
	 //  Button1.setBorder(BorderFactory.creatLineBorder(Color.BLACK,3));
	  
	   
	   Button2.setPreferredSize(new Dimension(100,40));
	   panel.add(Button2);
	   Button2.setEnabled(true); 
	   Button2.setBackground(Color.RED);
	  
	   
	   Button3.setPreferredSize(new Dimension(100,40));
	   panel.add(Button3);
	   Button3.setEnabled(true); 
	   Button3.setBackground(Color.RED);
	  
	   
	   Button4.setPreferredSize(new Dimension(100,40));
	   panel.add(Button4);
	   Button4.setEnabled(true); 
	   Button4.setBackground(Color.RED);
	   
	   Button5.setPreferredSize(new Dimension(100,40));
	   panel.add(Button5);
	   Button5.setEnabled(true); 
	   Button5.setBackground(Color.RED);

	   
	   Button6.setPreferredSize(new Dimension(100,40));
	   panel.add(Button6);
	   Button6.setEnabled(true); 
	   Button6.setBackground(Color.RED);
	  
	   
	   Button7.setPreferredSize(new Dimension(100,40));
	   panel.add(Button7);
	   Button7.setEnabled(true); 
	   Button7.setBackground(Color.RED);
	  
	   
	   Button8.setPreferredSize(new Dimension(100,40));
	   panel.add(Button8);
	   Button8.setEnabled(true); 
	   Button8.setBackground(Color.RED);
	 
	   
	   Button9.setPreferredSize(new Dimension(100,40));
	   panel.add(Button9);
	   Button9.setEnabled(true); 
	   Button9.setBackground(Color.RED);
	  
	   
	   Button0.setPreferredSize(new Dimension(100,40));
	   panel.add(Button0);
	   Button0.setEnabled(true); 
	   Button0.setBackground(Color.RED);
	  
	   
	   Buttonadd.setPreferredSize(new Dimension(100,40));
	   panel.add(Buttonadd);
	   Buttonadd.setEnabled(true); 
	   Buttonadd.setBackground(Color.RED);
	  
	   
	   Buttonsub.setPreferredSize(new Dimension(100,40));
	   panel.add(Buttonsub);
	   Buttonsub.setEnabled(true); 
	   Buttonsub.setBackground(Color.RED);
	  
	   
	   Buttonmul.setPreferredSize(new Dimension(100,40));
	   panel.add(Buttonmul);
	   Buttonmul.setEnabled(true); 
	   Buttonmul.setBackground(Color.RED);
	  
	   
	   Buttondiv.setPreferredSize(new Dimension(100,40));
	   panel.add(Buttondiv);
	   Buttondiv.setEnabled(true); 
	   Buttondiv.setBackground(Color.RED);
	
	   
	   Buttondot.setPreferredSize(new Dimension(100,40));
	   panel.add(Buttondot);
	   Buttondot.setEnabled(true); 
	   Buttondot.setBackground(Color.RED);

	   
	   Buttonequal.setPreferredSize(new Dimension(100,40));
	   panel.add(Buttonequal);
	   Buttonequal.setEnabled(true); 
	   Buttonequal.setBackground(Color.RED);

	   Buttonclear.setPreferredSize(new Dimension(100,40));
	   panel.add(Buttonclear);
	   Buttonclear.setEnabled(true); 
	   Buttonclear.setBackground(Color.RED);

	   
	   Button1.addActionListener((ActionListener) this);
	   Button2.addActionListener((ActionListener) this);
	   Button3.addActionListener((ActionListener) this);
	   Button4.addActionListener((ActionListener) this);
	   Button5.addActionListener((ActionListener) this);
	   Button6.addActionListener((ActionListener) this);
	   Button7.addActionListener((ActionListener) this);
	   Button8.addActionListener((ActionListener) this);
	   Button9.addActionListener((ActionListener) this);
	   Button0.addActionListener((ActionListener) this);
	   Buttonadd.addActionListener((ActionListener) this);
	   Buttonsub.addActionListener((ActionListener) this);
	   Buttonmul.addActionListener((ActionListener) this);
	   Buttondiv.addActionListener((ActionListener) this);
	   Buttondot.addActionListener((ActionListener) this);
	   Buttonequal.addActionListener((ActionListener) this);
	   Buttonclear.addActionListener((ActionListener) this);
   }

@Override
public void actionPerformed(ActionEvent e) {
	   Object source=e.getSource();
	   if(source==Buttonclear) {
		   number1=0;
		   number2=0;
		   textarea.setText("");
}
       if(source==Button1) {
    	    String s=textarea.getText()+Button1.getText();
    	    textarea.setText(s);
       }
       if(source==Button2) {
    	   String s=textarea.getText()+Button2.getText();
   	    textarea.setText(s);
       }
       if(source==Button3) {
    	   String s=textarea.getText()+Button3.getText();
   	    textarea.setText(s);
       }
       if(source==Button4) {
    	   String s=textarea.getText()+Button4.getText();
   	    textarea.setText(s);
       }
       if(source==Button5) {
    	   String s=textarea.getText()+Button5.getText();
   	    textarea.setText(s);
       }
       if(source==Button6) {
    	   String s=textarea.getText()+Button6.getText();
   	    textarea.setText(s);
       }
       if(source==Button7) {
    	   String s=textarea.getText()+Button7.getText();
   	    textarea.setText(s);
       }
       if(source==Button8) {
    	   String s=textarea.getText()+Button8.getText();
   	    textarea.setText(s);
       }
       if(source==Button9) {
    	   String s=textarea.getText()+Button9.getText();
   	    textarea.setText(s);
       }
       if(source==Button0) {
    	   String s=textarea.getText()+Button0.getText();
   	    textarea.setText(s);
       }
       if(source==Buttondot) {
    	   String s=textarea.getText()+Buttondot.getText();
   	    textarea.setText(s);
       }
       if(source==Buttonadd) {
    	   action=Buttonadd.getText();
    	   number1=Integer.valueOf(textarea.getText());
    	   textarea.setText("");
    	 
       }
       if(source==Buttondiv) {
    	   action=Buttondiv.getText();
    	   number1=Integer.valueOf(textarea.getText());
    	   textarea.setText("");
    	   
       }  
       if (source==Buttonmul) {
    	   action=Buttonmul.getText();
    	   number1=Integer.valueOf(textarea.getText());
    	   textarea.setText("");
    	   
       }
       if (source==Buttonsub) {
    	   action=Buttonsub.getText();
    	   number1=Integer.valueOf(textarea.getText());
    	   textarea.setText("");

       }
       if(source==Buttonequal) {
    	   number2=Integer.valueOf(textarea.getText());
    	   if(action=="+") {
    		   result=(number1+number2);
    		   number11=(int)result;
    		   textarea.setText(number1+action+number2+""+"="+result);
    	   }
    	   else if(action=="-") {
    		   result=number1-number2;
    		   textarea.setText(number1+action+number2+""+"="+result);
    	   }
    	   else if(action=="*") {
    		   result=number1*number2;
    		   textarea.setText(number1+action+number2+""+"="+result);
    	   }
    	   else if(action=="/") {
    		   result=number1/number2;
    		   textarea.setText(number1+action+number2+""+"="+result);
    	   }
    	   
    	 }  
       }

}