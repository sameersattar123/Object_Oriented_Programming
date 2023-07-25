public class StringQuestion {
    static void skip(String p , String up){
        if (up.isEmpty()) {
            System.out.println(p);
            return;
        }

        char ch = up.charAt(0);

        if (ch == 'a') {
            skip(p, up.substring(1));
        } else {
            skip(p + ch, up.substring(1));
            
        }
    }

    static String skip(String up){
        if (up.isEmpty()) {
            return "";
        }

        char ch = up.charAt(0);

        if (ch == 'a') {
            return skip(up.substring(1));
        } else {
            return ch + skip(up.substring(1));
            
        }
    }

    static String skipSameer(String up){
        if (up.isEmpty()) {
            return "";
        }

        if (up.startsWith("sameer")) {
            return skipSameer(up.substring(6));
        } else {
            return  skipSameer(up.substring(1)) + up.charAt(0);
            
        }
    }

    static String skipSamNotSameer(String up){
        if (up.isEmpty()) {
            return "";
        }

        if (up.startsWith("sam") && !up.startsWith("sameer")) {
            return skipSamNotSameer(up.substring(3));
        } else {
            return  up.charAt(0) + skipSamNotSameer(up.substring(1));
            
        }
    }
    public static void main(String[] args) {
    //     skip("", "sameer");
    //    System.out.println(skip( "sameer"));
    //    System.out.println(skipSameer( "aasasameerxxxa"));
    //    System.out.println(skipSamNotSameer( "aasasameerxxxa"));
    }
}
