import java.util.Scanner;

public class PR_0102 {

    public String solution(String str){
        StringBuffer answer = new StringBuffer();
        for(int i=0; i<str.length(); i++){
            if(Character.isUpperCase(str.charAt(i))){
                answer.append(String.valueOf(Character.toLowerCase(str.charAt(i))));
            }else{
                answer.append(String.valueOf(Character.toUpperCase(str.charAt(i))));
            }
        }
        return String.valueOf(answer);
    }

    public static void main(String[] args){

        Main T = new Main();
        Scanner kb = new Scanner(System.in);
        String str = kb.next();

        System.out.println(T.solution(str));
    }

}