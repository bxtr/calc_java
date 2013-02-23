import java.util.*;

public class Test
{
  public static void main(String args[])
  {
    String exp01 = "2*3+10/5-1"; //7
    String exp02 = "2*3-10/5+1"; //5
    String exp03 = "4-1-2-2*2+4-1"; //0
    String exp04 = "4-0-2*2+0+0"; //0
    String exp05 = "1-2*4+3"; //-4 
    String exp11 = "(1+2)*4+   3"; //15
    String exp12 = "1.5+4.2*(5+2)"; //30.9
    String exp13 = "(1+2)*(3-1)/2"; //3
    String exp14 = "((5+2)-(2+(3*4)))*2"; //-14
    String exp21 = "2+3^2"; //11
    String exp22 = "2^3+3^2"; //17
    String exp23 = "10-3^2*5+35"; //0
    String exp24 = "10-(3^2*5)+35"; //0
    String exp25 = "10-(3^2*5+1)+35"; //-1
    String exp31 = "(2.2^3 - 4/5.0) + 2^2"; //13.848
    String exp32 = "3 + 4 * 2 / (1 - 5)^2"; //3.5
  }
}