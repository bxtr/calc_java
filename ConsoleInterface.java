import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class ConsoleInterface implements UserInterface
{

  public void start()
  { System.out.println("Input expressions:"); }

  public void end()
  { System.out.println("Bye!"); }

  public void displayAnswer(String s)
  { System.out.println("=" + s); }

  public void displayErrorMessage(String s)
  { System.out.println(s); }
  
  public String readExpession()
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