class Solution {
    public int evalRPN(String[] tokens) {
        Stack<Integer> stack = new Stack<>();
        int n1, n2;
        for(String token: tokens) {
            switch (token) {
                case "+":
                    n1 = stack.pop();
                    n2 = stack.pop();
                    stack.push(n2 + n1);
                    break;
                case "-":
                    n1 = stack.pop();
                    n2 = stack.pop();
                    stack.push(n2 - n1);
                    break;
                case "*":
                    n1 = stack.pop();
                    n2 = stack.pop();
                    stack.push(n2 * n1);
                    break;
                case "/":
                    n1 = stack.pop();
                    n2 = stack.pop();
                    stack.push(n2 / n1);
                    break;
                default:
                    stack.push(Integer.parseInt(token));
                    break;
            }
        }
        return stack.peek();
    }
}