import java.util.NoSuchElementException;

public class ArraySequence implements IntegerSequence{
  private int currentIndex;
  private int[] data;

  /*Construct the sequence by copying values from the other array into the data array*/
  public ArraySequence(int[] _other){
    this.data = new int[_other.length];
     for(int i=0; i<_other.length; i++){
       data[i] = _other[i];
     }
     currentIndex = 0;
  }

  public ArraySequence(IntegerSequence _otherseq){
    this.data = new int[_otherseq.length()];
    System.out.println(_otherseq.length());
    int i = 0;
    while(_otherseq.hasNext()){
      data[i] = _otherseq.next();
      i++;
    }
    _otherseq.reset();
    currentIndex = 0;
  }

  public int length(){
    return(data.length);
  }

  public boolean hasNext(){
    return((currentIndex >= data.length)? false : true);
  }

  public int next() throws NoSuchElementException{
    if(!hasNext())
      throw new NoSuchElementException();
    int i = currentIndex;
    currentIndex++;
    return data[i];
  }

  public void reset(){
    currentIndex = 0;
  }
}
