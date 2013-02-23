public class Memory
{
  private Queue<String> log;
  private String memory;

  public Memory()
  {
    log = new LinkedList<String>();
    memory = new String("");
  }

  public void addLog(String str)
  { log.add(str);}

  public void memIn(String str)
  { memory = str;}

  public void memLast()
  { 
    if(log.peek() != null)
      {memory = log.peek()}
  }

  public String memOut()
  { return memory;}

  public void readLog()
  {
    Iterator iter = log.iterator();
    while(iter.hasNext())
      { System.out.println(iter.next());}
  }

}