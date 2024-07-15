class type{
    public static void main(String[] aegs){
        byte a = 12;
        int b =127;
        a = (byte)b; //this is explicit conversion and this concept is called "casting"
        
        byte c = 12;
        int d =567;

        c = (byte)d;  //in this case int value cannot be change to byte but in this %mod operator is used to convert it into byte

        float f = 5.6f;
        int e = (int)f;

        
        char t,s;
        
        t = '6';
        s = '6';

        int w = (char)t + (char)s;
        

        //int y = Integer.parseInt(t)+Integer.parseInt(s);

        
        System.out.println(a);
        System.out.println(c);
        System.out.println(e);
        //System.out.println(y);
        System.out.println(w);
    }
}