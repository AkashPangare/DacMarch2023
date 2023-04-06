class Q29{
    public static void main(String args[]){
        //double instance to byte
        Double a=456.25;
        Double b = new Double(a);
        byte c = b.byteValue();
        System.out.println(c);

        //double instance to short
        Double d = 578.64;
        Double e = new Double(d);
        short f = e.shortValue();
        System.out.println(f);
         
        //double instance to int
        Double g = 578.64;
        Double h = new Double(g);
        short i = h.intValue();
        System.out.println(i);

        //double instance to long
        Double j = 578.64;
        Double k = new Double(j);
        short l = k.longValue();
        System.out.println(l);

        //double instance to float
        Double m = 578.64;
        Double n = new Double(m);
        short o = n.floatValue();
        System.out.println(o);

        //double instance to double
        Double p = 578.64;
        Double q = new Double(p);
        short r = q.longValue();
        System.out.println(r);
    }
}