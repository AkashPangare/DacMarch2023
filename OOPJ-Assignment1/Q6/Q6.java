class Q6{
    public static void main(String args[]){
        //boolean to string
        boolean a = true;
        String b = Boolean.toString(a);
        System.out.println(b);

        //boolean to boolean instance
        boolean c = false;
        Boolean d = Boolean.valueOf(c);
        System.out.println(d);

        //string to boolean instance
        String e ="true";
        boolean f = Boolean.valueOf(e);
        System.out.println(f);

        //string to boolean
        String g = "true";
        boolean i = Boolean.parseBoolean(i);
        System.out.println(b);



    }
}