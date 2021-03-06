package net.jikuodong.springcloud.pojo;

/**
 * describe
 *
 * @author JKD
 * @version 1.0.0
 * @ClassName Product.java
 * @createTime 2019年06月18日 08:53:00
 */
public class Product {
    private int id;
    private String name;
    private int price;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }
    public Product() {}
    public Product(int id, String name, int price){
        super();
        this.id = id;
        this.name = name;
        this.price = price;
    }
}
