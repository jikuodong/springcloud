package net.jikuodong.springcloud.client;

import net.jikuodong.springcloud.pojo.Product;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.web.client.RestTemplate;

import java.util.List;

/**
 * describe Ribbon客户端
 *
 * @author JKD
 * @version 1.0.0
 * @ClassName ProductClientRibbon.java
 * @createTime 2019年06月18日 14:21:00
 */
@Component
public class ProductClientRibbon {

    @Autowired
    RestTemplate restTemplate;

    public List<Product> listProdcuts() {
        return restTemplate.getForObject("http://PRODUCT-DATA-SERVICE/products",List.class);
    }
}
