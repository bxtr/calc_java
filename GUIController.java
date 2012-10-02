import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class GUIController implements ActionListener
{
  GUIModel model;

  public void actionPerformed(ActionEvent e){
    if (e.getActionCommand().equals("0")) 
    { model.addToExp("0");}
    else if (e.getActionCommand().equals("1")) 
    { model.addToExp("1");}
    else if (e.getActionCommand().equals("2")) 
    { model.addToExp("2");}
    else if (e.getActionCommand().equals("3")) 
    { model.addToExp("3");}
    else if (e.getActionCommand().equals("4")) 
    { model.addToExp("4");}
    else if (e.getActionCommand().equals("5")) 
    { model.addToExp("5");}
    else if (e.getActionCommand().equals("6")) 
    { model.addToExp("6");}
    else if (e.getActionCommand().equals("7")) 
    { model.addToExp("7");}
    else if (e.getActionCommand().equals("8")) 
    { model.addToExp("8");}
    else if (e.getActionCommand().equals("9")) 
    { model.addToExp("9");}
    else if (e.getActionCommand().equals("/")) 
    { model.addToExp("/");}
    else if (e.getActionCommand().equals("+")) 
    { model.addToExp("+");}
    else if (e.getActionCommand().equals("*")) 
    { model.addToExp("*");}
    else if (e.getActionCommand().equals("-")) 
    { model.addToExp("-");}
    else if (e.getActionCommand().equals("=")) 
    { model.inputDone();}
  }

  public void addModel(GUIModel m){
    this.model = m;
  }
}