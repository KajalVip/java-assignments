public class SubArrayWithGivenSum {
    static void main(String[] args) {
        int[] arr={1,4,20,3,10,5};
        int target=33;
        int start=0;
        int currentSum=0;
        for(int i=0;i<arr.length;i++){
            currentSum=currentSum+arr[i];
            while(currentSum>target && start<=i){
                currentSum=currentSum-arr[start];
                start++;
            }
            if(currentSum==target){
                System.out.println("Sub Array is="+ start+ "to"+ i);
                return;
            }
        }
        System.out.println("Not found");
    }
}
