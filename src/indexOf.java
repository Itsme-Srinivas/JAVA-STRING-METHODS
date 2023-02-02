public class indexOf {
    public static void main(String args[]) {
        String s1 = "Hey Srinivas Where is Pannir Daa";
        int index1 = s1.indexOf("is");
        int index2 = s1.indexOf("Pannir");
        System.out.println(index1 + "  " + index2);


        int index3 = s1.indexOf("is", 4);
        System.out.println(index3);


        int index4 = s1.indexOf('S');
        System.out.println(index4);
    }
}
