import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class ContainsDuplicates {
    /**
     * Determine if an array of items contains any duplicate values. You should use a Set for this: remember that
     * Sets can not have duplicate values, but you may check if a value is already contained using the .contains method.
     * @param nums an array of ints.
     * @return true if nums contains any duplicate values, false if it does not.
     */
    public boolean containsDuplicate(int[] nums){
        // ME_NOTE: 2 ways to do this;
        
        // First way;
        // HashSet<Integer> testSet = new HashSet<>();
        // for(int i=0; i<nums.length; i++){
        //     if(testSet.contains(nums[i])){
        //         return true;
        //     }

        // }
        // return false;

        // 2nd way;
        Arrays.sort(nums);

        for(int i =0; i<nums.length-1; i++){
            if(nums[i] == nums[i+1]){
                return true;
            }
        }
        return false;
    }
}
