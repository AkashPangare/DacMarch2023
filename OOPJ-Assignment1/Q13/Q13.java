class Q13{
    public static void main(String args[]){
        //short to string conversion
        short a = 54;
        String num = Short.toString(a);
        System.out.println(num);

        //short to short instance
        short b=42;
        short c= Short.valueOf(b);
        System.out.println(b);

        //string instance to short instance 
        String d = "22";
        short e= Short.valueOf(d);
        System.out.println(e);
    }
}