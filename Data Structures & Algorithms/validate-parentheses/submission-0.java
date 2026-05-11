class Solution {
    public boolean isValid(String s) {
        Stack<Character> stack = new Stack<>();

        for(char c : s.toCharArray()){

             if(isOpenBracket(c)){
                stack.push(c);
             }else{
                if(stack.isEmpty()){
                    return false;
                }else if(!validate(stack.peek(),c)){
                    return false;
                }else{
                    stack.pop();
                }
             }     

        }
      return stack.isEmpty();
    }

    public boolean isOpenBracket(char c){
        return c=='('|| c=='{' || c=='[';
    }

    public boolean validate(char a, char c){
        if(a =='(' && c==')'){
            return true;
        }
          if(a =='{' && c=='}'){
            return true;
        }
          if(a =='[' && c==']'){
            return true;
        }
        return false;
    }
}
