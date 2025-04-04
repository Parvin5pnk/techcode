public class dictionarywords {
    
    public static boolean wordbreak(String a,String dict[]){
        int n=a.length();
        if(n==0){
            return true;
        }
        for(int i=1;i<=n;i++){
            if(inDict(a.substring(0,i),dict) && wordbreak(a.substring(i),dict)){
                return true;
            }
        }
        return false;
    }

    public static boolean inDict(String a,String dict[]){
        for(String word:dict){
            if(word.equals(a)){
                return true;
            }
        }
        return false;
    }
    public static void main(String args[]){
        String a="ilikeyou";
        String dict[]={"i","like","ice","cream","icecream","you","youtube"};
        if(wordbreak(a,dict)){
            System.out.println("Matched!");
        }
        else{
            System.out.println("Not Matched!");
        }
    }
}
