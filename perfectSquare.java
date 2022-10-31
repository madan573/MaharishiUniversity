import java.util.Scanner;
public class perfectSquare{
    
    static int isPerfectSquare(int c)
    {
        int sq=0;
        for(int i=1;i<c;i++)
        {
             sq=i*i;
            if(sq>c){
                break;
            }

        }
        return (sq);
    }
    public static void main(String[] args){
        Scanner obj = new Scanner(System.in);
        int a=obj.nextInt();
        int b = isPerfectSquare(a);
        System.out.println("the next perfect square is: "+b);
    }
}