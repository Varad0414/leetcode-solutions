class Solution {
    public void merge(int[] nums1, int m, int[] nums2, int n) {
        int arr[] = new int[m+n];
        int i1=0,i2=0,i=0;
        while(i1 < m && i2 < n){
            if(nums1[i1] <= nums2[i2]){
                arr[i] = nums1[i1];
                i1++;
                i++;
            }
            else{
                arr[i] = nums2[i2];
                i2++;
                i++;
            }
        }

        while(i1 < m){
            arr[i++] = nums1[i1++];
        }

        while(i2 < n){
            arr[i++] = nums2[i2++];
        }

        for(i=0;i<m+n;i++){
            nums1[i] = arr[i];
        }
    }
}