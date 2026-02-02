package Strings;

import java.util.Stack;

/*Valid Parenthesis or Balanced Brackets
 "()[]{}" → true
 "(]" → false
 "({[]})" → true
 "(((" → false
*/
public class P16 {
	public static void main(String[] args) {
		String str = "({[]})";
		
		//Using Stack
		Stack<Character> stack = new Stack<>();
		
		for(char ch : str.toCharArray()) {
			//Push opening brackets
			if(ch == '(' || ch == '{' || ch == '[') {
				stack.push(ch);
			}
			
			
			//Handle closing brackets
			else {
				
				//If stack is empty before pushing closing bracket,
				//then it seems to unbalanced
				
				if(stack.isEmpty()) {
					System.out.println("Not Balanced");
					return;
				}
				
				//If not empty,remove and get the top 
				char top = stack.pop();
				
				//Validate braces
				
				if(ch == ')' && top != '(' ||
				   ch == '}' && top != '{' ||
				   ch == ']' && top != '[' )
				{
					System.out.println("Not Balanced");
					return;
				}
			}
		}
		
		System.out.println(stack.isEmpty() ? "Balanced":"Not Balanced");
 	}
}
