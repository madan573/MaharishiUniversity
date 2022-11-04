/*An array is inertial if it holds following 3 conditions:
 * 1. it contains at least one odd value.
 * 2. the maximum value in the array is even.
 * 3. every odd value is greater than every even value that is not the maximum value.
 * 
 */
public class intertial {
public static void main(String[] args) {
	int [] a = {11,4,20,9,2,6};
	int r = isIntertial(a);
	if(r==1) {
	System.out.println("the array is interial");
	}else {
		System.out.println("The array is not interial");
	}
}
public static int isIntertial(int[] a) {
	int ret = 0;
	int max=0,count_odd=0;
	count_odd = oddCount(a);
	max = maxValue(a);
	if(count_odd>=1 && max == 1) {
		ret=1;
	}
	return ret;
}
//1. to count odd value
public static int oddCount(int[] b) {
	int c = 0;
	for(int i=0;i<b.length;i++) {
		if(b[i]%2!=0) {
			c++;
		}
	}
	return c;
}
//2. maximum value in an array and check 3 condition
public static int maxValue(int[] c) {
	int max=0,lowodd,ret=0;
	for(int i=0;i<c.length;i++) {
		if(c[i]>=max) {
			max = c[i];
		}
	}
	if(max%2!=0) {
		return ret;
	}else {
	lowodd = max;
	for(int i=0;i<c.length;i++) {
		
		if(c[i]%2==1 && c[i]<lowodd) {
			lowodd=c[i];
		}
		
	}
	
	for(int j=0;j<c.length;j++) {
		
		if(c[j]%2==0) {
			 if(c[j]==max) {continue;}
			if(lowodd>c[j]) {			
			ret =1;
			}else { ret =0;}
			
		}
	}
	}
	return ret;
}

}
