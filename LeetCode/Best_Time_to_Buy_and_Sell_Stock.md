## java

```java

class Solution {
    public int maxProfit(int[] prices) {
        
        int upPrice = 0;
        
        for(int i=0; i<prices.length; i++){
            
            for(int j=prices.length-1; j>=i; j--){
                if(upPrice <= prices[j]-prices[i]){
                    upPrice = prices[j]-prices[i];    
                }
                
            }
            
        }
        
        return upPrice;
    }
}

```

```
Time Limit Exceeded
```


```java

class Solution {
    public int maxProfit(int[] prices) {
        
        int maxProfit=0;
        int min=prices[0];
        for(int i=0;i<prices.length;i++)
        {
            if(prices[i]<min) min=prices[i];
            else if(prices[i]-min>maxProfit) maxProfit=prices[i]-min;
            
        }
        
        return maxProfit;
    }
}

```

```
Runtime: 1 ms, faster than 100.00% of Java online submissions for Best Time to Buy and Sell Stock.
Memory Usage: 51.8 MB, less than 87.60% of Java online submissions for Best Time to Buy and Sell Stock.
```