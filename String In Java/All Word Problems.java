

class HelloWorld {
    static void printWordInSeperateLine(String str){
        String w = ""; str+=" ";
        for(int i=0;i<str.length();i++){
            char c = str.charAt(i);
            if(c!=' '){
                w+=c;
            }
            else {
                System.out.println(w);
                w = "";
            }
        }
    }

 static int countWordsEndingWithD(String str){
        String wc = ""; str+=" ";int cnt=0;
        for(int i=0;i<str.length();i++){
            char c=str.charAt(i);
            if(c!=' '){
                wc+=c;
            }else{
                if(wc.endsWith("D") || wc.endsWith("d")){
                    cnt++;
                }
                wc="";
            }
        }
        return cnt;
    }
    
    static void printFirstCharOfEachWord(String str){
        String w = ""; str+=" ";
        for(int i=0;i<str.length();i++){
            char c = str.charAt(i);
            if(c!=' '){
                w+=c;
            }
            else{
                System.out.print(w.substring(0,2)+" ");
                w= "";
            }
        }
    }
    
    static void printWordStartingWithA(String str){
        String w = ""; str+=" ";
        for(int i=0;i<str.length();i++){
            char c = str.charAt(i);
            if(c!=' '){
                w+=c;
            }else{
                // if(w.charAt(0) == 'A'){
                //     System.out.println(w);
                // }
                if(w.startsWith("A")){
                    System.out.println(w);
                }
                if(w.contains("a"))
                System.out.print(w+" ");
                w="";
            }
        }
    }
    
    static void printSpecialWords(String str){
        String w = ""; str+=" ";
        for(int i=0;i<str.length();i++){
            char c = str.charAt(i);
            if(c!=' '){
                w+=c;
            }
            else{
                char f = w.charAt(0);
                char l = w.charAt(w.length()-1);
                if(Character.toUpperCase(l) == Character.toUpperCase(f)){
                    System.out.println(w);
                }
                w="";
            }
        }
    }
    
    static void printLongestWord(String str){
        String w = ""; str+=" ";
        String lw = "";
        for(int i=0;i<str.length();i++){
            char c = str.charAt(i);
            if(c!=' '){
                w+=c;
            }
            else{
                if(w.length()>lw.length()){
                    lw = w;
                }
                w="";
            }
        }
        System.out.println("Longest Word is : "+lw);
    }
    
    static boolean ifMatchingWordExists(String str, String str2){
        String w=""; str+=" ";
        for(int i=0;i<str.length();i++){
            char c= str.charAt(i);
            if(c!=' '){
                w+=c;
            }
            else{
                if(w.equalsIgnoreCase(str2)){
                    return true;
                }
                w="";
            }
        }
        return false;
    }
    
    static int numOfWords(String str){
        String w=""; str+=" ";
        int cnt=0;
        for(int i=0;i<str.length();i++){
            char c=str.charAt(i);
            if(c!=' '){
                w+=c;
            }
            else{
                cnt++;
                w="";
            }
        }
        return cnt;
    }
    
    public static void main(String[] args) {
        String s1 = "My name is Aayush";
        String s2 = "Anna and bob are friends";
        printWordInSeperateLine(s1);
        System.out.println();
        System.out.println();
        printFirstCharOfEachWord(s1);
        System.out.println();
        System.out.println();
        printWordStartingWithA(s1);
        System.out.println();
        System.out.println();
        printSpecialWords(s2);
        System.out.println();
        System.out.println();
        printLongestWord(s2);
        String s3="I am Iron Man";
        String s4 = "man";
        System.out.println(ifMatchingWordExists(s3,s4));
        System.out.println();
        System.out.println();
        System.out.println("Number of words in "+s3+" is: "+numOfWords(s3));
	        String s1 = "My name is GolD Bold and i am Cold";
        System.out.println("Number of Words ending with D is: "+countWordsEndingWithD(s1));
        
    }
}