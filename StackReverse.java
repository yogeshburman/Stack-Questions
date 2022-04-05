// push at bottom

import java.util.*;
class StackReverse {
  
  static void  pushtoBottom(Stack<Integer> s , int data ){
    
    if(s.isEmpty()){
      s.push(data);
      return;
    }
    int temp=s.pop();
    pushtoBottom(s,data);
    s.push(temp);
    
  }
  // reversing 
  static void reverse(Stack<Integer> s){
    if(s.isEmpty()){
      return;
    }
    
    
    int top=s.pop();
    reverse(s);
    pushtoBottom(s,top);
  }
  
  
  public static void main (String[]args){
    Stack<Integer> stack = new Stack<Integer>();
    stack.push(1);
    stack.push(2);
    stack.push(3);
    
    reverse(stack);
    
    while(stack.isEmpty()!=true){
      System.out.println(stack.peek());
      stack.pop();
    }
    
  }
}