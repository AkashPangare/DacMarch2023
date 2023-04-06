class Q20{
    public static void main(String args[]){
        //long to string
        long a=45662135l;
        String b = Long.toString(a);
        System.out.println(b);

        //long to long instance
        long c = 7584216l;
        Long d = Long.valueOf(c);
        System.out.println(d);

        //string instance to long instance
        String e="54789631";
        Long f= Long.valueOf(e);
        System.out.println(f);

        //long to binary
        long g=954126l;
        String h = Long.toBinaryString(g);
        System.out.println(h);

        //long to octal
        long i=954426l;
        String j = Long.toOctalString(i);
        System.out.println(j);

        //long to hexadecimal
        long k=954426l;
        String l = Long.toHexString(k);
        System.out.println(l);
    }
}