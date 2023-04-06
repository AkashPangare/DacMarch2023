class Program{
    public static void main(String args[]){
        //integer to string
        int a = 33;
        String b = Integer.toString(a);
        System.out.println(b);

        //integer to integer instance
        int c =45;
        int d = Integer.valueOf(c);
        System.out.println(d);

        //string instance to integer
        String e="55";
        int f = Integer.valueOf(e);
        System.out.println(f);

        //integer into binary 
        int g = 12;
        String h = Integer.toBinaryString(g);
        System.out.println(h);

        //integer to octal
        int i=11;
        String j = Integer.toOctalString(i);
        System.out.println(j);
        
        //integer to hexadecimal
        int k=16;
        String l = Integer.toHexString(k);
        System.out.println(l);

    }
}