import java.lang.Byte;
class Q9{
    public static void main(String args[]){
       //byte instance to byte
        byte a = 15;
        Byte b = new Byte(a);
        byte c= b.byteValue();
        System.out.println(c);

        //byte instnce to short
        byte d = 18;
        Byte e = new Byte(d);
        short e= e.shortValue();
        System.out.println(e)

        //byte instance to int
        byte f = 25;
        Byte g = new Byte(f);
        int h= g.intValue();
        System.out.println(h);

        //byte instance to long
        byte i = 19;
        Byte j = new Byte(i);
        long k= j.longValue();
        System.out.println(k);

        //byte instance to string
        byte l = 12;
        Byte m = new Byte(l);
        String n= m.toString();
        System.out.println(n);

        //byte instance to float
        byte o = 14;
        Byte p = new Byte(o);
        byte q= p.floatValue();
        System.out.println(q);

        //byte instance to double
        byte r = 45;
        Byte s = new Byte(r);
        byte t= s.doubleValue();
        System.out.println(t);
    }
}