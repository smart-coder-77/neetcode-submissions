class Solution {
    public int evalRPN(String[] tokens) {
        Stack<Integer> stack = new Stack<>();
        for(String s : tokens){
              if(isAOperator(s)){
                 Integer firstNumber = stack.pop();
                 Integer secondNumber = stack.pop();
                 Integer finalNumber =0 ; 
                 if(s.equals("+")){
                    finalNumber =firstNumber+secondNumber;
                 }
                  if(s.equals("-")){
                    finalNumber =secondNumber-firstNumber;
                 }
                 if(s.equals("*")){
                    finalNumber =firstNumber*secondNumber;
                 }
                 if(s.equals("/")){
                    finalNumber =secondNumber/firstNumber;
                 }
            stack.push(finalNumber);
              }else{
                stack.push(Integer.valueOf(s));
              }
        }
        return stack.peek();
    }

    public boolean isAOperator(String check){
        return (check.equals("+") || check.equals("-") ||check.equals("*") || check.equals("/"));
    }
}
