import java.util.List;
import java.util.Scanner;

public class PR_0204 {

    /*
        1) 피보나치 수열을 출력한다. 피보나치 수열이란 앞의 2개의 수를 합하여 다음 숫자가 되는 수열이다.
        2) 입력은 피보나치 수열의 총 항의 수 이다. 만약 7이 입력되면 1 1 2 3 5 8 13을 출력하면 된다.
    */
    // 재귀함수
    public int[] solution(int n){
        int[] result = new int[n];

        for(int i=0; i<n; i++){
            if(i < 2){
                result[i] = 1;
            }
            else{
                int test = result[i-2]+result[i-1];
                result[i] +=  test;
            }
        }

        return result;
    }

    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        PR_0204 T = new PR_0204();
        int[] result = T.solution(n);
        for(int r :result){
            System.out.print(r+" ");
        }
    }
}
