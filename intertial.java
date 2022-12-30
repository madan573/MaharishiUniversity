public class intertial {
public static void main(String[] args) {
	int [] a = {11,4,20,9,2,8};
	System.out.println(isIntertial(a));
}
public static int isIntertial(int[] a) {
	int maxOdd=0,minOdd=0,maxEven=0,count_odd=0, count_even=0;
	for(int i=0;i<a.length;i++) {
		if(a[i]%2!=0) {
			maxOdd=a[i];
minOdd=a[i];
count_odd = 1;
		}else{
			maxEven=a[i];
			count_even=1;
		}
		if(count_even==1 && count_odd==1) break;
	}
	if(count_odd==0 || count_even==0) return 0;
	for(int i=0;i<a.length;i++) {
	if(a[i]%2==0){		
if(a[i]>maxEven) maxEven = a[i];
	}else{
		if(a[i]>maxOdd) maxOdd=a[i];
		if(a[i]<minOdd) minOdd=a[i];
	}
	}
	if(maxOdd>maxEven) return 0;
	for(int i=0;i<a.length;i++) {
		if(a[i]==maxEven) continue;
		if(a[i]%2==0){
			if(a[i]>minOdd) return 0;
		}
	}
	return 1;
}
}
