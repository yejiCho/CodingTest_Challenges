import java.util.Scanner;
import java.util.stream.Collectors;
import java.util.List;
import java.util.ArrayList;

public class PR_0106 {

	// 중복문자제거
	// 소문자로 된 한개의 문자열이 입력되면 중복된 문자를 제거하고 출력
	// 중복이 제거된 문자열의 각 문자는 원래 문자열의 순서를 유지합니다.

	public String solution(String input){
	
		List<String> inputList = new ArrayList<>();
		String answer = "";
		
		for(char in : input.toCharArray()){
		inputList.add(String.valueOf(in));
		}

		List<String> answerArray = inputList.stream().distinct().collect(Collectors.toList());

		for(String a : answerArray){
			answer += a;	
		}

		return answer;
	}

	public static void main(String[] args){

		PR_0106 f = new PR_0106();
		
		Scanner in = new Scanner(System.in);
		String ex = in.nextLine();
		// ksekkset
		System.out.println(f.solution(ex));
	}
}
