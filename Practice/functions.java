public class functions {

    public static void hello(){
        System.out.println("I love Nayeon!");
    }

    public static void greet(String name){
        System.out.println("Hello " + name + "!");
    }
    public static int add(int a, int b){
        return a + b;
    }
    public static void main(String[] args) {
        hello();
        hello();
        hello();
        System.out.println(add(1, 11));


        int sum = add(100, 200);
        System.out.println(sum);
        greet("Nayeon");
    }
}
