class Solution {

    /*Doing optimal approach its easier cause we dont iterate through all the string 
    we keep the length and a delimiter example length + delimiter + word
    */
    public String encode(List<String> strs) { 
           StringBuilder encoded = new StringBuilder();
           for(String s : strs){
               encoded.append(s.length());
               encoded.append("@");
               encoded.append(s);
           }
         return encoded.toString();  
    }

    public List<String> decode(String str) {
           List<String> decoded = new ArrayList<>();
           int i=0;
           while(i<str.length()){
              int indexOfDelimiter = str.indexOf("@",i);
              int lengthOfString = Integer.parseInt(str.substring(i,indexOfDelimiter));
              int startIndexOfWord = indexOfDelimiter+1;
              int endIndexOfWord = startIndexOfWord+lengthOfString;
              String word = str.substring(startIndexOfWord,endIndexOfWord);
              decoded.add(word);
              i=endIndexOfWord;
           }
           return decoded;
    }
}
