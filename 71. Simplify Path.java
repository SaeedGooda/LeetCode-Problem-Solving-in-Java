class Solution {
    public String simplifyPath(String path) {
        String [] sts = path.split("/");
        Stack<String> stack = new Stack<>();
        for(int i = 0 ; i < sts.length; i++){
            if(sts[i].isEmpty() || sts[i].equals(".")){
                continue;
            }
            else if(sts[i].equals("..")){
                if(!stack.empty()){
                    stack.pop();
                }
            } else {
                stack.push(sts[i]);
            }
        }
        StringBuilder result = new StringBuilder();
        while(!stack.empty()){
            result.insert(0, "/" + stack.pop());
        }
        return result.length() > 0? result.toString() : "/";
    }
}