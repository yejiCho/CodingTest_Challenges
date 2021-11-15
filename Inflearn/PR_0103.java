import com.sun.tools.javac.Main;

import java.util.Scanner;

public class PR_0103 {

    public String solution(String str){
        String[] strList = str.split("\\s");
        String answer =  strList[0];

        for(int i=0; i< strList.length; i++){
            if(answer.length() < strList[i].length()){
                answer = strList[i];
            }
        }

        return answer;
    }

    public static void main(String[] args){

        PR_0103 T = new PR_0103();
        Scanner kb = new Scanner(System.in);
        String str = kb.nextLine();

        System.out.println(T.solution(str));
    }

}