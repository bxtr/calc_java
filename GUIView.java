import javax.swing.JFrame;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JTextField;
import javax.swing.JLabel;
import java.awt.Label;
import javax.swing.SwingConstants;
import java.awt.Dialog.ModalExclusionType;
import java.awt.Font;
import java.awt.event.WindowEvent;  //for CloseListener()
import java.awt.event.WindowAdapter;  //for CloseListener()/
import java.util.Observable;    //for update();

public class GUIView implements java.util.Observer
{

  private GUIModel model;

  private JFrame frmBxtrcalc;
  private JTextField textField;
  private JTextField textField_1;

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
  private JButton btnC;
  private JButton btnM;
  private JButton button_shift;
  private JButton button_lbarce;
  private JButton button_rbrace;
  private JButton btnSin;

  /* Updated when model change */
  public void update(Observable obs, Object obj) {
    textField.setText(model.getExpression());
    textField_1.setText(model.getAnswer());
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

  /* Initialize view + add listener */
  public GUIView(ActionListener controller)
  {
    frmBxtrcalc = new JFrame();
    frmBxtrcalc.setTitle("bxtrCalc");
    frmBxtrcalc.setBounds(100, 100, 417, 271);
    frmBxtrcalc.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    frmBxtrcalc.getContentPane().setLayout(null);
    
    JButton button_0 = new JButton("0");
    button_0.setFont(new Font("Century Schoolbook L", Font.BOLD, 20));
    button_0.setBounds(12, 209, 228, 25);
    frmBxtrcalc.getContentPane().add(button_0);
    
    JButton button_1 = new JButton("1");  
    button_1.setFont(new Font("Century Schoolbook L", Font.BOLD, 20));
    button_1.setBounds(12, 172, 68, 25);
    frmBxtrcalc.getContentPane().add(button_1);
    
    JButton button_2 = new JButton("2");
    button_2.setFont(new Font("Century Schoolbook L", Font.BOLD, 20));
    button_2.setBounds(92, 172, 68, 25);
    frmBxtrcalc.getContentPane().add(button_2);
    
    JButton button_3 = new JButton("3");
    button_3.setFont(new Font("Century Schoolbook L", Font.BOLD, 20));
    button_3.setBounds(172, 172, 68, 25);
    frmBxtrcalc.getContentPane().add(button_3);
    
    JButton button_4 = new JButton("4");
    button_4.setFont(new Font("Century Schoolbook L", Font.BOLD, 20));
    button_4.setBounds(12, 135, 68, 25);
    frmBxtrcalc.getContentPane().add(button_4);
    
    JButton button_5 = new JButton("5");
    button_5.setFont(new Font("Century Schoolbook L", Font.BOLD, 20));
    button_5.setBounds(92, 135, 68, 25);
    frmBxtrcalc.getContentPane().add(button_5);
    
    JButton button_6 = new JButton("6");
    button_6.setFont(new Font("Century Schoolbook L", Font.BOLD, 20));
    button_6.setBounds(172, 135, 68, 25);
    frmBxtrcalc.getContentPane().add(button_6);
    
    JButton button_7 = new JButton("7");
    button_7.setFont(new Font("Century Schoolbook L", Font.BOLD, 20));
    button_7.setBounds(12, 97, 68, 25);
    frmBxtrcalc.getContentPane().add(button_7);
    
    JButton button_8 = new JButton("8");
    button_8.setFont(new Font("Century Schoolbook L", Font.BOLD, 20));
    button_8.setBounds(92, 98, 68, 25);
    frmBxtrcalc.getContentPane().add(button_8);
    
    JButton button_9 = new JButton("9");
    button_9.setFont(new Font("Century Schoolbook L", Font.BOLD, 20));
    button_9.setBounds(172, 97, 68, 25);
    frmBxtrcalc.getContentPane().add(button_9);
    
    JButton button_equal = new JButton("=");
    button_equal.setFont(new Font("Century Schoolbook L", Font.BOLD, 20));
    button_equal.setBounds(252, 209, 148, 25);
    frmBxtrcalc.getContentPane().add(button_equal);
    
    JButton button_division = new JButton("/");
    button_division.setFont(new Font("Century Schoolbook L", Font.BOLD, 20));
    button_division.setBounds(252, 172, 68, 25);
    frmBxtrcalc.getContentPane().add(button_division);
    
    JButton button_addition = new JButton("+");
    button_addition.setFont(new Font("Century Schoolbook L", Font.BOLD, 20));
    button_addition.setBounds(252, 135, 68, 25);
    frmBxtrcalc.getContentPane().add(button_addition);
    
    JButton button_multiplication = new JButton("*");
    button_multiplication.setFont(new Font("Century Schoolbook L", Font.BOLD, 20));
    button_multiplication.setBounds(332, 172, 68, 25);
    frmBxtrcalc.getContentPane().add(button_multiplication);
    
    JButton button_subtraction = new JButton("-");
    button_subtraction.setFont(new Font("Century Schoolbook L", Font.BOLD, 20));
    button_subtraction.setBounds(332, 135, 68, 25);
    frmBxtrcalc.getContentPane().add(button_subtraction);
    
    textField = new JTextField();
    textField.setFont(new Font("Century Schoolbook L", Font.BOLD, 23));
    textField.setBounds(12, 12, 228, 35);
    frmBxtrcalc.getContentPane().add(textField);
    textField.setColumns(10);

    textField_1 = new JTextField();
    textField_1.setFont(new Font("Century Schoolbook L", Font.BOLD, 23));
    textField_1.setBounds(258, 12, 142, 35);
    textField_1.setColumns(10);
    frmBxtrcalc.getContentPane().add(textField_1);

    JLabel label = new JLabel("=");
    label.setFont(new Font("Century Schoolbook L", Font.BOLD, 23));
    label.setHorizontalAlignment(SwingConstants.CENTER);
    label.setBounds(232, 22, 34, 15);
    frmBxtrcalc.getContentPane().add(label);

    JButton btnC = new JButton("C");
    btnC.setFont(new Font("Century Schoolbook L", Font.BOLD, 20));
    btnC.setBounds(252, 96, 68, 25);
    frmBxtrcalc.getContentPane().add(btnC);
    
    JButton btnM = new JButton("M");
    btnM.setFont(new Font("Century Schoolbook L", Font.BOLD, 20));
    btnM.setBounds(332, 96, 68, 25);
    frmBxtrcalc.getContentPane().add(btnM);
    
    JButton button_shift = new JButton("<-");
    button_shift.setFont(new Font("Century Schoolbook L", Font.BOLD, 20));
    button_shift.setBounds(252, 59, 148, 25);
    frmBxtrcalc.getContentPane().add(button_shift);
    
    JButton button_lbrace = new JButton("(");
    button_lbrace.setFont(new Font("Century Schoolbook L", Font.BOLD, 20));
    button_lbrace.setBounds(12, 59, 68, 25);
    frmBxtrcalc.getContentPane().add(button_lbrace);
    
    JButton button_rbrace = new JButton(")");
    button_rbrace.setFont(new Font("Century Schoolbook L", Font.BOLD, 20));
    button_rbrace.setBounds(92, 59, 68, 25);
    frmBxtrcalc.getContentPane().add(button_rbrace);
    
    JButton btnSin = new JButton("sin");
    btnSin.setFont(new Font("Century Schoolbook L", Font.BOLD, 20));
    btnSin.setBounds(172, 59, 68, 25);
    frmBxtrcalc.getContentPane().add(btnSin);
    
    btnC.addActionListener(controller);
    btnM.addActionListener(controller);
    button_shift.addActionListener(controller);
    button_lbrace.addActionListener(controller);
    button_rbrace.addActionListener(controller);
    btnSin.addActionListener(controller);
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

    this.frmBxtrcalc.setVisible(true);
  }
}