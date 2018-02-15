public class ArrayBasedStack<T> implements StackInterface<T> {
 T[] data;
 int topOfStack;
 final int INITIAL_CAPACITY = 5;
 boolean initialized;
 
 public ArrayBasedStack(){
   data= new data.length;
   initialized= true;
   topOfStack= -1;
  
  if (topOfStack <= 0){
 throw IllegalArgumentException;
 }
 }
 
 public ArrayBasedStack(){
   data= (T[]) newObject[INITIAL_CAPACITY]; 
 }
 
 private void extendArray();
   
 public void copyOf();
 
 public void push ();
 
 public void expandArray(){
   T[] data = new data[size+1];
   }
 
 public void isEmpty(){
   if (topOfStack < 0) {
   return false;
   } 
      else{
      return true;
      }

}
}