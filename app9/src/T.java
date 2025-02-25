class T{
    final int i;
    T(int i){
        this.i=0;
    }
    T(){
        i=40;
    }
    public static void main(String[] args) {
        T obj = new T(10);
        System.out.println(obj.i);
        T obj1 = new T();
        System.out.println(obj1.i);
    }
}
