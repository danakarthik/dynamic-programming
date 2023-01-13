import java.util.*;
public class MyClass {
    public static int LCS(String x,String y,int n,int m)
    {
        int[][] t=new int[n+1][m+1];
        for(int i=0;i<=n;i++)
        {
            for(int j=0;j<=m;j++)
            {
                t[i][j]=-1;
            }
        }
        if(n==0||m==0)return 0;
        if(t[n][m]!=-1)return t[n][m];
        if(x.charAt(n-1)==y.charAt(m-1))
        {
            return t[n][m]=1+LCS(x,y,n-1,m-1);
        }
        else
        {
            return t[n][m]= Math.max(LCS(x,y,n-1,m),LCS(x,y,n,m-1));
        }
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
