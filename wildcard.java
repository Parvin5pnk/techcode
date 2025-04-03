import java.util.*;
public class wildcard {
    public static void main(String args[]){
        String text="abcdef";
        String pattern="*?";
        int m=text.length();
        int n=pattern.length();
        boolean dp[][]= new boolean[m+1][n+1];
        dp[0][0]=true;
        for(int j=1;j<=n;j++){
            if(pattern.charAt(j-1)=='*'){
                dp[0][j]=dp[0][j-1];
            }
        }

        for(int i=1;i<=m;i++){
            for(int j=1;j<=n;j++){
                if(pattern.charAt(j-1)==text.charAt(i-1) || pattern.charAt(j-1)=='?'){
                    dp[i][j]=dp[i-1][j-1];
                }
                else if(pattern.charAt(j-1)=='*'){
                    dp[i][j]=dp[i-1][j] || dp[i][j-1];
                }
            }
        }

        System.out.println(dp[m][n]);

    }
}
