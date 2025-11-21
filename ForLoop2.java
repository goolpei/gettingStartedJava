public class ForLoop2 {
    public static void main(String[] args){
        for(int i = 0; i < 100; i+= 4){
            System.out.println(i);
            if(i == 80) break;
        }
    } 
}
