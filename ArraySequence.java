import java.util.NoSuchElementException;
public class ArraySequence implements IntegerSequence{
  private int currentIndex;
  private int[] data;
  private int size;

  /*Construct the sequence by copying values from the other array into the data array*/
  public ArraySequence(int [] other){
    int[] data = new int[other.length];
    for (int i=0;i<other.length;i++){
      data[i]=other[i];
    }
    currentIndex=0;
    size = other.length;
  }

  public ArraySequence(IntegerSequence otherseq){
    otherseq.reset();
    int[] data = new int[otherseq.length()];
    int temp = 1;
    while (otherseq.hasNext()){
      data[temp] = otherseq.next();
      temp += 1;
    }
    otherseq.reset();
    currentIndex = 0;
  }

  public boolean hasNext(){
    return currentIndex < size;
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
    return size;
  }

  public void reset(){
    currentIndex=0;
  }


}
