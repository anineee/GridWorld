package Calculator;

import java.util.*;

public class Calculator {
	
	public double evalExpression(String expression) {
		Stack<Double> operand_s = new Stack<Double>();
		Stack<Character> operator_s = new Stack<Character>();
		double n = 0;
		int div = 1;
		boolean is_f = false;
		for(int i = 0; i < expression.length(); i ++) {
			char cur = expression.charAt(i);
			if(is_operator(cur)) {
				if(operator_s.empty()) {
					operand_s.push(n/div);
				}
				else {
					char pre_op = operator_s.peek();
					if(pre_op == '*') {
						double n0 = operand_s.pop();
						operand_s.push(n0*n/div);
						operator_s.pop();
					}
					else if(pre_op == '/') {
						double n0 = operand_s.pop();
						operand_s.push(n0*1.0/(n/div));
						operator_s.pop();
					}
					else {
						operand_s.push(n/div);
					}
				}
				n = 0;
				operator_s.push(cur);
				div = 1;
				is_f = false;
			}
			else {
				if(cur == '.') {
					is_f = true;
				}
				else {
					n *= 10;
					n += (int)(cur-'0');
					if(is_f) div *= 10;
				}
			}
		}
		if(operator_s.size() == operand_s.size()) 
			operand_s.push(n/div);
		while(true) {
			if(operator_s.empty()) break;
			double x1 = operand_s.pop();
			double x0 = operand_s.pop();
			char op = operator_s.pop();
			if(op == '+') {
				operand_s.push(x0+x1);
			}
			else if(op == '-') {
				operand_s.push(x0-x1);
			}
			else if(op == '*') {
				operand_s.push(x0*x1);
			}
			else {
				operand_s.push(x0*1.0/x1);
			}
		}
		double result = operand_s.peek();
		return result;
	}
	
	private boolean is_operator(char c) {
		if(c == '+' || c == '-' || c == '*' || c == '/')
			return true;
		return false;
	}
}