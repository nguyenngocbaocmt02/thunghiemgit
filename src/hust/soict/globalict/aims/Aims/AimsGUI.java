package hust.soict.globalict.aims.Aims;

import java.awt.BorderLayout;
import java.awt.EventQueue;
import java.awt.Font;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import com.jgoodies.forms.layout.FormLayout;
import com.jgoodies.forms.layout.ColumnSpec;
import com.jgoodies.forms.layout.RowSpec;

import hust.soict.globalict.aims.media.Book;
import hust.soict.globalict.aims.media.CompactDisc;
import hust.soict.globalict.aims.media.DigitalVideoDisc;
import hust.soict.globalict.aims.media.Media;
import hust.soict.globalict.aims.order.Order.Order;

import com.jgoodies.forms.layout.FormSpecs;
import javax.swing.JDesktopPane;
import javax.swing.JComboBox;
import javax.swing.JTextField;
import javax.naming.LimitExceededException;
import javax.swing.BoxLayout;
import javax.swing.JTextArea;
import javax.swing.JTree;
import javax.swing.JPasswordField;
import javax.swing.JSpinner;
import javax.swing.JSeparator;
import javax.swing.JScrollPane;
import javax.swing.JSlider;
import javax.swing.JToggleButton;
import javax.swing.DefaultComboBoxModel;
import javax.swing.DefaultListModel;
import javax.swing.GroupLayout;
import javax.swing.GroupLayout.Alignment;
import javax.swing.LayoutStyle.ComponentPlacement;
import javax.swing.JTextPane;
import javax.swing.JLabel;
import java.awt.Component;
import javax.swing.SwingConstants;
import javax.swing.JSplitPane;
import javax.swing.JButton;
import javax.swing.JList;
import javax.swing.JScrollBar;
import java.awt.FlowLayout;
import net.miginfocom.swing.MigLayout;
import javax.swing.SpringLayout;
import javax.swing.border.BevelBorder;
import javax.swing.border.CompoundBorder;
import javax.swing.border.LineBorder;
import java.awt.Color;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import javax.swing.ListSelectionModel;
import javax.swing.event.ListSelectionListener;
import javax.swing.event.ListSelectionEvent;

