
public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] a={99,22,88,66,44,33,77,11,55};
		//bubbleSort(a);
		//selectionSort(a);
		//insertionSort(a);
		//mergeSort(a);
		//shellSort(a);
		//quickSort(a);
		for(int i=0;i<a.length;i++){
			System.out.print(a[i]+" ");
		}

	}
	
	public static void mergeSort(int[] a){
		int[] helper=new int[a.length];
		mergeSort(a,helper,0,a.length-1);
	}
	public static void mergeSort(int[] a, int[] helper, int low, int high){
		if(low>=high) return;
		int mid=(low+high)/2;
		mergeSort(a, helper, low, mid);
		mergeSort(a,helper, mid+1, high);
		merge(a,helper, low,mid,high);
		
	}
	public static void merge(int[] a, int[] helper, int low,int mid, int high){
		//copy
		for(int i=low;i<=high;i++){
			helper[i]=a[i];
		}
		
		//compare and move++
		int left=low;
		int right=mid+1;
		int current=low;
		while(left<=mid&&right<=high){
			if(helper[left]<helper[right]){
				a[current]=helper[left];
				left++;
			}else{
				a[current]=helper[right];
				right++;
			}
			current++;
		}
		
		//left left, right is already in right position
		while(left<=mid){
			a[current++]=helper[left++];
		}
		
	}



}
