import java.util.NoSuchElementException;

public class Range implements IntegerSequence{

  private int start;
  private int end;
  private int current;

  //@param start : the starting value (inclusive) which must be <= end.
  //@param end : the ending value which is also inclusive.
  public Range(int _start,  int _end){
    this.start = _start;
    this.end = _end;
    this.current = _start;
  }

  public void reset(){
    current = start;
  }
  public int length(){
    return(end - start);
  }

  //When current is no longer a valid element in the range, it should return false.
  public boolean hasNext(){
    return((current >= end)? false : true);
  }

  //@throws NoSuchElementException when hasNext() is false.
  //This will return the current value, it will also increase current value by 1.
  //e.g.  if current is 5. This will make current 6, and return 5.
  public int next() throws NoSuchElementException{
    if(!hasNext())
      throw new NoSuchElementException();
    int i = current;
    current++;
    return i;
  }

}
