## java


```java

class Solution {
    public boolean containsDuplicate(int[] nums) {
        
        HashMap<Integer,Integer> map = new HashMap<Integer,Integer>();
        
        for(int i=0;i<nums.length; i++){
            
            if(map.containsKey(nums[i])){
                return true;
            }else{
                map.put(nums[i],i);
            }
            
        }
        
        return false;
        
    }
}

```

```
Runtime: 6 ms, faster than 55.81% of Java online submissions for Contains Duplicate.
Memory Usage: 45.8 MB, less than 23.96% of Java online submissions for Contains Duplicate.
```