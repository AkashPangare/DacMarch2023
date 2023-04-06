class Q25{
    public static void main(String args[]){
        // float instance to byte
        float a = 23.5f;
        Float b = new float(a);
        byte c =b.byteValue();
        System.out.println(c);

        //float instance to short
        float d = 23.5f;
        Float e = new float(d);
        short f =e.shortValue();
        System.out.println(f);

        //float instance to integer
        float g = 23.5f;
        Float h = new float(g);
        int i =h.intValue();
        System.out.println(i);

        //float instance to long
        float j = 23.5f;
        Float k = new float(j);
        long l =k.longValue();
        System.out.println(l);

        //float instance to float
        float m = 23.5f;
        Float n = new float(m);
        float o =n.floatValue();
        System.out.println(o);

        //float instance to double
        float p = 23.5f;
        Float q = new float(p);
        double r =q.doubleValue();
        System.out.println(r);
    }
}