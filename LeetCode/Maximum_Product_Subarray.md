## java

```java

class Solution {
    public int maxProduct(int[] nums) {
        
        int maxNum = Integer.MIN_VALUE;
        int resultTest = 1;
        
        if(nums.length == 1){
            return nums[0];
        }else{
            for(int num:nums) {
        	
                resultTest *= num;
                maxNum = Math.max(resultTest, maxNum);
                if(maxNum <= 0) maxNum = 0;
                
                
            }    
        }
        
        return maxNum;
    }
}

```

```
Skip
```