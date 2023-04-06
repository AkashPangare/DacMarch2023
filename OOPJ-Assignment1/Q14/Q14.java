class Q14{
    public static void main(String args[]){
        //short instance to byte
        short a = 65;
        Short b = new Short(a);
        byte c = b.byteValue();
        System.out.println(c);

        //short instance to short
        short d = 64;
        Short e = new Short(d);
        short f = e.shortValue();
        System.out.println(f);

        //short instance to integer
        short g = 75;
        Short h = new Short(g);
        int i = h.intValue();
        System.out.println(i);

        //short instance to double
        short j = 85;
        Short k = new Short(j);
        double l = k.doubleValue();
        System.out.println(l);

        //short instance to long
        short m = 95;
        Short n = new Short(m);
        long o = n.longValue();
        System.out.println(o);

        //short instance to float
        short p = 65;
        Short q = new Short(p);
        float r = q.byteValue();
        System.out.println(r);

    }
}