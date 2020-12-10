import java.util.NoSuchElementException;

public class Tester{

  public static void main(String[] args){
    IntegerSequence r = new Range(10,20);

    // Test for range
    while(r.hasNext()){
      System.out.print(r.next());
      if( r.hasNext() )
        System.out.print( ", " );
    }
    System.out.println();

    // Test NoSuchElementException
    try{
      System.out.println(r.next());
    }
    catch(NoSuchElementException e){
      System.out.println("caught NoSuchElementException exception");
    }

    int[] nums = {1,3,5,0,-1,3,9};
    IntegerSequence as = new ArraySequence(nums);

    System.out.println("ArraySequence(array):");
    while(as.hasNext()){
      System.out.print(as.next()+", ");
    }
    System.out.println();

    // Test NoSuchElementException
    try{
      System.out.println(r.next());
    }
    catch(NoSuchElementException e){
      System.out.println("caught NoSuchElementException exception");
    }

    // Test Second ArraySequence
    IntegerSequence ra = new Range(10,20);
    IntegerSequence aseq = new ArraySequence(ra);

    System.out.println("ArraySequence(seq):");
    while(aseq.hasNext()){
      System.out.print(aseq.next()+", ");
    }
    System.out.println();


  }


}
