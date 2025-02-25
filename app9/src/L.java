class L{
    final int i;
    public static void main(String[] args) {
        L obj = new L();
        System.out.println(obj.i);
    }
}
//it will give error because final variable must be initialized before use
//and here i is not initialized