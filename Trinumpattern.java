public class Trinumpattern {

    public static void main(String args[]){
        int n=5;
        for(int i=1;i<=n;i++){
            int num=i;
            System.out.print(num +" ");
            for(int j=1;j<i;j++){
                num +=n-j;
                System.out.print(num+" ");
            }
            System.out.println("\n");
        }
    }
    
}
