import java.util.NoSuchElementException;
public class Range implements IntegerSequence{
  private int start,end,current;
  public Range(int starting, int ending){
    start = starting;
    end = ending;
    current = starting;
  }

  public void reset(){
    current = 0;
  }

  public int length(){
    return end-start;
  }

  public boolean hasNext(){
    return current != end+1;
  }

   public int next(){
     if (!hasNext()) {
       throw new NoSuchElementException("The number " +current+1+ " is not within the bounds of this Range");
     }
     int curr = current;
     current += 1;
     return curr;
   }

   public int getStart(){
     return start;
   }

}
