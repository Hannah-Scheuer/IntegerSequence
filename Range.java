import java.util.NoSuchElementException;
public class Range implements IntegerSequence{
  private int start,end,current;
  public Range(int start, int end){
    start = this.start;
    end = this.end;
    current = start;
  }

  public void reset(){
    current = 0;
  }

  public int length(){
    return end-start;
  }

  public boolean hasNext(){
    return current != end;
  }

}
