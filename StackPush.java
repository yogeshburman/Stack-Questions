// push at bottom

import java.util.*;
class StackPush {
  
  static void  addtoBottom(Stack<Integer> s , int data ){
    
    if(s.isEmpty()){
      s.push(data);
      return;
    }
    int temp=s.pop();
    addtoBottom(s,data);
    s.push(temp);
    
  }
  
  public static void main (String[]args){
    Stack<Integer> stack = new Stack<Integer>();
    stack.push(1);
    stack.push(2);
    stack.push(3);
    
    addtoBottom(stack,5);
    while(stack.isEmpty()!=true){
      System.out.println(stack.peek());
      stack.pop();
    }
    
  }
}