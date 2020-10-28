package behavior.interpreter;

import java.util.Stack;

public class App {

    public static void main(String[] args) {
        String tokenStr = "4 3 2 - 1 + *";
        Stack<Expression> stack = new Stack<>();
        String[] tokenList = tokenStr.split(" ");
        for (String s : tokenList) {
            if (isOperator(s)) {
                Expression rightExpression = stack.pop();
                Expression leftExpression = stack.pop();
                Expression operator = getOperatorInstance(s, leftExpression, rightExpression);
                int result = operator.interpret();
                NumberExpression resultExpression = new NumberExpression(result);
                stack.push(resultExpression);
            } else {
                Expression i = new NumberExpression(s);
                stack.push(i);
            }
        }
        System.out.println("result: " + stack.pop().interpret());
    }

    public static boolean isOperator(String s) {
        return "+".equals(s) || "-".equals(s) || "*".equals(s);
    }

    public static Expression getOperatorInstance(
            String s, Expression left, Expression right) {
        switch (s) {
            case "+":
                return new PlusExpression(left, right);
            case "-":
                return new MinusExpression(left, right);
            case "*":
                return new MultiplyExpression(left, right);
            default:
                return new MultiplyExpression(left, right);
        }
    }

}
