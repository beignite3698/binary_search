package DSA;
public class binary_search {
	public static void main(String[] args) {
		int arr[] = {-3,-2,-1,0,1,2,3};		
		int item = -4;
		int len = arr.length;
		int beg = 0;
		int end = len-1;
		int mid = 0;
		int result = 0;
		while(beg<=end) {
			mid = (beg+end)/2;
			if(arr[mid]<=item) {
				if(arr[mid]==item) {
					result = mid;
				}
				beg = mid+1;
				}
			else {
				end = mid-1;
			}
		}
		if(result==0)
			System.out.println("not found");
		else {
			System.out.println("item found at index no "+result);
		}
	}
}
