class GfG
{
    int strstr(String str1, String str2)
    {
       int len1 = str1.length();
          int len2 = str2.length();
          int count = 0;
          int index = -1;
          boolean  flag = false;
          for(int i=0;i<=(len1-len2); i++) {
            if(str1.charAt(i) == str2.charAt(0)) {
              count = 1;
              for(int j=1; j<len2; j++) {
                if(str1.charAt(i+j) == str2.charAt(j)) {
                  count += 1;
                }
                else{
                  break;
                }
              }
              if(count == len2) {
                index = i;
                break;
              }
            }
          }
            return index;
        }
}
