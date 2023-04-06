class Q8{
    public static void main(String args[]){
        //byte to string conversion
        byte a=14;
        String num1 = Byte.toString(a);
        System.out.println(num1);

        //byte to Byte Instance conversion
        byte b =25;
        Byte num2 = Byte.valueOf(b);
        System.out.println(num2);

        //string instance to byte instance
        String c ="45";
        Byte num3= Byte.valueOf(c);
        System.out.println(num3);
    }
}