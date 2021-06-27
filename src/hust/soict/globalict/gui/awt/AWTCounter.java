package hust.soict.globalict.gui.awt;

import java.awt.*; // Using AWT container and component classes
import java.awt.event.*; // Using AWT event classes and listener interfaces
import java.util.ArrayList;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JList;
import javax.swing.JRadioButton;
import javax.swing.JTextField;
import javax.swing.JTextPane;
import java.util.ArrayList;
import java.util.List;
// An AWT program inherits from the top-level container java.awt.Frame
public class AWTCounter extends Frame implements ActionListener {
private Label lblCount; // Declare a Label component
private TextField tfCount; // Declare a TextField component
private Button btnCount; // Declare a Button component
private int count = 0; // Counter's value
private JRadioButton x;
private JRadioButton x_1;
private JTextPane t;
private JComboBox cb;

// Constructor to setup GUI components and event handlers
public AWTCounter () {

setLayout(new FlowLayout());
lblCount = new Label("Counter"); // construct the Label component
add(lblCount); // "super" Frame container adds Label component
tfCount = new TextField(count + "", 10); // construct the TextField component with initial text
tfCount.setEditable(false); // set to read-only
add(tfCount); // "super" Frame container adds TextField component
x=new JRadioButton();
x.setText("Up");
x.addActionListener(new ActionListener() {
	public void actionPerformed(ActionEvent e) {
		x_1.setSelected(false);

	}
});
add(x);
x_1=new JRadioButton();
x_1.addActionListener(new ActionListener() {
	public void actionPerformed(ActionEvent e) {
		x.setSelected(false);

	}
});
x_1.setText("Down");
add(x_1);
t= new JTextPane();
t.setEditable(false);
t.setBackground(Color.WHITE);
t.setText("Step");
add(t);
cb= new JComboBox();
List<Integer> qq= new ArrayList<Integer>();
for(Integer i=1;i<=10;i++) cb.addItem(i);

add(cb);
btnCount = new Button("Count"); // construct the Button component
add(btnCount); // "super" Frame container adds Button component
btnCount.addActionListener(this);
setTitle("AWT Counter"); // "super" Frame sets its title
setSize(512, 186); // "super" Frame sets its initial window size
setVisible(true); // "super" Frame shows
}
// The entry main() method
public static void main(String[] args) {
// Invoke the constructor to setup the GUI, by allocating an instance
AWTCounter app = new AWTCounter();
// or simply "new AWTCounter();" for an anonymous instance
}
// ActionEvent handler - Called back upon button-click.
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
}