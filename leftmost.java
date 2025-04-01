import java.util.*;
class stack{
    private int size;
    private int a[];
    private int top;
    public stack(int n){
        size=n;
        a=new int[size];
        top=-1;
    }
    void push(int v){
        if(top<size-1)
        a[++top]=v;
        else
        System.out.println("Overflow");
    }
    int pop(){
        if(top>=0)
        return a[top--];
        else
        return -1;
    }
    int peek(){
        if(top>=0)
        return a[top];
        else
        return -1;
    }
}
public class leftmost {
    public static void main(String args[]){
        int a[]={4,2,1,2,1};
        int out[]=new int[a.length];
        stack s=new stack(a.length);
        for(int i=0;i<a.length;i++){
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
