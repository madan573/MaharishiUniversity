import java.util.*;

public class madhavArray{

    public static void main(String [] args){
        final int N =10 ;
        int[] a =new int[N];
        int ch = arraySize(N);
        if(ch==1){
            System.out.println("Please check the size of array");
           // System.exit(1);
        }else{
        for(int i=0;i<N;i++){
            Scanner sc = new Scanner(System.in);
            a[i] = sc.nextInt();
        }
        int r = isMadhavArray(a);
        if(r==1){
            System.out.println("This is Madhav array");
        }else{
            System.out.println("This is not Madhav array");
        }
    }
    }
   
    public static int arraySize(int n){
        int r = 0, M=0;
        for (int i=1;i<=n;i++){
            M = i* (i+1)/2;
            if(M!=n){
                r=1;
            }else{
                r=0;
                break;
            }
        }
        return r;
    }
   public static int isMadhavArray(int[] a)
    {
        int ret = 1;
        int sum, c=0;
        for(int i=0;i<a.length;i=i+c){
            sum=0;
            
            for(int j=i;j<=i+c;j++){
                sum =sum+a[j];
                //c++;
            }
            if(sum!=a[0]){
                ret = 0;
                break;
            }
            c++;
        }
    
        return ret;
    }
}