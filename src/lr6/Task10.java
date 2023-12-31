package lr6;

public class Task10 {
    public static int[] getMaxNMin(int ... nums) {
        int[] maxMin=new int[2];
        maxMin[0]=nums[0];
        maxMin[1]=nums[0];
        for(int i=0; i<nums.length; i++){
            if(maxMin[0]<nums[i]){
                maxMin[0]=nums[i];
            }
            if(maxMin[1]>nums[i]){
                maxMin[1]=nums[i];
            }
        }
        return maxMin;
    }
}
