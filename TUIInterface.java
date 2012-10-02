import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class TUIInterface implements UserInterface
{
  public void setAnswer(String answer)
  { System.out.println("=" + answer); }

  public void displayError(String error)
  { System.out.println(error); }
  
  public String getExpression()
  { 
    String s = "";
    try {
        InputStreamReader isr = new InputStreamReader(System.in);
        BufferedReader br = new BufferedReader(isr);
        s = br.readLine();
    } catch (IOException e) {
        e.printStackTrace();
    }
    return s;   
  }
}