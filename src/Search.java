
public class Search {

	public static void main(String[] args) {
		int[] arr= {30,40,60};
		int index=-1;
		for(int i=0;i<arr.length-1;i++) {
			if(arr[i]==50) 
			{
			 index=i;
			}
		}
		if(index>=0) {
			System.out.println("50 found");
		}else {
			System.out.println("50 not found");
		}
	}

}
