/*
 * For example, if the array is {11, 5, 4, 20} the function would return 3 because 
 * the only square pairs that can be constructed from those numbers are <5, 11>,
 * <5, 20> and <4, 5>.
 */
public class squarepair {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int [] a = {11,5,4,20};
		int b = countSquarePairs(a);
		System.out.println("The square pairs in an array are: "+b);		
		
	}
	
//count square function
	public static int countSquarePairs(int[] a) {
		int count=0,sum=0,sq=0;
		if(a.length>1) {
		for(int i=0;i<a.length;i++) {
			if(a[i]<=0) {
				continue;
			}
		
		for(int j=0;j<a.length;j++) {
			if(a[i]<a[j]) {
			sum=a[i]+a[j];
			sq=isPerfectSquare(sum);
			if(sq==1) {
				count++;
			}
			}
		}
		}
		}
		
		return count;
	}
	
	public static int isPerfectSquare(int x) {
		int ret=0,sq=0;
		//this condition never occurs in this case
		if(x<=0) {
			return 0;
		}
		if(x==1) {
			return 1;
		}
		for(int i=2;i<=x/2;i++) {
			sq = i*i;
			if(x==sq) {
				ret=1;
				break;
			}
		}
		return ret;
	}
}
/* Alternate way of solution
public class squarepair {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int [] a = {11,5,4,20};
		int [] b = sortarray(a);
		int c = countSquarePairs(b);
		System.out.println("The square pairs in an array are: "+c);		
		
	}
	//sorting fucntion
	public static int[] sortarray(int[] a) {
		int[] ret=a; 
		int temp=a[0];
		for(int i=0;i<a.length-1;i++) {
			for(int j=i+1;j<a.length;j++) {
				if(a[i]>a[j]) {
					temp = a[j];
					a[j]=a[i];
					a[i]=temp;
				}
			}
		}
		return ret;
	}
//count square function
	public static int countSquarePairs(int[] b) {
		int count=0,sum=0,sq=0;
		if(b.length>1) {
		for(int i=0;i<b.length-1;i++) {
			if(b[i]<=0) {
				continue;
			}
		for(int j=i+1;j<b.length;j++) {
			sum=b[i]+b[j];
			sq=isPerfectSquare(sum);
			if(sq==1) {
				count++;
			}
		}
		}
		}
		
		return count;
	}
	
	public static int isPerfectSquare(int x) {
		int ret=0,sq=0;
		//this condition never occurs in this case
		if(x<=0) {
			return 0;
		}
		if(x==1) {
			return 1;
		}
		for(int i=2;i<=x/2;i++) {
			sq = i*i;
			if(x==sq) {
				ret=1;
				break;
			}
		}
		return ret;
	}
}
*/
