public class Subset {

    static void SubsetElements(String p , String up){
        if (up.isEmpty()) {
            System.out.println(p);
            return;
        }

        char ch = up.charAt(0);
        SubsetElements(p + ch, up.substring(1));
        SubsetElements(p , up.substring(1));
        SubsetElements(p + (ch + 0), up.substring(1));
    }
    public static void main(String[] args) {
        SubsetElements("", "sami");
    }
    
}
