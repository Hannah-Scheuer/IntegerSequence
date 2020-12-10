public class Demo{
   public static void main(String[]args){
     Range r = new Range(10,20);
     while(r.hasNext()){
       System.out.print(r.next());
       if( r.hasNext() )
          System.out.print( ", " );
    }
    System.out.println();

    IntegerSequence p = new Range(10,15);
    while(p.hasNext()){
      System.out.print(p.next());
      if( p.hasNext() ){
         System.out.print( ", " );
      }
    }
    System.out.println();
    System.out.println(p.length());

    int[]nums = {1,3,5,0,-1,3,9};
    ArraySequence as = new ArraySequence(nums);

    System.out.println("ArraySequence(array):");
    while(as.hasNext()){
      System.out.print(as.next());
      if( as.hasNext() ){
         System.out.print( ", " );
      }
    }

   }
}
