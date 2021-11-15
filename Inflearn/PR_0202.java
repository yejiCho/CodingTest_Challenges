import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class PR_0202 {

    /*
    *선생님이 N명의 학생을 일렬로 세웠습니다. 일렬로 서 있는 학생의 키가 앞에서부터 순서대로 주어질 때, 맨 앞에 서 있는
    *
    *선생님이 볼 수 있는 학생의 수를 구하는 프로그램을 작성하세요. (앞에 서 있는 사람들보다 크면 보이고, 작거나 같으면 보이지 않습니다.)
    *8
    *130 135 148 140 145 150 150 153
    * */
    public int solution(int n,int[] arr){
        int result = 1;
        List<Integer> resultList = new ArrayList<>();
        int height = arr[0];
        int lt = 0;
        for(int i=1; i<n; i++){
            if(arr[lt]<arr[i] && height<arr[i]){
                height = arr[i];
                result++;
            }
            lt++;
        }

        return result;
    }

    public static void main(String[] args){
        PR_0202 T = new PR_0202();
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];

        for(int i=0; i<n; i++){
            arr[i] = sc.nextInt();
        }

        System.out.print(T.solution(n,arr));

    }
}
