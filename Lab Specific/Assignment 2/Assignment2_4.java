public class Assignment2_4 {
    public static void main(String[] args) {
        String str1 = "He#llo $Wo%rld!";
        str1 = str1.replaceAll("[^a-zA-Z0-9]", "");
 
        System.out.println(str1);
    }
}
