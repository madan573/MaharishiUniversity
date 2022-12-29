public class upcount{

    public static void main(String[] args){
        int[] a ={2,3,1,-6,8,-3,-1,2};   
        int up = nUpCount(a,5);  
        System.out.println(up);
    }
    public static int nUpCount(int a[], int n){
        int count=0,partialsum=0;
        for(int i=0;i<a.length;i++)
        {
              if(partialsum<=n && (partialsum+a[i])>n){
                count++;
            }
            partialsum += a[i];
        }
        return count;
    }

}