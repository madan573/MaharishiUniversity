package maharishi;

public class CountRepresentations {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int result = countRepresentations(20);
		System.out.println(result);
	}
	static int countRepresentations(int numRupees) {
		int count =0;
		for(int rupees20=0;rupees20<=numRupees/20;rupees20++) {
			for(int rupees10=0;rupees10<=numRupees/10;rupees10++) {
				for(int rupees5=0;rupees5<=numRupees/5;rupees5++) {
					for(int rupees2=0;rupees2<=numRupees/2;rupees2++) {
						for(int rupees1=0;rupees1<=numRupees;rupees1++) {
							int total =rupees1+2*rupees2+5*rupees5+10*rupees10+20*rupees20;
							if(total==numRupees) {
								count++;
							}
							if(total>numRupees) {
								break;
							}
						}
					}
				}
			}	
		}
		return count;
	}

}