public class AimsGUI extends JFrame {
    public static Order currentOrder;
	private JPanel contentPane;
	private JTextField title;
	private JTextField category;
	private JTextField cost;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					currentOrder= new Order();
				} catch (LimitExceededException e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				}
				try {
					AimsGUI frame = new AimsGUI();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public AimsGUI() {
		JTextArea textField_3 = new JTextArea();
		DefaultListModel<String> items = new DefaultListModel();
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 833, 483);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		
		JPanel panel_4 = new JPanel();
		
		JPanel panel_6 = new JPanel();
		GroupLayout gl_contentPane = new GroupLayout(contentPane);
		gl_contentPane.setHorizontalGroup(
			gl_contentPane.createParallelGroup(Alignment.TRAILING)
				.addGroup(gl_contentPane.createSequentialGroup()
					.addContainerGap()
					.addGroup(gl_contentPane.createParallelGroup(Alignment.LEADING)
						.addGroup(gl_contentPane.createSequentialGroup()
							.addComponent(panel_4, GroupLayout.PREFERRED_SIZE, 821, GroupLayout.PREFERRED_SIZE)
							.addContainerGap())
						.addGroup(gl_contentPane.createSequentialGroup()
							.addComponent(panel_6, GroupLayout.DEFAULT_SIZE, 811, Short.MAX_VALUE)
							.addGap(20))))
		);
		gl_contentPane.setVerticalGroup(
			gl_contentPane.createParallelGroup(Alignment.TRAILING)
				.addGroup(gl_contentPane.createSequentialGroup()
					.addContainerGap(35, Short.MAX_VALUE)
					.addComponent(panel_4, GroupLayout.PREFERRED_SIZE, 50, GroupLayout.PREFERRED_SIZE)
					.addPreferredGap(ComponentPlacement.RELATED)
					.addComponent(panel_6, GroupLayout.PREFERRED_SIZE, 236, GroupLayout.PREFERRED_SIZE)
					.addGap(117))
		);
		SpringLayout sl_panel_6 = new SpringLayout();
		panel_6.setLayout(sl_panel_6);
		
		JList list = new JList(items);
		sl_panel_6.putConstraint(SpringLayout.WEST, list, 0, SpringLayout.WEST, panel_6);
		sl_panel_6.putConstraint(SpringLayout.EAST, list, -442, SpringLayout.EAST, panel_6);
		list.addListSelectionListener(new ListSelectionListener() {
			public void valueChanged(ListSelectionEvent e) {
			}
		});
		list.setSelectionMode(ListSelectionModel.SINGLE_SELECTION);
		list.setBorder(new LineBorder(new Color(0, 0, 0)));
		sl_panel_6.putConstraint(SpringLayout.NORTH, list, 0, SpringLayout.NORTH, panel_6);
		panel_6.add(list);
		
		JButton btnNewButton_1 = new JButton("Delete");
		btnNewButton_1.addActionListener(new ActionListener() {
	        public void actionPerformed(ActionEvent event) {
	          ListSelectionModel selmodel = list.getSelectionModel();
	          int index = selmodel.getMinSelectionIndex();
	          if (index >= 0) {
	            items.remove(index);
	          currentOrder.removeMedia(index);
	          }
	        }
	        

	      });
		sl_panel_6.putConstraint(SpringLayout.SOUTH, btnNewButton_1, -1, SpringLayout.SOUTH, panel_6);
		sl_panel_6.putConstraint(SpringLayout.SOUTH, list, -3, SpringLayout.NORTH, btnNewButton_1);
		sl_panel_6.putConstraint(SpringLayout.WEST, btnNewButton_1, 64, SpringLayout.WEST, panel_6);
		panel_6.add(btnNewButton_1);
		
		JButton btnNewButton_2 = new JButton("Pay Order");
		sl_panel_6.putConstraint(SpringLayout.SOUTH, btnNewButton_2, -1, SpringLayout.SOUTH, panel_6);
		panel_6.add(btnNewButton_2);
		
		JButton btnNewButton_3 = new JButton("Cancel Order");
		sl_panel_6.putConstraint(SpringLayout.WEST, btnNewButton_2, -159, SpringLayout.WEST, btnNewButton_3);
		sl_panel_6.putConstraint(SpringLayout.EAST, btnNewButton_2, -78, SpringLayout.WEST, btnNewButton_3);
		sl_panel_6.putConstraint(SpringLayout.SOUTH, btnNewButton_3, -1, SpringLayout.SOUTH, panel_6);
		sl_panel_6.putConstraint(SpringLayout.EAST, btnNewButton_3, -88, SpringLayout.EAST, panel_6);
		panel_6.add(btnNewButton_3);
		
		JButton btnNewButton_4 = new JButton("New button");
		sl_panel_6.putConstraint(SpringLayout.WEST, btnNewButton_4, 64, SpringLayout.EAST, btnNewButton_1);
		panel_6.add(btnNewButton_4);
		
		JButton btnNewButton_5 = new JButton("Export invoice");
		btnNewButton_5.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String result="***********************Order***********************\nDate: "+"Day: "+currentOrder.dateOrdered.day+"   Month: "+currentOrder.dateOrdered.month+"   Year: "+currentOrder.dateOrdered.year+"\n";
				for (int i=0;i<currentOrder.itemsOrdered.size();i++) {
					result+=" ["+currentOrder.itemsOrdered.get(i).getTitle()+"] -["+currentOrder.itemsOrdered.get(i).getCategory()+"]: "+Double.toString(currentOrder.itemsOrdered.get(i).getCost())+"$\n";		
				 }
				result+="Free toll: "+currentOrder.freetoll+"\n";
				result+="Total cost: "+currentOrder.totalCost();
				textField_3.setText(result);
			}
		});
		sl_panel_6.putConstraint(SpringLayout.WEST, btnNewButton_5, 0, SpringLayout.WEST, btnNewButton_4);
		sl_panel_6.putConstraint(SpringLayout.SOUTH, btnNewButton_5, 0, SpringLayout.SOUTH, btnNewButton_1);
		panel_6.add(btnNewButton_5);
		
		
		sl_panel_6.putConstraint(SpringLayout.NORTH, textField_3, 0, SpringLayout.NORTH, panel_6);
		sl_panel_6.putConstraint(SpringLayout.WEST, textField_3, 11, SpringLayout.EAST, list);
		sl_panel_6.putConstraint(SpringLayout.SOUTH, textField_3, 0, SpringLayout.SOUTH, list);
		sl_panel_6.putConstraint(SpringLayout.EAST, textField_3, -10, SpringLayout.EAST, panel_6);
		panel_6.add(textField_3);

		JPanel panel_1 = new JPanel();
		panel_4.add(panel_1);
		
		JComboBox kindOfMedia = new JComboBox();
		panel_1.add(kindOfMedia);
		kindOfMedia.setModel(new DefaultComboBoxModel(new String[] {"CD", "DVD", "Book"}));
		
		JPanel panel = new JPanel();
		panel_4.add(panel);
		
		JLabel q = new JLabel("Title");
		panel.add(q);
		q.setFont(new Font("Name",Font.PLAIN ,14));
		q.setHorizontalAlignment(SwingConstants.CENTER);
		q.setAlignmentX(Component.CENTER_ALIGNMENT);
		
		title = new JTextField();
		panel.add(title);
		title.setColumns(10);
		
		JPanel panel_2 = new JPanel();
		panel_4.add(panel_2);
		
		JLabel fd = new JLabel("Category");
		fd.setHorizontalAlignment(SwingConstants.CENTER);
		fd.setFont(new Font("Dialog", Font.PLAIN, 14));
		fd.setAlignmentX(0.5f);
		panel_2.add(fd);
		
		category = new JTextField();
		category.setColumns(10);
		panel_2.add(category);
		
		JPanel panel_3 = new JPanel();
		panel_4.add(panel_3);
		
		JLabel ff = new JLabel("Cost");
		ff.setHorizontalAlignment(SwingConstants.CENTER);
		ff.setFont(new Font("Dialog", Font.PLAIN, 14));
		ff.setAlignmentX(0.5f);
		panel_3.add(ff);
		
		cost = new JTextField();
		cost.setColumns(10);
		panel_3.add(cost);
		
			JButton btnNewButton = new JButton("ADD\r\n");
			btnNewButton.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
					String titles= title.getText();
					String categorys= category.getText();
					String costs= cost.getText();
					String kind= (String) kindOfMedia.getItemAt(kindOfMedia.getSelectedIndex());
			    	double costt= Double.parseDouble(costs);
			    	if(kind=="CD") {
			    		CompactDisc x1=new CompactDisc(titles,categorys,costt);
			    		int l=currentOrder.itemsOrdered.size();
						currentOrder.addMedia(x1);
						if(l!=currentOrder.itemsOrdered.size()){
						items.addElement(x1.toString());
						}
			    	}
			    	if(kind=="DVD") {
			    		DigitalVideoDisc x1=new DigitalVideoDisc(titles,categorys,costt);
			    		int l=currentOrder.itemsOrdered.size();
			    		currentOrder.addMedia(x1);
						if(l!=currentOrder.itemsOrdered.size()){
						items.addElement(x1.toString());
						}
						items.addElement(x1.toString());
			    	}
			    	if(kind=="Book") {
			    		Book x1=new Book(titles,categorys,costt);
			    		int l=currentOrder.itemsOrdered.size();
			    		currentOrder.addMedia(x1);
						if(l!=currentOrder.itemsOrdered.size()){
						items.addElement(x1.toString());
						}
						items.addElement(x1.toString());
			    	}
			    	
			    	
				}
			});
			panel_4.add(btnNewButton);
		contentPane.setLayout(gl_contentPane);
	}
}

