package oct25;

public class R {
	public static void main(String[] args) {
		int a[]= {1,3,5,7,9,11};
		for(int j=0;j<a.length;j++)
		{
			System.out.print(a[j]+" ");
		}
		System.out.println("\nReverse array");
		for(int i=a.length-1;i>=0;i--)
		{
			System.out.print(a[i]+" ");
		}
		System.out.println("\nArray length :"+a.length);
	}

}
