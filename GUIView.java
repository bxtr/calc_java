import javax.swing.JFrame;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import javax.swing.JTextField;
import javax.swing.JLabel;
import java.awt.event.WindowEvent;  //for CloseListener()
import java.awt.event.WindowAdapter;  //for CloseListener()/
import java.util.Observable;    //for update();

public class GUIView implements java.util.Observer
{

  private GUIModel model;

  private JFrame frame;
  private JTextField textField;
  private JButton button_0;
  private JButton button_1;
  private JButton button_2;
  private JButton button_3;
  private JButton button_4;
  private JButton button_5;
  private JButton button_6;
  private JButton button_7;
  private JButton button_8;
  private JButton button_9;
  private JButton button_equal;
  private JButton button_division;
  private JButton button_addition;
  private JButton button_multiplication;
  private JButton button_subtraction;


  public void update(Observable obs, Object obj) {
    textField.setText(model.getExpression());
  }

  public void addModel(GUIModel m){
    this.model = m;
  }

  public static class CloseListener extends WindowAdapter {
    public void windowClosing(WindowEvent e) {
      e.getWindow().setVisible(false);
      System.exit(0);
    } 
  } 


  public GUIView(ActionListener controller)
  {
    frame = new JFrame();
    frame.setBounds(100, 100, 417, 232);
    frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    frame.getContentPane().setLayout(null);
    
    JButton button_0 = new JButton("0");
    button_0.setBounds(12, 171, 228, 25);
    frame.getContentPane().add(button_0);
    
    JButton button_1 = new JButton("1");  
    button_1.setBounds(12, 134, 68, 25);
    frame.getContentPane().add(button_1);
    
    JButton button_2 = new JButton("2");
    button_2.setBounds(92, 134, 68, 25);
    frame.getContentPane().add(button_2);
    
    JButton button_3 = new JButton("3");
    button_3.setBounds(172, 134, 68, 25);
    frame.getContentPane().add(button_3);
    
    JButton button_4 = new JButton("4");
    button_4.setBounds(12, 97, 68, 25);
    frame.getContentPane().add(button_4);
    
    JButton button_5 = new JButton("5");
    button_5.setBounds(92, 97, 68, 25);
    frame.getContentPane().add(button_5);
    
    JButton button_6 = new JButton("6");
    button_6.setBounds(172, 97, 68, 25);
    frame.getContentPane().add(button_6);
    
    JButton button_7 = new JButton("7");
    button_7.setBounds(12, 59, 68, 25);
    frame.getContentPane().add(button_7);
    
    JButton button_8 = new JButton("8");
    button_8.setBounds(92, 60, 68, 25);
    frame.getContentPane().add(button_8);
    
    JButton button_9 = new JButton("9");
    button_9.setBounds(172, 59, 68, 25);
    frame.getContentPane().add(button_9);
    
    JButton button_equal = new JButton("=");
    button_equal.setBounds(252, 171, 148, 25);
    frame.getContentPane().add(button_equal);
    
    JButton button_division = new JButton("/");
    button_division.setBounds(252, 134, 68, 25);
    frame.getContentPane().add(button_division);
    
    JButton button_addition = new JButton("+");
    button_addition.setBounds(252, 97, 68, 25);
    frame.getContentPane().add(button_addition);
    
    JButton button_multiplication = new JButton("*");
    button_multiplication.setBounds(332, 134, 68, 25);
    frame.getContentPane().add(button_multiplication);
    
    JButton button_subtraction = new JButton("-");
    button_subtraction.setBounds(332, 97, 68, 25);
    frame.getContentPane().add(button_subtraction);
    
    textField = new JTextField();
    textField.setBounds(12, 12, 388, 35);
    frame.getContentPane().add(textField);
    textField.setColumns(10);
    
    JLabel lblBxtrcalculator = new JLabel("BxtrCalculator");
    lblBxtrcalculator.setBounds(258, 54, 142, 25);
    frame.getContentPane().add(lblBxtrcalculator);

    button_0.addActionListener(controller);
    button_1.addActionListener(controller);
    button_2.addActionListener(controller);
    button_3.addActionListener(controller);
    button_4.addActionListener(controller);
    button_5.addActionListener(controller);
    button_6.addActionListener(controller);
    button_7.addActionListener(controller);
    button_8.addActionListener(controller);
    button_9.addActionListener(controller);
    button_equal.addActionListener(controller);
    button_division.addActionListener(controller);
    button_addition.addActionListener(controller);
    button_multiplication.addActionListener(controller);
    button_subtraction.addActionListener(controller);

    this.frame.setVisible(true);
  }
}