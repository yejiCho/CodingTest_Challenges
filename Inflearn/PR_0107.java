import com.sun.tools.javac.Main;

import java.util.Scanner;

public class PR_0107 {
    /*
    * 앞에서 읽을 때나 뒤에서 읽을 때나 같은 문자열을 회문 문자열이라고 합니다.
    * 문자열이 입력되면 해당 문자열이 회문 문자열이면 "YES", 회문 문자열이 아니면 “NO"를 출력하는 프로그램을 작성하세요.
    * 단 회문을 검사할 때 대소문자를 구분하지 않습니다.
    * */
    public static String yes = "YES";
    public static String no = "NO";

    //gooG
    public String solution(String inputString){

        String lowerString = inputString.toLowerCase();

        for(int i=0; i<lowerString.length(); i++){

            if(lowerString.charAt(i) != lowerString.charAt(lowerString.length()-(i+1))){

                return no;
            }
        }
        return yes;

    }

    public static void main(String[] args){
        Scanner in=new Scanner(System.in);
        String inputString = in.next();

        PR_0107 m = new PR_0107();

        System.out.println(m.solution(inputString));

    }

}