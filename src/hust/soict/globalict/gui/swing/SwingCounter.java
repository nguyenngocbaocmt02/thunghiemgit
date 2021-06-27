package hust.soict.globalict.gui.swing;
import java.awt.*; // Using AWT layouts
import java.awt.event.*; // Using AWT event classes and listener interfaces
import java.util.ArrayList;
import java.util.List;

import javax.swing.*; // Using Swing components and containers

public class SwingCounter extends JFrame { 
private JTextField tfCount; 
private JButton btnCount; 
private int count = 0;
private JRadioButton x;
private JRadioButton x_1;
private JTextPane t;
private JComboBox cb;
@SuppressWarnings("serial")
public SwingCounter() {
// Retrieve the content-pane of the top-level container JFrame
// All operations done on the content-pane
setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
Container cp = getContentPane();
cp.setLayout(new FlowLayout()); // The content-pane sets its layout
cp.add(new JLabel("Counter"));
tfCount = new JTextField("0",10);
tfCount.setEditable(false);
cp.add(tfCount);
x=new JRadioButton();
x.setText("Up");
x.addActionListener(new ActionListener() {
	private AbstractButton x_1;

	public void actionPerformed(ActionEvent e) {
		x_1.setSelected(false);

	}
});
getContentPane().add(x);
x_1=new JRadioButton();
x_1.addActionListener(new ActionListener() {
	public void actionPerformed(ActionEvent e) {
		x.setSelected(false);

	}
});
x_1.setText("Down");
getContentPane().add(x_1);
t= new JTextPane();
t.setEditable(false);
t.setBackground(Color.WHITE);
t.setText("Step");
getContentPane().add(t);
cb= new JComboBox();
List<Integer> qq= new ArrayList<Integer>();
for(Integer i=1;i<=10;i++) cb.addItem(i);

getContentPane().add(cb);
btnCount = new JButton("Count");
cp.add(btnCount);
// Allocate an anonymous instance of an anonymous inner class that
// implements ActionListener as ActionEvent listener
btnCount.addActionListener(new ActionListener() {
@Override
public void actionPerformed(ActionEvent evt) {
	if(x.isSelected()) {
		count+=cb.getSelectedIndex()+1;
	}
	else {
		if(x_1.isSelected())
		count-=cb.getSelectedIndex()+1;
	}
	tfCount.setText(count + "");
}
});
setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); // Exit program if close-window button clicked
setTitle("Swing Counter"); // "super" JFrame sets title
setSize(439, 100); // "super" JFrame sets initial size
setVisible(true); // "super" JFrame shows
}
// The entry main() method
public static void main(String[] args) {
// Run the GUI construction in the Event-Dispatching thread for thread-safety
SwingUtilities.invokeLater(new Runnable() {
@Override
public void run() {
new SwingCounter(); // Let the constructor do the job
}
});
}
}