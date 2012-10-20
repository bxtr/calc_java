/* Get two list(numbers and signs) and calculate value with math order of expression */
import java.util.*;

public class ComplexCalculation
{
  private List<String> numbers;
  private List<String> signs;

  //  List<String> num = new LinkedList<String>(Arrays.asList("2.5", "3"));
  //  List<String> sign = new LinkedList<String>(Arrays.asList("+"));    

  public ComplexCalculation(List<String> numbers, List<String> signs)
  {
    this.numbers = numbers;
    this.signs = signs;
  }

  /* return answer */
  public String calculate()
  {
    String[] orderI = {"*", "/"};
    String[] orderII = {"+", "-"};
    orderOperation(orderI);
    orderOperation(orderII);
    return numbers.get(0);
  }

  private boolean equalStrings(String origin, String[] tests)
  {
    for(int i=0; i<tests.length; i++)
    {
      if(origin.equals(tests[i]))
        return true;
    }
    return false;
  }

  /* String[] tests = signs with equal math order of calculation */
  private void orderOperation(String[] operations)
  {
    //??? need test. maybe we don't need copy.
    List<String> copySigns = new ArrayList<String>(signs); 
    ListIterator<String> iSigns = signs.listIterator();
    while(iSigns.hasNext())
    {
      String sign = iSigns.next();
      if(equalStrings(sign, operations))
      {
        int index = copySigns.indexOf(sign);
        /*Set new value of number*/
        numbers.set(index, SimpleCalculation.calculate(numbers.get(index), numbers.get(index+1), sign));
        /*Delete from list next element and shift list*/
        numbers.remove(index+1);
        copySigns.remove(index);
        //iSigns.remove();
      }
    }
    signs = new ArrayList<String>(copySigns);
  }
}