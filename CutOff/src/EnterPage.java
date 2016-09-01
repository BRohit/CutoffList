import java.awt.*;
import java.awt.event.*;
import javax.swing.*;


public class EnterPage extends JPanel{
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	EnterPage(){
		
		String[] labels = { "Student Name :", "Marks :" };
	    char[] mnemonics = { 'S', 'M' };
	    int[] widths = { 15, 5 };
	    String[] descs = { "Student Name", "Marks" };
	
	    final TextForm form = new TextForm(labels, mnemonics, widths, descs);
	
	    JButton submit = new JButton("Submit Form");
	
	    submit.addActionListener(new ActionListener() {
	      public void actionPerformed(ActionEvent e) {
	        //System.out.println(form.getText(0) + " " + form.getText(1) + ". " + form.getText(2)
	        //   + ", age " + form.getText(3));
	    	  
	    	 String n = form.getText(1);
	    	  
	    	  int y = Integer.parseInt(String.valueOf(n));
	    	  new Formula(y);
	      }
	    });
	    
	    
	    
	    JFrame f = new JFrame("CutOff");
	    f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	    f.getContentPane().add(form, BorderLayout.NORTH);
	    JPanel p = new JPanel();
	    p.add(submit);
	    f.getContentPane().add(p, BorderLayout.SOUTH);
	    f.pack();
	    f.setVisible(true);
	}
}


