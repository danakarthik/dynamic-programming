import java.util.*;
public class MyClass {
    public static int Rod_cutting(int n,int[] price,int[] len)
    {
        int[][] t=new int[n+1][n+1];
        for(int i=0;i<=n;i++)
        {
            for(int j=0;j<=n;j++)
            {
                if(i==0||j==0)t[i][j]=0;
            }
        }
           for(int i=1;i<=n;i++)
        {
            for(int j=1;j<=n;j++)
            {
                if(len[i-1]<=j)t[i][j]=Math.max(t[i-1][j],price[i-1]+t[i][j-len[i-1]]);
                else t[i][j]=t[i-1][j];
            }
        }
             for(int i=0;i<=n;i++)
        {
            for(int j=0;j<=n;j++)
            {
               System.out.print(t[i][j]+" ");
            }
             System.out.println();
        }
        return t[n][n];
    }
    public static void main(String args[]) {
     Scanner in=new Scanner(System.in);
     int n=in.nextInt();
     int[] price=new int[n];
     int [] len=new int[n];
     for(int i=0;i<n;i++)
     {
         price[i]=in.nextInt();
         len[i]=i+1;
     }

      System.out.println(Rod_cutting(n,price,len));
    }
}
