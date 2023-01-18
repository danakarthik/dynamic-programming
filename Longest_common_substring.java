import java.util.*;
public class MyClass {
    public static int lc_substring(String x,String y,int m,int n)
    {
        int result=0;
        int[][] t=new int[m+1][n+1];
        String str="";
        for(int i=0;i<=m;i++)
        {
            for(int j=0;j<=n;j++)
        {
            if(i==0||j==0)t[i][j]=0;
        }
        }
        for(int i=1;i<=m;i++)
        {
           
            for(int j=1;j<=n;j++)
            {
                if(x.charAt(i-1)==y.charAt(j-1))
                {
                    t[i][j]=t[i-1][j-1]+1;
                    //str+=x.charAt(i-1);
                    result = Integer.max(result,t[i][j]);
                }
                else
                {
                    t[i][j]=0;
                    //str="";
                }
            }
        }
        //System.out.println(str);
        return result;
    }
    public static void main(String args[]) {
     Scanner in=new Scanner(System.in);
     String str=in.next();
     String y=in.next();
   
     

      System.out.println(lc_substring(str,y,str.length(),y.length()));
    }
}
