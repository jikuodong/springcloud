package net.jikuodong.springcloud.service;

import net.jikuodong.springcloud.pojo.Product;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

/**
 * describe
 *
 * @author JKD
 * @version 1.0.0
 * @ClassName ProductService.java
 * @createTime 2019年06月18日 08:57:00
 */
@Service
public class ProductService {
    @Value("${server.port}")
    String port;

    public List<Product> listProducts() {
        List<Product> ps = new ArrayList<>();
        ps.add(new Product(1,"product a from port:"+port,50));
        ps.add(new Product(2,"product b from port:"+port,150));
        ps.add(new Product(3,"product c from port:"+port,250));
        return ps;
    }
}
