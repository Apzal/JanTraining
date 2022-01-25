public class Methods {
    static {
        System.out.println("in static block");
    }

    {
        System.out.println("initializer block");
    }
    public int test(){
        return 1;
    }

    public static int test2(){
        return 1;
    }

    public Methods(){
        System.out.println("in constructor");
    }
    public static void main(String[] args) {
        Methods methods=new Methods();
        System.out.println(methods.test());
        System.out.println(test2());


    }


}
