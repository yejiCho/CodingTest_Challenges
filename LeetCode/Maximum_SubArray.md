## java

```java

class Solution {
    public int maxSubArray(int[] nums) {
        
        int result = 0;
        int count = 0;
        if(nums.length < 2){
            return nums[0];
        }else{
            count = nums[0];
            
            for(int i=0; i<nums.length; i++){
                if(count < nums[i]){
                    count = nums[i];
                }
            }
            
            result = count;
            
            for(int i=0; i<nums.length; i++){
                if(result<count){
                    result += nums[i-1];
                }else{
                    result += nums[i];
                }
            }
            
            
        }
        
        return result;
    }
}

```

```
divide and conquer approach

접근법에 대해 생각할 필요가 있다....
```