## java


```java

class Solution {
    public int[] productExceptSelf(int[] nums) {
        int[] result = new int[nums.length];
        
        for(int i=0; i<nums.length; i++){
            int multi = 1;
            for(int j=nums.length-1; j>=0; j--){
                if(i == j){
                    continue;
                }else{
                    multi *= nums[j];
                }
            }
            result[i] = multi;
        }
     
        
        return result;
    }
}

```