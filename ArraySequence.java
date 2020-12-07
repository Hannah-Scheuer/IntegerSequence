import java.util.NoSuchElementException;
public class ArraySequence implements IntegerSequence{
  private int currentIndex;
  private int []data;

  /*Construct the sequence by copying values from the other array into the data array*/
  public ArraySequence(int [] other){
    for (int i=0;i<other.length;i++){
      data[i]=other[i];
    }
    currentIndex=0;
  }

  public boolean hasNext(){
    return currentIndex < data.length;
  }

  public int next(){
    if (!hasNext()) {
      throw new NoSuchElementException("The number " +current+1+ " is not within the bounds of this Range");
    }
    int curr = currentIndex;
    currentIndex += 1;
    return curr;
  }


}
