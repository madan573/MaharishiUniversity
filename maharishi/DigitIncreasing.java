package maharishi;

public class DigitIncreasing {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int res = isDigitIncreasing(108);
		System.out.println(res);
	}
	/*static int isDigitIncreasing(int n) {
		int ret=0,m=n,digit=0,countBit=0;
		while(m>0) {
			digit = m;
			countBit++;
			m /=10; 
		}
		for(int i = digit-1;i<=digit;i++) {
			int sum=0,total=0;
			for(int j=1;j<=countBit;j++) {
				sum= (sum*10)+i;
				total =sum+total;
			}
			if(total==n) {
				ret=1;
				break;
			}
		}
		int sum=0,total=0;
		for(int j=1;j<=countBit;j++) {
			sum= (sum*10)+9;
			total =sum+total;
			if(total==n) {
				ret=1;
				break;
			}
		}
		return ret;
	}
	
	/* Alternative way
	 * 
	 *  static int isDigitIncreasing(int n) {
		int sum, num, ret=0;
		for(int i = 1; i <= 9; i++) {
			sum = 0;
			num = 0;
			while(sum < n) {
				num = (num * 10) + i;
				sum += num; 
			}
			if(sum == n) {
				ret=1;
				break;
			}
		}
		return ret;
	}
	
	*/
	static int isDigitIncreasing(int num) 
	{
	    int n = 1;
	    int sum = 1; //value to increase n
	    while (n <= num) {
	        //if num is (111...) * base_digit and base_digit is < 10
	        if (num % n == 0 && n * 10 > num) return 1;
	        sum = sum * 10 + 1; //N*10+N where n is 1 as was assumed
	        n += sum;  //next step
	    }
	    return 0;
	}
}
