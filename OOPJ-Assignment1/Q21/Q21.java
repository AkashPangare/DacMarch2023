class Q21{
    public static void main(String args[]){
        //long instance to byte
        long a=65846L;
        Long b = new Long(a);
        byte c = b.byteValue();
        System.out.println();

        //long instance to short
        long d=65846L;
        Long e = new Long(d);
        short f = e.shortValue();
        System.out.println(f);

        //long instance to integer
        long g=65846L;
        Long h = new Long(g);
        int i = h.intValue();
        System.out.println(i);

        //long instance to string
        long j=65846L;
        Long k = new Long(j);
        String l = k.toString();
        System.out.println(l);

        //long instance to long
        long m=65846L;
        Long n = new Long(m);
        long o = n.longValue();
        System.out.println(o);

        //long instance to float
        long p=65846L;
        Long q = new Long(p);
        float r = q.floatValue();
        System.out.println(r);

        //long instance to double
        long s=65846L;
        Long t = new Long(s);
        double u = t.doubleValue();
        System.out.println(u);


    }
}