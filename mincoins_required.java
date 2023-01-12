import java.util.*;
public class MyClass {
    public static int coin_change(int n,int sum,int[] arr)
    {
       int c=0;
        int[][] t=new int[n+1][sum+1];
        for(int i=0;i<=n;i++)
        {
            for(int j=0;j<=sum;j++)
            {
                if(i==0)t[i][j]=Integer.MAX_VALUE-1;
                if(j==0)t[i][j]=0;
                if(i==1)
                {
                if(j%arr[0]==0)t[i][j]=j/arr[0];
                else t[i][j]=Integer.MAX_VALUE-1;
                }
            }
        }
            for(int i=2;i<=n;i++)
            {
                for(int j=1;j<=sum;j++)
                {
                    if(arr[i-1]<=j)t[i][j]=Math.min(t[i-1][j],1+t[i][j-arr[i-1]]);
                    else
                    t[i][j]=t[i-1][j];
                }
            }
                     /*for(int i=0;i<=n;i++)
        {
            for(int j=0;j<=sum;j++)
            {
               System.out.print(t[i][j]+" ");
            }
             System.out.println();
        }*/
        int ans=t[n][sum];
        if(ans==Integer.MAX_VALUE-1)return -1;
     
      
        
       else return ans;
    }
    public static void main(String args[]) {
        Scanner in=new Scanner(System.in);
        int n=in.nextInt();
        int sum=in.nextInt();
        int[] arr=new int[n];
        for(int i=0;i<n;i++)arr[i]=in.nextInt();
      System.out.println(coin_change(n,sum,arr));
    }
}
