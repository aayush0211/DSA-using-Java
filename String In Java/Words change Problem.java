
class HelloWorld {
    static void changeWordInSentence(String str){
        String w="";str+=" ";
        String ns="";
        for(int i=0;i<str.length();i++){
            char c=str.charAt(i);
            if(c!=' '){
                w+=c;
            }
            else{
                if(w.equals("Is-A")){
                    ns=ns+"Has-A"+" ";
                }
                else{
                    ns=ns+w+" ";
                }
                w="";
            }
        }
        System.out.println("Correct Statement is: "+ns);
    }
    static void deleteWordInSentence(String str, String str2){
        String w = ""; str+=" ";
        String ns="";
        for(int i=0;i<str.length();i++){
            char c = str.charAt(i);
            if(c!=' '){
                w+=c;
            }
            else{
                if(!w.equals(str2)){
                    ns=ns+w+" ";
                }
                w="";
            }
        }
        System.out.println("New Sentence is: "+ns);
    }
    static void changeCaseOfAlternateWord(String str) {
        String w=""; str+=" "; int cnt = 0;
        String ns="";
        for(int i=0;i<str.length();i++){
            char c = str.charAt(i);
            if(c!=' '){
                w+=c;
            }
            else{
                if(cnt%2==0){
                    ns=ns+w.toUpperCase()+" ";
                    cnt++;
                }
                else{
                    ns=ns+w.toLowerCase()+" ";
                    cnt++;
                }
                w="";
            }
        }
        System.out.println("New Sentence is : "+ns);
    }
    static void capitalizeFirstWordInSentence(String str){
        String w=""; str+=" ";
        String ns="";
        for(int i=0;i<str.length();i++){
            char c = str.charAt(i);
            if(c!=' '){
                w+=c;
            }
            else{
                char f = w.charAt(0);
                f = Character.toUpperCase(f);
                ns = ns+f+w.substring(1)+" ";
                w="";
            }
        }
        System.out.println("New Sentence is: "+ns);
    }
    static void swapFirstAndLastLetter(String str){
        String w = "";str+=" ";
        String ns="";
        for(int i=0;i<str.length();i++){
            char c=str.charAt(i);
            if(c!=' '){
                w+=c;
            }
            else{
                char f = w.charAt(0);
                char l = w.charAt(w.length()-1);
                String m = w.substring(1,w.length()-1);
                ns=ns+l+m+f+" ";
                w="";
                
            }
        }
        System.out.println("After swapping : "+ns);
    }
    
    static void longestSubstringWithNoRepeat(String str){
        String longestSubstring = "";
        String currentSubstring="";
        int j;
        for(int i=0;i<str.length();i++){
            char c=str.charAt(i);
            currentSubstring=""+c;
            j=i+1;
            while(j<str.length() && currentSubstring.indexOf(str.charAt(j))==-1){
                currentSubstring+=str.charAt(j);
                j++;
            }
            
            if(longestSubstring.length()<currentSubstring.length()){
                 longestSubstring=currentSubstring;
            }
        }
        System.out.println("longest Substring is: "+longestSubstring);
    }
    
    public static void main(String[] args) {
        String s1="Interface establishes a Is-A relationship";
        System.out.println("Correct the Statement: "+s1);
        changeWordInSentence(s1);
        System.out.println();
        String s2 = "He owns you nothing";
        String s3="you";
        deleteWordInSentence(s2,s3);
        System.out.println();
        changeCaseOfAlternateWord(s2);
        System.out.println();
        capitalizeFirstWordInSentence(s2);
        System.out.println();
        swapFirstAndLastLetter(s2);
        String s4 = "abcabcdab";
        longestSubstringWithNoRepeat(s4);
    }
    
}