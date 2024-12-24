// package Arrays.Easy;

public class Q8 {
    public static void main(String[] args){
        // int[] a = {0 ,0 ,0 ,1};
        // int n = a.length;
        // int[] arr = new int[n];
        // for(int i=0; i<n; i++){
        //     if(a[i] != 0){
        //         arr[ct] = a[i];
        //         System.out.println(arr[i] = a[i]);
        //         ct++;
        //     }
        // }
        // for(int i=n-1; i>ct-1; i--){
        //     arr[i] = 0;
        //     System.out.println(arr[i] = 0);
        // }

        int[] nums = {0,1,1,0};
        int n = nums.length;
        int l = 0;
        for(int r=0; r<n; r++){
            if(nums[r] != 0){
                int temp = nums[l];
                nums[l] = nums[r];
                nums[r] = temp;
                l++;
            }
        }
        for(int i=0; i<n; i++){
            System.out.print(nums[i]+" ");
        }
    }
}