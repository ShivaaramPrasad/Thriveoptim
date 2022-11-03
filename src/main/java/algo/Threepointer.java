package algo;

public class Threepointer {
	
	/*
	
	  
	  follow step:
	  1.if pointerM value == low swap low and middle and increment low and middle pointer by 1 
	  2.if pointerM value == middle, increment pointer by 1
	  3.if pointerM value == high,swap high and middle and decrement high by 1
	  
	  Example  
	  int[] arr= {1,2,0,1,2};
	  
	Initialize low =0 ,middle =0 , high =arr.length-1
	if the arr[middle] is 0 , swap middle and low values and increment both pointer
	if(arr[middle]==0) {
				int temp=nums[middle];
				nums[middle]=nums[low];
				nums[low]=temp;
				middle++;
				low++;
			}
	if the arr[middle] is 1 , increment middle pointer 
	
	if(nums[middle] ==1) middle++
	
	if the arr[middle] is 2 swap middle and high values and decrement high pointer 
	break the loop when middle <=high
	else {
				int temp=nums[middle];
				nums[middle]=nums[high];
				nums[high]=temp;
				high--;
			}
	
*/

}
