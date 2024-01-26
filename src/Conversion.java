import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.awt.Insets;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;

public class Conversion extends JFrame implements ActionListener {
    private JLabel distanceInput;     
    private JLabel kilometersLabel;   
    private JLabel metersLabel;
    private JLabel feetLabel;
    private JTextField distanceField;  
    private JTextField kmField;
    private JTextField metersField; 
    private JTextField feetField;
    private JButton calcButton;   

    /* Constructor creates GUI components and adds GUI components
       using a GridBagLayout. */
    Conversion() {
        // Used to specify GUI component layout
        GridBagConstraints positionConst = null;

        // Set frame's title
        setTitle("Conversions");

        
        distanceInput = new JLabel("Distance(Miles):");
        metersLabel = new JLabel("Meters:");
        kilometersLabel = new JLabel("Kilometers:");
        feetLabel = new JLabel("Feet:");
        

        kmField = new JTextField(15);
        kmField.setEditable(false);
        kmField.setText("0");
       
        

        metersField = new JTextField(15);
        metersField.setEditable(false);
        metersField.setText("0");
        
        feetField = new JTextField(15);
        feetField.setEditable(false);
        feetField.setText("0");
        
        distanceField = new JTextField(15);
        distanceField.setEditable(true);
        distanceField.setText("0");

        // Create a "Calculate" button
        calcButton = new JButton("Calculate");

        // Use "this" class to handle button presses
        calcButton.addActionListener(this);

        // Use a GridBagLayout
        setLayout(new GridBagLayout());
        positionConst = new GridBagConstraints();

        // Specify component's grid location
        positionConst.gridx = 0;
        positionConst.gridy = 0;

        // 10 pixels of padding around component
        positionConst.insets = new Insets(10, 10, 10, 10);

        // Add component using the specified constraints
        add(distanceInput, positionConst);

        positionConst.gridx = 1;
        positionConst.gridy = 2;
        positionConst.insets = new Insets(10, 10, 10, 10);
        add(kmField, positionConst);

        
        positionConst.gridx = 0;
        positionConst.gridy = 1;
        positionConst.insets = new Insets(10, 10, 10, 10);
        add(metersLabel, positionConst);
        
        positionConst.gridx = 0;
        positionConst.gridy = 2;
        positionConst.insets = new Insets(10, 10, 10, 10);
        add(kilometersLabel, positionConst);

        positionConst.gridx = 0;
        positionConst.gridy = 3;
        positionConst.insets = new Insets(10, 10, 10, 10);
        add(feetLabel, positionConst);
        
        positionConst.gridx = 1;
        positionConst.gridy = 0;
        positionConst.insets = new Insets(10, 10, 10, 10);
        add(distanceField, positionConst);

        positionConst.gridx = 1;
        positionConst.gridy = 1;
        positionConst.insets = new Insets(10, 10, 10, 10);
        add(metersField, positionConst);
        
        
        positionConst.gridx = 1;
        positionConst.gridy = 3;
        positionConst.insets = new Insets(10, 10, 10, 10);
        add(feetField, positionConst);
        
        positionConst.gridx = 0;
        positionConst.gridy = 4;
        positionConst.insets = new Insets(10, 10, 10, 10);
        add(calcButton, positionConst);
        
    }

    /* Method is automatically called when an event
       occurs (e.g, button is pressed) */
    @Override
    public void actionPerformed(ActionEvent event) {
       
    	
    	String distance;
    	double distanceF;
    	double kilo;
    	double meters;
    	double feet;
    	
       
        distance = distanceField.getText();
        
        
        // Convert from String to an integer
        distanceF = Double.parseDouble(distance);
        kilo = distanceF * 1.609;
        meters = distanceF * 1609;
        feet = distanceF * 5280;

       
        kmField.setText(Double.toString(kilo));
        metersField.setText(Double.toString(meters));
        feetField.setText(Double.toString(feet));
    }

   
    public static void main(String[] args) {
       
    	Conversion myFrame = new Conversion();

        myFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        myFrame.pack();
        myFrame.setVisible(true);
    }
}