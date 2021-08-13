## Java

```java

class Solution {
    public long solution(int price, int money, int count) {
        long money2 = Long.valueOf(money);
        for(int index = 1; index <= count; index++){
            money2 -= price * index;
        }
        return money2 < 0 ? money2 * -1 : 0;
    }
}

```
