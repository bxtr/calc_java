import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JTextField;
import javax.swing.JLabel;

import java.io.IOException;

public class GuiInterface implements UserInterface
{

  private JFrame frame;
  private JTextField textField;
  private boolean responseFlag;

  public void startWork()
  {
  }

  public boolean response()
  {
    return responseFlag;
  }

  public void preparationForNextResponse()
  {
    responseFlag = false;
  }
  public void endWork()
  { return;}

  public String readExpession()
  {
    return textField.getText();
  }

  public void displayAnswer(String s)
  {

    textField.setText(s);
  }

  public void displayErrorMessage(String s)
  {
    textField.setText(s);
  }

  public void run(){
    this.frame.setVisible(true);
  }

  public GuiInterface() {
    responseFlag = false;
    initialize();   
  }


  /**
   * Initialize the contents of the frame.
   */
  private void initialize() {
    frame = new JFrame();
    frame.setBounds(100, 100, 417, 232);
    frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    frame.getContentPane().setLayout(null);
    
    JButton button = new JButton("0");
    button.addActionListener(new ActionListener() {
      public void actionPerformed(ActionEvent e) {
        textField.setText(textField.getText() + "0");
      }
    });
    button.setBounds(12, 171, 228, 25);
    frame.getContentPane().add(button);
    
    JButton button_1 = new JButton("1");
    button_1.addActionListener(new ActionListener() {
      public void actionPerformed(ActionEvent e) {
        textField.setText(textField.getText() + "1");
      }
    });
    button_1.setBounds(12, 134, 68, 25);
    frame.getContentPane().add(button_1);
    
    JButton button_2 = new JButton("2");
    button_2.addActionListener(new ActionListener() {
      public void actionPerformed(ActionEvent e) {
        textField.setText(textField.getText() + "2");
      }
    });
    button_2.setBounds(92, 134, 68, 25);
    frame.getContentPane().add(button_2);
    
    JButton button_3 = new JButton("3");
    button_3.addActionListener(new ActionListener() {
      public void actionPerformed(ActionEvent e) {
        textField.setText(textField.getText() + "3");
      }
    });
    button_3.setBounds(172, 134, 68, 25);
    frame.getContentPane().add(button_3);
    
    JButton button_4 = new JButton("4");
    button_4.addActionListener(new ActionListener() {
      public void actionPerformed(ActionEvent e) {
        textField.setText(textField.getText() + "4");
      }
    });
    button_4.setBounds(12, 97, 68, 25);
    frame.getContentPane().add(button_4);
    
    JButton button_5 = new JButton("5");
    button_5.addActionListener(new ActionListener() {
      public void actionPerformed(ActionEvent e) {
        textField.setText(textField.getText() + "5");
      }
    });
    button_5.setBounds(92, 97, 68, 25);
    frame.getContentPane().add(button_5);
    
    JButton button_6 = new JButton("6");
    button_6.addActionListener(new ActionListener() {
      public void actionPerformed(ActionEvent e) {
        textField.setText(textField.getText() + "6");
      }
    });
    button_6.setBounds(172, 97, 68, 25);
    frame.getContentPane().add(button_6);
    
    JButton button_7 = new JButton("7");
    button_7.addActionListener(new ActionListener() {
      public void actionPerformed(ActionEvent e) {
        textField.setText(textField.getText() + "7");
      }
    });
    button_7.setBounds(12, 59, 68, 25);
    frame.getContentPane().add(button_7);
    
    JButton button_8 = new JButton("8");
    button_8.addActionListener(new ActionListener() {
      public void actionPerformed(ActionEvent e) {
        textField.setText(textField.getText() + "8");
      }
    });
    button_8.setBounds(92, 60, 68, 25);
    frame.getContentPane().add(button_8);
    
    JButton button_9 = new JButton("9");
    button_9.addActionListener(new ActionListener() {
      public void actionPerformed(ActionEvent e) {
        textField.setText(textField.getText() + "9");
      }
    });
    button_9.setBounds(172, 59, 68, 25);
    frame.getContentPane().add(button_9);
    
    JButton button_10 = new JButton("=");
    button_10.addActionListener(new ActionListener() {
      public void actionPerformed(ActionEvent e) {
        responseFlag = true;
      }
    });
    button_10.setBounds(252, 171, 148, 25);
    frame.getContentPane().add(button_10);
    
    JButton button_11 = new JButton("/");
    button_11.addActionListener(new ActionListener() {
      public void actionPerformed(ActionEvent e) {
        textField.setText(textField.getText() + "/");
      }
    });
    button_11.setBounds(252, 134, 68, 25);
    frame.getContentPane().add(button_11);
    
    JButton button_12 = new JButton("+");
    button_12.addActionListener(new ActionListener() {
      public void actionPerformed(ActionEvent e) {
        textField.setText(textField.getText() + "+");
      }
    });
    button_12.setBounds(252, 97, 68, 25);
    frame.getContentPane().add(button_12);
    
    JButton button_13 = new JButton("*");
    button_13.addActionListener(new ActionListener() {
      public void actionPerformed(ActionEvent e) {
        textField.setText(textField.getText() + "*");
      }
    });
    button_13.setBounds(332, 134, 68, 25);
    frame.getContentPane().add(button_13);
    
    JButton button_14 = new JButton("-");
    button_14.addActionListener(new ActionListener() {
      public void actionPerformed(ActionEvent e) {
        textField.setText(textField.getText() + "-");
      }
    });
    button_14.setBounds(332, 97, 68, 25);
    frame.getContentPane().add(button_14);
    
    textField = new JTextField();
    textField.setBounds(12, 12, 388, 35);
    frame.getContentPane().add(textField);
    textField.setColumns(10);
    
    JLabel lblBxtrcalculator = new JLabel("BxtrCalculator");
    lblBxtrcalculator.setBounds(258, 54, 142, 25);
    frame.getContentPane().add(lblBxtrcalculator);
  }
}
