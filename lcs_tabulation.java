import java.util.*;
public class MyClass {
    public static int LCS(String x,String y,int n,int m)
    {
        int[][] t=new int[n+1][m+1];
        for(int i=0;i<=n;i++)
        {
            for(int j=0;j<=m;j++)
            {
                if(i==0||j==0)
                t[i][j]=0;
            }
        }
        for(int i=1;i<=n;i++)
        {
            for(int j=1;j<=m;j++)
            {
                if(x.charAt(i-1)==y.charAt(j-1)) t[i][j]=1+t[i-1][j-1];
                else t[i][j]=Math.max(t[i-1][j],t[i][j-1]);
            }
        }
        return t[n][m];
    }
    public static void main(String args[]) {
    Scanner in=new Scanner(System.in);
    String x=in.next();
    String y=in.next();
    int n=x.length();
    int m=y.length();
      System.out.println(LCS(x,y,n,m));
    }
}
