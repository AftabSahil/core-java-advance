class I{
    public static void main(String[] args) {
        test(10);
    System.out.println("done");
    }
    static void test(final int i) {
        System.out.println("test:" + i);
        i =10;
        System.out.println("test:" + i);
    }
}
//compilation error: cannot assign a value to final variable i
//because i is a final variable and cannot be assigned a new value