import java.util.HashMap;
import java.util.Map;

public class Main {
    public static void main(String[] args) {


    }

    public boolean containsNearbyDuplicate(int[] nums, int k) {
        Map<Integer, Integer> map = new HashMap<>();
        for(int i = 0; i < nums.length; i++){
            if(map.containsKey(nums[i]) && Math.abs(map.get(nums[i]) -i) <= k){
                return true;
            }else{
                map.put(nums[i], i);
            }
        }
        return false;
    }
}