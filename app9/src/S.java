class S{
    final int i;
    S(int i){
        this.i=0;
    }
    S(){ 

    }
    public static void main(String[] args) {
        S obj = new S(10);
        System.out.println(obj.i);
    }
}
