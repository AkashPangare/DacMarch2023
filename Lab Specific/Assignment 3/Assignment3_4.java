public class Assignment3_4 {
    static int countOccurrences(String str, char word){
    int count=0;
   for(int i=0; i<str.length(); i++)
  {
      if(str.charAt(i) == word)
      count++;
  }
  return count;
 
   
}
static int wordcount(String string)  
{  
  int count=0;  

    char ch[]= new char[string.length()];     
    for(int i=0;i<string.length();i++)  
    {  
        ch[i]= string.charAt(i);  
        if( ((i>0)&&(ch[i]!=' ')&&(ch[i-1]==' ')) || ((ch[0]!=' ')&&(i==0)) )  
            count++;  
    }  
    return count;  
}  
 

public static void main(String args[])
{
    String str = "The quick brown fox jumps over the lazy dog, but the dog is faster.";
    char word = 'o';
    int count2= countOccurrences(str, word);
    int wcount= wordcount(str);
    System.out.println(count2+" "+wcount);
}
}
