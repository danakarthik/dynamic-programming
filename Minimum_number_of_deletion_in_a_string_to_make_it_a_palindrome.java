import java.util.*;
public class MyClass {
    public static int lcs(String x,String y,int x_len,int y_len)
    {
        int[][] t=new int[x_len+1][y_len+1];
        for(int i=0;i<=x_len;i++)
        {
            for(int j=0;j<=y_len;j++)
            {
                if(i==0||j==0)t[i][j]=0;
            }
        }
        for(int i=1;i<=x_len;i++)
        {
            for(int j=1;j<=y_len;j++)
            {
                if(x.charAt(i-1)==y.charAt(j-1))t[i][j]=1+t[i-1][j-1];
                else t[i][j]=Math.max(t[i-1][j],t[i][j-1]);
            }
        }
        return x_len-t[x_len][y_len];
    }
    public static void main(String args[]) {
   Scanner in=new Scanner(System.in);
   String x=in.next();
   String y="";
   for(int i=x.length()-1;i>=0;i--)y+=x.charAt(i);
  
   System.out.println(lcs(x,y,x.length(),y.length()));
    }
}
