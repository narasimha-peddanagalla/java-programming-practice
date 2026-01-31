package Strings;
import java.util.Stack;
/*Valid Parenthesis or Balanced Brackets
"()[]{}" → true
"(]" → false
"({[]})" → true
"(((" → false
*/
public class BracketBalancing {
	public static void main(String[] args) {
		
		String str = " ({[]})";
		
		//Edge Case
		str = str.replaceAll("\\s+","");
		
		Stack<Character> stack = new Stack<>();
		
		for(char ch : str.toCharArray()) {
			
			if(ch == '(' || ch == '{' || ch == '[') {
				stack.push(ch);
			}
			else {
				if(stack.isEmpty()) {
					System.out.println(false);
					return;
				}
				
				char top = stack.pop();
				
				if(ch == ')' && top != '(' ||
				   ch == '}' && top != '{' ||
				   ch == ']' && top != '['
				){
					System.out.println(false);
					return;
				}
			}
		}
		System.out.println(stack.isEmpty());
	}
}
