import java.util.Scanner;

public class PR_0104 {

    public String solution(String str){
        StringBuffer answer = new StringBuffer();

        for(int i=str.length()-1; i>=0; i--){
//            System.out.println(str.charAt(i));
            answer.append(str.charAt(i));
        }

        return String.valueOf(answer);
    }

    public static void main(String[] args){

        Main T = new Main();
        Scanner kb = new Scanner(System.in);
        int inputCount = kb.nextInt();

        for(int i=0; i<inputCount; i++){
            System.out.println(T.solution(kb.next()));
        }
    }

}