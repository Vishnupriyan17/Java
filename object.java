class b {
    int x,y;
    b t;
    
}
class object{
 public static void main (String[] args)
 {
    b o = new b();
    b n = new b();
    o.t = n;
    n = null;
    System.out.println(o.t.x);
 }
}
