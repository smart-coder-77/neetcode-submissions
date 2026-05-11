class Solution {

    /*Doing brute force approach first post that will do optimal
    */
    public String encode(List<String> strs) {
           //just encode the string first
           StringBuilder encoded = new StringBuilder();
           for(String s : strs){
            String escaped = s.replace("@","@@");
            encoded.append(escaped).append("@:");
           }
         return encoded.toString();
    }

    public List<String> decode(String str) {
            //case 1 we find the charter ends with @:
            //case 2 we find the character ends with @@
            //case 3 we just move forward a single character 
         List<String>  decoded = new ArrayList<>();
         StringBuilder decodedSting = new StringBuilder(); 
         int i =0;
         while(i<str.length()){
            if(i<str.length() && i+1<str.length() && str.charAt(i)=='@' && str.charAt(i+1)==':'){
                 decoded.add(decodedSting.toString());
                 decodedSting.setLength(0);
                 i+=2;
            }else if(i<str.length() && i+1<str.length() && str.charAt(i)=='@' && str.charAt(i+1)=='@'){
                 decodedSting.append("@");
                 i+=2;
            }else{
                decodedSting.append(str.charAt(i));
                i++;
            }
         }
         return decoded;
    }
}
