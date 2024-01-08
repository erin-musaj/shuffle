public class Main {
    public static String shuffle(String s1, String s2){
        String rit = "";
        s1 = s1.trim();
        s2= s2.trim();
        while(s1.contains("  ")){
            s1 = s1.replace("  ", " ");
        }
        while(s2.contains("  ")){
            s2 = s2.replace("  ", " ");
        }
        for (int i = 0; i < Math.max(s1.length(), s2.length()); i++) {
            rit += s1.length()-1<i? "":s1.charAt(i);
            rit += s2.length()-1<i? "":s2.charAt(i);
        }
        return rit;
    }
    public static void main(String[] args) {
        System.out.println(shuffle("casa", "scatola"));
    }
}