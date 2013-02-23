import java.util.*;

public class Calculator
{
	private Hashtable<String, Function> functions;
	
	public Calculator(Hashtable<String, Function> functions){
		this.functions = functions;
	}
	
	private Function getFunctions(String sign){
		try
		{
			if(functions.containsKey(sign))
				{return functions.get(sign);}
			else
				{throw new Exception("Sign \"" + sign + "\" is not associated with any available function.");}
		}
		catch(Exception e)
		{
			System.err.println("Exception: " + e.getMessage());
			return null;
		}
	}

	public double calculate(String sign, double var1, double var2){
		Function temp = getFunctions(sign);
		if(temp != null)
			{return temp.calculate(var1, var2);}
		else
			{return 0.0;}
	}

	public String calculate(String sign, String var1, String var2){
		try{
			double d_var1 = Double.parseDouble(var1);
			double d_var2 = Double.parseDouble(var2);
			return Double.toString(calculate(sign, d_var1, d_var2));
		}catch (NumberFormatException e){
			System.err.println("Exception: " + e.getMessage());
			return "0.0";
		}
	}

	public String calculateRPN(Deque<String> rpn)
	{
		Deque<String> temp = new LinkedList<String>();
    while(!rpn.isEmpty())
    { 
      String temp_var = rpn.pollFirst();
      if(functions.containsKey(temp_var))
      {
        String var2 = temp.pollLast();
        String var1 = temp.pollLast();
        temp_var = calculate(temp_var, var1, var2);
      }
      temp.addLast(temp_var);
    }
    return temp.poll();
	}
}