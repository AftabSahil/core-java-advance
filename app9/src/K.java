class K{
    public static void main(final String[] args){
        System.out.println("Hello K");
        args = null;
    }
}
//main method arguments are final, so we can't reassign the value to args.
//compilation error: cannot assign a value to final variable args