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