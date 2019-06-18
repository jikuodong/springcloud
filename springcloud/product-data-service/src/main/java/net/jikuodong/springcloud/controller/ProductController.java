package net.jikuodong.springcloud.controller;

import net.jikuodong.springcloud.pojo.Product;
import net.jikuodong.springcloud.service.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * describe
 *
 * @author JKD
 * @version 1.0.0
 * @ClassName ProductController.java
 * @createTime 2019年06月18日 09:01:00
 */
@RestController
public class ProductController {
    @Autowired
    ProductService productService;

    @RequestMapping("/products")
    public Object products(){
        List<Product> ps = productService.listProducts();
        return ps;
    }
}
