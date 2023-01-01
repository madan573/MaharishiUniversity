public class madhavArray{

    public static void main(String [] args){
    	int[] a= {2,1,1,3,-1,0,7,3,-8,0};
        int r = isMadhavArray(a);
        System.out.println(r);
       }
      public static int arraySize(int n){
        int r = 0, M=0;
        for (int i=1;i<=n;i++){
            M = i* (i+1)/2;
            if(M==n){
                r=1;
                break;
            }
            if(M>n) break;
        }
        return r;
    }
   public static int isMadhavArray(int[] a)
    {
        int sum, c=0;
        if(arraySize(a.length)==1) {
	        for(int i=0;i<a.length;i=i+c){
	            sum=0;
	            for(int j=i;j<=i+c;j++){
	                sum =sum+a[j];
	            }
	            if(sum!=a[0]){
	                return 0;
	            }
	            c++;
	        }
	        return 1;
        }
        return 0;
    }
}