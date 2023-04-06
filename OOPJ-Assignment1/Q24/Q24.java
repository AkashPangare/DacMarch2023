class Q24{
     public static void main(String args[]){
        //float to string
        float a = 4.5f;
        String b = Float.toString(a);
        System.out.println(b);

        //float to float instance
        float c = 4.65f;
        Float d= Float.valueOf(c);
        System.out.println(d);

        //string to float instance
        String e= "6.48";
        Float f = Float.valueOf(e);
        System.out.println(f);

        //float to hexadecimal
        float g = 8.54f;
        String h = Float.toHexString(g);
        System.out.println(h);
     }

}