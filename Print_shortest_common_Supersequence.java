import java.util.*;
public class MyClass {
    public static String lcs(String x,String y,int x_len,int y_len)
    {
        String str="",s="";
      
        int i=x_len,j=y_len;
        while(i>0&&j>0)
        {
            if(x.charAt(i-1)==y.charAt(j-1))
            {
                str+=x.charAt(i-1);
                i--;
                j--;
            }
            else
            {
                str+=x.charAt(i-1);
                str+=y.charAt(j-1);
                i--;
                j--;
            }
        }
        for(int k=str.length()-1;k>=0;k--)
        {
            s+=str.charAt(k);
        }
        return s;
    }
    public static void main(String args[]) {
   Scanner in=new Scanner(System.in);
   String x=in.next();
   String y=in.next();
   
  
   System.out.println(lcs(x,y,x.length(),y.length()));
    }
}
