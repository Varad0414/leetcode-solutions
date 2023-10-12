/**
 * // This is MountainArray's API interface.
 * // You should not implement it, or speculate about its implementation
 * interface MountainArray {
 *     public int get(int index) {}
 *     public int length() {}
 * }
 */
 
class Solution {
    public int findInMountainArray(int target, MountainArray mountainArr) {
        int peak = findPeak(mountainArr);
        if(mountainArr.get(peak) == target){
            return peak;
        }
        int ind1 = binarySearch(0, peak-1, target, mountainArr);
        int ind2 = binarySearchR(peak + 1, mountainArr.length() - 1, target, mountainArr);

        if(ind1 != -1){
            if(ind2 != -1){
                return Math.min(ind1, ind2);
            }
            else{
                return ind1;
            }
        }

        if(ind2 != -1){
            if(ind1 != -1){
                return Math.min(ind1, ind2);
            }
            else{
                return ind2;
            }
        }

        return -1;
    }

    static int findPeak(MountainArray arr){
        int low = 0;
        int high = arr.length() - 1;
        while(low <= high){
            int mid = (low + high) / 2;
            int curr = arr.get(mid);
            if(mid - 1 >= 0 && mid + 1 < arr.length() && curr > arr.get(mid + 1) && curr > arr.get(mid - 1)){
                return mid;
            }
            else if(mid - 1 >= 0 && curr < arr.get(mid - 1)){
                high = mid - 1;
            }
            else{
                low = mid + 1;
            }
        }

        return -1;
    }

    static int binarySearch(int low, int high, int target, MountainArray arr){
        while(low <= high){
            int mid = (low + high) / 2;
            int curr = arr.get(mid);
            if(curr == target){
                return mid;
            }
            else if(curr > target){
                high = mid - 1;
            }
            else{
                low = mid + 1;
            }
        }

        return -1;
    }

    static int binarySearchR(int low, int high, int target, MountainArray arr){

        while(low <= high){
            int mid = (low + high) / 2;
            int curr = arr.get(mid);
            if(curr == target){
                return mid;
            }
            else if(curr < target){
                high = mid - 1;
            }
            else{
                low = mid + 1;
            }
        }

        return -1;
    }
}