public class Assignment3_5 {
    public static String reverseWord(String str){  
        String words[]=str.split("\\s");  
        String reverseWord="";  
        for(String w:words){  
            StringBuilder sb=new StringBuilder(w);  
            sb.reverse();  
            reverseWord+=sb.toString()+" ";  
        }  
        return reverseWord.trim();  
    } 
    private static void duplicate() {
        String str = "Hello World! How are you today?";
        int cnt = 0;
        char[] inp = str.toCharArray();
        System.out.println("Duplicate Characters:");
        for (int i = 0; i < str.length(); i++) {
         for (int j = i + 1; j < str.length(); j++) {
          if (inp[i] == inp[j]) {
           System.out.print(inp[j]);
           cnt++;
           break;
          }
         }
        }
    } 
    public static void main(String[] args) {  
        String str ="Hello World! How are you today?";
        System.out.println("Reversed words: "+reverseWord(str));  
        
        duplicate();
        }
     
}
