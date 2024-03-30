class Solution {
    public boolean isValid(String s) {
        Stack<Character> stack = new Stack<>();
        for(char c: s.toCharArray()){
            if(c == '(' || c == '{' || c == '['){
                stack.push(c);
            } else{
                if(!stack.empty() && getOpposite(c) == stack.peek()){
                    stack.pop();
                }
                else return false;
            }
        }
        return stack.empty();
    }
    public char getOpposite(char a){
        if(a == ')') return '(';
        else if(a == '}') return '{';
        else return '[';
    }

}
