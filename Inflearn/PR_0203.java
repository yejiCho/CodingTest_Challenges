import java.util.List;
import java.util.Scanner;

public class PR_0203 {

    /*
    가위바위보
    5
    2 3 3 1 3
    1 1 2 2 3
    */
    public String[] solution(int n,int[] a, int[] b){
        String[] result = new String[n];

        for(int i=0; i<n; i++){
            if(a[i] == b[i]) result[i] = "D";
            else if(a[i] == 1 && b[i] == 3 || a[i] == 2 && b[i] == 1 || a[i] == 3 && b[i] == 2) result[i] = "A";
            else result[i] = "B";
        }

        return result;
    }

    public static void main(String[] args){
        PR_0203 T = new PR_0203();
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] a = new int[n];
        int[] b = new int[n];
        for(int i=0; i<n; i++){
            a[i] = sc.nextInt();
        }
        for(int i=0; i<n; i++){
            b[i] = sc.nextInt();
        }

        for(String r: T.solution(n,a,b)){
            System.out.println(r);
        }

    }
}
