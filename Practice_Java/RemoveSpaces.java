

public class RemoveSpaces {
    public static void main(String[] args) {
        String str = "I love    Nayeon!";
        String result = "";
        int i = 0;
        while(i < str.length()){
            if(str.charAt(i) != ' ') result += str.charAt(i);
            i++;
        }
        System.out.println(result);
    }
}
