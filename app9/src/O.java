class O{
    final int i = 0;
    O(){
        i=0;
    }
    public static void main(String[] args) {
        O obj = new O();
        System.out.println(obj.i);
    }
}
//compiler error: cannot assign a value to final variable i
//because i is a final variable and cannot be assigned a new value