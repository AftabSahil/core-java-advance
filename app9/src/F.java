class F{
    int i;
    public static void main(String[] args) {
        final F f1 = new F();
        System.out.println(f1.i);
        f1.i = 20;
        System.out.println(f1.i);  
        f1.i = 120;
        System.out.println(f1.i);

    }
}