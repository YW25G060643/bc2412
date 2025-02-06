class Solution {
  public static int strStr(String haystack, String needle) {
        int output = 0;
        int count = 0;
        for(int i = 0; i < haystack.length(); i++){
            if(haystack.charAt(i) == needle.charAt(0)){
                for(int j = 0; j < haystack.length(); j++){
                    for (int j2 = 0; j2 < needle.length(); j2++) {
                      if(haystack.charAt(i) != needle.charAt(j)){
                          break;
                      }
                      if(haystack.charAt(i) == needle.charAt(j)){
                          count++;
                      }
                      if(count == needle.length()){
                          return output;
                      }
                    }
                }
            }
        }
        return -1;
    }
    public static void main(String[] args) {
        System.out.println(strStr("sadbutsad", "but"));
  }
}