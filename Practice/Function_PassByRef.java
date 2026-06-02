public class Function_PassByRef {

    public static int square(int n){
        return n * n;
    }
    public static void main(String[] args) {
        int a = 5;
        System.out.print(square(a) + " " + a);
    }
}
