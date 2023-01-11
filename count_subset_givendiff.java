import java.util.*;
public class MyClass {
    public static int subset(int n,int[] arr,int sum)
    {
        int[][] t=new int[n+1][sum+1];
        for(int i=0;i<=n;i++)
        {
            for(int j=0;j<=sum;j++)
            {
                if(i==0)t[i][j]=0;
                if(j==0)t[i][j]=1;
            }
        }
            for(int i=1;i<=n;i++)
            {
                for(int j=1;j<=sum;j++)
                {
                    if(arr[i-1]<=j)
                    {
                        t[i][j]=t[i-1][j]+t[i-1][j-arr[i-1]];
                    }
                    else t[i][j]=t[i-1][j];
                }
            }
        
        return t[n][sum];
    }
    public static int count_diff(int n,int[] arr,int diff)
    {
   
        int s=0;
        for(int i=0;i<n;i++)s+=arr[i];
        
       
        int s1=(s+diff)/2;
       
        
        return subset(n,arr,s1) ;
    }
    public static void main(String args[]) {
      Scanner in=new Scanner(System.in);
      int n=in.nextInt();
      int[] arr=new int[n];
      int diff=in.nextInt();
      for(int i=0;i<n;i++)arr[i]=in.nextInt();

      System.out.println(count_diff(n,arr,diff));
    }
}
