import java.util.*;
public class MyClass {
    public static boolean[][] t=new boolean[102][10002];
    public static boolean sub_set_sum(int n,int[] arr,int sum)
    {
          for(int i=0;i<=n;i++)
        {
            for(int j=0;j<=sum;j++)
            {
                if(i==0)t[i][j]=false;
                if(j==0)t[i][j]=true;
            }
        }
        for(int i=1;i<=n;i++)
        {
            for(int j=1;j<=sum;j++)
            {
                if(arr[i-1]<=j)t[i][j]=t[i-1][j]||t[i-1][j-arr[i-1]];
                else if(arr[i-1]>j)t[i][j]=t[i-1][j];
            }
        }
      
        
        return t[n][sum];
    }
    public static int min_diff(int n,int[] arr)
    { 
     
            int sum=0;
            for(int i=0;i<n;i++)
            {
                sum+=arr[i];
            }
          int max=Integer.MIN_VALUE;
          for(int i=sum/2;i>=0;i--)
          {
               if(sub_set_sum(n,arr,i))
            {
                max=i;
                break;
            }
          }
         // System.out.println(max);
        return sum-(2*max);
    }
    public static void main(String args[]) {
  Scanner in=new Scanner(System.in);
  int n=in.nextInt();
  int[] arr=new int[n];
 
  for(int i=0;i<n;i++)
  {
      arr[i]=in.nextInt();
     
  }
  //sub_set_sum(n,arr,sum);
  System.out.println(min_diff(n,arr));
 //System.out.println(sum);
    
  
    }
}
