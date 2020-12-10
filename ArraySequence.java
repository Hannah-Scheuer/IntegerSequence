import java.util.NoSuchElementException;
public class ArraySequence implements IntegerSequence{
  private int currentIndex;
  private int[] data;

  /*Construct the sequence by copying values from the other array into the data array*/
  public ArraySequence(int [] other){
    data = new int[other.length];
    for (int i=0;i<other.length;i++){
      data[i]=other[i];
    }
    currentIndex=0;
  }

  public ArraySequence(IntegerSequence otherseq){
    otherseq.reset();
    data = new int[otherseq.length()];
    for (int i=0; otherseq.hasNext();i++){
      data[i] = otherseq.next();
    }
    otherseq.reset();
    currentIndex = 0;
  }

  public boolean hasNext(){
    return currentIndex < data.length;
  }

  public int next(){
    if (!hasNext()) {
      throw new NoSuchElementException("The number at index " +currentIndex+1+ " is not within the bounds of this Range");
    }
    int curr = data[currentIndex];
    currentIndex += 1;
    return curr;
  }

  public int length(){
    return data.length;
  }

  public void reset(){
    currentIndex=0;
  }


}
