class Q17{
    public static void main(String args[]){
        //integer instance to byte
        int a = 54;
        Integer b = new Integer(a);
        byte c = b.byteValue();
        System.out.println(c);

        //integer instance to short
         int d = 64;
        Integer e = new Integer(d);
        short f = e.shortValue();
        System.out.println(f);

        //integer instance to integer
        int g = 54;
        Integer h = new Integer(g);
        int i = h.intValue();
        System.out.println(i); 

        //integer instance to string
        int j = 84;
        Integer k = new Integer(j);
        String l = b.toString();
        System.out.println(l);

        //integer instance to float
        int m = 94;
        Integer n = new Integer(m);
        float o = n.floatValue();
        System.out.println(o);

        //integer instance to long
        int p = 54;
        Integer q = new Integer(p);
        long r = q.longValue();
        System.out.println(r);

        //integer instance to double
        int s = 54;
        Integer t = new Integer(s);
        double u = t.doubleValue();
        System.out.println(u);

    }
}