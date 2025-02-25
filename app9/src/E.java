class E{
    public static void main(String[] args) {
        final int [] array = new int[10];
        System.out.println(array[0]);
        System.out.println(array[1]);
        array = new int[10];
        System.out.println(array[3]);
        System.out.println(array[5]);
    }
}
//compilation error: cannot assign a value to final variable array