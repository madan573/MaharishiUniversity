package maharishi;
/*porcupine number is a prime number with following properties:
 * 1. ends with 9
 * 2. next prime number also ends with 9
 * 
 */

public class porcupineNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n = 10;
		int r = findPorcupineNumber(n);
		System.out.println("The porcupine number is: "+r);
	}
	public static int findPorcupineNumber(int n) {
		int ret=0,prime1=2,r=0;
		n=n+1;
		while(true) {
			if(isPrime(n)==1 && n%10==9) {	
				prime1 = n;
				while(true) {
					n++;
					if(isPrime(n)==1) {
						if(n%10==9) {
								r=2;
								break;
						}
						break;
					}
				}
			}
				
			if(r==2) {
					ret= prime1;
					break;
			}
			n++;
			
		}
		return ret;
	}
	
	//prime number
	public static int isPrime(int n) {
		int p=1;
		if(n<1) {
			p=0;
		}
		for(int i=2;i<=n/2;i++) {
			if(n%i==0) {
				p=0;
				break;
			}
		}
		
		return p;
	}

}
