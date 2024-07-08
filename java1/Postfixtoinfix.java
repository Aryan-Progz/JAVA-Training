// package algorithms;

import java.util.Stack;

public class Postfixtoinfix {
	
	Stack<Integer> st = new Stack<>();

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Postfixtoinfix pf = new Postfixtoinfix();
		System.out.println(pf.calculate("25+6+"));
		System.out.println(pf.calculate("25+"));
	}
	
	public Stack<Integer> calculate(String s) {
		int size = s.length();
		st.clear();
		
		for(int i=0; i<size; i++) {
			if (Character.isDigit(s.charAt(i))) {
				int elem = (int)s.charAt(i)-'0';
				st.push(elem);
			}
			else {
				int firstOp = st.pop();
				int secondOp = st.pop();
				
				switch (s.charAt(i)) {
					case '+':
						st.push(firstOp+secondOp);
						break;
					case '-':
						st.push(firstOp-secondOp);
						break;
					default:
						throw new IllegalArgumentException("Unexpected value: " + s.charAt(i));
				}
			}		
		}
		return st;
	}

}
