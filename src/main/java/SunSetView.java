public class SunSetView {

     static int sunset(int arr[]){
        int count = 1;
        int length = arr.length;
        int maxHeightOfBuilding = arr[length-1];
        // As the given array has east to west buildings, The last building would ever have sunset. So, count is 1 assuming atleast one building present
        // performing loop from last second building
        for (int i = length-2; i >=0 ; i--) {
            if(arr[i]>maxHeightOfBuilding){
                count++;
                maxHeightOfBuilding=arr[i]; // if the height is more than previous building change the max height of building
            }
        }
        return count;
    }
    public static void main(String[] args){
        int[] arr = {3,7,8,3,6,1};
        System.out.println("Number of buildings which has sunset : "+sunset(arr));
    }
}
