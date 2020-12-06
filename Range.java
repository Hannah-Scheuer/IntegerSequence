import java.util.NoSuchElementException;
public class Range implements IntegerSequence{
  private int start,end,current;
  public Range(int start, int end){
    start = this.start;
    end = this.end;
  }

  public void reset(){
    current = 0;
  }

  public int length(){
    return end-start;
  }

}
