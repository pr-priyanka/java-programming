package stacks;

public class StackEmptyException extends Exception {

    /**
    *
    */
    private static final long serialVersionUID= 1L;

}

package stacks;

public class StackFullException extends Exception {

  
}


package stack;

public class StackUse{

    public static void main(String[] args){

        StackUsingArray stack = new StackUsingArray();
        stack.push(10);
        stack.top();
        stack.pop();
        stack.size();
        stack.isEmpty();
    }
}


package stacks;

public class StackUsingArray{

    private int data[];
    private int topIndex;  //Index of the top most element of the stack

    public StackUsingArray(){
        data= new int[10];
        topIndex=-1;
    }

    public int size(){
        return topIndex+1;

    }

    public boolean isEmpty(){

          //if(topIndex==-1) return true;
          //else return false;
          return topIndex == -1;
    }

    public void push(int elem) throws StackFullException{
          //If stack is full
          if(topIndex==data.length-1){
              StackFullException e= new StackFullException();
              throw e;
              //Throw Exception
          }
          topIndex++;
          data[topIndex]= elem;

    }

    public int top() throws StackEmptyException{
      if(topIndex==-1){
        //Throw stack empty exception
        throw new StackFullException();
      }
        return data[topIndex];

    }

    public int pop() throws StackEmptyException{

        if(topIndex==-1){
            throw new StackEmptyException()
        }
        int temp = data[topIndex];
        topIndex--;
        return temp;
    }


}
