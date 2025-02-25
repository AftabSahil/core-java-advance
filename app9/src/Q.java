class Q{
    final int i = 0;
    {
        i=0;
    }
    public static void main(String[] args) {
        Q obj = new Q();
        System.out.println(obj.i);
    }
}
//compiler error: cannot assign a value to final variable i
//because i is a final variable and cannot be assigned a new value
//The final variable i is assigned a value in the instance block, which is not allowed.