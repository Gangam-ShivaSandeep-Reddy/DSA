package binarysearch;

public class BinarySearch {

	public static void main(String[] args) {


		int[]nums= {2,4,6,8,10,12,14,16,18};
		int target=14;
		int result=binarysearch(nums,0,nums.length-1,target);


		if(result!=-1)
			System.out.println("Element Index at the Position : "+result);
		else
			System.out.println("Element Not Found!");


	}

	private static int binarysearch(int[] nums, int left, int right, int target) {
		while(left<=right) {
			int mid=(left+right)/2;
			if(nums[mid]==target) {
				return mid;
			}
			else if(nums[mid]<target) {
				left=mid+1;
			}
			else {
				right=mid-1;
			}
		}

		return -1;
	}

}





//		public static int binarySearch(int nums,target) {
//			int num[]= {2,4,6,8,10,12};
//			int target=10;
//			int left=0;
//			int right=num.length-1;
//			while(left<=right) {
//				int mid=(left+right)/2;
//				if(nums[mid]==target) {
//					return mid;
//				}
//			}
