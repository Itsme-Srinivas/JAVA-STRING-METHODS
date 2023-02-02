public class equalsIgnoreCase {
    public static void main(String[] args) {
        String S1 = "Srinivas";
        String S2 = "Tom";
        String S3 = "Srinivas";
        String S4 = "Wolf";

        System.out.println(S1.equalsIgnoreCase(S2));
        System.out.println(S1.equalsIgnoreCase(S3));
        System.out.println(S1.equalsIgnoreCase(S4));
    }
}
