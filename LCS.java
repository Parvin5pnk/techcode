import java.util.*;
public class LCS {
    public static void main(String args[]){
        String text1="ace";
        String text2="abcde";

        int dp[][]=new int[text1.length()+1][text2.length()+1];
        for(int i=0;i<text1.length();i++){
            dp[0][i]=0;
            dp[i][0]=0;
        }

        for(int i=1;i<dp.length;i++){
            for(int j=1;j<dp[i].length;j++){

                if(text1.charAt(i-1)== text2.charAt(j-1)){
                    dp[i][j]=1+dp[i-1][j-1];
                }
                else{
                    dp[i][j]=Math.max(dp[i-1][j],dp[i][j-1]);
                }
            }
        }
        System.out.println("The LCS:"+dp[text1.length()][text2.length()]);

        StringBuilder sb=new StringBuilder();
        int i=text1.length();
        int j=text2.length();

        while(i>0 && j>0){
            if(text1.charAt(i-1)==text2.charAt(j-1)){
                sb.append(text1.charAt(i-1));
                i--;
                j--;
            }
            else if(dp[i-1][j]>= dp[i][j-1]){
                i--;
            }
            else{
                j--;
            }
        }

        System.out.println(sb.reverse().toString());

    }
}
