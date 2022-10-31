public class prime {
    public static void main(String[] args){
        int start=10, end=30, total=0;
        total = primeCount(start,end);
        System.out.println(total);
    }
    public static int primeCount(int start,int end){
        count = 0 ;
        for(int i=start;i<=end;i++)
        {
            if(isPrime(i)==1)
            {
                count++;
            }
        }
            
        
        return count;
    }
    static int isPrime(int i){
        if(i<=1)
        {
            return 0;
        }
        for(int j=2; j=i/2;j++)
        {
            if(i%j==0){
                return 0;
            }
        }

        return 1;
    }
}
