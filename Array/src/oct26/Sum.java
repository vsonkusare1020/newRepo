package oct26;

public class Sum {
	public static void main(String[] args) {
		int x=0;
		int a[]= {1,2,3,4,5};
		for(int i=0;i<a.length;i++) {
			System.out.print(a[i]+" ");
			x=x+a[i];
		}
		System.out.println("\nsum of Array: "+x);
		
	}

}
