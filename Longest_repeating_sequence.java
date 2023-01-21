import java.util.*;
public class MyClass {
    public static String lcs(String x,String y,int x_len,int y_len)
    { String s="";
      int[][] t=new int[x_len+1][y_len+1];
      for(int i=0;i<x_len+1;i++)
      {
          for(int j=0;j<y_len+1;j++)
          {
              if(i==0||j==0)t[i][j]=0;
          }
      }
      for(int i=1;i<=x_len;i++)
      {
          for(int j=1;j<=y_len;j++)
          {
              if(x.charAt(i-1)==y.charAt(j-1)&&i!=j)t[i][j]=1+t[i-1][j-1];
              else t[i][j]=Math.max(t[i-1][j],t[i][j-1]);
          }
      }
      int i=x_len,j=y_len;
      
      while(i>0&&j>0)
      {
          if(t[i][j]==t[i-1][j-1]+1)
          {
              s+=x.charAt(i-1);
              i--;
              j--;
          }
          else
          {
              if(t[i][j]==t[i-1][j]) i--;
              else j--;
          }
      }
      return s;
    }
    public static void main(String args[]) {
     Scanner in=new Scanner(System.in);
     String str=in.next();
     String s=str;
     System.out.println(lcs(str,s,str.length(),str.length()));
    }
}
