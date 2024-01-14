public class Main {
    public static boolean isPalindrom(String text){
        String clean = text.replaceAll("\\s+", "").toLowerCase();
        StringBuilder plain = new StringBuilder(clean);
        StringBuilder reverse = plain.reverse();
        return (reverse.toString()).equals(clean);
    }
    public static void main(String[] args) {
        if (isPalindrom("А роза упала на лапу Азора") == true) {
            System.out.println("палиндром");
        }else System.out.println("не палиндром");
    }
}
