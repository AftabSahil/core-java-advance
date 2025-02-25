class G{
    int i;
    public static void main(String[] args) {
        final G g1 = new G();
        System.out.println(g1.i);
        g1 = new G();
        System.out.println(g1.i);

    }
}
//compilation error: cannot assign a value to final variable g1
//because g1 is a final variable and cannot be assigned a new value