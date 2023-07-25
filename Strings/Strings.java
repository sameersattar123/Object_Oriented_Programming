package JavaLanguage.Strings;

public class Strings {
    public static void main(String[] args) {
        // STRING METHODS

        // change to upper case
        String name = "Sameer Sattar Shaikh";
        System.out.println(name.toUpperCase());

        // change to lower case
        String name1 = "SAMEER SATTAR SHAIKH";
        System.out.println(name1.toLowerCase());

        // removing extra spacing
        String name2 = "      SAMEER   SATTAR    SHAIKH      ";
        System.out.println(name2.trim());

        // substring(start,end)
        String name3 = "SAMEER SATTAR SHAIKH";
        System.out.println(name3.substring(0, 5));

        // substring(start)
        String name4 = "SAMEER SATTAR SHAIKH";
        System.out.println(name4.substring(0));

        // replacing string method
        String name5 = "SAMEER SATTAR SHAIKH";
        System.out.println(name5.replace("S", "s"));

        // comfirm starting of characters
        String name6 = "SAMEER SATTAR SHAIKH";
        System.out.println(name6.startsWith("S"));

        // comfirm ending of char
        String name7 = "SAMEER SATTAR SHAIKH";
        System.out.println(name7.endsWith("KH"));

        // KNOWNING OF CHARACTER
        String name8 = "SAMEER SATTAR SHAIKH";
        System.out.println(name8.charAt(0));
    }
}
