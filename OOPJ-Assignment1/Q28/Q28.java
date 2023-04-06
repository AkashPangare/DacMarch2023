class Q28{
    public static void main(String args[]){
        //double to string 
        double a =546.54;
        String b = Double.toString(a);
        System.out.println(b);

        //double to double instance
        double c =594.54;
        Double d = Double.valueOf(c);
        System.out.println(d);

        //string to double instance
        String e ="594.54";
        Double f = Double.valueOf(e);
        System.out.println(f);

        //double to hexagonal
        double g =594.54;
        String h = Double.toHexString(g);
        System.out.println(h);

        //double to binary
        double i =594.54;
        String j = Double.longBitsToDouble(i);
        System.out.println(j);
    }
}