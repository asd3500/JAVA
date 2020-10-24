package by.itClass;

import by.itClass.exceptions.NameException12;
import by.itClass.exceptions.PriceException12;

public class Product12 {
    private String name;
    private int price;

    public Product12() {
    }

    public Product12(String name, int price) throws NameException12 {
        setName(name);
        setPrice(price);
    }

    public String getName() {
        return name;
    }

    public void setName(String name) throws NameException12 {
        if (!name.isEmpty()) {
            this.name = name;
        } else {
            throw new NameException12("Empty name");
        }
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        if (price > 0) {
            this.price = price;
        } else {
            try {
                throw new PriceException12("Negative price", price);
            } catch (PriceException12 e) {
                System.err.println(e.getMessage());
            }
        }
    }

    @Override
    public String toString() {
        return "Product12{" +
                "name='" + name + '\'' +
                ", price=" + price +
                '}';
    }


}
