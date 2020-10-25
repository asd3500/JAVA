import by.itClass.Product12;
import by.itClass.exceptions.NameException12;
/**
 * exception
 */
public class Runner12_exm3 {
    public static void main(String[] args) { //throws JVM -> e.printStackTrace()

        Product12 product = null;
        try {
            product = new Product12("Bread", 1200);
        } catch (NameException12 e) {
            e.printStackTrace();
        }

        product.setPrice(-900);
        try {
            product.setName("");
        } catch (Exception e) {
            System.err.println(e.getMessage());
        }

        System.out.println(product);

    }
}
