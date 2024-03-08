
class HelloWorld {
    static String reverseString(String str){
        String rev = "";
        for(int i=0;i<str.length();i++){
            char c=str.charAt(i);
            rev =  c+rev;
        }
        return rev;
    }
    static String reverseCaseString(String str){
        String ct = "";
        for(int i=0;i<str.length();i++){
            char c=str.charAt(i);
            if(Character.isUpperCase(c)){
                ct = ct+Character.toLowerCase(c);
            }
            else{
                ct = ct+Character.toUpperCase(c);
            }
        }
        return ct;
    }
    static int countAllVowel(String str){
        int count = 0;
        for(int i=0;i<str.length();i++){
            char c = str.charAt(i);
            char u = Character.toUpperCase(c);
            if(u=='A' || u=='E' || u=='I' || u=='O' || u=='U'){
                count++;
            }
        }
        return count++;
    }
    
    static String withoutSpace(String str){
        String rev = "";
        for(int i=0;i<str.length();i++){
            char c = str.charAt(i);
            if(!Character.isWhitespace(c)){
                rev = rev+c;
            }
        }
        return rev;
    }
    
    static String upperFirst(String str){
        String u = "";
        String rem = "";
        for(int i=0;i<str.length();i++){
            char c = str.charAt(i);
            if(Character.isUpperCase(c)){
                u=u+c;
            }else{
                rem=rem+c;
            }
        }
        String newString = u+rem;
        return newString;
    }
    
    static String digitFirst(String str){
        String d = "", rem = "";
        for(int i=0;i<str.length();i++){
            char c = str.charAt(i);
            if(Character.isDigit(c)){
                d = d+c;
            }
            else{
                rem = rem+c;
            }
        }
        String newString = d+rem;
        return newString;
    }
    
    static boolean isPallindrome(String str){
        
        String rev = "";
        for(int i=0;i<str.length();i++){
            char c = str.charAt(i);
            rev = rev+c;
        }
        
        if(str.equalsIgnoreCase(rev)){
            return true;
        }
        return false;
    }
    
    static String piglatinString(String str){
        String pl = "";
        for(int i=0;i<str.length();i++){
            char c = str.charAt(i);
            char u = Character.toUpperCase(c);
            if(u=='A' || u=='E' || u=='I' || u=='O' || u=='U'){
                pl=str+"WAY";
            }else{
                pl=str.substring(i)+str.substring(0,i)+"AY";
            }
            break;
        }
        return pl;
    }
    
    static String encodingAdd2ToEachChar(String str){
        String enc = "";
        for(int i =0;i<str.length();i++){
            char c = str.charAt(i);
            if(c=='Y' || c=='Z' || c=='y' || c=='z'){
                c-=26;
            }
        
            c+=2;
            enc = enc+c;
        }
        return enc;
    }
    
    public static void main(String[] args) {
        String s = "AayusH";
        String s1 = "I am Iron Man";
        String s2 = "PD0050A";
        String s3 = "abba";
        String s4="eat";
        String s5 = "clear";
        String s6 = "Coding is a test Zyan";
        System.out.println("rev: "+reverseString(s)+" || rev case: "+reverseCaseString(s)+" || vowel count: "+ countAllVowel(s));
        System.out.println("Space: "+s1+" || Without Space: "+withoutSpace(s1));
        System.out.println("normal: "+s1+" || Upper First: "+upperFirst(s1));
        System.out.println("Normal: "+s2+" || Digit First: "+digitFirst(s2));
        System.out.println("Normal: "+s3+" || isPallindrome: "+isPallindrome(s3));
        System.out.println("Normal: "+s4+" || After Encoding: "+piglatinString(s4));
        System.out.println("Normal: "+s5+" || After Encoding: "+piglatinString(s5));
        System.out.println("Normal: "+s6+" || After Encoding: "+encodingAdd2ToEachChar(s6));
    }
}