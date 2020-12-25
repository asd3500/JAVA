/**
 * StringBuilder, StringBuffer
 */
public class Runner27_exm1 {
    public static void main(String[] args) {
        String str = "Java IT CLASS!";
//        StringBuilder
//        StringBuffer

        StringBuilder strBuilder = new StringBuilder(str); // int - capacity (16 - default)
        viewBuilder(strBuilder);

        strBuilder.append(" 2020-12-13 Hello!");
        viewBuilder(strBuilder);

        strBuilder.insert(14, " INSERT");
        viewBuilder(strBuilder);

        strBuilder.delete(14,21);
        viewBuilder(strBuilder);
    }

    private static void viewBuilder(StringBuilder sb) {
        System.out.println("\n" + sb);
        System.out.println("capacity: " + sb.capacity());
        System.out.println("length: " + sb.length());
    }
}
