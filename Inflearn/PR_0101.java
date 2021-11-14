import java.util.Scanner;

public class PR_0101 {

    public int solution(String str, char t){
        int answer = 0;
        str = str.toUpperCase();
        t = Character.toUpperCase(t);

        while (true){

            if(str.indexOf(String.valueOf(t))>=0){
                answer++;
                str = str.replaceFirst(String.valueOf(t),"");

            }else{
                break;
            }
        }

        return answer;
    }

    public static void main(String[] args){

        Main T = new Main();
        Scanner kb = new Scanner(System.in);
        String str = kb.next();
        char c = kb.next().charAt(0);

        System.out.println(T.solution(str,c));
    }

}