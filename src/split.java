public class split {
    public static void main(String args[]) {
        String s1 = "Hey Srinivas Are u busy?";
        String[] words = s1.split("\\s");
        for (String w : words) {
            System.out.println(w);
        }
    }
}