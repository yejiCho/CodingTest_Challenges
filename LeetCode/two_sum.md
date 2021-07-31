## java

```java

class Solution {
    public int[] twoSum(int[] nums, int target) {
        
        int[] answer = new int[2];
        
        for(int i=0; i<nums.length; i++){
            for(int j=nums.length-1; j>=0; j--){
                if(nums[i]+ nums[j] == target){
                    answer[0] = i;
                    answer[1] = j;
                }
            }
        }
        
        return answer;
        
    }
}

```

```
Runtime: 108 ms, faster than 5.21% of Java online submissions for Two Sum.
Memory Usage: 38.8 MB, less than 92.73% of Java online submissions for Two Sum.
```

```java

public int[] twoSum(int[] nums, int target) {
        
        int[] ans = new int[2];
        
        HashMap<Integer,Integer> map = new HashMap<>();
        
        for(int i = 0;i<nums.length;i++){
            if(map.containsKey(target-nums[i])){
                ans[0] = (int)map.get(target-nums[i]);
                ans[1] = i;
            }else{
                map.put(nums[i],i);
            }
        }
        return ans;
    }

```

```
Runtime: 4 ms, faster than 55.05% of Java online submissions for Two Sum.
Memory Usage: 40.1 MB, less than 25.68% of Java online submissions for Two Sum.
```