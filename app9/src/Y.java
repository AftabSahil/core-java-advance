class A{
    final void test1(){

    }
    void test2(){

    }
}
class Y extends A{
    void test1(){  //final method can't be overridden in child class

    }
    void test2(){
}
}

// class Y{
//     static final int TEST_VALUE = 10;
//     public static void main(String[] args) {
//         System.out.println(Y.TEST_VALUE);
//     }
// }