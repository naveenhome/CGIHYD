package cgi.hyd;

import java.util.Stack;

public class RPNCalc {

	public int calculate(String expr) {
		// TODO Auto-generated method stub
		String[] inputValue = expr.split(",");
		Stack<String> inputStack = new Stack<String>();
		for(int i=0;i<inputValue.length;i++)
		{
			if(inputValue[i].equals("+"))
			{
				int secondValue = Integer.valueOf(inputStack.pop());
				int firstValue = Integer.valueOf(inputStack.pop());
				inputStack.push(String.valueOf(firstValue+secondValue));
			}
			else
			{
				inputStack.push(inputValue[i]);
			}
		}
		
		return Integer.valueOf(inputStack.pop());
	}

}
