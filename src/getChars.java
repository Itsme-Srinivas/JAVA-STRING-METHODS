public class getChars {
    public static void main(String args[]) {

        String str = new String("pannir Miss you Daa");
        char[] ch = new char[10];
        try {
            str.getChars(6, 16, ch, 0);
            System.out.println(ch);
        } catch (Exception ex) {
            System.out.println(ex);
        }
    }
}
