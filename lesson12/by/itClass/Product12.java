package by.itClass;

import by.itClass.exceptions.NameException;
import by.itClass.exceptions.PriceException;

public class Product12 {
    private String name;
    private int price;

    public Product12() {
    }

    public Product12(String name, int price) throws NameException {
        setName(name);
        setPrice(price);
    }

    public String getName() {
        return name;
    }

    public void setName(String name) throws NameException{
        if (!name.isEmpty()) {
            this.name = name;
        } else {
            throw new NameException("Empty name");
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
                throw new PriceException("Negative price", price);
            } catch (PriceException e) {
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
