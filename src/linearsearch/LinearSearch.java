package linearsearch;

public class LinearSearch {

	public static void main(String[] args) {

		int num[]= {3,5,7,9,11,13};
		int tar=11;
		int res=linearSearch(num,tar) ;
		if(res!=-1)
			System.out.println("Element found at the position : "+res);
		else
			System.out.println("Elememt not found :");



	}

	public static int linearSearch(int[] num, int tar) {
		for(int i=0;i<num.length;i++) {
			if(num[i]==tar)
				return i;
		}

		return -1 ;
	}

}

