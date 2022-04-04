package oct26;

public class Lno {
	public static void main(String[] args) {
		int a[]= {5,2,25,15,30,20};
		int largeno=a[0];
		for(int i=0;i<a.length;i++)
			
		{
			if(a[i]>largeno) {
				largeno=a[i];
			}
			
		}
		System.out.println("largest number: "+largeno);
		
	}

}
