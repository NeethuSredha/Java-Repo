package programs;

public class SumOfArray {
int[] array1= {2,3,4};
int[] array2= {4,9,2};
int[] sum=new int[3];
int i;
public void add(int[] a, int[] b) {
	for(i=0;i<array1.length;i++) {
		
			sum[i]=array1[i]+array2[i];
		}
	
	for(i=0;i<sum.length;i++) {
		System.out.print(sum[i]+"\t");
	}
	System.out.println();
}
	public static void main(String[] args) {
		SumOfArray s=new SumOfArray();
		s.add(s.array1,s.array2);

	}

}
