import javax.swing.*;

import java.awt.*;

/*
<applet code ="TextBox" width=auto height=auto></applet>
*/


public class TextBox extends JApplet {


	private static final long serialVersionUID = 1L;
	
	JTextField jtf[] = new JTextField[2];
	JPanel p;
	
	public TextBox(){
		setLayout(new FlowLayout());
		
		jtf[0]= new JTextField("student name",10);
		jtf[1]= new JTextField("marks",10);
		
		add(jtf[0]);
		add(jtf[1]);

		
		
	}
	
	
}
