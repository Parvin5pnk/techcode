import java.util.*;
class stack{
    private int size;
    private int arr[];
    private int top;
    stack(int n){
        size=n;
        arr=new int[size];
        top=-1;
    }
    void push(int v){
        if(top<size){
            arr[++top]=v;
        }
        else{
            System.out.println("Overflow");
        }
    }
    int pop(){
        if(top>=0){
            return arr[top--];
        }
        else{
            System.out.println("Underflow");
            return -1;
        }
    }
    int peek(){
        if(top<0)
        return top;
        return arr[top];
    }
}
class rightmost{
    public static void main(String args[]){

      int a[]={8,4,1,6,7,1};
      // -1 6 6 7 -1 -1
     int out[]=new int[a.length];
    stack s=new stack(a.length);
     for(int i=a.length-1;i>=0;i--){
        if(s.peek()==-1){
            out[i]=s.peek();
            s.push(a[i]);
        }
        else{
            while(a[i]>s.peek() && s.peek() != -1){
                s.pop();
            }
            out[i]=s.peek();
            s.push(a[i]);

        }
      }
      System.out.println(Arrays.toString(out));
    
    }

    
}
