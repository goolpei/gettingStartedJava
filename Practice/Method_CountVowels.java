public class Method_CountVowels {


    public static int countVowels(String str){
        int vowelCount = 0;
        String lowerStr = str.toLowerCase();
        for(int i = 0; i < str.length(); i++){
            char ch = lowerStr.charAt(i);
            if(ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u' ){
                vowelCount++;
            }
        }
        return vowelCount;
    }

    public static void main(String[] args) {
        String str = "I love you.";
        int count = countVowels(str);

        System.out.println("Vowel count: " + count);
    }
}
