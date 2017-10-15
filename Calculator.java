import java.awt.*;
import java.awt.event.*;
import java.awt.event.*;
import javax.swing.*;
class  Calculator extends JFrame implements ActionListener
{
	int x,y,r;
	String s;
	char ch;
	JTextArea t;
	JButton b[]=new JButton[17];
     public Calculator()
	{
		setTitle("CALCULATOR");
		setSize(250,250);
		t=new	JTextArea("",2,10);
		for(int i=0;i<=9;i++)
			b[i]=new JButton(""+i);
		b[10]=new JButton("+");
        b[11]=new JButton("-");
        b[12]=new JButton("*");
        b[13]=new JButton("/");
        b[14]=new JButton("%");
        b[15]=new JButton("=");
        b[16]=new JButton("c");
        
		for(int i=0;i<=16;i++)
			b[i].setForeground(Color.blue);
		JPanel p=new JPanel();
		p.setLayout(new GridLayout(5,5));
        for(int i=0;i<=16;i++)
			p.add(b[i]);
		add(p,BorderLayout.CENTER);
        add(t,BorderLayout.NORTH);
	    for(int i=0;i<=16;i++)
			b[i].addActionListener(this);
		setVisible(true);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}
	public void actionPerformed(ActionEvent ae)
	{
		for(int i=0;i<=9;i++)
			if(ae.getSource()==b[i])
			t.append(""+i);
		if(ae.getSource()==b[10])
		{
			ch='+';
			s=t.getText();
			x=Integer.parseInt(s);
			t.setText("");
		}

		if(ae.getSource()==b[11])
		{
			ch='-';
			s=t.getText();
			x=Integer.parseInt(s);
			t.setText("");
		}if(ae.getSource()==b[12])
		{
			ch='*';
			s=t.getText();
			x=Integer.parseInt(s);
			t.setText("");
		}if(ae.getSource()==b[13])
		{
			ch='/';
			s=t.getText();
			x=Integer.parseInt(s);
			t.setText("");
		}if(ae.getSource()==b[14])
		{
			ch='%';
			s=t.getText();
			x=Integer.parseInt(s);
			t.setText("");
		}
	     
		if(ae.getSource()==b[15])
		{
			s=t.getText();
			y=Integer.parseInt(s);
			switch(ch)
			{
				case'+' :r=x+y;
				t.setText(String.valueOf(r));
	   			break;
                  
                case'-' :r=x-y;
				t.setText(String.valueOf(r));
	   			break;
                
				case'*' :r=x*y;
				t.setText(String.valueOf(r));
	   			break;
                
				case'/' :r=x/y;
				t.setText(String.valueOf(r));
	   			break;
                
				case'%' :r=x%y;
				t.setText(String.valueOf(r));
	   			break;
			}
		}
	    
		if(ae.getSource()==b[16])
		     t.setText("");
	}




	public static void main(String[] args) 
	{
		new Calculator();

	}
}
